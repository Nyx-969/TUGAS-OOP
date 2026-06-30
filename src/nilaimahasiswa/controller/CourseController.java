package nilaimahasiswa.controller;

import java.util.List;
import nilaimahasiswa.dao.CourseDAO;
import nilaimahasiswa.model.Course;

/**
 * Logika bisnis untuk data Mata Kuliah.
 *
 * @author Ubai
 */
public class CourseController {

    private final CourseDAO dao = new CourseDAO();

    public void tambah(String code, String nama, int sks, int semester) throws Exception {
        validasiInput(code, nama, sks, semester);
        if (dao.isCodeExists(code)) {
            throw new Exception("Kode mata kuliah " + code + " sudah ada!");
        }
        dao.insert(new Course(code, nama, sks, semester));
    }

    public void update(String code, String nama, int sks, int semester) throws Exception {
        validasiInput(code, nama, sks, semester);
        if (!dao.isCodeExists(code)) {
            throw new Exception("Mata kuliah dengan kode " + code + " tidak ditemukan!");
        }
        dao.update(new Course(code, nama, sks, semester));
    }

    public void hapus(String code) throws Exception {
        if (code == null || code.trim().isEmpty()) {
            throw new Exception("Pilih mata kuliah yang akan dihapus!");
        }
        dao.delete(code);
    }

    public List<Course> semua() {
        return dao.findAll();
    }

    /** Ambil semua data, atau hasil pencarian jika keyword diisi. */
    public List<Course> cari(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return dao.findAll();
        }
        return dao.findByKeyword(keyword.trim());
    }

    private void validasiInput(String code, String nama, int sks, int semester) throws Exception {
        if (code.trim().isEmpty()) throw new Exception("Kode mata kuliah tidak boleh kosong!");
        if (nama.trim().isEmpty()) throw new Exception("Nama mata kuliah tidak boleh kosong!");
        if (sks <= 0 || sks > 6) throw new Exception("SKS harus antara 1-6!");
        if (semester <= 0 || semester > 8) throw new Exception("Semester harus antara 1-8!");
    }
}
