/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhap;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author LENOVO
 */
public class ThongKe extends javax.swing.JPanel {

    /**
     * Creates new form ThongKe
     */
    public ThongKe() {
        initComponents();
        taiml1();
        taiml2();
        taiml3();
        taiml4();
        taiBieuDo(jPanel1);
        tainu();
        tainam();
        taiBieuDo1(jPanel2);
    }
    public void taiml1() {    
        try {
            DBConnection a = new DBConnection();
            Connection conn = a.getConnection();
            PreparedStatement t1 = conn.prepareStatement("select COUNT(ma_hoc_vien) as 'Tổng số học viên đăng ký' from lop_hoc where ma_lop_hoc =? group by ma_lop_hoc ");
            t1.setString(1,jLabel3.getText());
            
            ResultSet rs1 = t1.executeQuery();           
            if(rs1.next()==true) {
                jTextField1.setText(rs1.getString("Tổng số học viên đăng ký"));               
            }
            jLabel3.setEnabled(false);
            jTextField1.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
    } 
    public void taiml2() {    
        try {
            DBConnection a = new DBConnection();
            Connection conn = a.getConnection();
            PreparedStatement t1 = conn.prepareStatement("select COUNT(ma_hoc_vien) as 'Tổng số học viên đăng ký' from lop_hoc where ma_lop_hoc =? group by ma_lop_hoc ");
            t1.setString(1,jLabel4.getText());
            
            ResultSet rs1 = t1.executeQuery();           
            if(rs1.next()==true) {
                jTextField2.setText(rs1.getString("Tổng số học viên đăng ký"));               
            }
            jLabel4.setEnabled(false);
            jTextField2.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
    } 
    public void taiml3() {    
        try {
            DBConnection a = new DBConnection();
            Connection conn = a.getConnection();
            PreparedStatement t1 = conn.prepareStatement("select COUNT(ma_hoc_vien) as 'Tổng số học viên đăng ký' from lop_hoc where ma_lop_hoc =? group by ma_lop_hoc ");
            t1.setString(1,jLabel5.getText());
            
            ResultSet rs1 = t1.executeQuery();           
            if(rs1.next()==true) {
                jTextField3.setText(rs1.getString("Tổng số học viên đăng ký"));               
            }
            jLabel5.setEnabled(false);
            jTextField3.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
    } 
    public void taiml4() {    
        try {
            DBConnection a = new DBConnection();
            Connection conn = a.getConnection();
            PreparedStatement t1 = conn.prepareStatement("select COUNT(ma_hoc_vien) as 'Tổng số học viên đăng ký' from lop_hoc where ma_lop_hoc =? group by ma_lop_hoc ");
            t1.setString(1,jLabel6.getText());
            
            ResultSet rs1 = t1.executeQuery();           
            if(rs1.next()==true) {
                jTextField4.setText(rs1.getString("Tổng số học viên đăng ký"));               
            }
            jLabel6.setEnabled(false);
            jTextField4.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
    } 
    public void taiBieuDo(JPanel jpnItem) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset .setValue((new Double(jTextField1.getText())), "HỌC VIÊN", "LỚP 1");
        dataset .setValue((new Double(jTextField2.getText())), "HỌC VIÊN", "LỚP 2");
        dataset .setValue((new Double(jTextField3.getText())), "HỌC VIÊN", "LỚP 3");
        dataset .setValue((new Double(jTextField4.getText())), "HỌC VIÊN", "LỚP 4");
        
        
        JFreeChart barChart = ChartFactory.createBarChart3D("BIỂU ĐỒ THỐNG KÊ SỐ LƯỢNG HỌC VIÊN ĐĂNG KÝ","SỐ LƯỢNG","TỔNG HỌC VIÊN",  dataset , PlotOrientation.VERTICAL,false,true,false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(),350));
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    public void tainu() {    
        try {
            DBConnection a = new DBConnection();
            Connection conn = a.getConnection();
            PreparedStatement t1 = conn.prepareStatement("select COUNT(gioi_tinh) as 'Nữ' from hoc_vien1 where gioi_tinh = ?");
            t1.setString(1,jLabel7.getText());
            
            ResultSet rs1 = t1.executeQuery();           
            if(rs1.next()==true) {
                jTextField5.setText(rs1.getString("Nữ"));               
            }
            jLabel7.setEnabled(false);
            jTextField5.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
    } 
    public void tainam() {    
        try {
            DBConnection a = new DBConnection();
            Connection conn = a.getConnection();
            PreparedStatement t1 = conn.prepareStatement("select COUNT(gioi_tinh) as 'Nam' from hoc_vien1 where gioi_tinh = ?");
            t1.setString(1,jLabel8.getText());
            
            ResultSet rs1 = t1.executeQuery();           
            if(rs1.next()==true) {
                jTextField6.setText(rs1.getString("Nam"));               
            }
            jLabel8.setEnabled(false);
            jTextField6.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
    } 
    public void taiBieuDo1(JPanel jpnItem) {
        int nam = Integer.parseInt(jTextField6.getText());
        int nu = Integer.parseInt(jTextField5.getText());
        int tong = nam + nu;
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Nhóm Nam", new Double((nam/(tong*1.0))*100));
        dataset.setValue("Nhóm Nữ", new Double((nu/(tong*1.0))*100));
        
        JFreeChart chart = ChartFactory.createPieChart("TỶ LỆ NAM NỮ", dataset, true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(),350));
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jLabel3.setText("1");

        jTextField1.setText("jTextField1");

        jLabel4.setText("2");

        jTextField2.setText("jTextField1");

        jLabel5.setText("3");

        jTextField3.setText("jTextField1");

        jLabel6.setText("4");

        jTextField4.setText("jTextField1");

        jLabel7.setText("Nữ");

        jTextField5.setText("jTextField1");

        jLabel8.setText("Nam");

        jTextField6.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
