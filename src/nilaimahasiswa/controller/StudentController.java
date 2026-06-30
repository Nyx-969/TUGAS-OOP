package nilaimahasiswa.controller;

import java.util.List;
import nilaimahasiswa.dao.StudentDAO;
import nilaimahasiswa.model.Student;

/**
 * Logika bisnis untuk data Mahasiswa.
 * Validasi input dilakukan di sini, bukan di View atau DAO.
 *
 * @author Ubai
 */
public class StudentController {

    private final StudentDAO dao = new StudentDAO();

    /** Tambah mahasiswa baru. */
    public void tambah(String nim, String nama, String prodi, String angkatan) throws Exception {
        validasiInput(nim, nama, prodi, angkatan);
        if (dao.isNimExists(nim)) {
            throw new Exception("NIM " + nim + " sudah terdaftar!");
        }
        dao.insert(new Student(nama, nim, prodi, angkatan));
    }

    /** Update data mahasiswa berdasarkan NIM. */
    public void update(String nim, String nama, String prodi, String angkatan) throws Exception {
        validasiInput(nim, nama, prodi, angkatan);
        if (!dao.isNimExists(nim)) {
            throw new Exception("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
        }
        dao.update(new Student(nama, nim, prodi, angkatan));
    }

    /** Hapus mahasiswa berdasarkan NIM. */
    public void hapus(String nim) throws Exception {
        if (nim == null || nim.trim().isEmpty()) {
            throw new Exception("Pilih mahasiswa yang akan dihapus!");
        }
        dao.delete(nim);
    }

    /** Ambil semua data, atau hasil pencarian jika keyword diisi. */
    public List<Student> cari(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return dao.findAll();
        }
        return dao.findByKeyword(keyword.trim());
    }

    public int getTotalData() {
        return dao.count();
    }

    private void validasiInput(String nim, String nama, String prodi, String angkatan) throws Exception {
        if (nim.trim().isEmpty()) throw new Exception("NIM tidak boleh kosong!");
        if (nama.trim().isEmpty()) throw new Exception("Nama tidak boleh kosong!");
        if (prodi.trim().isEmpty()) throw new Exception("Prodi tidak boleh kosong!");
        if (angkatan.trim().isEmpty()) throw new Exception("Angkatan tidak boleh kosong!");
        if (nim.trim().length() < 5) throw new Exception("NIM minimal 5 karakter!");
        if (!angkatan.trim().matches("\\d{4}")) throw new Exception("Angkatan harus 4 digit angka! Contoh: 2023");
    }
}
