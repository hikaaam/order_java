package crud;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilyas
 */
public class order_complete extends javax.swing.JFrame {

    /**
     * Creates new form order4
     */
    public order_complete() {
        initComponents();
        tampilkansemuadatauser();
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
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton7.setText("home");

        jButton8.setText("search");

        jButton9.setText("my products");

        jButton10.setText("my cart");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("incoming orders");

        jButton12.setText("my profile");

        jButton13.setText("sign out");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        jButton14.setText("incoming orders");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 240, 240));
        jButton15.setText("completed orders");

        jButton1.setText("detail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("delete order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15)))
                .addGap(0, 193, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.setVisible(false);
        new order_incoming().setVisible(true);
        order_incoming.user.setText(login_aplikasi.id);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
detail();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(order_complete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order_complete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order_complete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order_complete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order_complete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

     public void tampilkansemuadatauser()
  {
      koneksi DB = new koneksi();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
                   Object header[]={"id","no","costumer name","address","total","created at","status"};
DefaultTableModel data = new DefaultTableModel(null, header);
tabel.setModel(data);
        try {
           String sql = "SELECT product_id,order_id,nama_user,address,total,tanggal,status from orders2 where status=3" ;
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
               
           String kolom1 = rs.getString(1);
           String kolom2 = rs.getString(2);
           String kolom3 =rs.getString(3);
           String kolom4 = rs.getString(4);
           String kolom5 ="Rp. " +rs.getString(5);
           String kolom6 = rs.getString(6);
           String kolom7 = rs.getString(7);
          String status = null;
           if(kolom7.equals("1"))
           {
               status = "new";
           }
           else if(kolom7.equals("2"))
                   {
                      status = "confirm"; 
                   }
                      else if(kolom7.equals("3"))
                   {
                      status = "delivered"; 
                   }
               
           String kolom[] = {kolom1, kolom2, kolom3, kolom4, kolom5,kolom6,status};
           data.addRow(kolom);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
  }
     
      public void detail()
      {int row = tabel.getSelectedRow();
          koneksi DB = new koneksi();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        String order_id;
        if(row>=0)
        { 
        String pilih = tabel.getValueAt(tabel.getSelectedRow(), 1).toString();
         String sql = "select product_id,nama,price,qty,tanggal,status,address from orders where order_id = '" +pilih +"'";
        order_id = pilih;
            
        Object header[]={"id","name","price","qty","total","updated at"};
DefaultTableModel data = new DefaultTableModel(null, header);
       

            this.setVisible(false);
            new order_detail().setVisible(true);
            order_detail.noorder.setText(order_id);
            order_detail.tabel.setModel(data);
            try { ResultSet rs = stat.executeQuery(sql);
     while(rs.next())
      {
                                                  
           String kolom1 = rs.getString(1);
           String kolom2 = rs.getString(2);
           String kolom3 ="Rp. "+rs.getString(3);
           String kolom4 = rs.getString(4);
           int a= rs.getInt(3);
           int b= rs.getInt(4);
           int c= a*b;
           String status=null;
           String kolom5 ="Rp. " +c;
           String kolom6 = rs.getString(5);
           String kolom7 = rs.getString(6);
           String kolom8 = rs.getString(7);
           String address = kolom8;
           if(kolom7.equals("1"))
           {
               status = "new";
           }
           else if(kolom7.equals("2"))
                   {
                      status = "confirm"; 
                   }
                      else if(kolom7.equals("3"))
                   {
                      status = "delivered"; 
                   }
                      else if(kolom7.equals("4"))
                      {
                          status = "paid";
                      }
                                     
        String kolom[] = {kolom1, kolom2, kolom3, kolom4, kolom5,kolom6};
           data.addRow(kolom); 
           
           order_detail.status.setText(status);
           order_detail.alamat.setText(address);
           order_detail.user.setText(login_aplikasi.id);
                                       }
                                   }
                                   catch(Exception e)
                                   {
                                       JOptionPane.showMessageDialog(this, e.getMessage());
                                   }
                }
  
        else
        {
            JOptionPane.showMessageDialog(null, "silahkan pilih order yang ingin di proses");
        }

      }
      
}
