package nilaimahasiswa.view;

import nilaimahasiswa.controller.UserController;
import nilaimahasiswa.model.User;
import nilaimahasiswa.view.UITheme;

public class LoginForm extends javax.swing.JFrame {

    private final UserController userController = new UserController();

    public LoginForm() {
        initComponents();
        getRootPane().setDefaultButton(btnLogin);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBranding = new javax.swing.JPanel();
        lblIkon = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        pnlForm = new javax.swing.JPanel();
        pnlKartu = new javax.swing.JPanel();
        lblPesan = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblFooter = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblCaption = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Sistem Nilai Mahasiswa");
        setMinimumSize(new java.awt.Dimension(700, 420));

        pnlBranding.setBackground(new java.awt.Color(25, 200, 25));
        pnlBranding.setPreferredSize(new java.awt.Dimension(320, 480));

        lblIkon.setFont(new java.awt.Font("Segoe UI Emoji", 0, 56)); // NOI18N
        lblIkon.setForeground(new java.awt.Color(255, 255, 255));
        lblIkon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(255, 255, 255));
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("SIM Nilai Mahasiswa");

        lblSub.setForeground(new java.awt.Color(255, 255, 255));
        lblSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSub.setText("Kelola data akademik dengan mudah");

        javax.swing.GroupLayout pnlBrandingLayout = new javax.swing.GroupLayout(pnlBranding);
        pnlBranding.setLayout(pnlBrandingLayout);
        pnlBrandingLayout.setHorizontalGroup(
            pnlBrandingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
            .addComponent(lblSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBrandingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBrandingLayout.setVerticalGroup(
            pnlBrandingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBrandingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJudul)
                .addGap(6, 6, 6)
                .addComponent(lblSub)
                .addGap(41, 41, 41)
                .addComponent(lblIkon)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlForm.setBackground(new java.awt.Color(244, 246, 250));

        pnlKartu.setBackground(new java.awt.Color(255, 255, 255));

        lblPesan.setForeground(new java.awt.Color(214, 69, 65));
        lblPesan.setText(" ");

        lblHint.setForeground(new java.awt.Color(120, 130, 145));
        lblHint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHint.setText("<html><center>Akun contoh: admin / admin123<br>atau dosen / dosen123</center></html>");

        javax.swing.GroupLayout pnlKartuLayout = new javax.swing.GroupLayout(pnlKartu);
        pnlKartu.setLayout(pnlKartuLayout);
        pnlKartuLayout.setHorizontalGroup(
            pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuLayout.createSequentialGroup()
                .addComponent(lblPesan)
                .addGap(282, 282, 282))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKartuLayout.createSequentialGroup()
                .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlKartuLayout.setVerticalGroup(
            pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblPesan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblFooter.setForeground(new java.awt.Color(120, 130, 145));
        lblFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter.setText("Dibuat oleh Ubai");

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(34, 41, 53));
        lblTitle.setText("Selamat Datang");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblCaption.setForeground(new java.awt.Color(120, 130, 145));
        lblCaption.setText("Masuk untuk melanjutkan");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(33, 110, 196));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("MASUK");
        btnLogin.setFocusPainted(false);
        btnLogin.setOpaque(true);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUser.setText("Username");

        lblPass.setText("Password");

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCaption)
                    .addComponent(lblPass)
                    .addComponent(lblTitle)
                    .addComponent(lblUser)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKartu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCaption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pnlKartu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFooter)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBranding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBranding, javax.swing.GroupLayout.PREFERRED_SIZE, 614, Short.MAX_VALUE)
            .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        prosesLogin();
    }

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void prosesLogin() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            lblPesan.setForeground(UITheme.DANGER);
            lblPesan.setText("Username dan password wajib diisi!");
            return;
        }

        User user = userController.login(username, password);
        if (user == null) {
            lblPesan.setForeground(UITheme.DANGER);
            lblPesan.setText("Username atau password salah!");
            return;
        }

        lblPesan.setText(" ");
        dispose();
        java.awt.EventQueue.invokeLater(() -> new Dashboard(user).setVisible(true));
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCaption;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblIkon;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPesan;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlBranding;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlKartu;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
