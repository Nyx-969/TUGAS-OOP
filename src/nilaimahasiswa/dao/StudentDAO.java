package nilaimahasiswa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nilaimahasiswa.model.Student;
import nilaimahasiswa.util.DatabaseConnection;

/**
 * Akses data Mahasiswa – MySQL JDBC.
 *
 * @author Ubai
 */
public class StudentDAO {

    // ── Mapping ResultSet → Student ──────────────────────────────────────────
    private Student map(ResultSet rs) throws SQLException {
        return new Student(
            rs.getString("nama"),
            rs.getString("nim"),
            rs.getString("prodi"),
            rs.getString("angkatan")
        );
    }

    // ── Read ─────────────────────────────────────────────────────────────────

    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT nim, nama, prodi, angkatan FROM mahasiswa ORDER BY nim";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        } catch (SQLException e) {
            System.err.println("StudentDAO.findAll error: " + e.getMessage());
        }
        return list;
    }

    public List<Student> findByKeyword(String keyword) {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT nim, nama, prodi, angkatan FROM mahasiswa "
                   + "WHERE LOWER(nim) LIKE ? OR LOWER(nama) LIKE ? ORDER BY nim";
        String like = "%" + keyword.toLowerCase() + "%";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, like);
            ps.setString(2, like);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            System.err.println("StudentDAO.findByKeyword error: " + e.getMessage());
        }
        return list;
    }

    public boolean isNimExists(String nim) {
        String sql = "SELECT 1 FROM mahasiswa WHERE LOWER(nim) = LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nim);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("StudentDAO.isNimExists error: " + e.getMessage());
        }
        return false;
    }

    public int count() {
        String sql = "SELECT COUNT(*) FROM mahasiswa";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            System.err.println("StudentDAO.count error: " + e.getMessage());
        }
        return 0;
    }

    // ── Write ────────────────────────────────────────────────────────────────

    public void insert(Student s) {
        String sql = "INSERT INTO mahasiswa (nim, nama, prodi, angkatan) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getNim());
            ps.setString(2, s.getName());
            ps.setString(3, s.getStudyProgram());
            ps.setString(4, s.getAngkatan());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("StudentDAO.insert error: " + e.getMessage());
        }
    }

    public void update(Student s) {
        String sql = "UPDATE mahasiswa SET nama=?, prodi=?, angkatan=? WHERE LOWER(nim)=LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getStudyProgram());
            ps.setString(3, s.getAngkatan());
            ps.setString(4, s.getNim());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("StudentDAO.update error: " + e.getMessage());
        }
    }

    public void delete(String nim) {
        String sql = "DELETE FROM mahasiswa WHERE LOWER(nim)=LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nim);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("StudentDAO.delete error: " + e.getMessage());
        }
    }
}
