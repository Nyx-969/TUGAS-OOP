package nilaimahasiswa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import nilaimahasiswa.model.User;
import nilaimahasiswa.util.DatabaseConnection;

/**
 * Akses data akun pengguna – MySQL JDBC.
 *
 * @author Ubai
 */
public class UserDAO {

    /**
     * Cek username & password.
     * Mengembalikan objek User jika cocok, null jika gagal.
     */
    public User login(String username, String password) {
       String sql = "SELECT id, username, password, role FROM users WHERE LOWER(username)=LOWER(?) AND password=?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("UserDAO.login error: " + e.getMessage());
        }
        return null;
    }
}
