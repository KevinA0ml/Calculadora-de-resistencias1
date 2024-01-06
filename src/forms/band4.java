/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;


import calculadora_resistencia.Constructores.bandas;
import calculadora_resistencia.Constructores.multiplicador1;
import calculadora_resistencia.Constructores.tolerancia1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tato
 */
public class band4 extends javax.swing.JPanel {

    /**
     * Creates new form franjas4
     */
    public band4() {
        initComponents();
        llenarbanda();
    
        
        
        
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        ohms = new javax.swing.JTextField();
        tolerancia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Tolerancia");

        jLabel2.setText("valor de la resistencia :");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("nueva consulta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "elige una opcion", "calcular segun los colores", "calcular segun resistividad" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ohms)
                            .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGap(245, 245, 245))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ohms, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
//
    //
    //variable para mantener la opcion elegida 
    
    int opcion = 0;
// seleccionar opcion para calcular por colores o por resistencia
    //nueva consulta
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            ohms.setEnabled(true);
            tolerancia.setEnabled(true);
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);
            jComboBox3.setEnabled(true);
            jComboBox4.setEnabled(true);
            
            ohms.setText("");
            tolerancia.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
            botones.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed
// boton para realizar la operacion
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // switch para verificar la opcion elegida
        switch(opcion){
            case 1 -> {
                // calculo por los colores
                // valor segun la seleccion del combobox
                int ba1 =    jComboBox1.getSelectedIndex();
                int ba2 =    jComboBox2.getSelectedIndex();
                int ba3 =    jComboBox3.getSelectedIndex();
                int ba4 =    jComboBox4.getSelectedIndex();
                // array del valor
                
                ArrayList<bandas>listcolores = getUsuarios();
                // variable con el valor asignado
                int banda1 = listcolores.get(ba1).getValor();
                int banda2 = listcolores.get(ba2).getValor();
                
                //array del multi
                
                ArrayList<multiplicador1> listaBandas = getmulti();
                
                double banda3 = listaBandas.get(ba3).getMultiplicador();
                
                // array de la tolerancia
                ArrayList<tolerancia1> listatol = gettoler();
                double banda4 = listatol.get(ba4).getTolerancia();
                // llamamos metodo para hacer calculo
                double total =  calc_col(banda1,banda2,banda3);
                // imprimimos en casillas
                ohms.setText(String.valueOf(total)+" ohms");
                tolerancia.setText("+/-  "+String.valueOf(banda4)+"  %");
            }
            
            
            case 2 -> {
                     // calculo por el valor de la resistencia
                
                String resistencia = ohms.getText();
                //resistencia.length();
                int ba1 = Integer.parseInt(resistencia.substring(0, 1));
                int ba2 = Integer.parseInt(resistencia.substring(1, 2));
                String divisor = resistencia.substring(0, 2); 
                double ba3;
                ba3 = (Double.parseDouble(resistencia) / Double.parseDouble(divisor));

                int ba4 = Integer.parseInt(tolerancia.getText());

                
                // array del valor
                
                ArrayList<bandas>listcolores = getUsuarios();
                // variable con el valor asignado
                // banda1
                for (int i = 0; i < listcolores.size(); i++) {
                if (ba1 == listcolores.get(i).getValor()) {
                jComboBox1.setSelectedIndex(i);
                break;
                }
                }    
                //banda2
                for (int i = 0; i < listcolores.size(); i++) {
                if (ba2 == listcolores.get(i).getValor()) {
                jComboBox2.setSelectedIndex(i);
                break;
                }
                } 
                
                
                //array del multi
                
                ArrayList<multiplicador1> listaBandas = getmulti();
                
                for (int i = 0; i < listaBandas.size(); i++) {
                if (ba3 == listaBandas.get(i).getMultiplicador()) {
                jComboBox3.setSelectedIndex(i);
                break;
                }
                } 
                
                // array de la tolerancia
              
                ArrayList<tolerancia1> listatol = gettoler();
                for (int i = 0; i < listatol.size(); i++) {
                if (ba4 == listatol.get(i).getTolerancia()) {
                jComboBox4.setSelectedIndex(i);
                break;
                }
                }         
                
            }

        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        int a = jComboBox7.getSelectedIndex();
        System.out.println(String.valueOf(a));
        switch(a){
            case 1 -> {
                // TODO add your handling code here:
                
                ohms.setEditable(false);
                tolerancia.setEditable(false);
                jComboBox1.setEnabled(true);
                jComboBox2.setEnabled(true);
                jComboBox3.setEnabled(true);
                jComboBox4.setEnabled(true);
                opcion = 1;
            }
            case 2 -> {
                // TODO add your handling code here:
                
                ohms.setEditable(true  );
                tolerancia.setEditable(true);
                jComboBox1.setEnabled(false);
                jComboBox2.setEnabled(false);
                jComboBox3.setEnabled(false);
                jComboBox4.setEnabled(false);
                opcion = 2;
                
                JOptionPane.showMessageDialog(null, "Nota: Ingresar únicamente el valor numérico de los datos", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    
    
    // void para calcular segun los colores 
    private double calc_col (int band1, int band2, double multi){
        
        String strNum1 = Integer.toString(band1);
        String strNum2 = Integer.toString(band2);
        String resultStr = strNum1 + strNum2;
        double bandas = Double.parseDouble(resultStr);
        double restot =  bandas * multi ;
        return restot;
    }
    // void para calcular segun resistencia

    
    
    
    //
    //
    // void para llenar las banadas de colores a elegir
private void llenarbanda(){

        ArrayList<bandas>listcolores = getUsuarios();
        
        // vaciar combobox
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        //llenar combobox
        for (int i = 0; i< listcolores.size(); i++){
        //banda1 
        jComboBox1.addItem(listcolores.get(i).getColor());    
        //banda 2
        jComboBox2.addItem(listcolores.get(i).getColor());  
        
        }
       
           ArrayList<multiplicador1> listaBandas = getmulti();
        // vaciar combobox
        jComboBox3.removeAllItems();
        for (int e = 0; e < listaBandas.size(); e++){
        jComboBox3.addItem(listaBandas.get(e).getColor());  
     
        }

           ArrayList<tolerancia1> listatol = gettoler();
        // vaciar combobox
        jComboBox4.removeAllItems();
        for (int e = 0; e < listatol.size(); e++){
        jComboBox4.addItem(listatol.get(e).getColor());  
     
        }
  
}

// arrays que se hacen con los constructores para llenar los combobox
//valores de bandas 
     public ArrayList<bandas>getUsuarios(){

        ArrayList<bandas> listaBandas = new ArrayList<>();
        
     
        bandas banda = new bandas();
                
        banda.setColor("Negro"); 
        banda.setValor(0);
                   // agregar a la lista
        listaBandas.add(banda);
                
        bandas banda2 = new bandas();
        banda2.setColor("Marron");
        banda2.setValor(1);
        listaBandas.add(banda2);
                
                        bandas banda3 = new bandas();
        banda3.setColor("Rojo");
        banda3.setValor(2);
        listaBandas.add(banda3);
        
                bandas banda4 = new bandas();
        banda4.setColor("Naranja");
        banda4.setValor(3);
        listaBandas.add(banda4);
        
                bandas banda5 = new bandas();
        banda5.setColor("Amarillo");
        banda5.setValor(4);
        listaBandas.add(banda5);
            
                
                        bandas banda6 = new bandas();
        banda6.setColor("Verde");
        banda6.setValor(5);
        listaBandas.add(banda6);
        
                bandas banda7 = new bandas();
        banda7.setColor("Azul");
        banda7.setValor(6);
        listaBandas.add(banda7);
        
                bandas banda8 = new bandas();
        banda8.setColor("violeta");
        banda8.setValor(7);
        listaBandas.add(banda8);
        
                bandas banda9 = new bandas();
        banda9.setColor("Gris");
        banda9.setValor(8);
        listaBandas.add(banda9);
        
                bandas banda10 = new bandas();
        banda10.setColor("Blanco");
        banda10.setValor(9);
        listaBandas.add(banda10);    
      return listaBandas;
    }
// multiplicador
          public ArrayList<multiplicador1>getmulti(){

        ArrayList<multiplicador1> listaBandas = new ArrayList<>();
        

                multiplicador1 banda = new multiplicador1();                
                banda.setColor("Negro");
                banda.setMultiplicador(1);
                // agregar a la lista
                listaBandas.add(banda);
                
        multiplicador1 banda1 = new multiplicador1();   
        banda1.setColor("Marron");
        banda1.setMultiplicador(10.0);
        listaBandas.add(banda1);
        
        multiplicador1 banda2 = new multiplicador1();   
        banda2.setColor("Rojo");
        banda2.setMultiplicador(100.0);
        listaBandas.add(banda2);
 
        multiplicador1 banda3 = new multiplicador1();   
        banda3.setColor("Naranja");
        banda3.setMultiplicador(1000.0);
        listaBandas.add(banda3);
        
        multiplicador1 banda4 = new multiplicador1();   
        banda4.setColor("Amarillo");
        banda4.setMultiplicador(10000.0);
        listaBandas.add(banda4);
       
        multiplicador1 banda5 = new multiplicador1();   
        banda5.setColor("Verde");
        banda5.setMultiplicador(100000.0);
        listaBandas.add(banda5);
        
        multiplicador1 banda6 = new multiplicador1();   
        banda6.setColor("Azul");
        banda6.setMultiplicador(1000000.0);
        listaBandas.add(banda6);
       
        multiplicador1 banda7 = new multiplicador1();   
        banda7.setColor("Violeta");
        banda7.setMultiplicador(10000000.0);
        listaBandas.add(banda7);
        
                multiplicador1 banda8 = new multiplicador1();   
        banda8.setColor("Gris");
        banda8.setMultiplicador(100000000.0);
        listaBandas.add(banda8);
        
                multiplicador1 banda9 = new multiplicador1();   
        banda9.setColor("Blanco");
        banda9.setMultiplicador(1000000000.0);
        listaBandas.add(banda9);
        
                multiplicador1 banda10 = new multiplicador1();   
        banda10.setColor("Dorado");
        banda10.setMultiplicador(0.1);
        listaBandas.add(banda10);
        
                multiplicador1 banda11 = new multiplicador1();   
        banda11.setColor("Plateado");
        banda11.setMultiplicador(0.01);
        listaBandas.add(banda11);
        
                
                

      return listaBandas;
    }
// tolerancia
              public ArrayList<tolerancia1>gettoler(){

        ArrayList<tolerancia1> listatolerancia = new ArrayList<>();
        
            
                tolerancia1 banda = new tolerancia1();
                banda.setColor("Marron");
                banda.setTolerancia(1);
                // agregar a la lista
                listatolerancia.add(banda);

                tolerancia1 banda1 = new tolerancia1();
                banda1.setColor("Rojo");
                banda1.setTolerancia(2);
                // agregar a la lista
                listatolerancia.add(banda1);
    
                tolerancia1 banda2 = new tolerancia1();
                banda2.setColor("Dorado");
                banda2.setTolerancia(5);
                // agregar a la lista
                listatolerancia.add(banda2);
                
                tolerancia1 banda3 = new tolerancia1();
                banda3.setColor("Plateado");
                banda3.setTolerancia(10);
                // agregar a la lista
                listatolerancia.add(banda3);
                
                tolerancia1 banda4 = new tolerancia1();
                banda4.setColor("Vacio");
                banda4.setTolerancia(20);
                // agregar a la lista
                listatolerancia.add(banda4);
                

                
    
                return listatolerancia;
    }
















    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField ohms;
    private javax.swing.JTextField tolerancia;
    // End of variables declaration//GEN-END:variables
}
