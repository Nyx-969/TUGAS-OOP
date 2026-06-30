package nilaimahasiswa.controller;

import java.util.List;
import nilaimahasiswa.dao.KrsDAO;
import nilaimahasiswa.model.Course;
import nilaimahasiswa.model.KRS;

/**
 * Logika bisnis untuk input dan rekap nilai mahasiswa.
 * id KRS sekarang di-generate otomatis oleh AUTO_INCREMENT MySQL.
 *
 * @author Ubai
 */
public class KrsController {

    private final KrsDAO dao = new KrsDAO();

    public void simpanNilai(String nim, Course course, double score, int semester, String tahunAjaran)
            throws Exception {
        validasiInput(nim, course, score, tahunAjaran);
        // id = 0 → AUTO_INCREMENT MySQL yang tentukan id sesungguhnya
        dao.insert(new KRS(0, nim, course, score, semester, tahunAjaran));
    }

    /** Ubah data nilai (KRS) yang sudah ada, berdasarkan id. */
    public void ubahNilai(int id, String nim, Course course, double score, int semester, String tahunAjaran)
            throws Exception {
        validasiInput(nim, course, score, tahunAjaran);
        if (!dao.isIdExists(id)) {
            throw new Exception("Data nilai dengan id " + id + " tidak ditemukan!");
        }
        dao.update(new KRS(id, nim, course, score, semester, tahunAjaran));
    }

    public void hapus(int id) {
        dao.delete(id);
    }

    public List<KRS> semua() {
        return dao.findAll();
    }

    public List<KRS> milik(String nim) {
        return dao.findByNim(nim);
    }

    /** Ambil semua data, atau hasil pencarian jika keyword diisi. */
    public List<KRS> cari(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return dao.findAll();
        }
        return dao.findByKeyword(keyword.trim());
    }

    private void validasiInput(String nim, Course course, double score, String tahunAjaran) throws Exception {
        if (nim == null || nim.trim().isEmpty()) throw new Exception("Pilih mahasiswa terlebih dahulu!");
        if (course == null) throw new Exception("Pilih mata kuliah terlebih dahulu!");
        if (score < 0 || score > 100) throw new Exception("Nilai harus di antara 0 - 100!");
        if (tahunAjaran == null || tahunAjaran.trim().isEmpty()) {
            throw new Exception("Tahun ajaran tidak boleh kosong!");
        }
    }
}
