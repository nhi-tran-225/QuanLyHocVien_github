/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhap;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class QuanLyHocVien extends javax.swing.JPanel {
    String filename = null;
    byte[] person_image = null;
    DefaultTableModel model = new DefaultTableModel();
    SimpleDateFormat ngay = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form QuanLyHocVien
     */
    public QuanLyHocVien() {
        initComponents();
        taiDuLieu();
    }

     public void taiDuLieu() {
        try {
            DBConnection a = new DBConnection();
            Connection conn = a.getConnection();
            int so;
            Vector hang, cot;
            cot = new Vector();
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM hoc_vien1");
            ResultSetMetaData metadata = rs.getMetaData();
            so = metadata.getColumnCount();
            model.setColumnIdentifiers(new Object[]{
                "Mã Học Vien", "Tên Học Viên", "Ngày Sinh", "Số Điện Thoại", "Email", "Giới Tính", "Địa Chỉ"
            });

            while (rs.next()) {
                hang = new Vector();
                for (int i = 1; i <= so; i++) {
                    hang.addElement(rs.getString(i));
                }
                model.addRow(hang);
                jTable1.setModel(model);
            }
            jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jTable1.getSelectedRow() >= 0) {
                        mhv.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
                        ten.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "");
                        ngaysinh.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "");
                        sdt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3) + "");
                        email.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4) + "");
                        nam.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5) + "");
                        nu.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5) + "");
                        diachi.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6) + "");
                    }
                }
            });

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnRoot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jtfSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mhv = new javax.swing.JTextField();
        ten = new javax.swing.JTextField();
        ngaysinh = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        diachi = new javax.swing.JTextArea();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        MoHinh = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Moi = new javax.swing.JButton();
        CapNhat = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jpnRoot.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-icon-24.png"))); // NOI18N
        jButton2.setText("Tìm kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mã học viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel8)
                .addGap(83, 83, 83)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ HỌC VIÊN");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã học viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên học viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ngày sinh");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số điện thoại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Giới tính");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Địa chỉ");

        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        diachi.setColumns(20);
        diachi.setRows(5);
        jScrollPane2.setViewportView(diachi);

        buttonGroup1.add(nam);
        nam.setText("Nam");

        buttonGroup1.add(nu);
        nu.setText("Nữ");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N

        MoHinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MoHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-file-icon-16.png"))); // NOI18N
        MoHinh.setText("Mở hình");
        MoHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoHinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(MoHinh)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoHinh)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nu))
                    .addComponent(mhv)
                    .addComponent(ten)
                    .addComponent(ngaysinh)
                    .addComponent(sdt)
                    .addComponent(email)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addGap(190, 190, 190)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mhv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nam)
                    .addComponent(nu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        Moi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Moi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new-icon-16.png"))); // NOI18N
        Moi.setText("Tạo mới");
        Moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoiActionPerformed(evt);
            }
        });

        CapNhat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actions-document-edit-icon-16.png"))); // NOI18N
        CapNhat.setText("Sửa");
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });

        Xoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Close-icon-16.png"))); // NOI18N
        Xoa.setText("Xóa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-refresh-shield-50 (1).png"))); // NOI18N
        jButton1.setText("LÀM MỚI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1)
                                .addComponent(jLabel1)))
                        .addGroup(jpnRootLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(Moi)
                            .addGap(120, 120, 120)
                            .addComponent(CapNhat)
                            .addGap(88, 88, 88)
                            .addComponent(Xoa)
                            .addGap(99, 99, 99)
                            .addComponent(jButton1)
                            .addGap(125, 125, 125)))
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(Moi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 819, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jtfSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập thông tin tìm kiếm");
        } else {
            try {
                DBConnection a = new DBConnection();
                Connection conn = a.getConnection();
                PreparedStatement sp = conn.prepareStatement("SELECT * FROM hoc_vien1 WHERE ma_hoc_vien =?");
                sp.setString(1,jtfSearch.getText());
                ResultSet rs = sp.executeQuery();
                //boolean ktr = rs.next();
                if(rs.next()==true) {
                    mhv.setText(rs.getString("ma_hoc_vien"));
                    ten.setText(rs.getString("ten"));
                    ngaysinh.setText(rs.getString("ngay_sinh"));
                    sdt.setText(rs.getString("sdt"));
                    email.setText(rs.getString("email"));
                    diachi.setText(rs.getString("dia_chi"));
                }else {
                    JOptionPane.showMessageDialog(this,"Không tìm thấy học viên");
                    jtfSearch.setText("");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenActionPerformed

    private void MoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoiActionPerformed
if(mhv.getText().isEmpty()
            ||ten.getText().isEmpty()
            ||ngaysinh.getText().isEmpty()
            ||sdt.getText().isEmpty()
            ||email.getText().isEmpty()
            ||diachi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin");
        }
        else
        {
            try {
                DBConnection a = new DBConnection();
                Connection conn = a.getConnection();
                PreparedStatement sp = conn.prepareStatement("INSERT INTO hoc_vien1(ma_hoc_vien,ten,ngay_sinh,sdt,email,gioi_tinh,dia_chi)"
                        + "VALUES(?,?,?,?,?,?,?)");
                sp.setString(1,mhv.getText());
                sp.setString(2,ten.getText());
                sp.setString(3,ngaysinh.getText());
                sp.setString(4,sdt.getText());
                sp.setString(5,email.getText());
                if (nam.isSelected()) {
                sp.setString(6, nam.getText());
            } else {
                sp.setString(6, nu.getText());
            }
                sp.setString(7,diachi.getText());
                if(sp.executeUpdate()>0){
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công!");
                    model.setRowCount(0);
                    taiDuLieu();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Lỗi");
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_MoiActionPerformed

    private void MoHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoHinhActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH));
        jLabel10.setIcon(imageIcon);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_MoHinhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jtfSearch.setText("");
        mhv.setText("");
        ten.setText("");
        ngaysinh.setText("");
        sdt.setText("");
        email.setText("");
        //jLabel10.setIcon(null);
        diachi.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
            if(mhv.getText().isEmpty()
            ||ten.getText().isEmpty()
            ||ngaysinh.getText().isEmpty()
            ||sdt.getText().isEmpty()
            ||email.getText().isEmpty()
            ||diachi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dữ liệu để sửa");
        }
        else
        {
            try {
                DBConnection a = new DBConnection();
                Connection conn = a.getConnection();
                PreparedStatement sp = conn.prepareStatement("UPDATE hoc_vien1 SET ten=?,ngay_sinh=?, sdt=?,email=?,gioi_tinh=?, dia_chi=? WHERE ma_hoc_vien=?");
                sp.setString(7,mhv.getText()); 
                sp.setString(1,ten.getText());
                sp.setString(2,ngaysinh.getText());
                sp.setString(3,sdt.getText());
                sp.setString(4,email.getText());
                if(nam.isSelected()){
                    sp.setString(5,nam.getText());
                }else{
                    sp.setString(5,nu.getText());
                }
                sp.setString(6,diachi.getText());
                sp.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sửa Thành Công!");
                model.setRowCount(0);
                taiDuLieu();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_CapNhatActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        if(mhv.getText().isEmpty()
            ||ten.getText().isEmpty()
            ||ngaysinh.getText().isEmpty()
            ||sdt.getText().isEmpty()
            ||email.getText().isEmpty()
            ||diachi.getText().isEmpty())  {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dữ liệu để xóa");
        }
        else
        {
            try {
                DBConnection a = new DBConnection();
                Connection conn = a.getConnection();
                PreparedStatement sp = conn.prepareStatement("DELETE hoc_vien1 WHERE ma_hoc_vien=?");
                if(jTable1.getColumnCount()==0){
                    JOptionPane.showConfirmDialog(this,"Bảng Trống");
                }else {
                    sp.setString(1,jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
                    if(JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa học viên này không?", "Xóa",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    sp.executeUpdate();
                    model.setRowCount(0);
                    taiDuLieu();
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        }
    }//GEN-LAST:event_XoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CapNhat;
    private javax.swing.JButton MoHinh;
    private javax.swing.JButton Moi;
    private javax.swing.JButton Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea diachi;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JTextField mhv;
    private javax.swing.JRadioButton nam;
    private javax.swing.JTextField ngaysinh;
    private javax.swing.JRadioButton nu;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField ten;
    // End of variables declaration//GEN-END:variables
}
