package nilaimahasiswa.view;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import nilaimahasiswa.controller.CourseController;
import nilaimahasiswa.controller.KrsController;
import nilaimahasiswa.controller.StudentController;
import nilaimahasiswa.model.Course;
import nilaimahasiswa.model.KRS;
import nilaimahasiswa.model.Student;

/**
 * Panel input nilai mahasiswa.
 * @author Yabes
 */
public class panelInputNilai extends JPanel {

    private final KrsController     krsController     = new KrsController();
    private final StudentController studentController = new StudentController();
    private final CourseController  courseController  = new CourseController();

    // Pagination
    private int halamanSaat = 0;
    private final int BARIS_PER_HALAMAN = 10;
    private java.util.List<KRS> dataSekarang = new ArrayList<>();

    // Id KRS yang sedang dipilih di tabel (untuk Ubah)
    private int idTerpilih = -1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel lblJudul;
    private JLabel lblMhs;
    private JLabel lblMk;
    private JLabel lblNilai;
    private JLabel lblSem;
    private JLabel lblTahun;
    private JLabel lblHalaman;
    private JPanel pnlKartuForm;
    private JComboBox<Student> cbMahasiswa;
    private JComboBox<Course>  cbMataKuliah;
    private JTextField txtNilai;
    private JTextField txtSemester;
    private JTextField txtTahunAjaran;
    private JTextField txtCari;
    private JButton btnCari;
    private JButton btnSimpan;
    private JButton btnUbah;
    private JButton btnHapus;
    private JButton btnBersihkan;
    private JButton btnPrev;
    private JButton btnNext;
    private JScrollPane jScrollPane1;
    private JTable tabel;
    private DefaultTableModel modelTabel;
    // End of variables declaration//GEN-END:variables

    public panelInputNilai() {
        initComponents();
        customizeComponents();
        tampilkanData(krsController.cari(null));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setBackground(UITheme.BACKGROUND);
        lblJudul     = new JLabel();
        lblMhs       = new JLabel();
        lblMk        = new JLabel();
        lblNilai     = new JLabel();
        lblSem       = new JLabel();
        lblTahun     = new JLabel();
        lblHalaman   = new JLabel();
        pnlKartuForm = new JPanel();
        cbMahasiswa  = new JComboBox<>();
        cbMataKuliah = new JComboBox<>();
        txtNilai        = new JTextField();
        txtSemester     = new JTextField();
        txtTahunAjaran  = new JTextField();
        txtCari   = new JTextField();
        btnCari   = new JButton();
        btnSimpan = new JButton();
        btnUbah   = new JButton();
        btnHapus  = new JButton();
        btnBersihkan = new JButton();
        btnPrev   = new JButton();
        btnNext   = new JButton();
        modelTabel = new DefaultTableModel(
                new Object[]{"NIM","Mata Kuliah","Nilai","Grade","Semester","Tahun Ajaran","ID"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        tabel        = new JTable(modelTabel);
        jScrollPane1 = new JScrollPane(tabel);

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblJudul.setText("Input Nilai Mahasiswa");
        lblMhs.setText("Mahasiswa");
        lblMk.setText("Mata Kuliah");
        lblNilai.setText("Nilai (0-100)");
        lblSem.setText("Semester");
        lblTahun.setText("Tahun Ajaran");
        lblHalaman.setText("Halaman 1 / 1");
        lblHalaman.setForeground(UITheme.TEXT_MUTED);
        lblHalaman.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        pnlKartuForm.setBackground(java.awt.Color.WHITE);
        pnlKartuForm.setOpaque(true);
        txtTahunAjaran.setText("2024/2025");

        btnCari.setText("Cari");
        btnCari.setBackground(UITheme.PRIMARY);
        btnCari.setForeground(java.awt.Color.WHITE);
        btnCari.setOpaque(true);
        btnCari.setFocusPainted(false);

        btnSimpan.setBackground(UITheme.PRIMARY);
        btnSimpan.setForeground(java.awt.Color.WHITE);
        btnSimpan.setText("Simpan Nilai");
        btnSimpan.setOpaque(true);
        btnSimpan.setFocusPainted(false);
        btnUbah.setBackground(UITheme.SUCCESS);
        btnUbah.setForeground(java.awt.Color.WHITE);
        btnUbah.setText("Ubah");
        btnUbah.setOpaque(true);
        btnUbah.setFocusPainted(false);
        btnHapus.setBackground(java.awt.Color.WHITE);
        btnHapus.setForeground(UITheme.DANGER);
        btnHapus.setText("Hapus Baris Terpilih");
        btnHapus.setOpaque(true);
        btnHapus.setFocusPainted(false);
        btnBersihkan.setBackground(java.awt.Color.WHITE);
        btnBersihkan.setForeground(UITheme.TEXT_MUTED);
        btnBersihkan.setText("Bersihkan");
        btnBersihkan.setOpaque(true);
        btnBersihkan.setFocusPainted(false);

        btnPrev.setText("< Prev");
        btnPrev.setBackground(UITheme.PRIMARY);
        btnPrev.setForeground(java.awt.Color.WHITE);
        btnPrev.setOpaque(true);
        btnPrev.setFocusPainted(false);
        btnNext.setText("Next >");
        btnNext.setBackground(UITheme.PRIMARY);
        btnNext.setForeground(java.awt.Color.WHITE);
        btnNext.setOpaque(true);
        btnNext.setFocusPainted(false);

        GroupLayout kartuLayout = new GroupLayout(pnlKartuForm);
        pnlKartuForm.setLayout(kartuLayout);
        kartuLayout.setAutoCreateGaps(true);
        kartuLayout.setHorizontalGroup(
            kartuLayout.createSequentialGroup()
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblMhs).addComponent(cbMahasiswa, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblMk).addComponent(cbMataKuliah, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblNilai).addComponent(txtNilai, 90, 90, 130))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblSem).addComponent(txtSemester, 90, 90, 130))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblTahun).addComponent(txtTahunAjaran, 110, 110, 150))
        );
        kartuLayout.setVerticalGroup(
            kartuLayout.createSequentialGroup()
                .addGroup(kartuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMhs).addComponent(lblMk).addComponent(lblNilai).addComponent(lblSem).addComponent(lblTahun))
                .addGroup(kartuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMahasiswa,  GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMataKuliah, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNilai,     GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemester,  GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTahunAjaran, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setPreferredSize(new Dimension(0, 260));

        GroupLayout gl = new GroupLayout(this);
        this.setLayout(gl);
        gl.setAutoCreateGaps(true);
        gl.setHorizontalGroup(
            gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(gl.createSequentialGroup()
                    .addComponent(lblJudul)
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtCari, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addComponent(pnlKartuForm, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gl.createSequentialGroup()
                    .addComponent(btnSimpan).addComponent(btnUbah).addComponent(btnHapus).addComponent(btnBersihkan)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(jScrollPane1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gl.createSequentialGroup()
                    .addComponent(btnPrev)
                    .addGap(10, 10, 10)
                    .addComponent(lblHalaman)
                    .addGap(10, 10, 10)
                    .addComponent(btnNext)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        gl.setVerticalGroup(
            gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJudul)
                    .addComponent(txtCari, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlKartuForm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan).addComponent(btnUbah).addComponent(btnHapus).addComponent(btnBersihkan))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev).addComponent(lblHalaman).addComponent(btnNext))
        );
    }
    // </editor-fold>//GEN-END:initComponents

    private void customizeComponents() {
        // Styling warna/font sudah diatur lewat Design view (initComponents),
        // jadi di sini cukup pasang data & listener saja.

        for (Student s : studentController.cari(null)) cbMahasiswa.addItem(s);
        for (Course  c : courseController.cari(null))  cbMataKuliah.addItem(c);

        tabel.removeColumn(tabel.getColumnModel().getColumn(6)); // sembunyikan kolom ID
        UITheme.styleTable(tabel, 14, 22, 10, 8, 10, 14); // NIM, Mata Kuliah, Nilai, Grade, Semester, Tahun Ajaran
        tabel.getSelectionModel().addListSelectionListener(e -> isiFormDariBaris());

        txtCari.setFont(UITheme.FONT_LABEL);

        btnCari.addActionListener(evt -> tampilkanData(krsController.cari(txtCari.getText())));
        btnSimpan.addActionListener(evt -> simpan());
        btnUbah.addActionListener(evt -> ubah());
        btnHapus.addActionListener(evt -> hapus());
        btnBersihkan.addActionListener(evt -> bersihkanForm());
        btnPrev.addActionListener(evt -> {
            if (halamanSaat > 0) { halamanSaat--; refreshTabel(); }
        });
        btnNext.addActionListener(evt -> {
            int total = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
            if (halamanSaat < total - 1) { halamanSaat++; refreshTabel(); }
        });
    }

    /** Isi form dari baris tabel yang dipilih, termasuk simpan id-nya untuk keperluan Ubah. */
    private void isiFormDariBaris() {
        int row = tabel.getSelectedRow();
        if (row < 0) return;

        String nim = modelTabel.getValueAt(row, 0).toString();
        String namaMk = modelTabel.getValueAt(row, 1).toString();
        idTerpilih = (int) modelTabel.getValueAt(row, 6);

        pilihItemComboBox(cbMahasiswa, nim, true);
        pilihItemComboBox(cbMataKuliah, namaMk, false);

        txtNilai.setText(modelTabel.getValueAt(row, 2).toString());
        txtSemester.setText(modelTabel.getValueAt(row, 4).toString());
        txtTahunAjaran.setText(modelTabel.getValueAt(row, 5).toString());
    }

    /** Cari item di combo box berdasarkan NIM mahasiswa atau nama mata kuliah, lalu set sebagai terpilih. */
    private void pilihItemComboBox(JComboBox<?> combo, String kunci, boolean berdasarkanNim) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            Object item = combo.getItemAt(i);
            if (berdasarkanNim && item instanceof Student) {
                if (((Student) item).getNim().equalsIgnoreCase(kunci)) {
                    combo.setSelectedIndex(i);
                    return;
                }
            } else if (!berdasarkanNim && item instanceof Course) {
                if (((Course) item).getCourseName().equalsIgnoreCase(kunci)) {
                    combo.setSelectedIndex(i);
                    return;
                }
            }
        }
    }

    private void simpan() {
        try {
            Student mahasiswa  = (Student) cbMahasiswa.getSelectedItem();
            Course  mataKuliah = (Course)  cbMataKuliah.getSelectedItem();
            double nilai   = ambilDesimal(txtNilai);
            int    semester = ambilAngka(txtSemester);
            krsController.simpanNilai(
                    mahasiswa != null ? mahasiswa.getNim() : null,
                    mataKuliah, nilai, semester, txtTahunAjaran.getText());
            tampilkanData(krsController.cari(null));
            bersihkanForm();
            info("Nilai berhasil disimpan.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void ubah() {
        try {
            if (idTerpilih < 0) { error("Pilih baris pada tabel yang akan diubah!"); return; }
            Student mahasiswa  = (Student) cbMahasiswa.getSelectedItem();
            Course  mataKuliah = (Course)  cbMataKuliah.getSelectedItem();
            double nilai    = ambilDesimal(txtNilai);
            int    semester = ambilAngka(txtSemester);
            krsController.ubahNilai(idTerpilih,
                    mahasiswa != null ? mahasiswa.getNim() : null,
                    mataKuliah, nilai, semester, txtTahunAjaran.getText());
            tampilkanData(krsController.cari(null));
            info("Nilai berhasil diubah.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void hapus() {
        int row = tabel.getSelectedRow();
        if (row < 0) { error("Pilih baris pada tabel yang akan dihapus!"); return; }
        int id = (int) modelTabel.getValueAt(row, 6);
        if (JOptionPane.showConfirmDialog(this, "Hapus nilai ini?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        krsController.hapus(id);
        tampilkanData(krsController.cari(null));
        bersihkanForm();
    }

    private void bersihkanForm() {
        if (cbMahasiswa.getItemCount() > 0) cbMahasiswa.setSelectedIndex(0);
        if (cbMataKuliah.getItemCount() > 0) cbMataKuliah.setSelectedIndex(0);
        txtNilai.setText(""); txtSemester.setText("");
        txtTahunAjaran.setText("2024/2025");
        idTerpilih = -1;
        tabel.clearSelection();
    }

    private double ambilDesimal(JTextField f) throws Exception {
        try { return Double.parseDouble(f.getText().trim()); }
        catch (NumberFormatException e) { throw new Exception("Nilai harus berupa angka!"); }
    }

    private int ambilAngka(JTextField f) throws Exception {
        try { return Integer.parseInt(f.getText().trim()); }
        catch (NumberFormatException e) { throw new Exception("Semester harus berupa angka!"); }
    }

    private void tampilkanData(java.util.List<KRS> data) {
        this.dataSekarang = data;
        this.halamanSaat = 0;
        refreshTabel();
    }

    private void refreshTabel() {
        modelTabel.setRowCount(0);
        int dari = halamanSaat * BARIS_PER_HALAMAN;
        int sampai = Math.min(dari + BARIS_PER_HALAMAN, dataSekarang.size());
        for (int i = dari; i < sampai; i++) {
            KRS k = dataSekarang.get(i);
            modelTabel.addRow(new Object[]{
                k.getNim(), k.getCourse().getCourseName(), k.getScore(),
                k.getGrade(), k.getSemester(), k.getTahunAjaran(), k.getId()
            });
        }
        int totalHalaman = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
        lblHalaman.setText("Halaman " + (halamanSaat + 1) + " / " + Math.max(totalHalaman, 1));
    }

    private void info(String p)  { JOptionPane.showMessageDialog(this, p, "Berhasil", JOptionPane.INFORMATION_MESSAGE); }
    private void error(String p) { JOptionPane.showMessageDialog(this, p, "Gagal",    JOptionPane.ERROR_MESSAGE); }
}
