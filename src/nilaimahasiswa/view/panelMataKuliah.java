package nilaimahasiswa.view;

import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import nilaimahasiswa.controller.CourseController;
import nilaimahasiswa.model.Course;

/**
 * Panel pengelolaan data Mata Kuliah.
 * @author Yabes
 */
public class panelMataKuliah extends JPanel {

    private final CourseController controller = new CourseController();

    // Pagination
    private int halamanSaat = 0;
    private final int BARIS_PER_HALAMAN = 10;
    private java.util.List<Course> dataSekarang = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel lblJudul;
    private JLabel lblKode;
    private JLabel lblNama;
    private JLabel lblSks;
    private JLabel lblSemester;
    private JLabel lblHalaman;
    private JPanel pnlKartuForm;
    private JTextField txtKode;
    private JTextField txtNama;
    private JTextField txtSks;
    private JTextField txtSemester;
    private JTextField txtCari;
    private JButton btnCari;
    private JButton btnTambah;
    private JButton btnUbah;
    private JButton btnHapus;
    private JButton btnBersihkan;
    private JButton btnPrev;
    private JButton btnNext;
    private JScrollPane jScrollPane1;
    private JTable tabel;
    private DefaultTableModel modelTabel;
    // End of variables declaration//GEN-END:variables

    public panelMataKuliah() {
        initComponents();
        customizeComponents();
        tampilkanData(controller.cari(null));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setBackground(UITheme.BACKGROUND);
        lblJudul    = new JLabel();
        lblKode     = new JLabel();
        lblNama     = new JLabel();
        lblSks      = new JLabel();
        lblSemester = new JLabel();
        lblHalaman  = new JLabel();
        pnlKartuForm = new JPanel();
        txtKode     = new JTextField();
        txtNama     = new JTextField();
        txtSks      = new JTextField();
        txtSemester = new JTextField();
        txtCari     = new JTextField();
        btnCari      = new JButton();
        btnTambah    = new JButton();
        btnUbah      = new JButton();
        btnHapus     = new JButton();
        btnBersihkan = new JButton();
        btnPrev      = new JButton();
        btnNext      = new JButton();
        modelTabel   = new DefaultTableModel(new Object[]{"Kode","Nama Mata Kuliah","SKS","Semester"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        tabel        = new JTable(modelTabel);
        jScrollPane1 = new JScrollPane(tabel);

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblJudul.setText("Data Mata Kuliah");
        lblKode.setText("Kode");
        lblNama.setText("Nama Mata Kuliah");
        lblSks.setText("SKS");
        lblSemester.setText("Semester");
        lblHalaman.setText("Halaman 1 / 1");
        lblHalaman.setForeground(UITheme.TEXT_MUTED);
        lblHalaman.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        pnlKartuForm.setBackground(java.awt.Color.WHITE);
        pnlKartuForm.setOpaque(true);

        btnCari.setText("Cari");
        btnCari.setBackground(UITheme.PRIMARY);
        btnCari.setForeground(java.awt.Color.WHITE);
        btnCari.setOpaque(true);
        btnCari.setFocusPainted(false);

        btnTambah.setBackground(UITheme.PRIMARY);
        btnTambah.setForeground(java.awt.Color.WHITE);
        btnTambah.setText("Tambah");
        btnTambah.setOpaque(true);
        btnTambah.setFocusPainted(false);
        btnUbah.setBackground(UITheme.SUCCESS);
        btnUbah.setForeground(java.awt.Color.WHITE);
        btnUbah.setText("Ubah");
        btnUbah.setOpaque(true);
        btnUbah.setFocusPainted(false);
        btnHapus.setBackground(UITheme.DANGER);
        btnHapus.setForeground(java.awt.Color.WHITE);
        btnHapus.setText("Hapus");
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
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblKode).addComponent(txtKode, 100, 100, 150))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblNama).addComponent(txtNama, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblSks).addComponent(txtSks, 70, 70, 100))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblSemester).addComponent(txtSemester, 90, 90, 130))
        );
        kartuLayout.setVerticalGroup(
            kartuLayout.createSequentialGroup()
                .addGroup(kartuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode).addComponent(lblNama).addComponent(lblSks).addComponent(lblSemester))
                .addGroup(kartuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode,    GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama,    GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSks,     GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemester,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setPreferredSize(new Dimension(0, 300));

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
                    .addComponent(btnTambah).addComponent(btnUbah)
                    .addComponent(btnHapus).addComponent(btnBersihkan)
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
                    .addComponent(btnTambah).addComponent(btnUbah).addComponent(btnHapus).addComponent(btnBersihkan))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev).addComponent(lblHalaman).addComponent(btnNext))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customizeComponents() {
        // Styling warna/font sudah diatur lewat Design view (initComponents),
        // jadi di sini cukup pasang listener & logic saja.

        UITheme.styleTable(tabel, 16, 38, 12, 16); // Kode, Nama Mata Kuliah, SKS, Semester
        tabel.getSelectionModel().addListSelectionListener(e -> isiFormDariBaris());
        txtCari.setFont(UITheme.FONT_LABEL);

        btnCari.addActionListener(evt -> tampilkanData(controller.cari(txtCari.getText())));
        btnTambah.addActionListener(evt -> tambah());
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

    private void isiFormDariBaris() {
        int row = tabel.getSelectedRow();
        if (row < 0) return;
        txtKode.setText(modelTabel.getValueAt(row, 0).toString());
        txtNama.setText(modelTabel.getValueAt(row, 1).toString());
        txtSks.setText(modelTabel.getValueAt(row, 2).toString());
        txtSemester.setText(modelTabel.getValueAt(row, 3).toString());
    }

    private void tambah() {
        try {
            controller.tambah(txtKode.getText(), txtNama.getText(), ambilAngka(txtSks), ambilAngka(txtSemester));
            tampilkanData(controller.cari(null)); bersihkanForm(); info("Mata kuliah berhasil ditambahkan.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void ubah() {
        try {
            controller.update(txtKode.getText(), txtNama.getText(), ambilAngka(txtSks), ambilAngka(txtSemester));
            tampilkanData(controller.cari(null)); info("Mata kuliah berhasil diubah.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void hapus() {
        try {
            if (txtKode.getText().trim().isEmpty()) { error("Pilih data pada tabel terlebih dahulu!"); return; }
            if (JOptionPane.showConfirmDialog(this, "Hapus mata kuliah ini?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
            controller.hapus(txtKode.getText());
            tampilkanData(controller.cari(null)); bersihkanForm(); info("Mata kuliah berhasil dihapus.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private int ambilAngka(JTextField f) throws Exception {
        try { return Integer.parseInt(f.getText().trim()); }
        catch (NumberFormatException e) { throw new Exception("SKS dan Semester harus berupa angka!"); }
    }

    private void bersihkanForm() {
        txtKode.setText(""); txtNama.setText(""); txtSks.setText(""); txtSemester.setText("");
        tabel.clearSelection();
    }

    private void tampilkanData(java.util.List<Course> data) {
        this.dataSekarang = data;
        this.halamanSaat = 0;
        refreshTabel();
    }

    private void refreshTabel() {
        modelTabel.setRowCount(0);
        int dari = halamanSaat * BARIS_PER_HALAMAN;
        int sampai = Math.min(dari + BARIS_PER_HALAMAN, dataSekarang.size());
        for (int i = dari; i < sampai; i++) {
            Course c = dataSekarang.get(i);
            modelTabel.addRow(new Object[]{c.getCode(), c.getCourseName(), c.getSKS(), c.getSemester()});
        }
        int totalHalaman = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
        lblHalaman.setText("Halaman " + (halamanSaat + 1) + " / " + Math.max(totalHalaman, 1));
    }

    private void info(String p)  { JOptionPane.showMessageDialog(this, p, "Berhasil", JOptionPane.INFORMATION_MESSAGE); }
    private void error(String p) { JOptionPane.showMessageDialog(this, p, "Gagal",    JOptionPane.ERROR_MESSAGE); }
}
