package nilaimahasiswa.view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BorderFactory;
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
import nilaimahasiswa.controller.StudentController;
import nilaimahasiswa.model.Student;

/**
 * Panel pengelolaan data Mahasiswa.
 * @author Yabes
 */
public class panelMahasiswa extends JPanel {

    private final StudentController controller = new StudentController();

    // Pagination
    private int halamanSaat = 0;
    private final int BARIS_PER_HALAMAN = 10;
    private java.util.List<Student> dataSekarang = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel lblJudul;
    private JLabel lblNim;
    private JLabel lblNama;
    private JLabel lblProdi;
    private JLabel lblAngkatan;
    private JLabel lblHalaman;
    private JPanel pnlKartuForm;
    private JTextField txtNim;
    private JTextField txtNama;
    private JTextField txtProdi;
    private JTextField txtAngkatan;
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

    public panelMahasiswa() {
        initComponents();
        customizeComponents();
        tampilkanData(controller.cari(null));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setBackground(UITheme.BACKGROUND);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 24, 20, 24));

        lblJudul     = new JLabel();
        lblNim       = new JLabel();
        lblNama      = new JLabel();
        lblProdi     = new JLabel();
        lblAngkatan  = new JLabel();
        lblHalaman   = new JLabel();
        pnlKartuForm = new JPanel();
        txtNim       = new JTextField();
        txtNama      = new JTextField();
        txtProdi     = new JTextField();
        txtAngkatan  = new JTextField();
        txtCari      = new JTextField();
        btnCari      = new JButton();
        btnTambah    = new JButton();
        btnUbah      = new JButton();
        btnHapus     = new JButton();
        btnBersihkan = new JButton();
        btnPrev      = new JButton();
        btnNext      = new JButton();
        modelTabel   = new DefaultTableModel(new Object[]{"NIM","Nama","Program Studi","Angkatan"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        tabel        = new JTable(modelTabel);
        jScrollPane1 = new JScrollPane(tabel);

        lblJudul.setText("Data Mahasiswa");
        lblJudul.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
        lblJudul.setForeground(UITheme.TEXT_DARK);

        lblNim.setText("NIM");
        lblNama.setText("Nama");
        lblProdi.setText("Program Studi");
        lblAngkatan.setText("Angkatan");
        lblHalaman.setText("Halaman 1 / 1");
        lblHalaman.setForeground(UITheme.TEXT_MUTED);
        lblHalaman.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));

        btnCari.setText("Cari");
        btnTambah.setText("Tambah");
        btnUbah.setText("Ubah");
        btnHapus.setText("Hapus");
        btnBersihkan.setText("Bersihkan");
        btnPrev.setText("< Prev");
        btnNext.setText("Next >");

        // Warna tombol
        styleButtonPrimer(btnCari);
        styleButtonPrimer(btnTambah);
        btnUbah.setBackground(UITheme.SUCCESS);
        btnUbah.setForeground(java.awt.Color.WHITE);
        btnUbah.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btnUbah.setFocusPainted(false);
        btnUbah.setBorderPainted(false);
        btnUbah.setOpaque(true);
        btnUbah.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        styleButtonPrimer(btnPrev);
        styleButtonPrimer(btnNext);
        btnHapus.setBackground(UITheme.DANGER);
        btnHapus.setForeground(java.awt.Color.WHITE);
        btnHapus.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btnHapus.setFocusPainted(false);
        btnHapus.setBorderPainted(false);
        btnHapus.setOpaque(true);
        btnHapus.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        styleButtonOutline(btnBersihkan, UITheme.TEXT_MUTED);

        pnlKartuForm.setBackground(java.awt.Color.WHITE);
        pnlKartuForm.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));

        // pnlKartuForm layout
        GroupLayout kartuLayout = new GroupLayout(pnlKartuForm);
        pnlKartuForm.setLayout(kartuLayout);
        kartuLayout.setAutoCreateGaps(true);
        kartuLayout.setHorizontalGroup(
            kartuLayout.createSequentialGroup()
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblNim).addComponent(txtNim, 130, 130, 180))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblNama).addComponent(txtNama, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblProdi).addComponent(txtProdi, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kartuLayout.createParallelGroup().addComponent(lblAngkatan).addComponent(txtAngkatan, 100, 100, 140))
        );
        kartuLayout.setVerticalGroup(
            kartuLayout.createSequentialGroup()
                .addGroup(kartuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNim).addComponent(lblNama).addComponent(lblProdi).addComponent(lblAngkatan))
                .addGroup(kartuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngkatan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setPreferredSize(new Dimension(0, 260));

        // Main layout
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
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBersihkan)
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
    }
    // </editor-fold>//GEN-END:initComponents

    private void styleButtonPrimer(JButton btn) {
        btn.setBackground(new Color(33, 110, 196));
        btn.setForeground(Color.WHITE);
        btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }

    private void styleButtonOutline(JButton btn, Color warna) {
        btn.setBackground(Color.WHITE);
        btn.setForeground(warna);
        btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(warna, 1, true));
        btn.setOpaque(true);
        btn.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }

    private void customizeComponents() {
        lblNim.setFont(UITheme.FONT_LABEL);
        lblNama.setFont(UITheme.FONT_LABEL);
        lblProdi.setFont(UITheme.FONT_LABEL);
        lblAngkatan.setFont(UITheme.FONT_LABEL);

        styleTxt(txtNim); styleTxt(txtNama); styleTxt(txtProdi); styleTxt(txtAngkatan);
        txtCari.setFont(UITheme.FONT_LABEL);

        UITheme.styleTable(tabel, 18, 32, 30, 14); // NIM, Nama, Program Studi, Angkatan
        tabel.getSelectionModel().addListSelectionListener(e -> isiFormDariBaris());

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

    private void styleTxt(JTextField f) {
        f.setFont(UITheme.FONT_LABEL);
        f.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222)),
                BorderFactory.createEmptyBorder(5, 6, 5, 6)));
    }

    private void isiFormDariBaris() {
        int row = tabel.getSelectedRow();
        if (row < 0) return;
        txtNim.setText(modelTabel.getValueAt(row, 0).toString());
        txtNama.setText(modelTabel.getValueAt(row, 1).toString());
        txtProdi.setText(modelTabel.getValueAt(row, 2).toString());
        txtAngkatan.setText(modelTabel.getValueAt(row, 3).toString());
    }

    private void tambah() {
        try {
            controller.tambah(txtNim.getText(), txtNama.getText(), txtProdi.getText(), txtAngkatan.getText());
            tampilkanData(controller.cari(null));
            bersihkanForm();
            info("Data mahasiswa berhasil ditambahkan.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void ubah() {
        try {
            controller.update(txtNim.getText(), txtNama.getText(), txtProdi.getText(), txtAngkatan.getText());
            tampilkanData(controller.cari(null));
            info("Data mahasiswa berhasil diubah.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void hapus() {
        try {
            if (txtNim.getText().trim().isEmpty()) { error("Pilih data pada tabel terlebih dahulu!"); return; }
            if (JOptionPane.showConfirmDialog(this, "Hapus mahasiswa ini?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
            controller.hapus(txtNim.getText());
            tampilkanData(controller.cari(null));
            bersihkanForm();
            info("Data mahasiswa berhasil dihapus.");
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void bersihkanForm() {
        txtNim.setText(""); txtNama.setText(""); txtProdi.setText(""); txtAngkatan.setText("");
        tabel.clearSelection();
    }

    private void tampilkanData(java.util.List<Student> data) {
        this.dataSekarang = data;
        this.halamanSaat = 0;
        refreshTabel();
    }

    private void refreshTabel() {
        modelTabel.setRowCount(0);
        int dari = halamanSaat * BARIS_PER_HALAMAN;
        int sampai = Math.min(dari + BARIS_PER_HALAMAN, dataSekarang.size());
        for (int i = dari; i < sampai; i++) {
            Student s = dataSekarang.get(i);
            modelTabel.addRow(new Object[]{s.getNim(), s.getName(), s.getStudyProgram(), s.getAngkatan()});
        }
        int totalHalaman = (int) Math.ceil((double) dataSekarang.size() / BARIS_PER_HALAMAN);
        lblHalaman.setText("Halaman " + (halamanSaat + 1) + " / " + Math.max(totalHalaman, 1));
    }

    private void info(String p)  { JOptionPane.showMessageDialog(this, p, "Berhasil", JOptionPane.INFORMATION_MESSAGE); }
    private void error(String p) { JOptionPane.showMessageDialog(this, p, "Gagal",    JOptionPane.ERROR_MESSAGE); }
}
