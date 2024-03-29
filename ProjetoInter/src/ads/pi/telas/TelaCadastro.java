/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pi.telas;


import javax.swing.JOptionPane;
import ads.pi.usuario.Usuario;
import ads.pi.usuario.UsuarioDAO;


/**
 *
 * @author Jaelson Henrique
 */
public class TelaCadastro extends javax.swing.JFrame {

    UsuarioDAO dao = new UsuarioDAO();
    Usuario usuario = new Usuario();


   
    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsuario = new javax.swing.JTextField();
        btnAvancar = new javax.swing.JButton();
        tfSenha = new javax.swing.JPasswordField();
        btnFechar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 430));
        getContentPane().setLayout(null);

        tfUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(255, 130, 5));
        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfUsuario);
        tfUsuario.setBounds(510, 190, 160, 40);

        btnAvancar.setBackground(new java.awt.Color(255, 102, 51));
        btnAvancar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvancar.setText("AVANÇAR");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvancar);
        btnAvancar.setBounds(490, 310, 160, 40);

        tfSenha.setForeground(new java.awt.Color(255, 130, 5));
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(tfSenha);
        tfSenha.setBounds(510, 260, 160, 40);

        btnFechar.setBackground(new java.awt.Color(255, 102, 51));
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar);
        btnFechar.setBounds(570, 360, 100, 26);

        btnVoltar.setBackground(new java.awt.Color(255, 102, 51));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(460, 360, 90, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ads/pi/artefatos/tela_cadastro_login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLogin telaN = new TelaLogin();
        telaN.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed

        if (tfSenha.getText().isEmpty() || tfUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            TelaPessoa tela = new TelaPessoa();
            tela.setVisible(true);
            tela.usuario.setUsuario(tfUsuario.getText());
            tela.usuario.setSenha(tfSenha.getText());
            
            dispose();
        }


    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables



}
