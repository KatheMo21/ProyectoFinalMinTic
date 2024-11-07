/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Clases.Pais;
import Controlador.PaisControlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.List;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 */
public class frmPais extends javax.swing.JInternalFrame {
    private PaisControlador paisController;
    private static Pais pais = new Pais();
    private List<Pais> listaPais;
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form frmPais
     */
    public frmPais() throws SQLException{
        initComponents();
        paisController = new PaisControlador();

        //Crear el modelo de tabla con los nombres de las columnas 
        String[] titulosTabla = new String[]{"ID", "NOMBRE", "ESTADO","POBLACION","CIUDAD","REGION","LATITUD","LONGITUD","CALIFICACION","TASA"};
        tableModel.setColumnIdentifiers(titulosTabla);
        tblTabla.setModel(tableModel);
        
        listar(); //entra cargando la tabla pais de la base de datos

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
        jLabelID1 = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        txtBuscarID = new javax.swing.JTextField();
        jLabelID2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabelBuscarPor = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jLabelID3 = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelCodigo1 = new javax.swing.JLabel();
        txtPoblacion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtRegion = new javax.swing.JTextField();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelCodigo2 = new javax.swing.JLabel();
        txtTasa = new javax.swing.JTextField();
        jLabelID5 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        txtCalificacion = new javax.swing.JTextField();
        txtLatitud = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        jLabelID6 = new javax.swing.JLabel();
        btnPdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();
        jLabelFondo3 = new javax.swing.JLabel();

        bg.setPreferredSize(new java.awt.Dimension(1372, 776));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(140, 82, 255));
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
        bg.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 80));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 30));

        jLabelActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelActualizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActualizar.setText("Actualizar");
        bg.add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, 30));

        btnBuscar.setBackground(new java.awt.Color(140, 82, 255));
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
        jLabelBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscar.setText("Buscar");
        bg.add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 30));

        btnEliminar.setBackground(new java.awt.Color(140, 82, 255));
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
        jLabelEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar.setText("Eliminar");
        bg.add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 80, 30));

        btnlimpiar.setBackground(new java.awt.Color(140, 82, 255));
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
        jLabelLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setText("Limpiar");
        bg.add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 80, 30));

        jLabelNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        bg.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 100, -1));

        jLabelID1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID1.setText("ID");
        bg.add(jLabelID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 30, -1));

        jLabelCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setText("Estado");
        bg.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        txtBuscarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarIDKeyReleased(evt);
            }
        });
        bg.add(txtBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 120, -1));

        jLabelID2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID2.setText("ID");
        bg.add(jLabelID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 30, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 30));

        jLabelBuscarPor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelBuscarPor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarPor.setText("Buscar por:");
        bg.add(jLabelBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 80, -1));
        bg.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 120, 30));

        tblTabla.setBackground(new java.awt.Color(204, 204, 255));
        tblTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Estado", "Poblacion", "Ciudad", "Region", "Latitud", "Longitud", "Calificacion", "Tasa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(tblTabla);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 910, 370));
        bg.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, 30));

        jLabelID3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID3.setText("Tasa Impuesto");
        bg.add(jLabelID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 90, -1));

        jLabelNombre1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre1.setText("Longitud");
        bg.add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 60, -1));

        jLabelCodigo1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo1.setText("Calif Riesgo");
        bg.add(jLabelCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 80, -1));
        bg.add(txtPoblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 30));

        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiudadKeyReleased(evt);
            }
        });
        bg.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 120, 30));
        bg.add(txtRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 120, 30));

        jLabelNombre2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre2.setText("Ciudad");
        bg.add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 100, -1));

        jLabelCodigo2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo2.setText("Region");
        bg.add(jLabelCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 60, 20));
        bg.add(txtTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 80, 30));

        jLabelID5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID5.setText("Poblacion");
        bg.add(jLabelID5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 60, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLongitudKeyReleased(evt);
            }
        });
        bg.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 120, 30));

        txtCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacionActionPerformed(evt);
            }
        });
        bg.add(txtCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 92, 120, 30));
        bg.add(txtLatitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 120, 30));

        btnCerrar.setBackground(new java.awt.Color(204, 204, 255));
        btnCerrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        bg.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 534, 80, 30));

        jLabelID6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelID6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID6.setText("Latitud");
        bg.add(jLabelID6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 60, -1));

        btnPdf.setBackground(new java.awt.Color(140, 82, 255));
        btnPdf.setForeground(new java.awt.Color(140, 82, 255));
        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnPdf.setAlignmentY(0.0F);
        btnPdf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPdf.setBorderPainted(false);
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        bg.add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 90));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Generar PDF");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 120, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoColoress.png"))); // NOI18N
        jLabelFondo2.setText("jLabel2");
        jLabelFondo2.setPreferredSize(new java.awt.Dimension(1372, 776));
        bg.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1370, 740));

        jLabelFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jLabelFondo3.setText("jLabel2");
        bg.add(jLabelFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 950, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
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
            Logger.getLogger(frmPais.class.getName()).log(Level.SEVERE, null, ex);
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
                        Logger.getLogger(frmPais.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        btnAgregar.setEnabled(!txtNombre.getText().trim().isEmpty());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadKeyReleased

    private void txtLongitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongitudKeyReleased

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalificacionActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        MessageFormat header= new MessageFormat("Gestión de País");
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
        
        paisController.eliminar(id);
        this.limpiarFormulario();
        listar();
        JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");
        inicializarBotonera();
    }

    private void actualizar() {
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String estado = txtEstado.getText();
        double poblacion = Double.parseDouble(txtPoblacion.getText());
        String ciudad = txtCiudad.getText();
        String region = txtRegion.getText();
        String latitud = txtTasa.getText();
        String longitud = txtLongitud.getText();
        String calificacion = txtCalificacion.getText();
        double tasa = Double.parseDouble(txtTasa.getText());
        
        Pais pais = new Pais(id, nombre, estado,poblacion,ciudad,region,latitud,longitud,calificacion,tasa);
        try {
            paisController.actualizar(pais);
            JOptionPane.showMessageDialog(this, "Registro Actualizado");
            listar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void consultar() throws SQLException {
        int id = Integer.parseInt(txtBuscarID.getText());
        pais = paisController.consultar(id);
        if (pais == null) {
            JOptionPane.showMessageDialog(this, "ID NO ENCONTRADO");
        } else {
            txtId.setText(String.valueOf(pais.getId_pais()));
            txtNombre.setText(pais.getNombre());
            txtEstado.setText(pais.getEstado());
            txtPoblacion.setText(String.valueOf(pais.getPoblacion()));
            txtCiudad.setText(pais.getNombre());
            txtRegion.setText(pais.getEstado());
            txtLatitud.setText(pais.getLatitud());
            txtLongitud.setText(pais.getLongitud());
            txtCalificacion.setText(pais.getCalificacion_riesgo());
            txtTasa.setText(String.valueOf(pais.getTasa_impuesto()));
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnAgregar.setEnabled(false);
        }
    }

    private void limpiarFormulario() {
        txtId.setText("");
        txtNombre.setText("");
        txtEstado.setText("");
        txtPoblacion.setText("");
        txtCiudad.setText("");
        txtRegion.setText("");
        txtLatitud.setText("");
        txtLongitud.setText("");
        txtCalificacion.setText("");
        txtTasa.setText("");
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
        if ((!txtNombre.getText().trim().isEmpty()) && (!txtEstado.getText().trim().isEmpty())&& (!txtPoblacion.getText().trim().isEmpty())&& (!txtEstado.getText().trim().isEmpty())&& (!txtCiudad.getText().trim().isEmpty())&& (!txtRegion.getText().trim().isEmpty())&& (!txtLatitud.getText().trim().isEmpty())&& (!txtLongitud.getText().trim().isEmpty())&& (!txtCalificacion.getText().trim().isEmpty())&& (!txtTasa.getText().trim().isEmpty())) {
            validado = true;
        }
        return validado;
    }
    
    private void agregar() {

        String nombre = txtNombre.getText();
        String estado = txtEstado.getText();
        double poblacion = Double.parseDouble(txtPoblacion.getText());
        String ciudad = txtCiudad.getText();
        String region = txtRegion.getText();
        String latitud = txtTasa.getText();
        String longitud = txtLongitud.getText();
        String calificacion = txtCalificacion.getText();
        double tasa = Double.parseDouble(txtTasa.getText());
        
        Pais pais = new Pais(0, nombre, estado,poblacion,ciudad,region,latitud,longitud,calificacion,tasa);
        try {
            paisController.agregar(pais);
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
        List<Pais> listado = paisController.listar();
        listado.forEach((pais) -> {
            tableModel.addRow(new Object[]{pais.getId_pais(), pais.getNombre(), pais.getEstado(), pais.getPoblacion(), pais.getCiudad(), pais.getRegion(), pais.getLatitud(), pais.getLongitud(), pais.getCalificacion_riesgo(), pais.getTasa_impuesto()});
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnlimpiar;
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
    private javax.swing.JLabel jLabelFondo3;
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
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLatitud;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtTasa;
    // End of variables declaration//GEN-END:variables
}
