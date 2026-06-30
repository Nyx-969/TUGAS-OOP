package nilaimahasiswa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nilaimahasiswa.model.Course;
import nilaimahasiswa.util.DatabaseConnection;

/**
 * Akses data Mata Kuliah – MySQL JDBC.
 *
 * @author Ubai
 */
public class CourseDAO {

    private Course map(ResultSet rs) throws SQLException {
        return new Course(
            rs.getString("kode"),
            rs.getString("nama"),
            rs.getInt("sks"),
            rs.getInt("semester")
        );
    }

    // ── Read ─────────────────────────────────────────────────────────────────

    public List<Course> findAll() {
        List<Course> list = new ArrayList<>();
        String sql = "SELECT kode, nama, sks, semester FROM mata_kuliah ORDER BY kode";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        } catch (SQLException e) {
            System.err.println("CourseDAO.findAll error: " + e.getMessage());
        }
        return list;
    }

    public List<Course> findByKeyword(String keyword) {
        List<Course> list = new ArrayList<>();
        String sql = "SELECT kode, nama, sks, semester FROM mata_kuliah "
                   + "WHERE LOWER(kode) LIKE ? OR LOWER(nama) LIKE ? ORDER BY kode";
        String like = "%" + keyword.toLowerCase() + "%";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, like);
            ps.setString(2, like);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) {
            System.err.println("CourseDAO.findByKeyword error: " + e.getMessage());
        }
        return list;
    }

    public boolean isCodeExists(String code) {
        String sql = "SELECT 1 FROM mata_kuliah WHERE LOWER(kode) = LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, code);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("CourseDAO.isCodeExists error: " + e.getMessage());
        }
        return false;
    }

    // ── Write ────────────────────────────────────────────────────────────────

    public void insert(Course c) {
        String sql = "INSERT INTO mata_kuliah (kode, nama, sks, semester) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCode());
            ps.setString(2, c.getCourseName());
            ps.setInt(3, c.getSKS());
            ps.setInt(4, c.getSemester());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("CourseDAO.insert error: " + e.getMessage());
        }
    }

    public void update(Course c) {
        String sql = "UPDATE mata_kuliah SET nama=?, sks=?, semester=? WHERE LOWER(kode)=LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCourseName());
            ps.setInt(2, c.getSKS());
            ps.setInt(3, c.getSemester());
            ps.setString(4, c.getCode());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("CourseDAO.update error: " + e.getMessage());
        }
    }

    public void delete(String code) {
        String sql = "DELETE FROM mata_kuliah WHERE LOWER(kode)=LOWER(?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, code);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("CourseDAO.delete error: " + e.getMessage());
        }
    }
}
