package lk.ijse.onspot.view;

import java.awt.event.KeyEvent;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Van", "Car", "Bus", "Bicycle" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      if (jComboBox1.getSelectedItem().toString().equals("Van")){

          van.setVisible(true); 
      }
       if (jComboBox1.getSelectedItem().toString().equals("Car")){
          
          car.setVisible(true); 
      }
        if (jComboBox1.getSelectedItem().toString().equals("Bus")){
            
            bus.setVisible(true);
      }
         if (jComboBox1.getSelectedItem().toString().equals("Bicycle")){
                
                bic.setVisible(true);
      }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
             if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                 if (jComboBox1.getSelectedItem().toString().equals("Van")){
                     this.van.setcount(this.jTextField2.getText()+"");
            }
                 if (jComboBox1.getSelectedItem().toString().equals("Car")){
                         this.car.setcount(this.jTextField2.getText()+"");
            }
                 if (jComboBox1.getSelectedItem().toString().equals("Bus")){
                         this.bus.setcount(this.jTextField2.getText()+"");
            }
                 if (jComboBox1.getSelectedItem().toString().equals("Bicycle")){
                         this.bic.setcount(this.jTextField2.getText()+"");
            }
     
                
    }//GEN-LAST:event_jTextField2KeyPressed
        }
 
    
    
    private CarForm car = new CarForm();;
    private BusForm bus = new BusForm();;
    private BicycleForm bic = new BicycleForm();;
    private VanForm van = new VanForm(); ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
