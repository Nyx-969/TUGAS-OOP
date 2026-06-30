package nilaimahasiswa.view;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import nilaimahasiswa.model.User;
import nilaimahasiswa.view.UITheme;

/**
 * Jendela utama setelah login. Sidebar kiri + konten kanan (CardLayout).
 * @author Ubai
 */
public class Dashboard extends JFrame {

    private final User user;
    private final CardLayout cardLayout = new CardLayout();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnDosen;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMahasiswa;
    private javax.swing.JButton btnMataKuliah;
    private javax.swing.JButton btnNilai;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSideFooter;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlSidebar;
    // End of variables declaration//GEN-END:variables

    public Dashboard(User user) {
        this.user = user;
        initComponents();
        postInit();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSidebar = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnBeranda = new javax.swing.JButton();
        btnMahasiswa = new javax.swing.JButton();
        btnMataKuliah = new javax.swing.JButton();
        btnNilai = new javax.swing.JButton();
        btnDosen = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblSideFooter = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard - Sistem Nilai Mahasiswa");
        setMinimumSize(new java.awt.Dimension(900, 560));

        pnlSidebar.setBackground(new java.awt.Color(25, 200, 25));
        pnlSidebar.setPreferredSize(new java.awt.Dimension(200, 650));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setText("  SIM Nilai");

        btnBeranda.setBackground(new java.awt.Color(25, 200, 25));
        btnBeranda.setForeground(new java.awt.Color(255, 255, 255));
        btnBeranda.setText("  Beranda");
        btnBeranda.setFocusPainted(false);
        btnBeranda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBeranda.setOpaque(true);
        btnBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBerandaActionPerformed(evt);
            }
        });

        btnMahasiswa.setBackground(new java.awt.Color(25, 200, 25));
        btnMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        btnMahasiswa.setText("  Data Mahasiswa");
        btnMahasiswa.setFocusPainted(false);
        btnMahasiswa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMahasiswa.setOpaque(true);
        btnMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahasiswaActionPerformed(evt);
            }
        });

        btnMataKuliah.setBackground(new java.awt.Color(25, 200, 25));
        btnMataKuliah.setForeground(new java.awt.Color(255, 255, 255));
        btnMataKuliah.setText("  Mata Kuliah");
        btnMataKuliah.setFocusPainted(false);
        btnMataKuliah.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMataKuliah.setOpaque(true);
        btnMataKuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMataKuliahActionPerformed(evt);
            }
        });

        btnNilai.setBackground(new java.awt.Color(25, 200, 25));
        btnNilai.setForeground(new java.awt.Color(255, 255, 255));
        btnNilai.setText("  Input Nilai");
        btnNilai.setFocusPainted(false);
        btnNilai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNilai.setOpaque(true);
        btnNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNilaiActionPerformed(evt);
            }
        });

        btnDosen.setBackground(new java.awt.Color(25, 200, 25));
        btnDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnDosen.setText("  Data Dosen");
        btnDosen.setFocusPainted(false);
        btnDosen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDosen.setOpaque(true);
        btnDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosenActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(204, 51, 51));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("  Keluar");
        btnLogout.setFocusPainted(false);
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setOpaque(true);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblSideFooter.setForeground(new java.awt.Color(255, 255, 255));
        lblSideFooter.setText("  by Ubai");

        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(lblSideFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblSideFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlContent.setBackground(new java.awt.Color(244, 246, 250));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postInit() {
        // Pasang CardLayout ke pnlContent
        pnlContent.setLayout(cardLayout);

        // Tambah panel anak ke CardLayout
        pnlContent.add(buatPanelBeranda(), "beranda");
        pnlContent.add(new panelMahasiswa(), "mahasiswa");
        pnlContent.add(new panelMataKuliah(), "matakuliah");
        pnlContent.add(new panelInputNilai(), "inputnilai");
        pnlContent.add(new panelDosen(), "dosen");

        // Style hover sidebar buttons
        styleNavHover(btnBeranda);
        styleNavHover(btnMahasiswa);
        styleNavHover(btnMataKuliah);
        styleNavHover(btnNilai);
        styleNavHover(btnDosen);

        // Default ke beranda
        cardLayout.show(pnlContent, "beranda");
        setActiveBtn(btnBeranda);
    }

    private void styleNavHover(JButton btn) {
        Color base = btn.getBackground();
        btn.getModel().addChangeListener(e -> {
            if (btn.getModel().isRollover()) {
                btn.setBackground(UITheme.SIDEBAR_HOVER);
            } else if (!btn.getBackground().equals(new Color(46, 78, 110))) {
                btn.setBackground(base);
            }
        });
    }

    private void setActiveBtn(JButton active) {
        JButton[] navBtns = {btnBeranda, btnMahasiswa, btnMataKuliah, btnNilai, btnDosen};
        for (JButton b : navBtns) {
            b.setBackground(UITheme.SIDEBAR);
            b.setForeground(new Color(0, 0, 0));
        }
        active.setBackground(new Color(46, 78, 110));
        active.setForeground(Color.BLACK);
    }

    private void btnBerandaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        cardLayout.show(pnlContent, "beranda");
        setActiveBtn(btnBeranda);
    }

    private void btnMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cardLayout.show(pnlContent, "mahasiswa");
        setActiveBtn(btnMahasiswa);
    }

    private void btnMataKuliahActionPerformed(java.awt.event.ActionEvent evt) {                                              
        cardLayout.show(pnlContent, "matakuliah");
        setActiveBtn(btnMataKuliah);
    }

    private void btnNilaiActionPerformed(java.awt.event.ActionEvent evt) {                                         
        cardLayout.show(pnlContent, "inputnilai");
        setActiveBtn(btnNilai);
    }

    private void btnDosenActionPerformed(java.awt.event.ActionEvent evt) {                                         
        cardLayout.show(pnlContent, "dosen");
        setActiveBtn(btnDosen);
    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        keluar();
    }

    private JPanel buatPanelBeranda() {
        JPanel panel = new JPanel();
        panel.setBackground(UITheme.BACKGROUND);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel lblSelamat = new JLabel("Selamat datang, " + user.getUsername() + "!");
        lblSelamat.setFont(UITheme.FONT_TITLE);
        lblSelamat.setForeground(UITheme.TEXT_DARK);

        JLabel lblRole = new JLabel("Anda masuk sebagai " + user.getRole());
        lblRole.setFont(UITheme.FONT_SUBTITLE);
        lblRole.setForeground(UITheme.TEXT_MUTED);

        JPanel kartu1 = buatKartu("Menu Mahasiswa",   "Kelola data mahasiswa: tambah, ubah, hapus, cari.");
        JPanel kartu2 = buatKartu("Menu Mata Kuliah", "Atur daftar mata kuliah beserta SKS dan semester.");
        JPanel kartu3 = buatKartu("Menu Input Nilai", "Masukkan nilai mahasiswa per mata kuliah.");

        GroupLayout gl = new GroupLayout(panel);
        panel.setLayout(gl);
        gl.setAutoCreateGaps(true);
        gl.setHorizontalGroup(
            gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(lblSelamat)
                .addComponent(lblRole)
                .addGroup(gl.createSequentialGroup()
                    .addComponent(kartu1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartu2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartu3, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
        );
        gl.setVerticalGroup(
            gl.createSequentialGroup()
                .addComponent(lblSelamat)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole)
                .addGap(24)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(kartu1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartu2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addComponent(kartu3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
        );
        return panel;
    }

    private JPanel buatKartu(String judul, String deskripsi) {
        JPanel kartu = new JPanel();
        kartu.setBackground(UITheme.CARD);
        kartu.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));

        JLabel lblJudul = new JLabel(judul);
        lblJudul.setFont(UITheme.FONT_BUTTON);
        lblJudul.setForeground(UITheme.PRIMARY_DARK);

        JLabel lblDesk = new JLabel("<html><div style='width:190px;'>" + deskripsi + "</div></html>");
        lblDesk.setFont(UITheme.FONT_SUBTITLE);
        lblDesk.setForeground(UITheme.TEXT_MUTED);

        GroupLayout gl = new GroupLayout(kartu);
        kartu.setLayout(gl);
        gl.setHorizontalGroup(
            gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(lblJudul, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDesk,  0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gl.setVerticalGroup(
            gl.createSequentialGroup()
                .addComponent(lblJudul)
                .addGap(8)
                .addComponent(lblDesk)
                .addGap(0, 0, Short.MAX_VALUE)
        );
        return kartu;
    }

    private void keluar() {
        int pilihan = JOptionPane.showConfirmDialog(this, "Keluar dari aplikasi?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            dispose();
            SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
        }
    }
}
