/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Clases.Emprendedor;
import Clases.Pais;
import Controlador.EmprendedorControlador;
import Controlador.PaisControlador;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.Set;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**private EmprendedorControlador emprendedorController;
    //private PaisControlador paisController;
    private static Emprendedor emprendedor = new Emprendedor();
    private List<Emprendedor> listaEmprendedor;
    DefaultTableModel tableModel = new DefaultTableModel();
 *
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 */
public class frmEmprendedor extends javax.swing.JInternalFrame {
    private EmprendedorControlador emprendedorController;
    //private PaisControlador paisController;
    private static Emprendedor emprendedor = new Emprendedor();
    private List<Emprendedor> listaEmprendedor;
    DefaultTableModel tableModel = new DefaultTableModel();
    /**
     * Creates new form frmEmprendedor
     */
    public frmEmprendedor() throws SQLException {
        initComponents();
        emprendedorController = new EmprendedorControlador();
        //Crear el modelo de tabla con los nombres de las columnas 
        String[] titulosTabla = new String[]{"ID", "ID_PAIS_NACIMIENTO", "ID_USUARIO","NOMBRE","APELLIDO","EDAD","GENERO","PROFESION","AÑO_NACIMIENTO","MES_NACIMIENTO"};
        tableModel.setColumnIdentifiers(titulosTabla);
        tblTabla.setModel(tableModel);
        
        listar(); //entra cargando la tabla pais de la base de datos

        inicializarBotonera();
        listar_paises(emprendedorController.listarPaises(),jComboIdPais);
        listar_usuarios(emprendedorController.listarUsuarios(),jComboIdUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelActualizar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabelBuscar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabelEliminar = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jLabelLimpiar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        txtBuscarID = new javax.swing.JTextField();
        jLabelBuscarPor = new javax.swing.JLabel();
        jLabelID1 = new javax.swing.JLabel();
        jLabelID2 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabelID5 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelCodigo2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabelID6 = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelCodigo1 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtAnioNacimiento = new javax.swing.JTextField();
        txtProfesion = new javax.swing.JTextField();
        txtMesNacimiento = new javax.swing.JTextField();
        jComboIdPais = new javax.swing.JComboBox<>();
        jComboIdUsuario = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        jLabelID3 = new javax.swing.JLabel();
        btnPdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1578, 864));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(140, 82, 255));
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
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 80));

        btnAgregar.setBackground(new java.awt.Color(140, 82, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setAlignmentY(0.0F);
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setBorderPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 80));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 30));

        jLabelActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelActualizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActualizar.setText("Actualizar");
        getContentPane().add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, 30));

        btnBuscar.setBackground(new java.awt.Color(140, 82, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setAlignmentY(0.0F);
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
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 80));

        jLabelBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscar.setText("Buscar");
        getContentPane().add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, 30));

        btnEliminar.setBackground(new java.awt.Color(140, 82, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setAlignmentY(0.0F);
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 80));

        jLabelEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar.setText("Eliminar");
        getContentPane().add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 90, 30));

        btnlimpiar.setBackground(new java.awt.Color(140, 82, 255));
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnlimpiar.setAlignmentY(0.0F);
        btnlimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 80));

        jLabelLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setText("Limpiar");
        getContentPane().add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 90, 30));

        tblTabla.setBackground(new java.awt.Color(204, 204, 255));
        tblTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblTabla.setForeground(new java.awt.Color(0, 0, 0));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_empre", "Id_pais_nacimiento", "Id_usuario", "Nombre", "Apellido", "Edad", "Genero", "Profesion", "Año nacmiento", "Mes nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabla.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 1000, 370));

        txtBuscarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarIDKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 120, 30));

        jLabelBuscarPor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelBuscarPor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarPor.setText("Buscar por:");
        getContentPane().add(jLabelBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 80, -1));

        jLabelID1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID1.setText("ID");
        getContentPane().add(jLabelID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 30, -1));

        jLabelID2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID2.setText("ID_emprendedor");
        getContentPane().add(jLabelID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 110, -1));

        jLabelNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("ID_pais_nacimiento");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 130, -1));

        jLabelCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setText("ID_usuario");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 80, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, 30));

        jLabelID5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID5.setText("Nombre");
        getContentPane().add(jLabelID5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 60, -1));

        jLabelNombre2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre2.setText("Apellido");
        getContentPane().add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 100, -1));

        jLabelCodigo2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo2.setText("Edad");
        getContentPane().add(jLabelCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 60, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 30));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 120, 30));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 120, 30));

        jLabelID6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID6.setText("Genero");
        getContentPane().add(jLabelID6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 60, -1));

        jLabelNombre1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre1.setText("Profesion");
        getContentPane().add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 60, -1));

        jLabelCodigo1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo1.setText("Año nacimiento");
        getContentPane().add(jLabelCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 120, -1));
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 120, 30));
        getContentPane().add(txtAnioNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 120, 30));

        txtProfesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProfesionKeyReleased(evt);
            }
        });
        getContentPane().add(txtProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 120, 30));
        getContentPane().add(txtMesNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 70, 80, 30));

        jComboIdPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboIdPaisKeyReleased(evt);
            }
        });
        getContentPane().add(jComboIdPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 30));

        getContentPane().add(jComboIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 120, 30));

        btnCerrar.setBackground(new java.awt.Color(204, 204, 255));
        btnCerrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 540, 70, 30));

        jLabelID3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID3.setText("Mes nacimiento");
        getContentPane().add(jLabelID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 100, -1));

        btnPdf.setBackground(new java.awt.Color(140, 82, 255));
        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnPdf.setAlignmentY(0.0F);
        btnPdf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPdf.setBorderPainted(false);
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        getContentPane().add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 90));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Generar PDF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 120, -1));

        jLabelFondo2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelFondo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoColoress.png"))); // NOI18N
        jLabelFondo2.setText("jLabel2");
        jLabelFondo2.setMinimumSize(new java.awt.Dimension(1420, 810));
        jLabelFondo2.setPreferredSize(new java.awt.Dimension(1578, 864));
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 1400, 750));

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
            Logger.getLogger(frmEmprendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyReleased

    }//GEN-LAST:event_btnBuscarKeyReleased

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
                        Logger.getLogger(frmEmprendedor.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtBuscarIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarIDKeyReleased
        btnBuscar.setEnabled(!txtBuscarID.getText().trim().isEmpty());
    }//GEN-LAST:event_txtBuscarIDKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        btnAgregar.setEnabled(!txtNombre.getText().trim().isEmpty());
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtProfesionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfesionKeyReleased
        btnAgregar.setEnabled(!txtNombre.getText().trim().isEmpty());
    }//GEN-LAST:event_txtProfesionKeyReleased

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jComboIdPaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboIdPaisKeyReleased
        
    }//GEN-LAST:event_jComboIdPaisKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        btnAgregar.setEnabled(!txtNombre.getText().trim().isEmpty());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
      MessageFormat header= new MessageFormat("Gestión de Emprendedores");
        MessageFormat footer= new MessageFormat("Katherin Monroy Echeverry & Luis Felipe Alzate Osorio © 2024");
        try{
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet(); 
            set.add(OrientationRequested.LANDSCAPE);
            this.tblTabla.print(JTable.PrintMode.FIT_WIDTH,header,footer,true,set,true);
            JOptionPane.showMessageDialog(this,"Impreso exitosamente");  
        }
        catch(java.awt.print.PrinterException e){
            JOptionPane.showMessageDialog(this,"Impresión fallida "+e);
            
        }
        
    }//GEN-LAST:event_btnPdfActionPerformed

    private void eliminar(int id) throws SQLException {
        
        emprendedorController.eliminar(id);
        this.limpiarFormulario();
        listar();
        JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");
        inicializarBotonera();
    }

    private void actualizar() {
        int id = Integer.parseInt(txtId.getText());
        int id_pais = (int) (jComboIdPais.getSelectedItem());
        int id_usuario = (int) (jComboIdUsuario.getSelectedItem());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String edad = txtEdad.getText();
        String genero = txtGenero.getText();
        String profesion = txtProfesion.getText();
        String anio_nacimiento = txtAnioNacimiento.getText();
        String mes_nacimiento = txtMesNacimiento.getText();
        
        Emprendedor emprendedor = new Emprendedor(id, id_pais, id_usuario,nombre,apellido,edad,genero,profesion,anio_nacimiento,mes_nacimiento);
        try {
            emprendedorController.actualizar(emprendedor);
            JOptionPane.showMessageDialog(this, "Registro Actualizado");
            listar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void consultar() throws SQLException {
        int id = Integer.parseInt(txtBuscarID.getText());
        emprendedor = emprendedorController.consultar(id);
        if (emprendedor == null) {
            JOptionPane.showMessageDialog(this, "ID NO ENCONTRADO");
        } else {
            txtId.setText(String.valueOf(emprendedor.getId_emprendedor()));
            jComboIdPais.setSelectedItem(emprendedor.getId_pais_nacimiento());
            jComboIdUsuario.setSelectedItem(emprendedor.getId_usuario());
            txtNombre.setText(emprendedor.getNombre());
            txtApellido.setText(emprendedor.getApellido());
            txtEdad.setText(emprendedor.getEdad());
            txtGenero.setText(emprendedor.getGenero());
            txtProfesion.setText(emprendedor.getProfesion());
            txtAnioNacimiento.setText(emprendedor.getAnio_nacimiento());
            txtMesNacimiento.setText(String.valueOf(emprendedor.getMes_nacimiento()));
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnAgregar.setEnabled(false);
        }
    }

    private void limpiarFormulario() {
        txtId.setText("");
//        jComboIdPais.setText("");
//        jComboIdUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtGenero.setText("");
        txtProfesion.setText("");
        txtAnioNacimiento.setText("");
        txtMesNacimiento.setText("");
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
        if ((!txtNombre.getText().trim().isEmpty())&& (!txtApellido.getText().trim().isEmpty())&& (!txtEdad.getText().trim().isEmpty())&& (!txtGenero.getText().trim().isEmpty())&& (!txtProfesion.getText().trim().isEmpty())&& (!txtAnioNacimiento.getText().trim().isEmpty())&& (!txtMesNacimiento.getText().trim().isEmpty())) {
            validado = true;
        }
        return validado;
    }
    
    private void agregar() {

        
        int id_pais = (int)(jComboIdPais.getSelectedItem());
        int id_usuario = (int)(jComboIdUsuario.getSelectedItem());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String edad = txtEdad.getText();
        String genero = txtGenero.getText();
        String profesion = txtProfesion.getText();
        String anio_nacimiento = txtAnioNacimiento.getText();
        String mes_nacimiento = txtMesNacimiento.getText();
        
        Emprendedor emprendedor = new Emprendedor(0,id_pais, id_usuario,nombre,apellido,edad,genero,profesion,anio_nacimiento,mes_nacimiento);
        try {
            emprendedorController.agregar(emprendedor);
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
        List<Emprendedor> listado = emprendedorController.listar();
        listado.forEach((emprendedor) -> {
            tableModel.addRow(new Object[]{emprendedor.getId_emprendedor(), emprendedor.getId_pais_nacimiento(), emprendedor.getId_usuario(), emprendedor.getNombre(), emprendedor.getApellido(), emprendedor.getEdad(), emprendedor.getGenero(), emprendedor.getProfesion(), emprendedor.getAnio_nacimiento(), emprendedor.getMes_nacimiento()});
        });
    }
    
    public void listar_paises(List<Integer> listado_paises,JComboBox c) throws SQLException{
        DefaultComboBoxModel combo=new DefaultComboBoxModel();
        c.setModel(combo);
        for (int i = 0; i < listado_paises.size(); i++) {
            combo.addElement(listado_paises.get(i));
            
        }
    }
    
    public void listar_usuarios(List<Integer> listado_usuarios,JComboBox c) throws SQLException{
        DefaultComboBoxModel combo=new DefaultComboBoxModel();
        c.setModel(combo);
        for (int i = 0; i < listado_usuarios.size(); i++) {
            combo.addElement(listado_usuarios.get(i));
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JComboBox<String> jComboIdPais;
    private javax.swing.JComboBox<String> jComboIdUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelActualizar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelBuscarPor;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCodigo1;
    private javax.swing.JLabel jLabelCodigo2;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelID1;
    private javax.swing.JLabel jLabelID2;
    private javax.swing.JLabel jLabelID3;
    private javax.swing.JLabel jLabelID5;
    private javax.swing.JLabel jLabelID6;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtAnioNacimiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMesNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesion;
    // End of variables declaration//GEN-END:variables
}
