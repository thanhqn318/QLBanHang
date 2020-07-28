package poly;

import KetNoi.Helper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrQLSP extends javax.swing.JPanel {

    ArrayList<SanPham> lstSanPham = new ArrayList<>();
    int index;
    String headers[] = {"MaLapTop", "TenLapTop", "CauHinhCT", "Mau", "ThuongHieu", "SoLuong", "BaoHanh", "GiaBan", "HinhAnh"};
    DefaultTableModel model = new DefaultTableModel(headers, 0);
    Connection con = Helper.ketnoi("LapTopStore");

    public FrQLSP() {
        initComponents();

        if (con != null) {
            LoadDataToJTable();
            if (lstSanPham.size() > 0) {
                index = 0;
                showDetail();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối");
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btDauTien = new javax.swing.JButton();
        btLui = new javax.swing.JButton();
        btTien = new javax.swing.JButton();
        btCuoi = new javax.swing.JButton();
        btXuatFile = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSpFind = new javax.swing.JTextField();
        bttTimKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtMau = new javax.swing.JTextField();
        txtThuongHieu = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCauHinh = new javax.swing.JTextArea();
        txtSoLuong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBaoHanh = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã LapTop", "Tên LapTop", "Cấu hình CT", "Màu", "Thương hiệu", "Giá", "Số lượng", "Bảo hành"
            }
        ));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSanPham);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý sản phẩm");

        btDauTien.setBackground(new java.awt.Color(255, 255, 255));
        btDauTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/First_record.png"))); // NOI18N
        btDauTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauTienActionPerformed(evt);
            }
        });

        btLui.setBackground(new java.awt.Color(255, 255, 255));
        btLui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rewind.png"))); // NOI18N
        btLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuiActionPerformed(evt);
            }
        });

        btTien.setBackground(new java.awt.Color(255, 255, 255));
        btTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fast-forward.png"))); // NOI18N
        btTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTienActionPerformed(evt);
            }
        });

        btCuoi.setBackground(new java.awt.Color(255, 255, 255));
        btCuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Last_recor.png"))); // NOI18N
        btCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuoiActionPerformed(evt);
            }
        });

        btXuatFile.setBackground(new java.awt.Color(255, 255, 255));
        btXuatFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Print.png"))); // NOI18N
        btXuatFile.setText("Xuất File");
        btXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatFileActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã SP");

        txtMaSpFind.setBackground(new java.awt.Color(204, 204, 204));

        bttTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bttTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        bttTimKiem.setText("Find");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMaSpFind, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(bttTimKiem)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSpFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tìm kiếm");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã LapTop");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tên LapTop");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cấu hình chi tiết");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Màu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Thương hiệu");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Giá");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Số lượng");

        txtMaSP.setBackground(new java.awt.Color(204, 204, 204));
        txtMaSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPActionPerformed(evt);
            }
        });

        txtTenSP.setBackground(new java.awt.Color(204, 204, 204));
        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMau.setBackground(new java.awt.Color(204, 204, 204));
        txtMau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMauActionPerformed(evt);
            }
        });

        txtThuongHieu.setBackground(new java.awt.Color(204, 204, 204));
        txtThuongHieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtGia.setBackground(new java.awt.Color(204, 204, 204));
        txtGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCauHinh.setBackground(new java.awt.Color(204, 204, 204));
        txtCauHinh.setColumns(20);
        txtCauHinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCauHinh.setRows(5);
        jScrollPane2.setViewportView(txtCauHinh);

        txtSoLuong.setBackground(new java.awt.Color(204, 204, 204));
        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Bảo hành");

        txtBaoHanh.setBackground(new java.awt.Color(204, 204, 204));
        txtBaoHanh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSP)
                            .addComponent(txtTenSP)
                            .addComponent(txtMau)
                            .addComponent(txtThuongHieu)
                            .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(txtSoLuong)
                            .addComponent(txtBaoHanh))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtTenSP)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        btThem.setBackground(new java.awt.Color(255, 255, 255));
        btThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btLuu.setBackground(new java.awt.Color(255, 255, 255));
        btLuu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        btLuu.setText("Lưu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(255, 255, 255));
        btXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btXoa.setText("Xóa");

        btSua.setBackground(new java.awt.Color(255, 255, 255));
        btSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        btSua.setText("Sửa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(547, 547, 547))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btDauTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCuoi)
                        .addGap(183, 183, 183)
                        .addComponent(btXuatFile)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCuoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btDauTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btDauTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauTienActionPerformed
        // TODO add your handling code here:
        try {
            index = 0;
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không di chuyển được nữa");
        }
    }//GEN-LAST:event_btDauTienActionPerformed

    private void btCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuoiActionPerformed
        // TODO add your handling code here:
        try {
            index = lstSanPham.size() - 1;
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không di chuyển được nữa");
        }
    }//GEN-LAST:event_btCuoiActionPerformed

    private void btLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuiActionPerformed
        // TODO add your handling code here:
        try {
            if (index > 0) {
                index--;
                showDetail();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không di chuyển được nữa");
        }
    }//GEN-LAST:event_btLuiActionPerformed

    private void btTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTienActionPerformed
        // TODO add your handling code here:
        try {
            if (index < lstSanPham.size() - 1) {
                index++;
                showDetail();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không di chuyển được nữa");
        }
    }//GEN-LAST:event_btTienActionPerformed

    private void btXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXuatFileActionPerformed

    private void txtMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSPActionPerformed

    private void txtMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMauActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        them();
    }//GEN-LAST:event_btThemActionPerformed

    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        // TODO add your handling code here:
        try {
            index = tbSanPham.getSelectedRow();
            if (index >= 0) {
                showDetail();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lỗi click Table");
        }
    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        if (checkNull() == true) {
            luu();
        }


    }//GEN-LAST:event_btLuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCuoi;
    private javax.swing.JButton btDauTien;
    private javax.swing.JButton btLui;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTien;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btXuatFile;
    private javax.swing.JButton bttTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtBaoHanh;
    private javax.swing.JTextArea txtCauHinh;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaSpFind;
    private javax.swing.JTextField txtMau;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtThuongHieu;
    // End of variables declaration//GEN-END:variables
    private void them() {
        txtBaoHanh.setText(null);
        txtCauHinh.setText(null);
        txtGia.setText(null);
        txtMaSP.setText(null);
        txtMaSpFind.setText(null);
        txtMau.setText(null);
        txtTenSP.setText(null);
        txtThuongHieu.setText(null);
        txtSoLuong.setText(null);
    }

    private void LoadDataToJTable() {
        try {
            model.setRowCount(0);
            Statement st = con.createStatement();
            String sql = "SELECT *\n"
                    + "FROM LapTop";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getString(4));
                row.add(rs.getString(5));
                row.add(rs.getInt(6));
                row.add(rs.getString(7));
                row.add(rs.getFloat(8));
                row.add(rs.getString(9));
                model.addRow(row);
                tbSanPham.setModel(model);
                lstSanPham.add(new SanPham(rs.getString("MaLapTop"),
                        rs.getString("TenLapTop"),
                        rs.getString("CauHinhCT"),
                        rs.getString("Mau"),
                        rs.getString("ThuongHieu"),
                        rs.getInt("SoLuong"),
                        rs.getString("BaoHanh"),
                        rs.getFloat("GiaBan"),
                        rs.getString("HinhAnh"))
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi load dữ liệu: " + e);
            System.exit(0);
        }

    }

    private boolean checkNull() {
        String masp = txtMaSP.getText();
        String tensp = txtTenSP.getText();
        String cauhinh = txtCauHinh.getText();
        String mau = txtMau.getText();
        String thuonghieu = txtThuongHieu.getText();
        String baohanh = txtBaoHanh.getText();
        int soLuong;
        float gia;
        if (kiemtratrung(masp) == true) {
            JOptionPane.showMessageDialog(this, "Trùng mã sản phẩm");
            txtMaSP.setText("");
            txtMaSP.requestFocus();
            return false;
        } else if (masp.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã sản phầm");
            txtMaSP.requestFocus();
            return false;
        } else if (tensp.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên sản phầm");
            txtTenSP.requestFocus();
            return false;
        } else if (cauhinh.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập cấu hình sản phầm");
            txtCauHinh.requestFocus();
            return false;
        } else if (mau.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập màu sản phầm");
            txtMau.requestFocus();
            return false;
        } else if (thuonghieu.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thương hiệu sản phầm");
            txtThuongHieu.requestFocus();
            return false;
        }
        try {
            soLuong = Integer.parseInt(txtSoLuong.getText());
            if (soLuong <= 0) {
                JOptionPane.showMessageDialog(this, "Giá phải lớn hơn 0");
                txtGia.requestFocus();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đúng định dạng số lượng");
            txtSoLuong.requestFocus();
            return false;
        }
        try {
            gia = Float.parseFloat(txtGia.getText());
            if (gia <= 0) {
                JOptionPane.showMessageDialog(this, "Giá phải lớn hơn 0");
                txtGia.requestFocus();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đúng định dạng giá");
            txtGia.requestFocus();
            return false;
        }

        if (baohanh.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập bảo hành sản phầm");
            txtBaoHanh.requestFocus();
            return false;
        }
        return true;

    }

    private void luu() {
        try {
            String masp = txtMaSP.getText();
            String tensp = txtTenSP.getText();
            String cauhinh = txtCauHinh.getText();
            String mau = txtMau.getText();
            String thuonghieu = txtThuongHieu.getText();
            int soLuong = Integer.parseInt(txtSoLuong.getText());
            String baohanh = txtBaoHanh.getText();
            float gia = Float.parseFloat(txtGia.getText());
            lstSanPham.add(new SanPham(masp, tensp, cauhinh, mau, thuonghieu, soLuong, baohanh, gia, null));
            model.addRow(new Object[]{masp, tensp, cauhinh, mau, thuonghieu, soLuong, baohanh, gia, null});
            String sql = "INSERT INTO LapTop\n"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, null)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, masp);
            ps.setString(2, tensp);
            ps.setString(3, cauhinh);
            ps.setString(4, mau);
            ps.setString(5, thuonghieu);
            ps.setInt(6, soLuong);
            ps.setString(7, baohanh);
            ps.setFloat(8, gia);
            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                index = lstSanPham.size() - 1;
                showDetail();
            } else {
                JOptionPane.showMessageDialog(this, "Không thêm được dòng nào");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lưu thất bại: " + ex);
        }
    }

    private void xoa() {

    }

    private void showDetail() {
        SanPham sp = lstSanPham.get(index);
        txtMaSP.setText(sp.getMaLapTop());
        txtTenSP.setText(sp.getTenLapTop());
        txtCauHinh.setText(sp.getCauHinhCT());
        txtMau.setText(sp.getMau());
        txtThuongHieu.setText(sp.getThuongHieu());
        txtSoLuong.setText(sp.getSoLuong() + "");
        txtBaoHanh.setText(sp.getBaoHanh());
        txtGia.setText(sp.getGiaBan() + "");
        tbSanPham.setRowSelectionInterval(index, index);
    }

    private boolean kiemtratrung(String ma) {
        boolean kt = false;
        for (int i = 0; i < lstSanPham.size(); i++) {
            if (lstSanPham.get(i).getMaLapTop().equalsIgnoreCase(ma) == true) {
                kt = true;
            }
        }
        return kt;
    }
}
