package adminView;

import employeeView.EmpDashboard;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import userView.First;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AdminDashboard extends javax.swing.JFrame {

    int width = 200; // Biến sử dụng cho thao tác đóng, mở menu
    int height = 600;
    
    // biến giải quyết xung đột đa luồng (không liên quan đến các xử lí dữ liệu)
    private AtomicBoolean running = new AtomicBoolean(true);

    public AdminDashboard() {
        initComponents();
        addSVG();
        setTime();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnSlideMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        closeMenu = new userView.SVGImage();
        mainLogo = new userView.SVGImage();
        lbLogout = new javax.swing.JLabel();
        lbEmployee = new javax.swing.JLabel();
        lbAdd = new javax.swing.JLabel();
        lbVoucher = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        svgEmp = new userView.SVGImage();
        svgPro = new userView.SVGImage();
        svgVou = new userView.SVGImage();
        svgUser = new userView.SVGImage();
        svgLogout = new userView.SVGImage();
        lbUser1 = new javax.swing.JLabel();
        lbUser2 = new javax.swing.JLabel();
        svgPro1 = new userView.SVGImage();
        svgManage1 = new userView.SVGImage();
        svgBill = new userView.SVGImage();
        svgSta = new userView.SVGImage();
        pnContainer = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpEmployee = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        emCategory = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        emEnter = new javax.swing.JTextField();
        emSearch = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        emTable = new javax.swing.JTable();
        emAddbt = new javax.swing.JButton();
        emDeletebt = new javax.swing.JButton();
        emUpdatebt = new javax.swing.JButton();
        jpAddEmployee = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        eaID = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        eaName = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        eaSex = new javax.swing.JTextField();
        eaPhone = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        eaWorkDate = new javax.swing.JTextField();
        eaSalary = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        eaUsername = new javax.swing.JTextField();
        eaPassword = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        eaRole = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        eaAddbt = new javax.swing.JButton();
        eaBackbt = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jpDeleteEmployee = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        edCategory = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        edEnter = new javax.swing.JTextField();
        edSearch = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        edTable = new javax.swing.JTable();
        edDeletebt = new javax.swing.JButton();
        edBackbt = new javax.swing.JButton();
        jpUpdateEmployee = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        euCategory = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        euEnter = new javax.swing.JTextField();
        euSearch = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        euTable = new javax.swing.JTable();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        euID = new javax.swing.JTextField();
        euName = new javax.swing.JTextField();
        euSex = new javax.swing.JTextField();
        euPhone = new javax.swing.JTextField();
        euWorkDate = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        euSalary = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        euSavebt = new javax.swing.JButton();
        euBackbt = new javax.swing.JButton();
        jpProduct = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        emCategory1 = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        emEnter1 = new javax.swing.JTextField();
        emSearch1 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        emTable1 = new javax.swing.JTable();
        emAddbt1 = new javax.swing.JButton();
        emDeletebt1 = new javax.swing.JButton();
        emUpdatebt1 = new javax.swing.JButton();
        jpAddProduct = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        eaID1 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        eaName1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        eaSex1 = new javax.swing.JTextField();
        eaPhone1 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        eaWorkDate1 = new javax.swing.JTextField();
        eaSalary1 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        eaUsername1 = new javax.swing.JTextField();
        eaPassword1 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        eaRole1 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        eaAddbt1 = new javax.swing.JButton();
        eaBackbt1 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jpDeleteProduct = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        edCategory1 = new javax.swing.JComboBox<>();
        jLabel93 = new javax.swing.JLabel();
        edEnter1 = new javax.swing.JTextField();
        edSearch1 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        edTable1 = new javax.swing.JTable();
        edDeletebt1 = new javax.swing.JButton();
        edBackbt1 = new javax.swing.JButton();
        jpUpdateProduct = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        euCategory1 = new javax.swing.JComboBox<>();
        jLabel96 = new javax.swing.JLabel();
        euEnter1 = new javax.swing.JTextField();
        euSearch1 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        euTable1 = new javax.swing.JTable();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        euID1 = new javax.swing.JTextField();
        euName1 = new javax.swing.JTextField();
        euSex1 = new javax.swing.JTextField();
        euPhone1 = new javax.swing.JTextField();
        euWorkDate1 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        euSalary1 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        euSavebt1 = new javax.swing.JButton();
        euBackbt1 = new javax.swing.JButton();
        jpVoucher = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        emCategory2 = new javax.swing.JComboBox<>();
        jLabel106 = new javax.swing.JLabel();
        emEnter2 = new javax.swing.JTextField();
        emSearch2 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        emTable2 = new javax.swing.JTable();
        emAddbt2 = new javax.swing.JButton();
        emDeletebt2 = new javax.swing.JButton();
        emUpdatebt2 = new javax.swing.JButton();
        jpAddVoucher = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        eaID2 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        eaName2 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        eaSex2 = new javax.swing.JTextField();
        eaPhone2 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        eaWorkDate2 = new javax.swing.JTextField();
        eaSalary2 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        eaUsername2 = new javax.swing.JTextField();
        eaPassword2 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        eaRole2 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        eaAddbt2 = new javax.swing.JButton();
        eaBackbt2 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        jpDeleteVoucher = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        edCategory2 = new javax.swing.JComboBox<>();
        jLabel120 = new javax.swing.JLabel();
        edEnter2 = new javax.swing.JTextField();
        edSearch2 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        edTable2 = new javax.swing.JTable();
        edDeletebt2 = new javax.swing.JButton();
        edBackbt2 = new javax.swing.JButton();
        jpUpdateVoucher = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        euCategory2 = new javax.swing.JComboBox<>();
        jLabel123 = new javax.swing.JLabel();
        euEnter2 = new javax.swing.JTextField();
        euSearch2 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        euTable2 = new javax.swing.JTable();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        euID2 = new javax.swing.JTextField();
        euName2 = new javax.swing.JTextField();
        euSex2 = new javax.swing.JTextField();
        euPhone2 = new javax.swing.JTextField();
        euWorkDate2 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        euSalary2 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        euSavebt2 = new javax.swing.JButton();
        euBackbt2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        openMenu = new userView.SVGImage();
        adminUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(100, 19, 19));
        pnMain.setInheritsPopupMenu(true);
        pnMain.setPreferredSize(new java.awt.Dimension(900, 600));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSlideMenu.setBackground(new java.awt.Color(93, 5, 5));
        pnSlideMenu.setPreferredSize(new java.awt.Dimension(200, 600));
        pnSlideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(93, 5, 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 200, 160));
        jLabel2.setText("THE COFFEE HOME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, -1));

        closeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMenuMouseClicked(evt);
            }
        });
        jPanel2.add(closeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 41));

        mainLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainLogoMouseClicked(evt);
            }
        });
        jPanel2.add(mainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, 95));

        pnSlideMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 190));

        lbLogout.setBackground(new java.awt.Color(255, 255, 255));
        lbLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setText("Đăng xuất");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        lbEmployee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lbEmployee.setText("Nhân viên");
        lbEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEmployeeMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lbAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAdd.setForeground(new java.awt.Color(255, 255, 255));
        lbAdd.setText("Sản phẩm");
        lbAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAddMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lbVoucher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lbVoucher.setText("Khuyến mãi");
        lbVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVoucherMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        lbUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("User");
        lbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUserMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        pnSlideMenu.add(svgEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 30));
        pnSlideMenu.add(svgPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 30, 30));
        pnSlideMenu.add(svgVou, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));
        pnSlideMenu.add(svgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 30, 30));
        pnSlideMenu.add(svgLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 30, 30));

        lbUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUser1.setForeground(new java.awt.Color(255, 255, 255));
        lbUser1.setText("Đơn hàng");
        lbUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUser1MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        lbUser2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUser2.setForeground(new java.awt.Color(255, 255, 255));
        lbUser2.setText("Thống kê");
        lbUser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUser2MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));
        pnSlideMenu.add(svgPro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));
        pnSlideMenu.add(svgManage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 30, 30));
        pnSlideMenu.add(svgBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 30, 30));
        pnSlideMenu.add(svgSta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 30, 30));

        pnMain.add(pnSlideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 600));

        pnContainer.setBackground(new java.awt.Color(204, 255, 255));
        pnContainer.setPreferredSize(new java.awt.Dimension(900, 450));
        pnContainer.setLayout(new java.awt.CardLayout());

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setPreferredSize(new java.awt.Dimension(900, 533));
        jpHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 231, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDate.setForeground(new java.awt.Color(163, 149, 134));
        lbDate.setText("Wednesday, 22-12-2023");
        jPanel1.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lbTime.setBackground(new java.awt.Color(0, 0, 0));
        lbTime.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbTime.setForeground(new java.awt.Color(100, 19, 19));
        lbTime.setText("11:03:05 PM");
        jPanel1.add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        jpHome.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 150));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 168, 168));
        jLabel3.setText("Tổng đơn hàng");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 168, 168));
        jLabel5.setText("999");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        jpHome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 250, 150));

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 168, 168));
        jLabel4.setText("Tổng doanh thu");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 168, 168));
        jLabel6.setText("22,520,950");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jpHome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 250, 150));

        pnContainer.add(jpHome, "card4");

        jpEmployee.setBackground(new java.awt.Color(237, 218, 199));
        jpEmployee.setPreferredSize(new java.awt.Dimension(900, 533));
        jpEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(100, 19, 19));
        jLabel50.setText("QUẢN LÝ NHÂN VIÊN");
        jpEmployee.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Tìm kiếm theo");
        jpEmployee.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        emCategory.setBackground(new java.awt.Color(255, 255, 255));
        emCategory.setForeground(new java.awt.Color(0, 0, 0));
        emCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpEmployee.add(emCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 40));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Nhập thông tin");
        jpEmployee.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        emEnter.setBackground(new java.awt.Color(255, 255, 255));
        emEnter.setForeground(new java.awt.Color(0, 0, 0));
        jpEmployee.add(emEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, 40));
        emEnter.getAccessibleContext().setAccessibleName("");

        emSearch.setBackground(new java.awt.Color(0, 0, 0));
        emSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch.setForeground(new java.awt.Color(255, 255, 255));
        emSearch.setText("Tìm");
        emSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearchActionPerformed(evt);
            }
        });
        jpEmployee.add(emSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 40));

        emTable.setBackground(new java.awt.Color(255, 255, 255));
        emTable.setForeground(new java.awt.Color(0, 0, 0));
        emTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Giới tính", "Số điện thoại", "Ngày vào làm", "Lương"
            }
        ));
        emTable.setGridColor(new java.awt.Color(100, 19, 19));
        emTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(emTable);

        jpEmployee.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 620, 320));

        emAddbt.setBackground(new java.awt.Color(100, 19, 19));
        emAddbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emAddbt.setForeground(new java.awt.Color(255, 255, 255));
        emAddbt.setText("Thêm");
        emAddbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emAddbtMouseClicked(evt);
            }
        });
        emAddbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emAddbtActionPerformed(evt);
            }
        });
        jpEmployee.add(emAddbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 80, 40));

        emDeletebt.setBackground(new java.awt.Color(100, 19, 19));
        emDeletebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emDeletebt.setForeground(new java.awt.Color(255, 255, 255));
        emDeletebt.setText("Xoá");
        emDeletebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emDeletebtMouseClicked(evt);
            }
        });
        emDeletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emDeletebtActionPerformed(evt);
            }
        });
        jpEmployee.add(emDeletebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 80, 40));

        emUpdatebt.setBackground(new java.awt.Color(100, 19, 19));
        emUpdatebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emUpdatebt.setForeground(new java.awt.Color(255, 255, 255));
        emUpdatebt.setText("Sửa");
        emUpdatebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emUpdatebtMouseClicked(evt);
            }
        });
        emUpdatebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emUpdatebtActionPerformed(evt);
            }
        });
        jpEmployee.add(emUpdatebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 80, 40));

        pnContainer.add(jpEmployee, "card2");

        jpAddEmployee.setBackground(new java.awt.Color(237, 218, 199));
        jpAddEmployee.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(100, 19, 19));
        jLabel53.setText("THÊM NHÂN VIÊN");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("ID");

        eaID.setBackground(new java.awt.Color(255, 255, 255));
        eaID.setForeground(new java.awt.Color(0, 0, 0));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Tên");

        eaName.setBackground(new java.awt.Color(255, 255, 255));
        eaName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Giới tính");

        eaSex.setBackground(new java.awt.Color(255, 255, 255));
        eaSex.setForeground(new java.awt.Color(0, 0, 0));

        eaPhone.setBackground(new java.awt.Color(255, 255, 255));
        eaPhone.setForeground(new java.awt.Color(0, 0, 0));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Số điện thoại");

        eaWorkDate.setBackground(new java.awt.Color(255, 255, 255));
        eaWorkDate.setForeground(new java.awt.Color(0, 0, 0));

        eaSalary.setBackground(new java.awt.Color(255, 255, 255));
        eaSalary.setForeground(new java.awt.Color(0, 0, 0));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Ngày vào làm");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Lương tháng");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Username");

        eaUsername.setBackground(new java.awt.Color(255, 255, 255));
        eaUsername.setForeground(new java.awt.Color(0, 0, 0));

        eaPassword.setBackground(new java.awt.Color(255, 255, 255));
        eaPassword.setForeground(new java.awt.Color(0, 0, 0));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Password");

        eaRole.setBackground(new java.awt.Color(255, 255, 255));
        eaRole.setForeground(new java.awt.Color(0, 0, 0));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Vai trò");

        eaAddbt.setBackground(new java.awt.Color(100, 19, 19));
        eaAddbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaAddbt.setForeground(new java.awt.Color(255, 255, 255));
        eaAddbt.setText("Thêm");
        eaAddbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaAddbtActionPerformed(evt);
            }
        });

        eaBackbt.setBackground(new java.awt.Color(255, 255, 255));
        eaBackbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaBackbt.setForeground(new java.awt.Color(0, 0, 0));
        eaBackbt.setText("Back");
        eaBackbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eaBackbtMouseClicked(evt);
            }
        });
        eaBackbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaBackbtActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Nhập thông tin nhân viên cần thêm");

        javax.swing.GroupLayout jpAddEmployeeLayout = new javax.swing.GroupLayout(jpAddEmployee);
        jpAddEmployee.setLayout(jpAddEmployeeLayout);
        jpAddEmployeeLayout.setHorizontalGroup(
            jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddEmployeeLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56)
                            .addComponent(jLabel59))
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eaName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel57))
                                .addGap(18, 18, 18)
                                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(eaSex, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel60))))
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addComponent(eaPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eaWorkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(eaSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addGap(18, 18, 18)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addGap(18, 18, 18)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(eaRole, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(137, 137, 137))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel53)))
                    .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(eaAddbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eaBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAddEmployeeLayout.setVerticalGroup(
            jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addGap(52, 52, 52)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaSex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaWorkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaAddbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pnContainer.add(jpAddEmployee, "card12");

        jpDeleteEmployee.setBackground(new java.awt.Color(237, 218, 199));
        jpDeleteEmployee.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(100, 19, 19));
        jLabel54.setText("XOÁ NHÂN VIÊN");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Tìm kiếm theo ");

        edCategory.setBackground(new java.awt.Color(255, 255, 255));
        edCategory.setForeground(new java.awt.Color(0, 0, 0));
        edCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Nhập thông tin");

        edEnter.setBackground(new java.awt.Color(255, 255, 255));
        edEnter.setForeground(new java.awt.Color(0, 0, 0));
        edEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnterActionPerformed(evt);
            }
        });

        edSearch.setBackground(new java.awt.Color(0, 0, 0));
        edSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch.setForeground(new java.awt.Color(255, 255, 255));
        edSearch.setText("Tìm");

        edTable.setBackground(new java.awt.Color(255, 255, 255));
        edTable.setForeground(new java.awt.Color(0, 0, 0));
        edTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SEX", "PHONE", "START DATE", "SALARY"
            }
        ));
        edTable.setGridColor(new java.awt.Color(100, 19, 19));
        edTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(edTable);

        edDeletebt.setBackground(new java.awt.Color(100, 19, 19));
        edDeletebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edDeletebt.setForeground(new java.awt.Color(255, 255, 255));
        edDeletebt.setText("Xoá");

        edBackbt.setBackground(new java.awt.Color(255, 255, 255));
        edBackbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edBackbt.setForeground(new java.awt.Color(0, 0, 0));
        edBackbt.setText("Back");
        edBackbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBackbtMouseClicked(evt);
            }
        });
        edBackbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBackbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDeleteEmployeeLayout = new javax.swing.GroupLayout(jpDeleteEmployee);
        jpDeleteEmployee.setLayout(jpDeleteEmployeeLayout);
        jpDeleteEmployeeLayout.setHorizontalGroup(
            jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addGap(35, 35, 35)
                        .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                                .addComponent(edEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel54)
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(edDeletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDeleteEmployeeLayout.setVerticalGroup(
            jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDeleteEmployeeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edDeletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174))))
        );

        pnContainer.add(jpDeleteEmployee, "card13");

        jpUpdateEmployee.setBackground(new java.awt.Color(237, 218, 199));
        jpUpdateEmployee.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(100, 19, 19));
        jLabel55.setText("CHỈNH SỬA NHÂN VIÊN");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Tìm kiếm theo");

        euCategory.setBackground(new java.awt.Color(255, 255, 255));
        euCategory.setForeground(new java.awt.Color(0, 0, 0));
        euCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Nhập thông tin");

        euEnter.setBackground(new java.awt.Color(255, 255, 255));
        euEnter.setForeground(new java.awt.Color(0, 0, 0));
        euEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euEnterActionPerformed(evt);
            }
        });

        euSearch.setBackground(new java.awt.Color(0, 0, 0));
        euSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSearch.setForeground(new java.awt.Color(255, 255, 255));
        euSearch.setText("Tìm");

        euTable.setBackground(new java.awt.Color(255, 255, 255));
        euTable.setForeground(new java.awt.Color(0, 0, 0));
        euTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SEX", "PHONE", "START DATE", "SALARY"
            }
        ));
        euTable.setGridColor(new java.awt.Color(100, 19, 19));
        euTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(euTable);

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(100, 19, 19));
        jLabel69.setText("Nhập thông tin cần chỉnh sửa");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("ID");

        euID.setBackground(new java.awt.Color(255, 255, 255));
        euID.setForeground(new java.awt.Color(0, 0, 0));

        euName.setBackground(new java.awt.Color(255, 255, 255));
        euName.setForeground(new java.awt.Color(0, 0, 0));

        euSex.setBackground(new java.awt.Color(255, 255, 255));
        euSex.setForeground(new java.awt.Color(0, 0, 0));

        euPhone.setBackground(new java.awt.Color(255, 255, 255));
        euPhone.setForeground(new java.awt.Color(0, 0, 0));

        euWorkDate.setBackground(new java.awt.Color(255, 255, 255));
        euWorkDate.setForeground(new java.awt.Color(0, 0, 0));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Tên");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("Giới tính");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setText("Số điện thoại");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Ngày vào làm");

        euSalary.setBackground(new java.awt.Color(255, 255, 255));
        euSalary.setForeground(new java.awt.Color(0, 0, 0));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Lương");

        euSavebt.setBackground(new java.awt.Color(100, 19, 19));
        euSavebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSavebt.setForeground(new java.awt.Color(255, 255, 255));
        euSavebt.setText("Lưu");
        euSavebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euSavebtActionPerformed(evt);
            }
        });

        euBackbt.setBackground(new java.awt.Color(255, 255, 255));
        euBackbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euBackbt.setForeground(new java.awt.Color(0, 0, 0));
        euBackbt.setText("Back");
        euBackbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euBackbtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpUpdateEmployeeLayout = new javax.swing.GroupLayout(jpUpdateEmployee);
        jpUpdateEmployee.setLayout(jpUpdateEmployeeLayout);
        jpUpdateEmployeeLayout.setHorizontalGroup(
            jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(jLabel68))
                            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                                .addComponent(euCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(euEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(euSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel69)
                            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70)
                                    .addComponent(euID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addComponent(euName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72)
                                    .addComponent(euSex, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73)
                                    .addComponent(euPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel75)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpUpdateEmployeeLayout.createSequentialGroup()
                                .addComponent(euWorkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(euSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(euSavebt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jpUpdateEmployeeLayout.setVerticalGroup(
            jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69)
                .addGap(18, 18, 18)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(6, 6, 6)
                        .addComponent(euID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(6, 6, 6)
                        .addComponent(euName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addGap(6, 6, 6)
                        .addComponent(euSex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addGap(6, 6, 6)
                        .addComponent(euPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addGap(1, 1, 1)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSavebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euWorkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pnContainer.add(jpUpdateEmployee, "card14");

        jpProduct.setBackground(new java.awt.Color(237, 218, 199));
        jpProduct.setPreferredSize(new java.awt.Dimension(900, 533));
        jpProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(100, 19, 19));
        jLabel76.setText("QUẢN LÝ SẢN PHẨM");
        jpProduct.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Tìm kiếm theo");
        jpProduct.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        emCategory1.setBackground(new java.awt.Color(255, 255, 255));
        emCategory1.setForeground(new java.awt.Color(0, 0, 0));
        emCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpProduct.add(emCategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 40));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("Nhập thông tin");
        jpProduct.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        emEnter1.setBackground(new java.awt.Color(255, 255, 255));
        emEnter1.setForeground(new java.awt.Color(0, 0, 0));
        jpProduct.add(emEnter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, 40));

        emSearch1.setBackground(new java.awt.Color(0, 0, 0));
        emSearch1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch1.setForeground(new java.awt.Color(255, 255, 255));
        emSearch1.setText("Tìm");
        emSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch1ActionPerformed(evt);
            }
        });
        jpProduct.add(emSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 40));

        emTable1.setBackground(new java.awt.Color(255, 255, 255));
        emTable1.setForeground(new java.awt.Color(0, 0, 0));
        emTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Giới tính", "Số điện thoại", "Ngày vào làm", "Lương"
            }
        ));
        emTable1.setGridColor(new java.awt.Color(100, 19, 19));
        emTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(emTable1);

        jpProduct.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 620, 320));

        emAddbt1.setBackground(new java.awt.Color(100, 19, 19));
        emAddbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emAddbt1.setForeground(new java.awt.Color(255, 255, 255));
        emAddbt1.setText("Thêm");
        emAddbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emAddbt1MouseClicked(evt);
            }
        });
        emAddbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emAddbt1ActionPerformed(evt);
            }
        });
        jpProduct.add(emAddbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 80, 40));

        emDeletebt1.setBackground(new java.awt.Color(100, 19, 19));
        emDeletebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emDeletebt1.setForeground(new java.awt.Color(255, 255, 255));
        emDeletebt1.setText("Xoá");
        emDeletebt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emDeletebt1MouseClicked(evt);
            }
        });
        emDeletebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emDeletebt1ActionPerformed(evt);
            }
        });
        jpProduct.add(emDeletebt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 80, 40));

        emUpdatebt1.setBackground(new java.awt.Color(100, 19, 19));
        emUpdatebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emUpdatebt1.setForeground(new java.awt.Color(255, 255, 255));
        emUpdatebt1.setText("Sửa");
        emUpdatebt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emUpdatebt1MouseClicked(evt);
            }
        });
        emUpdatebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emUpdatebt1ActionPerformed(evt);
            }
        });
        jpProduct.add(emUpdatebt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 80, 40));

        pnContainer.add(jpProduct, "card2");

        jpAddProduct.setBackground(new java.awt.Color(237, 218, 199));
        jpAddProduct.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(100, 19, 19));
        jLabel80.setText("THÊM SẢN PHẨM");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("ID");

        eaID1.setBackground(new java.awt.Color(255, 255, 255));
        eaID1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
        jLabel82.setText("Tên sản phẩm");

        eaName1.setBackground(new java.awt.Color(255, 255, 255));
        eaName1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
        jLabel83.setText("Giới tính");

        eaSex1.setBackground(new java.awt.Color(255, 255, 255));
        eaSex1.setForeground(new java.awt.Color(0, 0, 0));

        eaPhone1.setBackground(new java.awt.Color(255, 255, 255));
        eaPhone1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setText("Số điện thoại");

        eaWorkDate1.setBackground(new java.awt.Color(255, 255, 255));
        eaWorkDate1.setForeground(new java.awt.Color(0, 0, 0));

        eaSalary1.setBackground(new java.awt.Color(255, 255, 255));
        eaSalary1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
        jLabel85.setText("Ngày vào làm");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
        jLabel86.setText("Lương tháng");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 0, 0));
        jLabel87.setText("Username");

        eaUsername1.setBackground(new java.awt.Color(255, 255, 255));
        eaUsername1.setForeground(new java.awt.Color(0, 0, 0));

        eaPassword1.setBackground(new java.awt.Color(255, 255, 255));
        eaPassword1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 0, 0));
        jLabel88.setText("Password");

        eaRole1.setBackground(new java.awt.Color(255, 255, 255));
        eaRole1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 0, 0));
        jLabel89.setText("Vai trò");

        eaAddbt1.setBackground(new java.awt.Color(100, 19, 19));
        eaAddbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaAddbt1.setForeground(new java.awt.Color(255, 255, 255));
        eaAddbt1.setText("Thêm");
        eaAddbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaAddbt1ActionPerformed(evt);
            }
        });

        eaBackbt1.setBackground(new java.awt.Color(255, 255, 255));
        eaBackbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaBackbt1.setForeground(new java.awt.Color(0, 0, 0));
        eaBackbt1.setText("Back");
        eaBackbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eaBackbt1MouseClicked(evt);
            }
        });
        eaBackbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaBackbt1ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 0));
        jLabel90.setText("Nhập thông tin sản phẩm cần thêm");

        javax.swing.GroupLayout jpAddProductLayout = new javax.swing.GroupLayout(jpAddProduct);
        jpAddProduct.setLayout(jpAddProductLayout);
        jpAddProductLayout.setHorizontalGroup(
            jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddProductLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddProductLayout.createSequentialGroup()
                        .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaID1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81)
                            .addComponent(jLabel84))
                        .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAddProductLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82))
                                .addGap(18, 18, 18)
                                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel83)
                                    .addComponent(eaSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpAddProductLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel85))))
                    .addGroup(jpAddProductLayout.createSequentialGroup()
                        .addComponent(eaPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eaWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addComponent(eaSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAddProductLayout.createSequentialGroup()
                        .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addGap(18, 18, 18)
                        .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88))
                        .addGap(18, 18, 18)
                        .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel89)
                            .addComponent(eaRole1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(137, 137, 137))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddProductLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90)
                            .addComponent(jLabel80)))
                    .addGroup(jpAddProductLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(eaAddbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eaBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAddProductLayout.setVerticalGroup(
            jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addGap(52, 52, 52)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaID1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaRole1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaAddbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pnContainer.add(jpAddProduct, "card12");

        jpDeleteProduct.setBackground(new java.awt.Color(237, 218, 199));
        jpDeleteProduct.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(100, 19, 19));
        jLabel91.setText("XOÁ SẢN PHẨM");

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 0));
        jLabel92.setText("Tìm kiếm theo ");

        edCategory1.setBackground(new java.awt.Color(255, 255, 255));
        edCategory1.setForeground(new java.awt.Color(0, 0, 0));
        edCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 0));
        jLabel93.setText("Nhập thông tin");

        edEnter1.setBackground(new java.awt.Color(255, 255, 255));
        edEnter1.setForeground(new java.awt.Color(0, 0, 0));
        edEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnter1ActionPerformed(evt);
            }
        });

        edSearch1.setBackground(new java.awt.Color(0, 0, 0));
        edSearch1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch1.setForeground(new java.awt.Color(255, 255, 255));
        edSearch1.setText("Tìm");

        edTable1.setBackground(new java.awt.Color(255, 255, 255));
        edTable1.setForeground(new java.awt.Color(0, 0, 0));
        edTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SEX", "PHONE", "START DATE", "SALARY"
            }
        ));
        edTable1.setGridColor(new java.awt.Color(100, 19, 19));
        edTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setViewportView(edTable1);

        edDeletebt1.setBackground(new java.awt.Color(100, 19, 19));
        edDeletebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edDeletebt1.setForeground(new java.awt.Color(255, 255, 255));
        edDeletebt1.setText("Xoá");

        edBackbt1.setBackground(new java.awt.Color(255, 255, 255));
        edBackbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edBackbt1.setForeground(new java.awt.Color(0, 0, 0));
        edBackbt1.setText("Back");
        edBackbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBackbt1MouseClicked(evt);
            }
        });
        edBackbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBackbt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDeleteProductLayout = new javax.swing.GroupLayout(jpDeleteProduct);
        jpDeleteProduct.setLayout(jpDeleteProductLayout);
        jpDeleteProductLayout.setHorizontalGroup(
            jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteProductLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92))
                        .addGap(35, 35, 35)
                        .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel93)
                            .addGroup(jpDeleteProductLayout.createSequentialGroup()
                                .addComponent(edEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel91)
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(edDeletebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDeleteProductLayout.setVerticalGroup(
            jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteProductLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDeleteProductLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edDeletebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174))))
        );

        pnContainer.add(jpDeleteProduct, "card13");

        jpUpdateProduct.setBackground(new java.awt.Color(237, 218, 199));
        jpUpdateProduct.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(100, 19, 19));
        jLabel94.setText("CHỈNH SỬA SẢN PHẨM");

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Tìm kiếm theo");

        euCategory1.setBackground(new java.awt.Color(255, 255, 255));
        euCategory1.setForeground(new java.awt.Color(0, 0, 0));
        euCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 0, 0));
        jLabel96.setText("Nhập thông tin");

        euEnter1.setBackground(new java.awt.Color(255, 255, 255));
        euEnter1.setForeground(new java.awt.Color(0, 0, 0));
        euEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euEnter1ActionPerformed(evt);
            }
        });

        euSearch1.setBackground(new java.awt.Color(0, 0, 0));
        euSearch1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSearch1.setForeground(new java.awt.Color(255, 255, 255));
        euSearch1.setText("Tìm");

        euTable1.setBackground(new java.awt.Color(255, 255, 255));
        euTable1.setForeground(new java.awt.Color(0, 0, 0));
        euTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SEX", "PHONE", "START DATE", "SALARY"
            }
        ));
        euTable1.setGridColor(new java.awt.Color(100, 19, 19));
        euTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setViewportView(euTable1);

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(100, 19, 19));
        jLabel97.setText("Nhập thông tin cần chỉnh sửa");

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("ID");

        euID1.setBackground(new java.awt.Color(255, 255, 255));
        euID1.setForeground(new java.awt.Color(0, 0, 0));

        euName1.setBackground(new java.awt.Color(255, 255, 255));
        euName1.setForeground(new java.awt.Color(0, 0, 0));

        euSex1.setBackground(new java.awt.Color(255, 255, 255));
        euSex1.setForeground(new java.awt.Color(0, 0, 0));

        euPhone1.setBackground(new java.awt.Color(255, 255, 255));
        euPhone1.setForeground(new java.awt.Color(0, 0, 0));

        euWorkDate1.setBackground(new java.awt.Color(255, 255, 255));
        euWorkDate1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("Tên");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("Giới tính");

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 0));
        jLabel101.setText("Số điện thoại");

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 0));
        jLabel102.setText("Ngày vào làm");

        euSalary1.setBackground(new java.awt.Color(255, 255, 255));
        euSalary1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("Lương");

        euSavebt1.setBackground(new java.awt.Color(100, 19, 19));
        euSavebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSavebt1.setForeground(new java.awt.Color(255, 255, 255));
        euSavebt1.setText("Lưu");
        euSavebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euSavebt1ActionPerformed(evt);
            }
        });

        euBackbt1.setBackground(new java.awt.Color(255, 255, 255));
        euBackbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euBackbt1.setForeground(new java.awt.Color(0, 0, 0));
        euBackbt1.setText("Back");
        euBackbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euBackbt1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpUpdateProductLayout = new javax.swing.GroupLayout(jpUpdateProduct);
        jpUpdateProduct.setLayout(jpUpdateProductLayout);
        jpUpdateProductLayout.setHorizontalGroup(
            jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(jLabel96))
                            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                                .addComponent(euCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(euEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(euSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel97)
                            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel98)
                                    .addComponent(euID1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel99)
                                    .addComponent(euName1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel100)
                                    .addComponent(euSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel101)
                                    .addComponent(euPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel103)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpUpdateProductLayout.createSequentialGroup()
                                .addComponent(euWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(euSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(euSavebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jpUpdateProductLayout.setVerticalGroup(
            jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addGap(6, 6, 6)
                        .addComponent(euID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addGap(6, 6, 6)
                        .addComponent(euName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addGap(6, 6, 6)
                        .addComponent(euSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addGap(6, 6, 6)
                        .addComponent(euPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103))
                .addGap(1, 1, 1)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSavebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pnContainer.add(jpUpdateProduct, "card14");

        jpVoucher.setBackground(new java.awt.Color(237, 218, 199));
        jpVoucher.setPreferredSize(new java.awt.Dimension(900, 533));
        jpVoucher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(100, 19, 19));
        jLabel104.setText("QUẢN LÝ KHUYẾN MÃI");
        jpVoucher.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 0));
        jLabel105.setText("Tìm kiếm theo");
        jpVoucher.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        emCategory2.setBackground(new java.awt.Color(255, 255, 255));
        emCategory2.setForeground(new java.awt.Color(0, 0, 0));
        emCategory2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpVoucher.add(emCategory2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 40));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 0, 0));
        jLabel106.setText("Nhập thông tin");
        jpVoucher.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        emEnter2.setBackground(new java.awt.Color(255, 255, 255));
        emEnter2.setForeground(new java.awt.Color(0, 0, 0));
        jpVoucher.add(emEnter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, 40));

        emSearch2.setBackground(new java.awt.Color(0, 0, 0));
        emSearch2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch2.setForeground(new java.awt.Color(255, 255, 255));
        emSearch2.setText("Tìm");
        emSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch2ActionPerformed(evt);
            }
        });
        jpVoucher.add(emSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 40));

        emTable2.setBackground(new java.awt.Color(255, 255, 255));
        emTable2.setForeground(new java.awt.Color(0, 0, 0));
        emTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Giới tính", "Số điện thoại", "Ngày vào làm", "Lương"
            }
        ));
        emTable2.setGridColor(new java.awt.Color(100, 19, 19));
        emTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane13.setViewportView(emTable2);

        jpVoucher.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 620, 320));

        emAddbt2.setBackground(new java.awt.Color(100, 19, 19));
        emAddbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emAddbt2.setForeground(new java.awt.Color(255, 255, 255));
        emAddbt2.setText("Thêm");
        emAddbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emAddbt2MouseClicked(evt);
            }
        });
        emAddbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emAddbt2ActionPerformed(evt);
            }
        });
        jpVoucher.add(emAddbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 80, 40));

        emDeletebt2.setBackground(new java.awt.Color(100, 19, 19));
        emDeletebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emDeletebt2.setForeground(new java.awt.Color(255, 255, 255));
        emDeletebt2.setText("Xoá");
        emDeletebt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emDeletebt2MouseClicked(evt);
            }
        });
        emDeletebt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emDeletebt2ActionPerformed(evt);
            }
        });
        jpVoucher.add(emDeletebt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 80, 40));

        emUpdatebt2.setBackground(new java.awt.Color(100, 19, 19));
        emUpdatebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emUpdatebt2.setForeground(new java.awt.Color(255, 255, 255));
        emUpdatebt2.setText("Sửa");
        emUpdatebt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emUpdatebt2MouseClicked(evt);
            }
        });
        emUpdatebt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emUpdatebt2ActionPerformed(evt);
            }
        });
        jpVoucher.add(emUpdatebt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 80, 40));

        pnContainer.add(jpVoucher, "card2");

        jpAddVoucher.setBackground(new java.awt.Color(237, 218, 199));
        jpAddVoucher.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(100, 19, 19));
        jLabel107.setText("THÊM KHUYẾN MÃI");

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("ID");

        eaID2.setBackground(new java.awt.Color(255, 255, 255));
        eaID2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 0, 0));
        jLabel109.setText("Tên sản phẩm");

        eaName2.setBackground(new java.awt.Color(255, 255, 255));
        eaName2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 0));
        jLabel110.setText("Giới tính");

        eaSex2.setBackground(new java.awt.Color(255, 255, 255));
        eaSex2.setForeground(new java.awt.Color(0, 0, 0));

        eaPhone2.setBackground(new java.awt.Color(255, 255, 255));
        eaPhone2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 0, 0));
        jLabel111.setText("Số điện thoại");

        eaWorkDate2.setBackground(new java.awt.Color(255, 255, 255));
        eaWorkDate2.setForeground(new java.awt.Color(0, 0, 0));

        eaSalary2.setBackground(new java.awt.Color(255, 255, 255));
        eaSalary2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 0));
        jLabel112.setText("Ngày vào làm");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 0));
        jLabel113.setText("Lương tháng");

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 0));
        jLabel114.setText("Username");

        eaUsername2.setBackground(new java.awt.Color(255, 255, 255));
        eaUsername2.setForeground(new java.awt.Color(0, 0, 0));

        eaPassword2.setBackground(new java.awt.Color(255, 255, 255));
        eaPassword2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 0));
        jLabel115.setText("Password");

        eaRole2.setBackground(new java.awt.Color(255, 255, 255));
        eaRole2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("Vai trò");

        eaAddbt2.setBackground(new java.awt.Color(100, 19, 19));
        eaAddbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaAddbt2.setForeground(new java.awt.Color(255, 255, 255));
        eaAddbt2.setText("Thêm");
        eaAddbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaAddbt2ActionPerformed(evt);
            }
        });

        eaBackbt2.setBackground(new java.awt.Color(255, 255, 255));
        eaBackbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaBackbt2.setForeground(new java.awt.Color(0, 0, 0));
        eaBackbt2.setText("Back");
        eaBackbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eaBackbt2MouseClicked(evt);
            }
        });
        eaBackbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaBackbt2ActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 0));
        jLabel117.setText("Nhập thông tin khuyến mãi cần thêm");

        javax.swing.GroupLayout jpAddVoucherLayout = new javax.swing.GroupLayout(jpAddVoucher);
        jpAddVoucher.setLayout(jpAddVoucherLayout);
        jpAddVoucherLayout.setHorizontalGroup(
            jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddVoucherLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddVoucherLayout.createSequentialGroup()
                        .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaID2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108)
                            .addComponent(jLabel111))
                        .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eaName2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel109))
                                .addGap(18, 18, 18)
                                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel110)
                                    .addComponent(eaSex2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel112))))
                    .addGroup(jpAddVoucherLayout.createSequentialGroup()
                        .addComponent(eaPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eaWorkDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113)
                            .addComponent(eaSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAddVoucherLayout.createSequentialGroup()
                        .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel114))
                        .addGap(18, 18, 18)
                        .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115))
                        .addGap(18, 18, 18)
                        .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel116)
                            .addComponent(eaRole2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(137, 137, 137))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddVoucherLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117)
                            .addComponent(jLabel107)))
                    .addGroup(jpAddVoucherLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(eaAddbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eaBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAddVoucherLayout.setVerticalGroup(
            jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel117)
                .addGap(52, 52, 52)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jLabel109)
                    .addComponent(jLabel110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaID2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaName2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaSex2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jLabel112)
                    .addComponent(jLabel113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaWorkDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(jLabel115)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaRole2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eaAddbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pnContainer.add(jpAddVoucher, "card12");

        jpDeleteVoucher.setBackground(new java.awt.Color(237, 218, 199));
        jpDeleteVoucher.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(100, 19, 19));
        jLabel118.setText("XOÁ KHUYẾN MÃI");

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setText("Tìm kiếm theo ");

        edCategory2.setBackground(new java.awt.Color(255, 255, 255));
        edCategory2.setForeground(new java.awt.Color(0, 0, 0));
        edCategory2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 0));
        jLabel120.setText("Nhập thông tin");

        edEnter2.setBackground(new java.awt.Color(255, 255, 255));
        edEnter2.setForeground(new java.awt.Color(0, 0, 0));
        edEnter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnter2ActionPerformed(evt);
            }
        });

        edSearch2.setBackground(new java.awt.Color(0, 0, 0));
        edSearch2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch2.setForeground(new java.awt.Color(255, 255, 255));
        edSearch2.setText("Tìm");

        edTable2.setBackground(new java.awt.Color(255, 255, 255));
        edTable2.setForeground(new java.awt.Color(0, 0, 0));
        edTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SEX", "PHONE", "START DATE", "SALARY"
            }
        ));
        edTable2.setGridColor(new java.awt.Color(100, 19, 19));
        edTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane14.setViewportView(edTable2);

        edDeletebt2.setBackground(new java.awt.Color(100, 19, 19));
        edDeletebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edDeletebt2.setForeground(new java.awt.Color(255, 255, 255));
        edDeletebt2.setText("Xoá");

        edBackbt2.setBackground(new java.awt.Color(255, 255, 255));
        edBackbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edBackbt2.setForeground(new java.awt.Color(0, 0, 0));
        edBackbt2.setText("Back");
        edBackbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBackbt2MouseClicked(evt);
            }
        });
        edBackbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBackbt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDeleteVoucherLayout = new javax.swing.GroupLayout(jpDeleteVoucher);
        jpDeleteVoucher.setLayout(jpDeleteVoucherLayout);
        jpDeleteVoucherLayout.setHorizontalGroup(
            jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel119))
                        .addGap(35, 35, 35)
                        .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel120)
                            .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                                .addComponent(edEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel118)
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(edDeletebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDeleteVoucherLayout.setVerticalGroup(
            jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDeleteVoucherLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edDeletebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174))))
        );

        pnContainer.add(jpDeleteVoucher, "card13");

        jpUpdateVoucher.setBackground(new java.awt.Color(237, 218, 199));
        jpUpdateVoucher.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(100, 19, 19));
        jLabel121.setText("CHỈNH SỬA KHUYẾN MÃI");

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("Tìm kiếm theo");

        euCategory2.setBackground(new java.awt.Color(255, 255, 255));
        euCategory2.setForeground(new java.awt.Color(0, 0, 0));
        euCategory2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setText("Nhập thông tin");

        euEnter2.setBackground(new java.awt.Color(255, 255, 255));
        euEnter2.setForeground(new java.awt.Color(0, 0, 0));
        euEnter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euEnter2ActionPerformed(evt);
            }
        });

        euSearch2.setBackground(new java.awt.Color(0, 0, 0));
        euSearch2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSearch2.setForeground(new java.awt.Color(255, 255, 255));
        euSearch2.setText("Tìm");

        euTable2.setBackground(new java.awt.Color(255, 255, 255));
        euTable2.setForeground(new java.awt.Color(0, 0, 0));
        euTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SEX", "PHONE", "START DATE", "SALARY"
            }
        ));
        euTable2.setGridColor(new java.awt.Color(100, 19, 19));
        euTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane15.setViewportView(euTable2);

        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(100, 19, 19));
        jLabel124.setText("Nhập thông tin cần chỉnh sửa");

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(0, 0, 0));
        jLabel125.setText("ID");

        euID2.setBackground(new java.awt.Color(255, 255, 255));
        euID2.setForeground(new java.awt.Color(0, 0, 0));

        euName2.setBackground(new java.awt.Color(255, 255, 255));
        euName2.setForeground(new java.awt.Color(0, 0, 0));

        euSex2.setBackground(new java.awt.Color(255, 255, 255));
        euSex2.setForeground(new java.awt.Color(0, 0, 0));

        euPhone2.setBackground(new java.awt.Color(255, 255, 255));
        euPhone2.setForeground(new java.awt.Color(0, 0, 0));

        euWorkDate2.setBackground(new java.awt.Color(255, 255, 255));
        euWorkDate2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 0, 0));
        jLabel126.setText("Tên");

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(0, 0, 0));
        jLabel127.setText("Giới tính");

        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 0, 0));
        jLabel128.setText("Số điện thoại");

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setText("Ngày vào làm");

        euSalary2.setBackground(new java.awt.Color(255, 255, 255));
        euSalary2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("Lương");

        euSavebt2.setBackground(new java.awt.Color(100, 19, 19));
        euSavebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSavebt2.setForeground(new java.awt.Color(255, 255, 255));
        euSavebt2.setText("Lưu");
        euSavebt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euSavebt2ActionPerformed(evt);
            }
        });

        euBackbt2.setBackground(new java.awt.Color(255, 255, 255));
        euBackbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euBackbt2.setForeground(new java.awt.Color(0, 0, 0));
        euBackbt2.setText("Back");
        euBackbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euBackbt2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpUpdateVoucherLayout = new javax.swing.GroupLayout(jpUpdateVoucher);
        jpUpdateVoucher.setLayout(jpUpdateVoucherLayout);
        jpUpdateVoucherLayout.setHorizontalGroup(
            jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(jLabel123))
                            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                                .addComponent(euCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(euEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(euSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel124)
                            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel125)
                                    .addComponent(euID2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel126)
                                    .addComponent(euName2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel127)
                                    .addComponent(euSex2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel128)
                                    .addComponent(euPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                                .addComponent(jLabel129)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel130))
                            .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpUpdateVoucherLayout.createSequentialGroup()
                                .addComponent(euWorkDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(euSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(euSavebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jpUpdateVoucherLayout.setVerticalGroup(
            jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel124)
                .addGap(18, 18, 18)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addGap(6, 6, 6)
                        .addComponent(euID2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addGap(6, 6, 6)
                        .addComponent(euName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addComponent(jLabel127)
                        .addGap(6, 6, 6)
                        .addComponent(euSex2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addGap(6, 6, 6)
                        .addComponent(euPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel129)
                    .addComponent(jLabel130))
                .addGap(1, 1, 1)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSavebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euWorkDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pnContainer.add(jpUpdateVoucher, "card14");

        pnMain.add(pnContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, -1, 533));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 200, 160));
        jLabel8.setText("THE COFFEE HOME");
        pnMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        openMenu.setText(" ");
        openMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenuMouseClicked(evt);
            }
        });
        pnMain.add(openMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        adminUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminUsername.setForeground(new java.awt.Color(255, 255, 255));
        adminUsername.setText("admin");
        pnMain.add(adminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addSVG() // Thêm file svg vào giao diện
    {
        openMenu.setSVGImage("image_svg/menu.svg", 30, 30);
        closeMenu.setSVGImage("image_svg/closemenu.svg", 30, 30);
        mainLogo.setSVGImage("image_svg/mainlogo.svg", 90, 90);
        svgEmp.setSVGImage("image_svg/emp.svg", 30, 30);
        svgPro.setSVGImage("image_svg/product.svg", 30, 30);
        svgVou.setSVGImage("image_svg/voucher.svg", 30, 30);
        svgUser.setSVGImage("image_svg/account.svg", 30, 30);
        svgBill.setSVGImage("image_svg/bill.svg", 30, 30);
        svgSta.setSVGImage("image_svg/statistics.svg", 30, 30);
        svgLogout.setSVGImage("image_svg/logout.svg", 30, 30);
    }
    
    // THIẾT KẾ GIAO DIỆN 
    
   // Method setTime
    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (running.get()) {
                        Date date = new Date();
                        SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                        SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                        String time = tf.format(date);

                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                lbTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                                lbDate.setText(df.format(date));
                            }
                        });

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }).start();
    }

    // Method open MenuBar
    public void openMenuBar() {
        running.set(false);
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    final int currentWidth = i;
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            pnSlideMenu.setSize(currentWidth, height);
                        }
                    });
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    // Method close MenuBar
    public void closeMenuBar() {
        running.set(true);
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    final int currentWidth = i;
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            pnSlideMenu.setSize(currentWidth, height);
                        }
                    });
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    // Nút đăng xuất
    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new First().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(true);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbAddMouseClicked

    private void lbEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEmployeeMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(true);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbEmployeeMouseClicked

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuMouseClicked
        openMenuBar();
    }//GEN-LAST:event_openMenuMouseClicked

    private void closeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMenuMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_closeMenuMouseClicked

    private void mainLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLogoMouseClicked
        closeMenuBar();
        jpHome.setVisible(true);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_mainLogoMouseClicked

    private void lbVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVoucherMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(true);
    }//GEN-LAST:event_lbVoucherMouseClicked

    private void emSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearchActionPerformed
      
    }//GEN-LAST:event_emSearchActionPerformed

    private void emAddbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emAddbtMouseClicked
        jpEmployee.setVisible(false);
        jpAddEmployee.setVisible(true);
    }//GEN-LAST:event_emAddbtMouseClicked

    private void emAddbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emAddbtActionPerformed
       
    }//GEN-LAST:event_emAddbtActionPerformed

    private void emDeletebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emDeletebtMouseClicked
        jpEmployee.setVisible(false);
        jpDeleteEmployee.setVisible(true);
    }//GEN-LAST:event_emDeletebtMouseClicked

    private void emDeletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emDeletebtActionPerformed
        
    }//GEN-LAST:event_emDeletebtActionPerformed

    private void emUpdatebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emUpdatebtMouseClicked
        jpEmployee.setVisible(false);
        jpUpdateEmployee.setVisible(true);
    }//GEN-LAST:event_emUpdatebtMouseClicked

    private void emUpdatebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emUpdatebtActionPerformed
        
    }//GEN-LAST:event_emUpdatebtActionPerformed

    private void eaAddbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaAddbtActionPerformed
       
    }//GEN-LAST:event_eaAddbtActionPerformed

    private void eaBackbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eaBackbtMouseClicked
        jpEmployee.setVisible(true);
        jpAddEmployee.setVisible(false);
    }//GEN-LAST:event_eaBackbtMouseClicked

    private void eaBackbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaBackbtActionPerformed
        
    }//GEN-LAST:event_eaBackbtActionPerformed

    private void edEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnterActionPerformed
        
    }//GEN-LAST:event_edEnterActionPerformed

    private void edBackbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBackbtActionPerformed
       
    }//GEN-LAST:event_edBackbtActionPerformed

    private void euEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euEnterActionPerformed
        
    }//GEN-LAST:event_euEnterActionPerformed

    private void euSavebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euSavebtActionPerformed
      
    }//GEN-LAST:event_euSavebtActionPerformed

    private void lbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbUserMouseClicked

    private void edBackbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBackbtMouseClicked
        jpEmployee.setVisible(true);
        jpDeleteEmployee.setVisible(false);
    }//GEN-LAST:event_edBackbtMouseClicked

    private void euBackbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euBackbtMouseClicked
        jpEmployee.setVisible(true);
        jpUpdateEmployee.setVisible(false);
    }//GEN-LAST:event_euBackbtMouseClicked

    private void lbUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUser1MouseClicked
       
    }//GEN-LAST:event_lbUser1MouseClicked

    private void lbUser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUser2MouseClicked
        
    }//GEN-LAST:event_lbUser2MouseClicked

    private void emSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch1ActionPerformed
        
    }//GEN-LAST:event_emSearch1ActionPerformed

    private void emAddbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emAddbt1MouseClicked
        jpEmployee.setVisible(false);
        jpAddEmployee.setVisible(true);
    }//GEN-LAST:event_emAddbt1MouseClicked

    private void emAddbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emAddbt1ActionPerformed
       
    }//GEN-LAST:event_emAddbt1ActionPerformed

    private void emDeletebt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emDeletebt1MouseClicked
        jpEmployee.setVisible(false);
        jpDeleteEmployee.setVisible(true);
    }//GEN-LAST:event_emDeletebt1MouseClicked

    private void emDeletebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emDeletebt1ActionPerformed
        
    }//GEN-LAST:event_emDeletebt1ActionPerformed

    private void emUpdatebt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emUpdatebt1MouseClicked
        jpEmployee.setVisible(false);
        jpUpdateEmployee.setVisible(true);
    }//GEN-LAST:event_emUpdatebt1MouseClicked

    private void emUpdatebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emUpdatebt1ActionPerformed
        
    }//GEN-LAST:event_emUpdatebt1ActionPerformed

    private void eaAddbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaAddbt1ActionPerformed
       
    }//GEN-LAST:event_eaAddbt1ActionPerformed

    private void eaBackbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eaBackbt1MouseClicked
        jpEmployee.setVisible(true);
        jpAddEmployee.setVisible(false);
    }//GEN-LAST:event_eaBackbt1MouseClicked

    private void eaBackbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaBackbt1ActionPerformed
        
    }//GEN-LAST:event_eaBackbt1ActionPerformed

    private void edEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnter1ActionPerformed
        
    }//GEN-LAST:event_edEnter1ActionPerformed

    private void edBackbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBackbt1MouseClicked
        jpEmployee.setVisible(true);
        jpDeleteEmployee.setVisible(false);
    }//GEN-LAST:event_edBackbt1MouseClicked

    private void edBackbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBackbt1ActionPerformed
        
    }//GEN-LAST:event_edBackbt1ActionPerformed

    private void euEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euEnter1ActionPerformed
       
    }//GEN-LAST:event_euEnter1ActionPerformed

    private void euSavebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euSavebt1ActionPerformed
        
    }//GEN-LAST:event_euSavebt1ActionPerformed

    private void euBackbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euBackbt1MouseClicked
        jpEmployee.setVisible(true);
        jpUpdateEmployee.setVisible(false);
    }//GEN-LAST:event_euBackbt1MouseClicked

    private void emSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch2ActionPerformed
        
    }//GEN-LAST:event_emSearch2ActionPerformed

    private void emAddbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emAddbt2MouseClicked
        jpVoucher.setVisible(false);
        jpAddVoucher.setVisible(true);
    }//GEN-LAST:event_emAddbt2MouseClicked

    private void emAddbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emAddbt2ActionPerformed
        
    }//GEN-LAST:event_emAddbt2ActionPerformed

    private void emDeletebt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emDeletebt2MouseClicked
        jpVoucher.setVisible(false);
        jpDeleteVoucher.setVisible(true);
    }//GEN-LAST:event_emDeletebt2MouseClicked

    private void emDeletebt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emDeletebt2ActionPerformed
        
    }//GEN-LAST:event_emDeletebt2ActionPerformed

    private void emUpdatebt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emUpdatebt2MouseClicked
        jpVoucher.setVisible(false);
        jpUpdateVoucher.setVisible(true);
    }//GEN-LAST:event_emUpdatebt2MouseClicked

    private void emUpdatebt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emUpdatebt2ActionPerformed
        
    }//GEN-LAST:event_emUpdatebt2ActionPerformed

    private void eaAddbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaAddbt2ActionPerformed
        
    }//GEN-LAST:event_eaAddbt2ActionPerformed

    private void eaBackbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eaBackbt2MouseClicked
        jpVoucher.setVisible(true);
        jpAddVoucher.setVisible(false);
    }//GEN-LAST:event_eaBackbt2MouseClicked

    private void eaBackbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaBackbt2ActionPerformed
        
    }//GEN-LAST:event_eaBackbt2ActionPerformed

    private void edEnter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnter2ActionPerformed
        
    }//GEN-LAST:event_edEnter2ActionPerformed

    private void edBackbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBackbt2MouseClicked
        jpVoucher.setVisible(true);
        jpDeleteVoucher.setVisible(false);
    }//GEN-LAST:event_edBackbt2MouseClicked

    private void edBackbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBackbt2ActionPerformed
       
    }//GEN-LAST:event_edBackbt2ActionPerformed

    private void euEnter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euEnter2ActionPerformed
        
    }//GEN-LAST:event_euEnter2ActionPerformed

    private void euSavebt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euSavebt2ActionPerformed
      
    }//GEN-LAST:event_euSavebt2ActionPerformed

    private void euBackbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euBackbt2MouseClicked
        jpVoucher.setVisible(true);
        jpUpdateVoucher.setVisible(false);
    }//GEN-LAST:event_euBackbt2MouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel adminUsername;
    private userView.SVGImage closeMenu;
    private javax.swing.JButton eaAddbt;
    private javax.swing.JButton eaAddbt1;
    private javax.swing.JButton eaAddbt2;
    private javax.swing.JButton eaBackbt;
    private javax.swing.JButton eaBackbt1;
    private javax.swing.JButton eaBackbt2;
    private javax.swing.JTextField eaID;
    private javax.swing.JTextField eaID1;
    private javax.swing.JTextField eaID2;
    private javax.swing.JTextField eaName;
    private javax.swing.JTextField eaName1;
    private javax.swing.JTextField eaName2;
    private javax.swing.JTextField eaPassword;
    private javax.swing.JTextField eaPassword1;
    private javax.swing.JTextField eaPassword2;
    private javax.swing.JTextField eaPhone;
    private javax.swing.JTextField eaPhone1;
    private javax.swing.JTextField eaPhone2;
    private javax.swing.JTextField eaRole;
    private javax.swing.JTextField eaRole1;
    private javax.swing.JTextField eaRole2;
    private javax.swing.JTextField eaSalary;
    private javax.swing.JTextField eaSalary1;
    private javax.swing.JTextField eaSalary2;
    private javax.swing.JTextField eaSex;
    private javax.swing.JTextField eaSex1;
    private javax.swing.JTextField eaSex2;
    private javax.swing.JTextField eaUsername;
    private javax.swing.JTextField eaUsername1;
    private javax.swing.JTextField eaUsername2;
    private javax.swing.JTextField eaWorkDate;
    private javax.swing.JTextField eaWorkDate1;
    private javax.swing.JTextField eaWorkDate2;
    private javax.swing.JButton edBackbt;
    private javax.swing.JButton edBackbt1;
    private javax.swing.JButton edBackbt2;
    private javax.swing.JComboBox<String> edCategory;
    private javax.swing.JComboBox<String> edCategory1;
    private javax.swing.JComboBox<String> edCategory2;
    private javax.swing.JButton edDeletebt;
    private javax.swing.JButton edDeletebt1;
    private javax.swing.JButton edDeletebt2;
    private javax.swing.JTextField edEnter;
    private javax.swing.JTextField edEnter1;
    private javax.swing.JTextField edEnter2;
    private javax.swing.JButton edSearch;
    private javax.swing.JButton edSearch1;
    private javax.swing.JButton edSearch2;
    private javax.swing.JTable edTable;
    private javax.swing.JTable edTable1;
    private javax.swing.JTable edTable2;
    private javax.swing.JButton emAddbt;
    private javax.swing.JButton emAddbt1;
    private javax.swing.JButton emAddbt2;
    private javax.swing.JComboBox<String> emCategory;
    private javax.swing.JComboBox<String> emCategory1;
    private javax.swing.JComboBox<String> emCategory2;
    private javax.swing.JButton emDeletebt;
    private javax.swing.JButton emDeletebt1;
    private javax.swing.JButton emDeletebt2;
    private javax.swing.JTextField emEnter;
    private javax.swing.JTextField emEnter1;
    private javax.swing.JTextField emEnter2;
    private javax.swing.JButton emSearch;
    private javax.swing.JButton emSearch1;
    private javax.swing.JButton emSearch2;
    private javax.swing.JTable emTable;
    private javax.swing.JTable emTable1;
    private javax.swing.JTable emTable2;
    private javax.swing.JButton emUpdatebt;
    private javax.swing.JButton emUpdatebt1;
    private javax.swing.JButton emUpdatebt2;
    private javax.swing.JButton euBackbt;
    private javax.swing.JButton euBackbt1;
    private javax.swing.JButton euBackbt2;
    private javax.swing.JComboBox<String> euCategory;
    private javax.swing.JComboBox<String> euCategory1;
    private javax.swing.JComboBox<String> euCategory2;
    private javax.swing.JTextField euEnter;
    private javax.swing.JTextField euEnter1;
    private javax.swing.JTextField euEnter2;
    private javax.swing.JTextField euID;
    private javax.swing.JTextField euID1;
    private javax.swing.JTextField euID2;
    private javax.swing.JTextField euName;
    private javax.swing.JTextField euName1;
    private javax.swing.JTextField euName2;
    private javax.swing.JTextField euPhone;
    private javax.swing.JTextField euPhone1;
    private javax.swing.JTextField euPhone2;
    private javax.swing.JTextField euSalary;
    private javax.swing.JTextField euSalary1;
    private javax.swing.JTextField euSalary2;
    private javax.swing.JButton euSavebt;
    private javax.swing.JButton euSavebt1;
    private javax.swing.JButton euSavebt2;
    private javax.swing.JButton euSearch;
    private javax.swing.JButton euSearch1;
    private javax.swing.JButton euSearch2;
    private javax.swing.JTextField euSex;
    private javax.swing.JTextField euSex1;
    private javax.swing.JTextField euSex2;
    private javax.swing.JTable euTable;
    private javax.swing.JTable euTable1;
    private javax.swing.JTable euTable2;
    private javax.swing.JTextField euWorkDate;
    private javax.swing.JTextField euWorkDate1;
    private javax.swing.JTextField euWorkDate2;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jpAddEmployee;
    private javax.swing.JPanel jpAddProduct;
    private javax.swing.JPanel jpAddVoucher;
    private javax.swing.JPanel jpDeleteEmployee;
    private javax.swing.JPanel jpDeleteProduct;
    private javax.swing.JPanel jpDeleteVoucher;
    private javax.swing.JPanel jpEmployee;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpProduct;
    private javax.swing.JPanel jpUpdateEmployee;
    private javax.swing.JPanel jpUpdateProduct;
    private javax.swing.JPanel jpUpdateVoucher;
    private javax.swing.JPanel jpVoucher;
    private javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbEmployee;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUser1;
    private javax.swing.JLabel lbUser2;
    private javax.swing.JLabel lbVoucher;
    private userView.SVGImage mainLogo;
    private userView.SVGImage openMenu;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSlideMenu;
    private userView.SVGImage svgBill;
    private userView.SVGImage svgEmp;
    private userView.SVGImage svgLogout;
    private userView.SVGImage svgManage1;
    private userView.SVGImage svgPro;
    private userView.SVGImage svgPro1;
    private userView.SVGImage svgSta;
    private userView.SVGImage svgUser;
    private userView.SVGImage svgVou;
    // End of variables declaration//GEN-END:variables
}
