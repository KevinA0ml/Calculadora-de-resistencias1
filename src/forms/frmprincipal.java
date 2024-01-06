/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.awt.Color;
/**
 *
 * @author tato
 */
public class frmprincipal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public frmprincipal() {
        initComponents();
        // establece color de fondo 
        Color col =new Color(199,181,242);
                this.getContentPane().setBackground(col);
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        content = new javax.swing.JPanel();
        fran4 = new javax.swing.JRadioButton();
        fran5 = new javax.swing.JRadioButton();
        fran6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        content.setBackground(new java.awt.Color(102, 102, 102));
        content.setPreferredSize(new java.awt.Dimension(947, 625));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fran4.setText("resistencia de 4 franjas");
        fran4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fran4ActionPerformed(evt);
            }
        });

        fran5.setText("resistencia de 5 franjas");
        fran5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fran5ActionPerformed(evt);
            }
        });

        fran6.setText("resistencia de 6 franjas");
        fran6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fran6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fran4)
                    .addComponent(fran5)
                    .addComponent(fran6))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(fran4)
                .addGap(31, 31, 31)
                .addComponent(fran5)
                .addGap(36, 36, 36)
                .addComponent(fran6)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// instanci y llama al formulario band4 al jpanel
    
    private void fran4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fran4ActionPerformed
        // TODO add your handling code here:
        botones.add(fran4);
        botones.add(fran5);
        botones.add(fran6);
        if(botones.getSelection()== null){
            return;
        }
             //instancia
     band4 fr4 = new band4();
     fr4.setSize(947, 625);
     fr4.setLocation(0,0);
    content.removeAll();
     content.add(fr4);
     content.revalidate();
     content.repaint();
    }//GEN-LAST:event_fran4ActionPerformed
// instanci y llama al formulario band5 al jpanel
    private void fran5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fran5ActionPerformed
        // TODO add your handling code here:
        botones.add(fran4);
        botones.add(fran5);
        botones.add(fran6);
        if(botones.getSelection()== null){
            return;
        }
         //instancia
     band5 fr5 = new band5();
     fr5.setSize(947, 625);
     fr5.setLocation(0,0);

     content.removeAll();
     content.add(fr5);    
     content.revalidate();
     content.repaint();
    }//GEN-LAST:event_fran5ActionPerformed
// instanci y llama al formulario band6 al jpanel
    private void fran6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fran6ActionPerformed
        // TODO add your handling code here:
                botones.add(fran4);
        botones.add(fran5);
        botones.add(fran6);
        if(botones.getSelection()== null){
            return;
        }
        //instancia
     band6 fr6 = new band6();
     fr6.setSize(947, 625);
     fr6.setLocation(0,0);
     content.removeAll();
     content.add(fr6);
     content.revalidate();
     content.repaint();
    }//GEN-LAST:event_fran6ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JPanel content;
    private javax.swing.JRadioButton fran4;
    private javax.swing.JRadioButton fran5;
    private javax.swing.JRadioButton fran6;
    // End of variables declaration//GEN-END:variables
}
