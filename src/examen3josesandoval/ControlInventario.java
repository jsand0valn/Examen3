
package examen3josesandoval;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ControlInventario extends javax.swing.JFrame {
    
  
DefaultTableModel modelo;//para agregar, eliminar y modificar filas y columnas de datos.


    public ControlInventario() {
        initComponents();
   
        modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Precio");
        this.tabla.setModel(modelo);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdescrip = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CBDesechable = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btreporte = new javax.swing.JButton();
        btagregar = new javax.swing.JButton();
        btborrar = new javax.swing.JButton();
        brmodificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtfila = new javax.swing.JTextField();
        txtcolumna = new javax.swing.JTextField();
        txtnuevo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btreporte1 = new javax.swing.JButton();
        btguardartxt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 80, 70, 19);
        jPanel2.add(txtcodigo);
        txtcodigo.setBounds(60, 20, 90, 20);

        jLabel4.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("NUEVO DATO:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(440, 110, 80, 19);
        jPanel2.add(txtcant);
        txtcant.setBounds(70, 80, 80, 19);

        jLabel5.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Codigo:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(12, 25, 70, 19);
        jPanel2.add(txtdescrip);
        txtdescrip.setBounds(260, 20, 140, 19);

        jLabel6.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripcion:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(170, 20, 100, 19);

        CBDesechable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desechables", "Comestibles", "Abarrotes", "Ropa" }));
        CBDesechable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDesechableActionPerformed(evt);
            }
        });
        jPanel2.add(CBDesechable);
        CBDesechable.setBounds(170, 80, 120, 24);

        jLabel7.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("tipo:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(160, 60, 50, 19);

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtprecio);
        txtprecio.setBounds(330, 90, 80, 19);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 520, 190);

        btreporte.setFont(new java.awt.Font("Bebas Neue Bold", 0, 24)); // NOI18N
        btreporte.setText("reporte");
        btreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreporteActionPerformed(evt);
            }
        });
        jPanel2.add(btreporte);
        btreporte.setBounds(390, 350, 130, 34);

        btagregar.setFont(new java.awt.Font("Bebas Neue Bold", 0, 24)); // NOI18N
        btagregar.setText("Agregar");
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });
        jPanel2.add(btagregar);
        btagregar.setBounds(10, 350, 120, 34);

        btborrar.setFont(new java.awt.Font("Bebas Neue Bold", 0, 24)); // NOI18N
        btborrar.setText("borrar");
        btborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btborrarActionPerformed(evt);
            }
        });
        jPanel2.add(btborrar);
        btborrar.setBounds(140, 350, 100, 34);

        brmodificar.setFont(new java.awt.Font("Bebas Neue Bold", 0, 24)); // NOI18N
        brmodificar.setText("modificar");
        brmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brmodificarActionPerformed(evt);
            }
        });
        jPanel2.add(brmodificar);
        brmodificar.setBounds(250, 350, 130, 34);

        jLabel9.setFont(new java.awt.Font("Bebas Neue Bold", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MODIFICAR");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(480, 10, 90, 30);

        jLabel10.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("fILA:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(460, 50, 50, 19);

        jLabel11.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("COLUMNA:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(430, 80, 100, 19);

        txtfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilaActionPerformed(evt);
            }
        });
        jPanel2.add(txtfila);
        txtfila.setBounds(530, 50, 60, 19);
        jPanel2.add(txtcolumna);
        txtcolumna.setBounds(530, 80, 60, 19);

        txtnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(txtnuevo);
        txtnuevo.setBounds(530, 110, 60, 19);

        jLabel12.setFont(new java.awt.Font("Bebas Neue Bold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("precio:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(340, 60, 50, 19);

        btreporte1.setFont(new java.awt.Font("Bebas Neue Bold", 0, 24)); // NOI18N
        btreporte1.setText("reporte");
        btreporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreporte1ActionPerformed(evt);
            }
        });
        jPanel2.add(btreporte1);
        btreporte1.setBounds(390, 350, 130, 34);

        btguardartxt.setFont(new java.awt.Font("Bebas Neue Bold", 0, 14)); // NOI18N
        btguardartxt.setText("GUARDAR TXT");
        btguardartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardartxtActionPerformed(evt);
            }
        });
        jPanel2.add(btguardartxt);
        btguardartxt.setBounds(540, 230, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 100, 660, 400);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bebas Neue Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de Inventario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 370, 48);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 20, 480, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void btreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreporteActionPerformed
        JFrame PantallaReportes = new JFrame("Nueva ventana");
        PantallaReportes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btreporteActionPerformed

    private void btborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btborrarActionPerformed
        int fila =tabla.getSelectedRow();
        if (fila>=0) {
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione Fila");
        
        }
    }//GEN-LAST:event_btborrarActionPerformed

    private void brmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brmodificarActionPerformed
       int fila = Integer.parseInt(txtfila.getText());
       int columna= Integer.parseInt(txtcolumna.getText());
       modelo.setValueAt(txtnuevo.getText(),fila, columna);
    }//GEN-LAST:event_brmodificarActionPerformed

    private void CBDesechableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDesechableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBDesechableActionPerformed

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaKeyPressed

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        String[] info =new String[5];//COLUMNAS

        info[0] = txtcodigo.getText();
        info[1] = txtdescrip.getText();
        info[2] = txtcant.getText();
        info[3] = CBDesechable.getSelectedItem().toString();
        info[4] = txtprecio.getText();
        
        modelo.addRow(info);
        
        
        txtcodigo.setText("");
        txtdescrip.setText("");
        txtcant.setText("");
        txtprecio.setText("");
    }//GEN-LAST:event_btagregarActionPerformed

    private void txtfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfilaActionPerformed

    private void txtnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnuevoActionPerformed

    private void btreporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreporte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btreporte1ActionPerformed

    private void btguardartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardartxtActionPerformed
        try {
            String rutaArchivo = "C:\\temp\\articulo\\datos.txt";
            FileWriter fw = new FileWriter(rutaArchivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tabla.getColumnCount(); i++) {
                for (int j = 0; j < tabla.getColumnCount(); j++) {
                bw.write(tabla.getValueAt(i, j).toString() + " ");
                    
                }
                 bw.newLine();
                  fw.close();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente en " + rutaArchivo);   
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
    }
    }//GEN-LAST:event_btguardartxtActionPerformed

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
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBDesechable;
    private javax.swing.JButton brmodificar;
    private javax.swing.JButton btagregar;
    private javax.swing.JButton btborrar;
    private javax.swing.JButton btguardartxt;
    private javax.swing.JButton btreporte;
    private javax.swing.JButton btreporte1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcolumna;
    private javax.swing.JTextField txtdescrip;
    private javax.swing.JTextField txtfila;
    private javax.swing.JTextField txtnuevo;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
