package interfaz;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class interfaces extends javax.swing.JFrame {
    
    DecimalFormat FormatoNumerico = new DecimalFormat("##.##");

    public interfaces() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    // X es la variable independiente
    ArrayList<Double> X = new ArrayList<>();

    // Y es la variable dependiente
    ArrayList<Double> Y = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarY = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtNumD = new javax.swing.JTextField();
        txtFormula = new javax.swing.JTextField();
        txtCoeficiente = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValorDep = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pronosticar");
        setResizable(false);

        btnAgregarY.setText("Agregar");
        btnAgregarY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarYActionPerformed(evt);
            }
        });

        jLabel1.setText("Dependiente Y");

        jLabel2.setText("Independiente X");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtNumD.setEnabled(false);

        txtFormula.setEnabled(false);

        txtCoeficiente.setEnabled(false);

        txtError.setEnabled(false);

        jLabel3.setText("Número de datos:");

        jLabel4.setText("Ecuación de la recta MA:");

        jLabel5.setText("Coeficiente de relación:");

        jLabel6.setText("Error estandar:");

        jLabel7.setText("Valor dependiente:");

        txtValorDep.setEnabled(false);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnReiniciar)
                                        .addComponent(jLabel3)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumD, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregarY)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCalcular))
                                    .addComponent(txtY)
                                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorDep, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarY)
                    .addComponent(btnCalcular)
                    .addComponent(jButton1)
                    .addComponent(btnReiniciar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAgregarYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarYActionPerformed
        // TODO add your handling code here:
        
        // X es la variable independiente
        X.add(Double.parseDouble(txtX.getText()));

        // Y es la variable dependiente
        Y.add(Double.parseDouble(txtY.getText()));
        
        txtX.setText("");
        txtY.setText("");
        
    }//GEN-LAST:event_btnAgregarYActionPerformed

    
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

        // N = es el numero de datos que hay en Y
        Double N = Double.parseDouble(""+Y.size());

        // Inicializamos las siguintes variables     
        Double sumX2 = 0.0;
        Double sumY2 = 0.0;
        Double sumXY = 0.0;
        Double SumX = 0.0;
        Double SumY = 0.0;
        Double ProX;
        Double ProY;

        for (int i = 0; i < N; i++) {
            // Sumatorias XY, X2, Y2 
            // Media X, Y
            sumX2 = sumX2 + Math.pow(X.get(i),2);
            sumY2 = sumY2 + Math.pow(Y.get(i),2);
            sumXY = sumXY + X.get(i)*Y.get(i);
            SumX = (SumX + X.get(i));
            SumY = (SumY + Y.get(i)); 
        }
            ProX=SumX/N;
            ProY=SumY/N;
            
        // Calcular Pendiente
        //     Z(x).(y) - n.(x°).(y°)
        // b = -------------------------
        //     Z(x)^2 - n.(x°)^2	

        Double b; 
        b = ((sumXY) - (N *(ProX * ProY))) / (sumX2 - N * (Math.pow(ProX,2)));
 
        // Calcular Ordenada en el origen
        // a = y° - b.(x°)
        
        Double a;
        a = ProY - b * ProX;

        // Calcular Coeficiente de relación
        //               Z(x).(y) - n.(x°).(y°)
        // r = ----------------------------------------
        //     ________________________________________
        //    √(Z(x)^2 - n.(x°)^2).(Z(y)^2 - n.(y°)^2)

        Double n;	// numerator
        Double d;	// denominator
        Double r;	// Coeficiente de relación
        n = (sumXY) - (N *(ProX * ProY));
        d = (sumX2 - N * (Math.pow(ProX,2))) * (sumY2 - N * (Math.pow(ProY,2)));
        r = (n) / Math.sqrt(d);
        
        // Error estandar
        //     (Zy2 - a*n -b*Zxy) -->numerador           
        // d = ------------------                          numerador
        //         (n-2)          -->denominador    e = √ -------------
        //                                                 denominador
        
        Double e;
        Double div;
        
        div = (sumY2-(a*N)-(b*sumXY)) / (N - 2);
        e = Math.sqrt(div);

        // Resultados
        txtNumD.setText("" + N);
        txtFormula.setText("y = " + FormatoNumerico.format(b) + "x + " + FormatoNumerico.format(a));
        txtCoeficiente.setText("" + FormatoNumerico.format(r));
        txtError.setText("" + FormatoNumerico.format(e));
        
        //Formula lineal
        double y;
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor independiente"));
        y = b * x + a;
        txtValorDep.setText("" + FormatoNumerico.format(y));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtCoeficiente.setText("");
        txtError.setText("");
        txtFormula.setText("");
        txtNumD.setText("");
        txtValorDep.setText("");
        txtX.setText("");
        txtY.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        X.clear();
        Y.clear();
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarY;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCoeficiente;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtFormula;
    private javax.swing.JTextField txtNumD;
    private javax.swing.JTextField txtValorDep;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables
}
