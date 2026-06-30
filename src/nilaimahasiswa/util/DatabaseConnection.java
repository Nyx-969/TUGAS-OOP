package nilaimahasiswa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton koneksi ke MySQL via JDBC.
 * Semua DAO mengambil Connection lewat kelas ini.
 *
 * @author Ubai
 */
public class DatabaseConnection {

     private static final String URL =
            "jdbc:mysql://localhost:3306/db_mahasiswa?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Jakarta";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection instance = null;

    /** Mencegah instansiasi dari luar. */
    private DatabaseConnection() {}

    /**
     * Kembalikan koneksi tunggal (singleton).
     * Otomatis buka kembali jika koneksi terputus.
     */
    public static Connection getConnection() throws SQLException {
    if (instance == null || instance.isClosed()) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver tidak ditemukan.", e);
        }

        instance = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    return instance;
}

    /** Tutup koneksi (panggil saat aplikasi ditutup, opsional). */
    public static void close() {
        if (instance != null) {
            try {
                instance.close();
            } catch (SQLException e) {
                System.err.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}
