package nilaimahasiswa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nilaimahasiswa.model.Lecturer;
import nilaimahasiswa.util.DatabaseConnection;

/**
 * Akses data Dosen – MySQL JDBC.
 *
 * @author Ubai
 */
public class LecturerDAO {

    private Lecturer map(ResultSet rs) throws SQLException {
        return new Lecturer(
            rs.getString("nidn"),  // idCard = nidn (sesuai constructor Lecturer)
            rs.getString("nama"),
            rs.getString("nidn"),
            rs.getString("keahlian"),
            rs.getString("no_hp")
        );
    }

    // ── Read ─────────────────────────────────────────────────────────────────

    public List<Lecturer> findAll() {
        List<Lecturer> list = new ArrayList<>();
        String sql = "SELECT nidn, nama, keahlian, no_hp FROM dosen ORDER BY nidn";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        } catch (SQLException e) {
            System.err.println("LecturerDAO.findAll error: " + e.getMessage());
        }
        return list;
    }

    public List<Lecturer> findByKeyword(String keyword) {
        List<Lecturer> list = new ArrayList<>();
        String sql = "SELECT nidn, nama, keahlian, no_hp FROM dosen "
                   + "WHERE LOWER(nidn) LIKE ? OR LOWER(nama) LIKE ? ORDER BY nidn";
        String like = "%" + keyword.toLowerCase() + "%";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, like);
            ps.setString(2, like);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            System.err.println("LecturerDAO.findByKeyword error: " + e.getMessage());
        }
        return list;
    }

    public boolean isNidnExists(String nidn) {
        String sql = "SELECT 1 FROM dosen WHERE LOWER(nidn) = LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nidn);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("LecturerDAO.isNidnExists error: " + e.getMessage());
        }
        return false;
    }

    // ── Write ────────────────────────────────────────────────────────────────

    public void insert(Lecturer l) {
        String sql = "INSERT INTO dosen (nidn, nama, keahlian, no_hp) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, l.getNidn());
            ps.setString(2, l.getName());
            ps.setString(3, l.getExpertise());
            ps.setString(4, l.getNoHp());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("LecturerDAO.insert error: " + e.getMessage());
        }
    }

    public void update(Lecturer l) {
        String sql = "UPDATE dosen SET nama=?, keahlian=?, no_hp=? WHERE LOWER(nidn)=LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, l.getName());
            ps.setString(2, l.getExpertise());
            ps.setString(3, l.getNoHp());
            ps.setString(4, l.getNidn());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("LecturerDAO.update error: " + e.getMessage());
        }
    }

    public void delete(String nidn) {
        String sql = "DELETE FROM dosen WHERE LOWER(nidn)=LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nidn);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("LecturerDAO.delete error: " + e.getMessage());
        }
    }
}
