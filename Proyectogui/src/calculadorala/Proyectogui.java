/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorala;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Proyectogui extends javax.swing.JFrame {
    
    Hashtable<String, Partido> tabla_partido = new Hashtable<String, Partido> ();

    /**
     * Creates new form calculadorala
     */
    public Proyectogui() {
        
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jSlider1 = new javax.swing.JSlider();
        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lbltitulo1 = new javax.swing.JLabel();
        btnempate = new javax.swing.JButton();
        btnvictoriaslocales = new javax.swing.JButton();
        btnvictoriasvisitantes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(464, 750));

        lbltitulo1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbltitulo1.setText("MARCADOR PARTIDO");

        btnempate.setText("EMPATE");
        btnempate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempateActionPerformed(evt);
            }
        });

        btnvictoriaslocales.setText("VICTORIA LOCALES ");
        btnvictoriaslocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvictoriaslocalesActionPerformed(evt);
            }
        });

        btnvictoriasvisitantes.setText("VICTORIAS VISITANTES");
        btnvictoriasvisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvictoriasvisitantesActionPerformed(evt);
            }
        });

        jButton2.setText("AGREGAR MARCADOR ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Equipo Visitante", "Equipo local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnempate)
                                .addGap(42, 42, 42)
                                .addComponent(btnvictoriaslocales)
                                .addGap(31, 31, 31)
                                .addComponent(btnvictoriasvisitantes))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnempate)
                    .addComponent(btnvictoriaslocales)
                    .addComponent(btnvictoriasvisitantes))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnempateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempateActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EMPATE dialog = new EMPATE(new javax.swing.JFrame(), true,tabla_partido);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        llenartabla(tabla_partido);
                    }
                });
                dialog.setVisible(true);
            }
        });
         
           
        
    }//GEN-LAST:event_btnempateActionPerformed

    private void btnvictoriaslocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvictoriaslocalesActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Victorialocales dialog = new Victorialocales(new javax.swing.JFrame(), true,tabla_partido);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        llenartabla(tabla_partido);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
        
        
    }//GEN-LAST:event_btnvictoriaslocalesActionPerformed

    private void btnvictoriasvisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvictoriasvisitantesActionPerformed
        // TODO add your handling code here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Victoriavisitantes dialog = new Victoriavisitantes(new javax.swing.JFrame(), true,tabla_partido);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        llenartabla(tabla_partido);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
        
        
    }//GEN-LAST:event_btnvictoriasvisitantesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregarmarcador dialog = new Agregarmarcador(new javax.swing.JFrame(), true,tabla_partido);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        llenartabla(tabla_partido);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Proyectogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyectogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyectogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyectogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyectogui().setVisible(true);
            }
        });
    }
    
   public void llenartabla(Hashtable <String,Partido> partido)
    {
        limpiartable();
        Enumeration <Partido> mipartido= partido.elements();
        Enumeration <String> llaves= partido.keys();
        int j= 0;
        while (mipartido.hasMoreElements())
        {
            Partido mipartido2= mipartido.nextElement();
            
            for (int i = 0; i<=4; i++)
            {
                switch(i)
                {
                    case 0:
                    {
                        jTable1.setValueAt(llaves.nextElement(), j, i);
                        break;
                    }
                    case 1:
                    {
                        jTable1.setValueAt(mipartido2.getEquipolocal(), j, i);
                        break;
                    }
                    case 2:
                    {
                        jTable1.setValueAt(mipartido2.getGoleslocal(), j, i);
                        break;
                    }
                    case 3:
                    {
                        jTable1.setValueAt(mipartido2.getEquipovisitante(), j, i);
                        break;
                    }
                    case 4:
                    {
                        jTable1.setValueAt(mipartido2.getGolesvisitantes(), j, i);
                        break;
                    }
                }
            }
            j++;
        }
    }
public void limpiartable( )
{
    for( int j= 0; j< jTable1.getModel().getRowCount(); j++)
    {
        for ( int i = 0; i<= 4; i++)
        {
         switch (i)   
         {
             case 0:
             {
                 jTable1.setValueAt("", j, i);
                 break;
             }
         
         case 1:
             {
                jTable1.setValueAt("", j, i);
                 break;
             }
         case 2:
             {
                 jTable1.setValueAt("", j, i);
                 break;
             }
         case 3:
             {
                 jTable1.setValueAt("", j, i);
                 break;
             }
         case 4:
             {
                jTable1.setValueAt("", j, i);
                 break;
             }
        }
    }
    }}
   
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnempate;
    private javax.swing.JButton btnvictoriaslocales;
    private javax.swing.JButton btnvictoriasvisitantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbltitulo1;
    // End of variables declaration//GEN-END:variables
}
