/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Toolkit;

/**
 *
 * @author Leo Family
 */
public class Main_Portada extends javax.swing.JFrame {

    /**
     * Creates new form Main_Portada
     */
    public Main_Portada() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setTitle("Simulacion de Aereopuerto Manuel Piar");
        setIcon();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Boton_Comenzar = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_main/Main_portada.jpg"))); // NOI18N

        Boton_Comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton_comenzar 1.png"))); // NOI18N
        Boton_Comenzar.setContentAreaFilled(false);
        Boton_Comenzar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton_comenzar 3.png"))); // NOI18N
        Boton_Comenzar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton_comenzar 2.png"))); // NOI18N
        Boton_Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ComenzarActionPerformed(evt);
            }
        });

        Boton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton_salir 1.png"))); // NOI18N
        Boton_Salir.setContentAreaFilled(false);
        Boton_Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton_salir 3.png"))); // NOI18N
        Boton_Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/boton_salir 2.png"))); // NOI18N
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Comenzar))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(Boton_Comenzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ComenzarActionPerformed
        
        
        Vista_main vm = new Vista_main();
        vm.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Boton_ComenzarActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_Boton_SalirActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Comenzar;
    private javax.swing.JButton Boton_Salir;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes_main/logo.png")));
    }

    
}
