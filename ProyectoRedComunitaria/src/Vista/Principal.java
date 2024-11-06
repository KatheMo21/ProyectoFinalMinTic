/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FELIPE
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        IngInformacion = new javax.swing.JMenu();
        itmUsuario = new javax.swing.JMenuItem();
        itmPais = new javax.swing.JMenuItem();
        itmEmprendedor = new javax.swing.JMenuItem();
        itmProyecto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItmGestionInformación = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazul.jpg"))); // NOI18N

        escEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escEscritorioLayout = new javax.swing.GroupLayout(escEscritorio);
        escEscritorio.setLayout(escEscritorioLayout);
        escEscritorioLayout.setHorizontalGroup(
            escEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        escEscritorioLayout.setVerticalGroup(
            escEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        IngInformacion.setText("Ingresar Información");

        itmUsuario.setText("Usuarios");
        itmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUsuarioActionPerformed(evt);
            }
        });
        IngInformacion.add(itmUsuario);

        itmPais.setText("Paises");
        itmPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPaisActionPerformed(evt);
            }
        });
        IngInformacion.add(itmPais);

        itmEmprendedor.setText("Emprendedores");
        itmEmprendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEmprendedorActionPerformed(evt);
            }
        });
        IngInformacion.add(itmEmprendedor);

        itmProyecto.setText("Proyectos");
        itmProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProyectoActionPerformed(evt);
            }
        });
        IngInformacion.add(itmProyecto);

        jMenuBar1.add(IngInformacion);

        jMenu2.setText("Gestion Información");

        ItmGestionInformación.setText("Gestionar información");
        ItmGestionInformación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmGestionInformaciónActionPerformed(evt);
            }
        });
        jMenu2.add(ItmGestionInformación);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUsuarioActionPerformed
        frmUsuario frmUsuario = null;
        try {
            frmUsuario = new frmUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        escEscritorio.add(frmUsuario);
        frmUsuario.show();
    }//GEN-LAST:event_itmUsuarioActionPerformed

    private void itmPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPaisActionPerformed
        frmPais frmPais = null;
        try {
            frmPais = new frmPais();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        escEscritorio.add(frmPais);
        frmPais.show();
        
    }//GEN-LAST:event_itmPaisActionPerformed

    private void itmEmprendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEmprendedorActionPerformed
        frmEmprendedor frmEmprendedor = null;
        try {
            frmEmprendedor = new frmEmprendedor();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        escEscritorio.add(frmEmprendedor);
        frmEmprendedor.show();
    }//GEN-LAST:event_itmEmprendedorActionPerformed

    private void itmProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProyectoActionPerformed
        frmProyecto frmProyecto = null;
        try {
            frmProyecto = new frmProyecto();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        escEscritorio.add(frmProyecto);
        frmProyecto.show();
    }//GEN-LAST:event_itmProyectoActionPerformed

    private void ItmGestionInformaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmGestionInformaciónActionPerformed
        frmGestionInformacion frmGestionInformacion = null;
        try {
            frmGestionInformacion = new frmGestionInformacion();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        escEscritorio.add(frmGestionInformacion);
        frmGestionInformacion.show();
    }//GEN-LAST:event_ItmGestionInformaciónActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu IngInformacion;
    private javax.swing.JMenuItem ItmGestionInformación;
    private javax.swing.JDesktopPane escEscritorio;
    private javax.swing.JMenuItem itmEmprendedor;
    private javax.swing.JMenuItem itmPais;
    private javax.swing.JMenuItem itmProyecto;
    private javax.swing.JMenuItem itmUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
