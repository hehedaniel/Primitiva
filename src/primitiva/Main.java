/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package primitiva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author alumno
 */
public class Main extends javax.swing.JFrame {
    
    private static ArrayList<String> numeros_7 = new ArrayList();
    private static String complementario;
    private static String reintegro;
    private static final File SORTEOS_FILE = new File("src/primitiva/sorteos.txt");

    /**
     * Creates new form Main
     */
    public Main() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        FField_num1 = new javax.swing.JFormattedTextField();
        FField_num2 = new javax.swing.JFormattedTextField();
        FField_num3 = new javax.swing.JFormattedTextField();
        FField_num4 = new javax.swing.JFormattedTextField();
        FField_num5 = new javax.swing.JFormattedTextField();
        FField_num6 = new javax.swing.JFormattedTextField();
        FField_numComp = new javax.swing.JFormattedTextField();
        FField_numReint = new javax.swing.JFormattedTextField();
        Btn_Guardar = new javax.swing.JButton();
        Btn_UltSorteo = new javax.swing.JButton();
        Btn_Generar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FField_num1.setEditable(false);
        FField_num1.setBackground(new java.awt.Color(153, 255, 153));
        FField_num1.setForeground(new java.awt.Color(0, 0, 0));
        FField_num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_num1.setPreferredSize(new java.awt.Dimension(50, 50));
        FField_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FField_num1ActionPerformed(evt);
            }
        });
        getContentPane().add(FField_num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 52));

        FField_num2.setEditable(false);
        FField_num2.setBackground(new java.awt.Color(153, 255, 153));
        FField_num2.setForeground(new java.awt.Color(0, 0, 0));
        FField_num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_num2.setPreferredSize(new java.awt.Dimension(50, 50));
        FField_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FField_num2ActionPerformed(evt);
            }
        });
        getContentPane().add(FField_num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 52));

        FField_num3.setEditable(false);
        FField_num3.setBackground(new java.awt.Color(153, 255, 153));
        FField_num3.setForeground(new java.awt.Color(0, 0, 0));
        FField_num3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_num3.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FField_num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, 52));

        FField_num4.setEditable(false);
        FField_num4.setBackground(new java.awt.Color(153, 255, 153));
        FField_num4.setForeground(new java.awt.Color(0, 0, 0));
        FField_num4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_num4.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FField_num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 52));

        FField_num5.setEditable(false);
        FField_num5.setBackground(new java.awt.Color(153, 255, 153));
        FField_num5.setForeground(new java.awt.Color(0, 0, 0));
        FField_num5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_num5.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FField_num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 52));

        FField_num6.setEditable(false);
        FField_num6.setBackground(new java.awt.Color(153, 255, 153));
        FField_num6.setForeground(new java.awt.Color(0, 0, 0));
        FField_num6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_num6.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FField_num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 52));

        FField_numComp.setEditable(false);
        FField_numComp.setBackground(new java.awt.Color(0, 153, 51));
        FField_numComp.setForeground(new java.awt.Color(0, 0, 0));
        FField_numComp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_numComp.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FField_numComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, 52));

        FField_numReint.setEditable(false);
        FField_numReint.setBackground(new java.awt.Color(0, 153, 51));
        FField_numReint.setForeground(new java.awt.Color(0, 0, 0));
        FField_numReint.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FField_numReint.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FField_numReint, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, 52));

        Btn_Guardar.setBackground(new java.awt.Color(0, 255, 51));
        Btn_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        Btn_Guardar.setMaximumSize(new java.awt.Dimension(30, 100));
        Btn_Guardar.setMinimumSize(new java.awt.Dimension(30, 100));
        Btn_Guardar.setPreferredSize(new java.awt.Dimension(30, 100));
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 110, 31));

        Btn_UltSorteo.setBackground(new java.awt.Color(0, 255, 51));
        Btn_UltSorteo.setForeground(new java.awt.Color(0, 0, 0));
        Btn_UltSorteo.setText("Ultimo sorteo");
        Btn_UltSorteo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        Btn_UltSorteo.setMaximumSize(new java.awt.Dimension(30, 100));
        Btn_UltSorteo.setMinimumSize(new java.awt.Dimension(30, 100));
        Btn_UltSorteo.setPreferredSize(new java.awt.Dimension(30, 100));
        Btn_UltSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UltSorteoActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_UltSorteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, 31));

        Btn_Generar.setBackground(new java.awt.Color(0, 255, 51));
        Btn_Generar.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Generar.setText("Generar");
        Btn_Generar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        Btn_Generar.setMaximumSize(new java.awt.Dimension(30, 100));
        Btn_Generar.setMinimumSize(new java.awt.Dimension(30, 100));
        Btn_Generar.setPreferredSize(new java.awt.Dimension(30, 100));
        Btn_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GenerarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 110, 31));

        Btn_Limpiar.setBackground(new java.awt.Color(0, 255, 51));
        Btn_Limpiar.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Limpiar.setText("Limpiar");
        Btn_Limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        Btn_Limpiar.setMaximumSize(new java.awt.Dimension(30, 100));
        Btn_Limpiar.setMinimumSize(new java.awt.Dimension(30, 100));
        Btn_Limpiar.setPreferredSize(new java.awt.Dimension(30, 100));
        Btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 110, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primitiva/Logotipo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primitiva/fondo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(700, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-680, -450, 1380, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        
        System.out.println(SORTEOS_FILE.getAbsolutePath());
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(SORTEOS_FILE, true))){
            String cadena = String.join("-", numeros_7);
            cadena += "-" + complementario + "-" + reintegro;
            bw.write(cadena + "\n");
            bw.flush();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_UltSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UltSorteoActionPerformed
        // TODO add your handling code here:
        
        
        if (numeros_7.size() == 0){
            try(BufferedReader br = new BufferedReader(new FileReader(SORTEOS_FILE))){
                String linea ;
                String lineaUltima = "";
                while ((linea = br.readLine()) != null){
                    lineaUltima = linea;
                }
                
            numeros_7 = new ArrayList(Arrays.asList(lineaUltima.split("-")));
            reintegro = numeros_7.remove(7);
            complementario = numeros_7.remove(6);
            asignarNumeros();
            }catch(Exception e){
                e.getMessage();
            }
        }else {
            asignarNumeros();
        }
    }//GEN-LAST:event_Btn_UltSorteoActionPerformed

    private void Btn_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GenerarActionPerformed
        Set<String> numerosSet = new TreeSet<String>();
        numeros_7.clear();
        while(numerosSet.size() < 7){
            numerosSet.add(""+((int) (Math.random()*48)+1));
        }
        
        for(String numero: numerosSet){
            numeros_7.add(numero);
        }
        
        complementario = numeros_7.remove(6).toString();
        
        reintegro = "" + (int) ((Math.random()*8)+1);
        asignarNumeros();
        System.out.println("Generados.");
    }//GEN-LAST:event_Btn_GenerarActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        FField_num1.setText(" ");
        FField_num2.setText(" ");
        FField_num3.setText(" ");
        FField_num4.setText(" ");
        FField_num5.setText(" ");
        FField_num6.setText(" ");
        FField_numComp.setText(" ");
        FField_numReint.setText(" ");
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void FField_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FField_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FField_num1ActionPerformed

    private void FField_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FField_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FField_num2ActionPerformed

    private void asignarNumeros(){
        FField_num1.setText(numeros_7.get(0));
        FField_num2.setText(numeros_7.get(1));
        FField_num3.setText(numeros_7.get(2));
        FField_num4.setText(numeros_7.get(3));
        FField_num5.setText(numeros_7.get(4));
        FField_num6.setText(numeros_7.get(5));
        FField_numComp.setText(complementario);
        FField_numReint.setText(reintegro);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //ImageIcon imagen = new ImageIcon(getClass().getResource("/src/primitiva/Logotipo.png"));
                //JLabel etiqueta = new JLabel(imagen);
                //etiqueta.setHorizontalAlignment(JLabel.CENTER);
                //etiqueta.setVerticalAlignment(JLabel.CENTER);

                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Generar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_UltSorteo;
    private javax.swing.JFormattedTextField FField_num1;
    private javax.swing.JFormattedTextField FField_num2;
    private javax.swing.JFormattedTextField FField_num3;
    private javax.swing.JFormattedTextField FField_num4;
    private javax.swing.JFormattedTextField FField_num5;
    private javax.swing.JFormattedTextField FField_num6;
    private javax.swing.JFormattedTextField FField_numComp;
    private javax.swing.JFormattedTextField FField_numReint;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
