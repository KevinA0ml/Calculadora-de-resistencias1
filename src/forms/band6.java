/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;


import calculadora_resistencia.Constructores.bandas;
import calculadora_resistencia.Constructores.multiplicador2;
import calculadora_resistencia.Constructores.temperatura;
import calculadora_resistencia.Constructores.tolerancia1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tato
 */
public class band6 extends javax.swing.JPanel {

    /**
     * Creates new form franjas6
     */
    public band6() {
        initComponents();
        habilitarcombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        tolerancia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ohms = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        temperaturax = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jLabel4.setText("temperatura");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(19, 19, 19))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(30, 30, 30))))
                        .addComponent(jLabel2))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(temperaturax, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ohms)
                                .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(129, 129, 129))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(temperaturax, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ohms, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //
    //
    //variable para mantener la opcion elegida 
    int opcion;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ohms.setEditable(true);
            tolerancia.setEditable(true);
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);
            jComboBox3.setEnabled(true);
            jComboBox4.setEnabled(true);
            jComboBox5.setEnabled(true);
            jComboBox6.setEnabled(true);
            
            ohms.setText("");
            tolerancia.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
            jComboBox5.setSelectedIndex(0);
            jComboBox6.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      

        
        switch(opcion){
            case 1 -> {
                // calculo por los colores
                // valor segun la seleccion del combobox
                int ba1 =    jComboBox1.getSelectedIndex();
                int ba2 =    jComboBox2.getSelectedIndex();
                int ba3 =    jComboBox3.getSelectedIndex();
                int ba4 =    jComboBox4.getSelectedIndex();
                int ba5 =    jComboBox5.getSelectedIndex();
                int ba6 =    jComboBox6.getSelectedIndex();
                // array del valor 
                
                ArrayList<bandas>listcolores = getUsuarios();
                // variable con el valor asignado
                int banda1 = listcolores.get(ba1).getValor();
                int banda2 = listcolores.get(ba2).getValor();
                int banda3 = listcolores.get(ba3).getValor();
                //array del multi
                ArrayList<multiplicador2> listaBandas = getmulti();
                
                double banda4 = listaBandas.get(ba4).getMultiplicador();
                // array tolerancia
                // array de la tolerancia
                ArrayList<tolerancia1> listatol = obtenerTolerancias();
                double banda5 = listatol.get(ba5).getTolerancia();
                // llamamos metodo para hacer calculo
                ArrayList<temperatura> listatemp = obtenerTemp();
                double banda6 = listatemp.get(ba6).getValor();
                
                int total =  calculoCol(banda1,banda2,banda3,banda4);
                // imprimimos en casillas
                ohms.setText(String.valueOf(total)+ "  ohms");
                tolerancia.setText("+/-  "+String.valueOf(banda5)+"  %");
                temperaturax.setText(String.valueOf(banda6)+"  ppm");
            }
            case 2 -> {
                // calculo por el valor de la resistencia
                
                // calculo por el valor de la resistencia
                String resistencia = ohms.getText();

                
                int ba1 = Integer.parseInt(resistencia.substring(0, 1));
                int ba2 = Integer.parseInt(resistencia.substring(1, 2));
                int ba3 = Integer.parseInt(resistencia.substring(2, 3));
                String divisor = resistencia.substring(0, 3);
                double ba4;
                ba4 = (Double.parseDouble(resistencia) / Double.parseDouble(divisor));
                
                double ba5 = Double.parseDouble(tolerancia.getText());
                double ba6 = Double.parseDouble(temperaturax.getText());
                
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
                //banda3
                for (int i = 0; i < listcolores.size(); i++) {
                if (ba3 == listcolores.get(i).getValor()) {
                jComboBox3.setSelectedIndex(i);
                break;
                }
                } 
                //array del multi
                ArrayList<multiplicador2> listaBandas = getmulti();
                // banda4
                for (int i = 0; i < listaBandas.size(); i++) {
                if (ba4 == listaBandas.get(i).getMultiplicador()) {
                jComboBox4.setSelectedIndex(i);
                break;
                }
                } 
                // banda5
                ArrayList<tolerancia1> listatol = obtenerTolerancias();
                for (int i = 0; i < listatol.size(); i++) {
                if (ba5 == listatol.get(i).getTolerancia()) {
                jComboBox5.setSelectedIndex(i);
                //banda6
                }
                }
                //banda6
                ArrayList<temperatura> listatemp = obtenerTemp();
                 for (int i = 0; i < listatemp.size(); i++) {
                if (ba6 == listatemp.get(i).getValor()) {
                jComboBox6.setSelectedIndex(i);
                }
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        int a = jComboBox7.getSelectedIndex();
        switch(a){
            case 1 -> {
                // TODO add your handling code here:
                
                
                temperaturax.setEditable(false);
                ohms.setEditable(false);
                tolerancia.setEditable(false);
                jComboBox1.setEnabled(true);
                jComboBox2.setEnabled(true);
                jComboBox3.setEnabled(true);
                jComboBox4.setEnabled(true);
                jComboBox5.setEnabled(true);
                jComboBox6.setEnabled(true);
                opcion = 1;
            }
            case 2 -> {
                // TODO add your handling code here:
                
                
                temperaturax.setEditable(true);
                ohms.setEditable(true  );
                tolerancia.setEditable(true);
                jComboBox1.setEnabled(false);
                jComboBox2.setEnabled(false);
                jComboBox3.setEnabled(false);
                jComboBox4.setEnabled(false);
                jComboBox5.setEnabled(false);
                jComboBox6.setEnabled(false);
                opcion = 2;
                
                JOptionPane.showMessageDialog(null, "ingresar unicamente valores aceptables", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    
    
    
    // void para calcular segun los colores 
    private int calculoCol (int band1, int band2,int band3, double multi){
        
        String strNum1 = Integer.toString(band1);
        String strNum2 = Integer.toString(band2);
        String strNum3 = Integer.toString(band3);
        String resultStr = strNum1 + strNum2+strNum3;
        double bandas = Double.parseDouble(resultStr);
        int restot =(int) ((int)bandas*multi);
        return restot;
    }
    
    
    
    
    
    private void habilitarcombobox(){
    // rellenar combobox de bandas (1,2,3)
      
        ArrayList<bandas>listcolores = getUsuarios();
        // vaciar combobox
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();
        //llenar combobox
        for (int i = 0; i< listcolores.size(); i++){
        //banda1 
        jComboBox1.addItem(listcolores.get(i).getColor());    
        //banda 2
        jComboBox2.addItem(listcolores.get(i).getColor());  
        //banda 3
        jComboBox3.addItem(listcolores.get(i).getColor());
        }
        //rellenar multiplicador (4)
           ArrayList<multiplicador2> listaBandas = getmulti();
        // vaciar combobox
        jComboBox4.removeAllItems();
        for (int e = 0; e < listaBandas.size(); e++){
        jComboBox4.addItem(listaBandas.get(e).getColor());  
     
        }
        // rellenar tolerancia (5)
        // Llama al método obtenerTolerancias de la misma clase
        ArrayList<tolerancia1> listatol = obtenerTolerancias();
        // Vaciar el combobox
        jComboBox5.removeAllItems();
        for (int e = 0; e < listatol.size(); e++) {
        jComboBox5.addItem(listatol.get(e).getColor()); 
        }
                // rellenar temperatura (6)
        // Llama al método obtenerTolerancias de la misma clase
        ArrayList<temperatura> listatemp = obtenerTemp();
        // Vaciar el combobox
        jComboBox6.removeAllItems();
        for (int e = 0; e < listatemp.size(); e++) {
        jComboBox6.addItem(listatemp.get(e).getColor()); 
        }
        
        
        

    }
    
    // arrays que se hacen con los constructores para llenar combobox
    //bandas normales
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
                 //multiplicador
    // metodo para hacer la consulta a base de datos y llenar jcombobox 
         public ArrayList<multiplicador2>getmulti(){
                ArrayList<multiplicador2> listaBandas = new ArrayList<>();
        

                multiplicador2 banda = new multiplicador2();                
                banda.setColor("Negro");
                banda.setMultiplicador(1);
                // agregar a la lista
                listaBandas.add(banda);
                
        multiplicador2 banda1 = new multiplicador2();   
        banda1.setColor("Marron");
        banda1.setMultiplicador(10.0);
        listaBandas.add(banda1);
        
        multiplicador2 banda2 = new multiplicador2();   
        banda2.setColor("Rojo");
        banda2.setMultiplicador(100.0);
        listaBandas.add(banda2);
 
        multiplicador2 banda3 = new multiplicador2();   
        banda3.setColor("Naranja");
        banda3.setMultiplicador(1000.0);
        listaBandas.add(banda3);
        
        multiplicador2 banda4 = new multiplicador2();   
        banda4.setColor("Amarillo");
        banda4.setMultiplicador(10000.0);
        listaBandas.add(banda4);
       
        multiplicador2 banda5 = new multiplicador2();   
        banda5.setColor("Verde");
        banda5.setMultiplicador(100000.0);
        listaBandas.add(banda5);
        
        multiplicador2 banda6 = new multiplicador2();   
        banda6.setColor("Azul");
        banda6.setMultiplicador(1000000.0);
        listaBandas.add(banda6);
       
        multiplicador2 banda7 = new multiplicador2();   
        banda7.setColor("Violeta");
        banda7.setMultiplicador(10000000.0);
        listaBandas.add(banda7);
        
        
                multiplicador2 banda10 = new multiplicador2();   
        banda10.setColor("Dorado");
        banda10.setMultiplicador(0.1);
        listaBandas.add(banda10);
        
                multiplicador2 banda11 = new multiplicador2();   
        banda11.setColor("Plateado");
        banda11.setMultiplicador(0.01);
        listaBandas.add(banda11);
      return listaBandas;
    }
    //tolerancia
 // metodo para hacer la consulta a base de datos y llenar jcombobox de tolerancia
    public static ArrayList<tolerancia1> obtenerTolerancias() {
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
                banda2.setColor("Verde");
                banda2.setTolerancia(0.5);
                // agregar a la lista
                listatolerancia.add(banda2);
                
                tolerancia1 banda3 = new tolerancia1();
                banda3.setColor("Azul");
                banda3.setTolerancia(0.25);
                // agregar a la lista
                listatolerancia.add(banda3);
                
                tolerancia1 banda4 = new tolerancia1();
                banda4.setColor("Violeta");
                banda4.setTolerancia(0.10);
                // agregar a la lista
                listatolerancia.add(banda4);
     
                tolerancia1 banda5 = new tolerancia1();
                banda5.setColor("Dorado");
                banda5.setTolerancia(5);
                // agregar a la lista
                listatolerancia.add(banda5);
                
                tolerancia1 banda6 = new tolerancia1();
                banda6.setColor("Dorado");
                banda6.setTolerancia(5);
                // agregar a la lista
                listatolerancia.add(banda6);
        return listatolerancia;
    }
    
    
        //temperatura
      // metodo para hacer la consulta a base de datos y llenar jcombobox 
    public static ArrayList<temperatura> obtenerTemp() {
    
        ArrayList<temperatura> listatemp = new ArrayList<>();


                temperatura banda = new temperatura();

        banda.setColor("Negro"); 
        banda.setValor(250);
                   // agregar a la lista
        listatemp.add(banda);
                
       temperatura banda2 = new temperatura();
        banda2.setColor("Marron");
        banda2.setValor(100);
        listatemp.add(banda2);
                
        temperatura banda3 = new temperatura();
        banda3.setColor("Rojo");
        banda3.setValor(50);
        listatemp.add(banda3);
        
        temperatura banda4 = new temperatura();
        banda4.setColor("Naranja");
        banda4.setValor(15);
        listatemp.add(banda4);
        
        temperatura banda5 = new temperatura();
        banda5.setColor("Amarillo");
        banda5.setValor(25);
        listatemp.add(banda5);
            
                
        temperatura banda6 = new temperatura();
        banda6.setColor("Verde");
        banda6.setValor(20);
        listatemp.add(banda6);
        
        temperatura banda7 = new temperatura();
        banda7.setColor("Azul");
        banda7.setValor(10);
        listatemp.add(banda7);
        
        temperatura banda8 = new temperatura();
        banda8.setColor("violeta");
        banda8.setValor(5);
        listatemp.add(banda8);
        
        temperatura banda9 = new temperatura();
        banda9.setColor("Gris");
        banda9.setValor(1);
        listatemp.add(banda9);
           
        return listatemp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField ohms;
    private javax.swing.JTextField temperaturax;
    private javax.swing.JTextField tolerancia;
    // End of variables declaration//GEN-END:variables
}
