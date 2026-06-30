package nilaimahasiswa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import nilaimahasiswa.model.Course;
import nilaimahasiswa.model.KRS;
import nilaimahasiswa.util.DatabaseConnection;

/**
 * Akses data nilai (KRS) mahasiswa – MySQL JDBC.
 * id di-generate otomatis oleh AUTO_INCREMENT MySQL (bukan DataStore).
 *
 * @author Ubai
 */
public class KrsDAO {

    // ── Mapping ResultSet → KRS ───────────────────────────────────────────────
    private KRS map(ResultSet rs) throws SQLException {
        Course course = new Course(
            rs.getString("kode"),
            rs.getString("nama_mk"),
            rs.getInt("sks"),
            rs.getInt("semester_mk")
        );
        return new KRS(
            rs.getInt("id"),
            rs.getString("nim"),
            course,
            rs.getDouble("nilai"),
            rs.getInt("semester"),
            rs.getString("tahun_ajaran")
        );
    }

    // SQL JOIN supaya dapat data Course sekaligus
    private static final String SELECT_ALL =
        "SELECT k.id, k.nim, k.nilai, k.semester, k.tahun_ajaran, "
      + "       m.kode, m.nama AS nama_mk, m.sks, m.semester AS semester_mk "
      + "FROM krs k "
      + "JOIN mata_kuliah m ON k.kode_mk = m.kode ";

    // ── Read ─────────────────────────────────────────────────────────────────

    public List<KRS> findAll() {
        List<KRS> list = new ArrayList<>();
        String sql = SELECT_ALL + "ORDER BY k.id";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        } catch (SQLException e) {
            System.err.println("KrsDAO.findAll error: " + e.getMessage());
        }
        return list;
    }

    public List<KRS> findByNim(String nim) {
        List<KRS> list = new ArrayList<>();
        String sql = SELECT_ALL + "WHERE LOWER(k.nim) = LOWER(?) ORDER BY k.id";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nim);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            System.err.println("KrsDAO.findByNim error: " + e.getMessage());
        }
        return list;
    }

    public List<KRS> findByKeyword(String keyword) {
        List<KRS> list = new ArrayList<>();
        String sql = SELECT_ALL
            + "WHERE LOWER(k.nim) LIKE ? OR LOWER(m.nama) LIKE ? OR LOWER(k.tahun_ajaran) LIKE ? "
            + "ORDER BY k.id";
        String like = "%" + keyword.toLowerCase() + "%";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, like);
            ps.setString(2, like);
            ps.setString(3, like);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            System.err.println("KrsDAO.findByKeyword error: " + e.getMessage());
        }
        return list;
    }

    public boolean isIdExists(int id) {
        String sql = "SELECT 1 FROM krs WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("KrsDAO.isIdExists error: " + e.getMessage());
        }
        return false;
    }

    // ── Write ────────────────────────────────────────────────────────────────

    /**
     * Insert KRS baru. id-nya diabaikan (AUTO_INCREMENT MySQL yang isi).
     * Setelah insert, id yang baru di-set balik ke objek KRS (opsional).
     */
    public void insert(KRS krs) {
        String sql = "INSERT INTO krs (nim, kode_mk, nilai, semester, tahun_ajaran) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, krs.getNim());
            ps.setString(2, krs.getCourse().getCode());
            ps.setDouble(3, krs.getScore());
            ps.setInt(4, krs.getSemester());
            ps.setString(5, krs.getTahunAjaran());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("KrsDAO.insert error: " + e.getMessage());
        }
    }

    public void update(KRS krs) {
        String sql = "UPDATE krs SET nim=?, kode_mk=?, nilai=?, semester=?, tahun_ajaran=? WHERE id=?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, krs.getNim());
            ps.setString(2, krs.getCourse().getCode());
            ps.setDouble(3, krs.getScore());
            ps.setInt(4, krs.getSemester());
            ps.setString(5, krs.getTahunAjaran());
            ps.setInt(6, krs.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("KrsDAO.update error: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM krs WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("KrsDAO.delete error: " + e.getMessage());
        }
    }
}
