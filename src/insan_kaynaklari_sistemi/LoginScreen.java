
package insan_kaynaklari_sistemi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parthenia
 */
public class LoginScreen extends javax.swing.JFrame {

    public LoginScreen() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblkadi = new javax.swing.JLabel();
        lblsifre = new javax.swing.JLabel();
        txtkadi = new javax.swing.JTextField();
        btngiris = new javax.swing.JButton();
        lblbaslik = new javax.swing.JLabel();
        txtsifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblkadi.setText("Kullanıcı Adı:");

        lblsifre.setText("Şifre:");

        btngiris.setText("Giriş Yap");
        btngiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisActionPerformed(evt);
            }
        });

        lblbaslik.setText("İnsan Kaynakları Otomasyonu'na Hoş Geldiniz...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblbaslik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblkadi)
                            .addComponent(lblsifre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtkadi, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btngiris)
                            .addComponent(txtsifre))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblbaslik)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkadi)
                    .addComponent(txtkadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsifre)
                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btngiris)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisActionPerformed
        DBConnect.baglantiAc();
            try {
                String username = txtkadi.getText();
                char[] input = txtsifre.getPassword();
                String pass = new String(input);
                
                DBConnect.yetkilikontrol(username, pass); 
                
                this.dispose();
            }
            catch (Exception e) {
                System.out.println(e + " hatası");
            } 
    }//GEN-LAST:event_btngirisActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiris;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblkadi;
    private javax.swing.JLabel lblsifre;
    private javax.swing.JTextField txtkadi;
    private javax.swing.JPasswordField txtsifre;
    // End of variables declaration//GEN-END:variables
}
