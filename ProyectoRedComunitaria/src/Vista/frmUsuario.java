/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Clases.Usuario;
import Controlador.UsuarioControlador;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Katherin
 */
public class frmUsuario extends javax.swing.JInternalFrame {

    private UsuarioControlador usuarioController;
    private static Usuario usuario = new Usuario();
    private List<Usuario> listaUsuario;
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form frmUsuario
     */
    public frmUsuario() throws SQLException {
        initComponents();
        usuarioController = new UsuarioControlador();

        //Crear el modelo de tabla con los nombres de las columnas 
        String[] titulosTabla = new String[]{"ID", "NOMBRE_USUARIO", "CONTRASENIA"};
        tableModel.setColumnIdentifiers(titulosTabla);
        tblTabla.setModel(tableModel);
        
        listar(); //entra cargando la tabla usuario de la base de datos

        inicializarBotonera();
        
        
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
        btnAgregar = new javax.swing.JButton();
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
        btnCerrar = new javax.swing.JButton();
        jLabelID2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabelBuscarPor = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jLabelFondo2 = new javax.swing.JLabel();

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setBorderPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 80));

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
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnBuscarKeyReleased(evt);
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

        btnlimpiar.setBackground(new java.awt.Color(204, 204, 204));
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

        jLabelLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLimpiar.setText("Limpiar");
        bg.add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 80, 30));

        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre  Usuario");
        bg.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        bg.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 570));

        jLabelID1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID1.setText("ID");
        bg.add(jLabelID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 30, -1));

        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Contraseña");
        bg.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, -1));

        txtBuscarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarIDKeyReleased(evt);
            }
        });
        bg.add(txtBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 52, 120, 30));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        bg.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, -1, -1));

        jLabelID2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID2.setText("ID");
        bg.add(jLabelID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 30, -1));

        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyReleased(evt);
            }
        });
        bg.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 120, 30));

        jLabelBuscarPor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBuscarPor.setText("Buscar por:");
        bg.add(jLabelBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 80, -1));
        bg.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 120, 30));

        tblTabla.setBackground(new java.awt.Color(204, 204, 204));
        tblTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
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
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTabla);
        if (tblTabla.getColumnModel().getColumnCount() > 0) {
            tblTabla.getColumnModel().getColumn(0).setResizable(false);
            tblTabla.getColumnModel().getColumn(1).setResizable(false);
            tblTabla.getColumnModel().getColumn(2).setResizable(false);
        }

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 590, 370));
        bg.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, 30));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel2");
        bg.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 750, 570));

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

    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            consultar();
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = this.tblTabla.getSelectedRow();
        if (fila >= 0) {
            int id = (int) this.tblTabla.getValueAt(fila, 0);
            if (id > 0) {
                int option = JOptionPane.showConfirmDialog(this, "¿ Desea eliminar el usuario con Id ? " + id);
                if (option == 0) {
                    try {
                        eliminar(id);
                    } catch (SQLException ex) {
                        Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, " El usuario con ID " + id + " ha sido eliminado exitosamente ");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor seleccione el usuario que desea eliminar de la tabla");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyReleased

    }//GEN-LAST:event_btnBuscarKeyReleased

    private void txtNombreUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyReleased
        btnAgregar.setEnabled(!txtNombreUsuario.getText().trim().isEmpty());
    }//GEN-LAST:event_txtNombreUsuarioKeyReleased

    private void txtBuscarIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarIDKeyReleased
        btnBuscar.setEnabled(!txtBuscarID.getText().trim().isEmpty());
    }//GEN-LAST:event_txtBuscarIDKeyReleased

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void eliminar(int id) throws SQLException {
        
        usuarioController.eliminar(id);
        this.limpiarFormulario();
        listar();
        JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");
        inicializarBotonera();
    }

    private void actualizar() {
        int id = Integer.parseInt(txtId.getText());
        String nombre_usuario = txtNombreUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        Usuario usuario = new Usuario(id,nombre_usuario,contrasenia);
        try {
            usuarioController.actualizar(usuario);
            JOptionPane.showMessageDialog(this, "Registro Actualizado");
            listar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void consultar() throws SQLException {
        int id = Integer.parseInt(txtBuscarID.getText());
        usuario = usuarioController.consultar(id);
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "ID NO ENCONTRADO");
        } else {
            txtId.setText(String.valueOf(usuario.getId_usuario()));
            txtNombreUsuario.setText(usuario.getNombre_usuario());
            txtContrasenia.setText(usuario.getContrasenia());
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnAgregar.setEnabled(false);
        }
    }

    private void limpiarFormulario() {
        txtId.setText("");
        txtNombreUsuario.setText("");
        txtContrasenia.setText("");
        txtBuscarID.setText("");
        inicializarBotonera();
    }

    private void inicializarBotonera() {
        btnAgregar.setEnabled(false);
        btnBuscar.setEnabled(false);
        
        if(this.tblTabla.getSelectedRow()>0 || this.tblTabla.getRowCount()>0){
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }else{
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }

    private boolean validarVacios() {
        boolean validado = false;
        if ((!txtNombreUsuario.getText().trim().isEmpty()) && (!txtContrasenia.getText().trim().isEmpty())) {
            validado = true;
        }
        return validado;
    }

    private void agregar() {

        String nombre = txtNombreUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        Usuario usuario = new Usuario(0, nombre, contrasenia);
        try {
            usuarioController.agregar(usuario);
            JOptionPane.showMessageDialog(this, "Registro agregado");
            listar();
            limpiarFormulario();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /*public void limpiarTabla(){         
      int filasTabla = tableModel.getRowCount();  
      for (int i=0; i < filasTabla; i++){           
          tableModel.removeRow(0);  
      }  
    }  */
    public void listar() throws SQLException {
        tableModel.setRowCount(0); // Limpiar la tabla
        List<Usuario> listado = usuarioController.listar();
        listado.forEach((usuario) -> {
            tableModel.addRow(new Object[]{usuario.getId_usuario(), usuario.getNombre_usuario(), usuario.getContrasenia()});
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
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
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
