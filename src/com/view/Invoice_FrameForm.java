 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */


package com.view;

import  com.controller.Controller;
import com.model.InvoiceH;
import com.model.invoiceTable;
import java.util.ArrayList;
import javax.swing.*;

public class Invoice_FrameForm extends JFrame {


        /**
         * Creates new form Invoice_FrameForm
         */
        public Invoice_FrameForm() {
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

            jScrollPane1 = new javax.swing.JScrollPane();
            table_Invoice = new javax.swing.JTable();
            table_Invoice.getSelectionModel().addListSelectionListener(controller);
            create_Invoice_btn = new javax.swing.JButton();
            create_Invoice_btn.addActionListener(controller);
            delete_Invoice_btn = new javax.swing.JButton();
            delete_Invoice_btn.addActionListener(controller);
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            invoice_Line = new javax.swing.JTable();
            create_Line_btn = new javax.swing.JButton();
            create_Line_btn.addActionListener(controller);
            delete_Line_btn = new javax.swing.JButton();
            delete_Line_btn.addActionListener(controller);
            invNumLbl = new javax.swing.JLabel();
            invDateLbl = new javax.swing.JLabel();
            invNameLbl = new javax.swing.JLabel();
            invTotalLbl = new javax.swing.JLabel();
            jMenuBar1 = new javax.swing.JMenuBar();
            jMenu1 = new javax.swing.JMenu();
            loadFile_MenuItem = new javax.swing.JMenuItem();
            loadFile_MenuItem.addActionListener(controller);
            saveFile_MenuItem = new javax.swing.JMenuItem();
            saveFile_MenuItem.addActionListener(controller);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            table_Invoice.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {

                    }
            ));
            jScrollPane1.setViewportView(table_Invoice);

            create_Invoice_btn.setText("Create New Invoice");
            create_Invoice_btn.setActionCommand("Create_New_Invoice");
            create_Invoice_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    create_Invoice_btnActionPerformed(evt);
                }
            });

            delete_Invoice_btn.setText("Delete Invoice");
            delete_Invoice_btn.setActionCommand("Delete_Invoice");

            jLabel1.setText("Invoice Number");

            jLabel2.setText("Invoice Date");

            jLabel3.setText("Invoice Name");

            jLabel4.setText("Invoice Total");

            invoice_Line.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {

                    }
            ));
            jScrollPane2.setViewportView(invoice_Line);

            create_Line_btn.setText("Create New Item");
            create_Line_btn.setActionCommand("Create_New_Item");

            delete_Line_btn.setText("Delete Item");
            delete_Line_btn.setActionCommand("Delete_Item");

            invNumLbl.setText(".");

            invDateLbl.setText(".");

            invNameLbl.setText(".");

            invTotalLbl.setText(".");

            jMenu1.setText("File");

            loadFile_MenuItem.setText("Load File");
            loadFile_MenuItem.setActionCommand("Load_File");
            jMenu1.add(loadFile_MenuItem);

            saveFile_MenuItem.setText("Save File");
            saveFile_MenuItem.setActionCommand("Save_File");
            jMenu1.add(saveFile_MenuItem);

            jMenuBar1.add(jMenu1);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(53, 53, 53)
                                                    .addComponent(create_Invoice_btn)
                                                    .addGap(180, 180, 180)
                                                    .addComponent(delete_Invoice_btn))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(86, 86, 86)
                                                    .addComponent(create_Line_btn)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(delete_Line_btn)
                                                    .addGap(49, 49, 49))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel1)
                                                                            .addComponent(jLabel2)
                                                                            .addComponent(jLabel3)
                                                                            .addComponent(jLabel4))
                                                                    .addGap(18, 18, 18)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(invTotalLbl)
                                                                            .addComponent(invNameLbl)
                                                                            .addComponent(invDateLbl)
                                                                            .addComponent(invNumLbl))))
                                                    .addContainerGap(22, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel1)
                                                            .addComponent(invNumLbl))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel2)
                                                            .addComponent(invDateLbl))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(invNameLbl))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel4)
                                                            .addComponent(invTotalLbl))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(create_Line_btn)
                                            .addComponent(delete_Line_btn)
                                            .addComponent(delete_Invoice_btn)
                                            .addComponent(create_Invoice_btn))
                                    .addContainerGap(26, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void create_Invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_Invoice_btnActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_create_Invoice_btnActionPerformed

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
                java.util.logging.Logger.getLogger(Invoice_FrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Invoice_FrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Invoice_FrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Invoice_FrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Invoice_FrameForm().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton create_Invoice_btn;
        private javax.swing.JButton create_Line_btn;
        private javax.swing.JButton delete_Invoice_btn;
        private javax.swing.JButton delete_Line_btn;
        private javax.swing.JLabel invDateLbl;
        private javax.swing.JLabel invNameLbl;
        private javax.swing.JLabel invNumLbl;
        private javax.swing.JLabel invTotalLbl;
        private javax.swing.JTable invoice_Line;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JMenuItem loadFile_MenuItem;
        private javax.swing.JMenuItem saveFile_MenuItem;
        private javax.swing.JTable table_Invoice;
        // End of variables declaration//GEN-END:variables

        private ArrayList<InvoiceH> invoices;

        private Controller controller = new Controller(this);

        private invoiceTable inv_T_M;

        public ArrayList<InvoiceH> getInvoices() {
            return invoices;
        }

        public void setInvoices(ArrayList<InvoiceH> invoices) {
            this.invoices = invoices;
        }

        public invoiceTable getInv_T_M() {
            return inv_T_M;
        }

        public void setInv_T_M(invoiceTable inv_T_M) {
            this.inv_T_M = inv_T_M;
        }

        public JTable getTable_Invoice() {
            return table_Invoice;
        }

        public void setTable_Invoice(JTable table_Invoice) {
            this.table_Invoice = table_Invoice;
        }

        public JTable getInvoice_Line() {
            return invoice_Line;
        }

        public void setInvoice_Line(JTable invoice_Line) {
            this.invoice_Line = invoice_Line;
        }

        public JLabel getInvDateLbl() {
            return invDateLbl;
        }

        public void setInvDateLbl(JLabel invDateLbl) {
            this.invDateLbl = invDateLbl;
        }

        public JLabel getInvNameLbl() {
            return invNameLbl;
        }

        public void setInvNameLbl(JLabel invNameLbl) {
            this.invNameLbl = invNameLbl;
        }

        public JLabel getInvNumLbl() {
            return invNumLbl;
        }

        public void setInvNumLbl(JLabel invNumLbl) {
            this.invNumLbl = invNumLbl;
        }

        public JLabel getInvTotalLbl() {
            return invTotalLbl;
        }

        public void setInvTotalLbl(JLabel invTotalLbl) {
            this.invTotalLbl = invTotalLbl;
        }

        public Controller getController() {
            return controller;
        }

        public void setController(Controller controller) {
            this.controller = controller;
        }

        public int get_Next_InvoNum(){
            int n = 0;
            for (InvoiceH invo : invoices){
                if (invo.getNum() > n ){
                    n = invo.getNum();
                }

            }
            return ++n ;
        }




    }


