/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

/**
 *
 * @author Katherin
 */
public class frmUsuario extends javax.swing.JDialog {

    /**
     * Creates new form Emprendedor
     */
    public frmUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        bg = new javax.swing.JPanel();
        btnTAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelActualizar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabelBuscar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabelEliminar = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jLabelLimpiar = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelID1 = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        txtBuscarID = new javax.swing.JTextField();
        jLabelID2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabelBuscarPor = new javax.swing.JLabel();
        txtContrasenia1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnTAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnTAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTAgregar.setBorderPainted(false);
        btnTAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTAgregarActionPerformed(evt);
            }
        });
        bg.add(btnTAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 80));

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setAlignmentY(0.0F);
        btnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.setBorderPainted(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        bg.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 80));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agregar");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 30));

        jLabelActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelActualizar.setText("Actualizar");
        bg.add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 30));

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 80));

        jLabelBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBuscar.setText("Buscar");
        bg.add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 30));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 80));

        jLabelEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEliminar.setText("Eliminar");
        bg.add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 80, 30));

        btnlimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnlimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        bg.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 80));
        btnlimpiar.getAccessibleContext().setAccessibleParent(null);

        jLabelLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLimpiar.setText("Limpiar");
        bg.add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 80, 30));

        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre  Usuario");
        bg.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 100, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        bg.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 540));

        jLabelID1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID1.setText("ID");
        bg.add(jLabelID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 30, -1));

        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Contraseña");
        bg.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, -1));
        bg.add(txtBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 120, -1));

        jLabelID2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID2.setText("ID");
        bg.add(jLabelID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 30, -1));
        bg.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, -1));

        jLabelBuscarPor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBuscarPor.setText("Buscar por:");
        bg.add(jLabelBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, -1));
        bg.add(txtContrasenia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 120, -1));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre Usuario", "Contrasenia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 590, 370));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel2");
        bg.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 700, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmUsuario dialog = new frmUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnTAgregar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelActualizar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelBuscarPor;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelID1;
    private javax.swing.JLabel jLabelID2;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtContrasenia1;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
