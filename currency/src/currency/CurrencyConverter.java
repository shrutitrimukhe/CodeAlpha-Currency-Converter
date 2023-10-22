package currency;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CurrencyConverter extends javax.swing.JFrame {
	
	private javax.swing.JComboBox choiceFrom;
    private javax.swing.JComboBox choiceTo;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel output;
    private javax.swing.JLabel title;
	
	public CurrencyConverter() {
        initComponents();
    }

	
	private void initComponents() {
		
		 title = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        input = new javax.swing.JTextField();
	        choiceFrom = new javax.swing.JComboBox();
	        choiceTo = new javax.swing.JComboBox();
	        output = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(0, 0, 0));

	        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
	        title.setText("Currency Converter");
	        title.setVerifyInputWhenFocusTarget(false);

	        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        jButton1.setText("CONVERT");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });
	        
	        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
	        jLabel1.setText("Enter Amount ");

	        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
	        jLabel2.setText("Convert From");

	        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
	        jLabel3.setText("Convert To");

	        input.setFont(new java.awt.Font("Times New Roman", 0, 18));
	        input.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                actionPerformed(evt);
	            }
	        });

	        choiceFrom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        choiceFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "JPY" }));
	        choiceFrom.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                itemStateChanged(evt);
	            }
	        });
	        
	        choiceTo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
	        choiceTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR", "USD", "EUR", "JPY" }));
	        choiceTo.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                itemStateChanged(evt);
	            }
	        });

	        output.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
	        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	        
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(228, 228, 228)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel1)
	                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(52, 52, 52)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(input)
	                            .addComponent(choiceFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(choiceTo, 0, 231, Short.MAX_VALUE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(322, 322, 322)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(203, 203, 203)
	                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(0, 94, Short.MAX_VALUE)
	                .addComponent(title)
	                .addGap(93, 93, 93))
	        );
	        
	        layout.setVerticalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addGap(34, 34, 34)
	                    .addComponent(title)
	                    .addGap(50, 50, 50)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jLabel1))
	                    .addGap(45, 45, 45)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jLabel2)
	                        .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(52, 52, 52)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jLabel3)
	                        .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(68, 68, 68)
	                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(32, 32, 32)
	                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(42, Short.MAX_VALUE))
	            );
	         pack();
	}
	        
	       
	        
	        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Double total;
		Double amount= Double.parseDouble(input.getText());
		
        //CONVERSION FROM USD to
        //if USD is converted to
        switch (choiceFrom.getSelectedItem().toString()) {
        
        case "USD":
            //INR
            switch (choiceTo.getSelectedItem().toString()) {
                case "INR":
                    total=amount*83.1775;
                    output.setText(input.getText()+" USD = "+total+" INR");
                    break;
                case "EUR":
                    total=amount*0.94515;
                    output.setText(input.getText()+" USD = "+total+" EUR");
                    break;
                case "JPY":
                    total=amount*149.38;
                    output.setText(input.getText()+" USD = "+total+" JPY");
                    break;
                default:
                    total=amount*1;
                    output.setText(input.getText()+" USD = "+total+" USD");
                    break;
                    
            }
            break;
        
        case "INR":
            //USD
            switch (choiceTo.getSelectedItem().toString()) {
                case "USD":
                    total=amount*0.0120;
                    output.setText(input.getText()+" INR = "+total+" USD");
                    break;
                case "EUR":
                    total=amount*0.01139;
                    output.setText(input.getText()+" INR = "+total+" EUR");
                    break;
                    
                case "JPY":
                    total=amount*1.80;
                    output.setText(input.getText()+" INR = "+total+" JPY");
                    break;
                default:
                    total=amount*1;
                    output.setText(input.getText()+" INR = "+total+" INR");
                    break;
            }
            break;
                 
        case "EUR":
            //USD
            switch (choiceTo.getSelectedItem().toString()) {
                case "USD":
                    total=amount*1.06;
                    output.setText(input.getText()+" EUR = "+total+" USD");
                    break;
                case "INR":
                    total=amount*88.10;
                    output.setText(input.getText()+" EUR = "+total+" INR");
                    break;
                case "JPY":
                    total=amount*158.15;
                    output.setText(input.getText()+" EUR = "+total+" JPY");
                    break;
               default:
                    total=amount*1;
                    output.setText(input.getText()+" EUR = "+total+" EUR");
                    break;
            }
            break;
                
        
        
	        case "JPY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.0067;
                        output.setText(input.getText()+" JPY = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*0.56;
                        output.setText(input.getText()+" JPY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.0063;
                        output.setText(input.getText()+" JPY = "+total+" EUR");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" JPY = "+total+" JPY");
                        break;
                }
                break;
             }
      }
	        
	        public static void main(String args[]) {
	            
	            java.awt.EventQueue.invokeLater(new Runnable() {
	                public void run() {
	                    new CurrencyConverter().setVisible(true);
	                }
	            });
	        }

}