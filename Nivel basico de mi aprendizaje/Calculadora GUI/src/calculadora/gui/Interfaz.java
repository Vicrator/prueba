/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author pavlo
 */
public class Interfaz extends javax.swing.JFrame {
    double numero1,numero2;
    int operacion=10,control=0;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        Pantalla2.setText("");
    }
    
    public boolean maximo(String cadena){
        boolean si=true;
        if(cadena.length()>=8){
            si=false;
        }
        return si;
    }
    
    public void op(String operacion){
        numero1=Double.parseDouble(Pantalla.getText());
        Pantalla2.setText(Pantalla.getText()+ operacion);
        Pantalla.setText("");
        control=1;

    }
    
    public String cero(double numero){
        String cadena=String.format("%.3f",numero);
        
        if(numero<100000000){
            if(numero%1==0){
                cadena=cadena.substring(0, cadena.length()-4);
            }
        }
        else{
            cadena="El resultado contiene mas de 8 digitos";
        }
        
        return cadena;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JTextField();
        nueve = new javax.swing.JButton();
        ciete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        Masmenos = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        Punto = new javax.swing.JButton();
        Mult = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        BorraTodo = new javax.swing.JButton();
        BorraraCaracter = new javax.swing.JButton();
        Div = new javax.swing.JButton();
        Pantalla2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla.setEditable(false);
        Pantalla.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaActionPerformed(evt);
            }
        });
        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 55));

        nueve.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nueve.setText("9");
        nueve.setPreferredSize(new java.awt.Dimension(33, 33));
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel1.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 50, 50));

        ciete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ciete.setText("7");
        ciete.setPreferredSize(new java.awt.Dimension(33, 33));
        ciete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cieteActionPerformed(evt);
            }
        });
        jPanel1.add(ciete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));

        ocho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ocho.setText("8");
        ocho.setPreferredSize(new java.awt.Dimension(33, 33));
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel1.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 50, 50));

        cuatro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cuatro.setText("4");
        cuatro.setPreferredSize(new java.awt.Dimension(33, 33));
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel1.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        cinco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cinco.setText("5");
        cinco.setPreferredSize(new java.awt.Dimension(33, 33));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel1.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 50, 50));

        seis.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        seis.setText("6");
        seis.setPreferredSize(new java.awt.Dimension(33, 33));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel1.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 50, 50));

        tres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tres.setText("3");
        tres.setPreferredSize(new java.awt.Dimension(33, 33));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel1.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 50, 50));

        uno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        uno.setText("1");
        uno.setPreferredSize(new java.awt.Dimension(33, 33));
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 50));

        dos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dos.setText("2");
        dos.setPreferredSize(new java.awt.Dimension(33, 33));
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel1.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 50, 50));

        Masmenos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Masmenos.setText("+/-");
        Masmenos.setPreferredSize(new java.awt.Dimension(33, 33));
        Masmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasmenosActionPerformed(evt);
            }
        });
        jPanel1.add(Masmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 60, 60));

        cero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cero.setText("0");
        cero.setPreferredSize(new java.awt.Dimension(33, 33));
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel1.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 50, 50));

        Punto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Punto.setText(".");
        Punto.setPreferredSize(new java.awt.Dimension(33, 33));
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });
        jPanel1.add(Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 50, 50));

        Mult.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Mult.setText("*");
        Mult.setPreferredSize(new java.awt.Dimension(33, 33));
        Mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultActionPerformed(evt);
            }
        });
        jPanel1.add(Mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 50, 50));

        Resta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Resta.setText("-");
        Resta.setPreferredSize(new java.awt.Dimension(33, 33));
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        jPanel1.add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 50, 50));

        Suma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Suma.setText("+");
        Suma.setPreferredSize(new java.awt.Dimension(33, 33));
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        jPanel1.add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 50, 50));

        Igual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Igual.setText("=");
        Igual.setPreferredSize(new java.awt.Dimension(33, 33));
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        jPanel1.add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 50, 50));

        BorraTodo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BorraTodo.setText("AC");
        BorraTodo.setPreferredSize(new java.awt.Dimension(33, 33));
        BorraTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorraTodoActionPerformed(evt);
            }
        });
        jPanel1.add(BorraTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 50, 50));

        BorraraCaracter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BorraraCaracter.setText("C");
        BorraraCaracter.setPreferredSize(new java.awt.Dimension(33, 33));
        BorraraCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorraraCaracterActionPerformed(evt);
            }
        });
        jPanel1.add(BorraraCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 50, 50));

        Div.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Div.setText("/");
        Div.setPreferredSize(new java.awt.Dimension(33, 33));
        Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivActionPerformed(evt);
            }
        });
        jPanel1.add(Div, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 50, 50));

        Pantalla2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pantalla2.setForeground(new java.awt.Color(255, 255, 255));
        Pantalla2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Pantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 6, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"0");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_ceroActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"4");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"1");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"2");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"3");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_tresActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"5");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"6");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_seisActionPerformed

    private void cieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cieteActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"7");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_cieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"8");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
                if(maximo(Pantalla.getText())){
         Pantalla.setText(Pantalla.getText()+"9");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor no puede superar los 8 digitos");
        }
    }//GEN-LAST:event_nueveActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        if(control==0){
         operacion=1;
        op(" + ");           
        }
    }//GEN-LAST:event_SumaActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        if(control==0){
         operacion=2;
        op(" - ");           
        }        
    }//GEN-LAST:event_RestaActionPerformed

    private void MultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultActionPerformed
        if(control==0){
            operacion=3;
            op(" * ");           
        }        
    }//GEN-LAST:event_MultActionPerformed

    private void DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivActionPerformed
        if(control==0){
            operacion=4;
            op(" / ");           
        }
    }//GEN-LAST:event_DivActionPerformed

    private void BorraraCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorraraCaracterActionPerformed
        if(operacion==10 || !Pantalla.getText().equals("")){
            if(Pantalla.getText().length()>1){
                Pantalla.setText(Pantalla.getText().substring(0,Pantalla.getText().length()-1));
            }
            else{
                Pantalla.setText("");
            }
        }
        else{
            operacion=10;
            Pantalla.setText(Pantalla2.getText().substring(0,Pantalla2.getText().length()-3));
            Pantalla2.setText("");
        }
    }//GEN-LAST:event_BorraraCaracterActionPerformed

    private void BorraTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorraTodoActionPerformed
        Pantalla.setText("");
        Pantalla2.setText("");
    }//GEN-LAST:event_BorraTodoActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        if(!Pantalla.getText().contains(".")){
            Pantalla.setText(Pantalla.getText()+".");
        }
    }//GEN-LAST:event_PuntoActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
if(!Pantalla.getText().equals("")){
        switch(operacion){
            case 1:
                control=0;
                numero2=Double.parseDouble(Pantalla.getText());
                Pantalla2.setText(Pantalla2.getText() + Pantalla.getText());
                Pantalla.setText(cero(numero1+numero2));
                break;
            case 2:
                control=0;
                numero2=Double.parseDouble(Pantalla.getText());
                Pantalla2.setText(Pantalla2.getText() + Pantalla.getText());
                System.out.println(numero1 + " " + numero2);
                Pantalla.setText(cero(numero1-numero2));
                break;
            case 3:
                control=0;
                numero2=Double.parseDouble(Pantalla.getText());
                Pantalla2.setText(Pantalla2.getText() + Pantalla.getText());
                Pantalla.setText(cero(numero1*numero2));
                break;
            case 4: 
                control=0;
                numero2=Double.parseDouble(Pantalla.getText());
                Pantalla2.setText(Pantalla2.getText() + Pantalla.getText());
                Pantalla.setText(cero(numero1/numero2));
                break;
            default: 
                JOptionPane.showMessageDialog(null, "No se especifico la operacion");
    }
}
else{
    JOptionPane.showMessageDialog(null, "Coloca el segundo numero");
}
    }//GEN-LAST:event_IgualActionPerformed

    private void MasmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasmenosActionPerformed
        Pantalla.setText(String.valueOf(Integer.parseInt(Pantalla.getText())*-1));
    }//GEN-LAST:event_MasmenosActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorraTodo;
    private javax.swing.JButton BorraraCaracter;
    private javax.swing.JButton Div;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Masmenos;
    private javax.swing.JButton Mult;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JLabel Pantalla2;
    private javax.swing.JButton Punto;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JButton cero;
    private javax.swing.JButton ciete;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton seis;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
