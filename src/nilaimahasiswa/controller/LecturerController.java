package nilaimahasiswa.controller;

import java.util.List;
import nilaimahasiswa.dao.LecturerDAO;
import nilaimahasiswa.model.Lecturer;

/**
 * Logika bisnis untuk data Dosen.
 *
 * @author Ubai
 */
public class LecturerController {

    private final LecturerDAO dao = new LecturerDAO();

    public void tambah(String nidn, String nama, String keahlian, String noHp) throws Exception {
        validasiInput(nidn, nama, keahlian, noHp);
        if (dao.isNidnExists(nidn)) {
            throw new Exception("NIDN " + nidn + " sudah terdaftar!");
        }
        dao.insert(new Lecturer(nidn, nama, nidn, keahlian, noHp));
    }

    public void update(String nidn, String nama, String keahlian, String noHp) throws Exception {
        validasiInput(nidn, nama, keahlian, noHp);
        if (!dao.isNidnExists(nidn)) {
            throw new Exception("Dosen dengan NIDN " + nidn + " tidak ditemukan!");
        }
        dao.update(new Lecturer(nidn, nama, nidn, keahlian, noHp));
    }

    public void hapus(String nidn) throws Exception {
        if (nidn == null || nidn.trim().isEmpty()) {
            throw new Exception("Pilih dosen yang akan dihapus!");
        }
        dao.delete(nidn);
    }

    public List<Lecturer> semua() {
        return dao.findAll();
    }

    public List<Lecturer> cari(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return dao.findAll();
        }
        return dao.findByKeyword(keyword.trim());
    }

    private void validasiInput(String nidn, String nama, String keahlian, String noHp) throws Exception {
        if (nidn.trim().isEmpty()) throw new Exception("NIDN tidak boleh kosong!");
        if (nama.trim().isEmpty()) throw new Exception("Nama tidak boleh kosong!");
        if (keahlian.trim().isEmpty()) throw new Exception("Bidang keahlian tidak boleh kosong!");
        if (noHp.trim().isEmpty()) throw new Exception("No. HP tidak boleh kosong!");
    }
}
