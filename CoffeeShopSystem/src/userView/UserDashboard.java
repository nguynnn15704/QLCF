package userView;

import dao.UserDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class UserDashboard extends JFrame {
    
    int width = 200; // Biến sử dụng cho thao tác đóng, mở menu
    int height = 600;
    
    UserDao user = new UserDao();
    private int id_user;
    String[] user_data = new String[8]; // mảng truy xuất các data trong bảng user
    
    public UserDashboard() {
        initComponents();
        addSVG(); // file SVG
        Account(); // Xử lí Account Frame (ĐANG LỖI)
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
        lbHome = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        svgHome = new userView.SVGImage();
        svgAccount = new userView.SVGImage();
        svgShop = new userView.SVGImage();
        svgLogout = new userView.SVGImage();
        lbPurchase1 = new javax.swing.JLabel();
        lbPurchase2 = new javax.swing.JLabel();
        svgHistory = new userView.SVGImage();
        svgChat = new userView.SVGImage();
        lbAccount1 = new javax.swing.JLabel();
        svgVou = new userView.SVGImage();
        pnContainer = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jpHomea = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        svgA = new userView.SVGImage();
        svgB = new userView.SVGImage();
        jLabel19 = new javax.swing.JLabel();
        jpAccount = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        amUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        amSavebt = new javax.swing.JButton();
        amID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        amSignDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        amSex = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        amDeletebt = new javax.swing.JButton();
        jpVoucher = new javax.swing.JPanel();
        jLabel312 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel311 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jpMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbCaphe = new javax.swing.JLabel();
        lbTra = new javax.swing.JLabel();
        lbBanh = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        MenuCard = new javax.swing.JPanel();
        MenuCaphe = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jSpinner20 = new javax.swing.JSpinner();
        jCheckBox20 = new javax.swing.JCheckBox();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        MenuTra = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jCheckBox21 = new javax.swing.JCheckBox();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jSpinner22 = new javax.swing.JSpinner();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jSpinner23 = new javax.swing.JSpinner();
        jCheckBox23 = new javax.swing.JCheckBox();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jSpinner24 = new javax.swing.JSpinner();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jSpinner25 = new javax.swing.JSpinner();
        jCheckBox25 = new javax.swing.JCheckBox();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jSpinner26 = new javax.swing.JSpinner();
        jCheckBox26 = new javax.swing.JCheckBox();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jSpinner27 = new javax.swing.JSpinner();
        jCheckBox27 = new javax.swing.JCheckBox();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jSpinner28 = new javax.swing.JSpinner();
        jCheckBox28 = new javax.swing.JCheckBox();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jSpinner29 = new javax.swing.JSpinner();
        jCheckBox29 = new javax.swing.JCheckBox();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jSpinner30 = new javax.swing.JSpinner();
        jCheckBox30 = new javax.swing.JCheckBox();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jSpinner31 = new javax.swing.JSpinner();
        jCheckBox31 = new javax.swing.JCheckBox();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jSpinner32 = new javax.swing.JSpinner();
        jCheckBox32 = new javax.swing.JCheckBox();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        MenuBanh = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jSpinner33 = new javax.swing.JSpinner();
        jCheckBox33 = new javax.swing.JCheckBox();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jSpinner34 = new javax.swing.JSpinner();
        jCheckBox34 = new javax.swing.JCheckBox();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jSpinner35 = new javax.swing.JSpinner();
        jCheckBox35 = new javax.swing.JCheckBox();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jSpinner36 = new javax.swing.JSpinner();
        jCheckBox36 = new javax.swing.JCheckBox();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jSpinner37 = new javax.swing.JSpinner();
        jCheckBox37 = new javax.swing.JCheckBox();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jSpinner38 = new javax.swing.JSpinner();
        jCheckBox38 = new javax.swing.JCheckBox();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jSpinner39 = new javax.swing.JSpinner();
        jCheckBox39 = new javax.swing.JCheckBox();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jSpinner40 = new javax.swing.JSpinner();
        jCheckBox40 = new javax.swing.JCheckBox();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jSpinner41 = new javax.swing.JSpinner();
        jCheckBox41 = new javax.swing.JCheckBox();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jSpinner42 = new javax.swing.JSpinner();
        jCheckBox42 = new javax.swing.JCheckBox();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jSpinner43 = new javax.swing.JSpinner();
        jCheckBox43 = new javax.swing.JCheckBox();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jSpinner44 = new javax.swing.JSpinner();
        jCheckBox44 = new javax.swing.JCheckBox();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jSpinner45 = new javax.swing.JSpinner();
        jCheckBox45 = new javax.swing.JCheckBox();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpThanhtoan = new javax.swing.JPanel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        scrollPane2 = new java.awt.ScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        jLabel396 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jLabel401 = new javax.swing.JLabel();
        jLabel402 = new javax.swing.JLabel();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jLabel407 = new javax.swing.JLabel();
        jLabel408 = new javax.swing.JLabel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        jLabel414 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        openMenu = new userView.SVGImage();
        userUsername = new javax.swing.JLabel();

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
        pnSlideMenu.add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        lbHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbHome.setText("Trang chủ");
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lbAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbAccount.setText("Tài khoản");
        lbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAccountMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lbMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMenu.setForeground(new java.awt.Color(255, 255, 255));
        lbMenu.setText("Mua hàng");
        lbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenuMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        pnSlideMenu.add(svgHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 30));
        pnSlideMenu.add(svgAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 30, 30));
        pnSlideMenu.add(svgShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 30, 30));
        pnSlideMenu.add(svgLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 30, 30));

        lbPurchase1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPurchase1.setForeground(new java.awt.Color(255, 255, 255));
        lbPurchase1.setText("Lịch sử");
        lbPurchase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPurchase1MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbPurchase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        lbPurchase2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPurchase2.setForeground(new java.awt.Color(255, 255, 255));
        lbPurchase2.setText("TCH CARE");
        lbPurchase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPurchase2MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbPurchase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));
        pnSlideMenu.add(svgHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 30, 30));
        pnSlideMenu.add(svgChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 30, 30));

        lbAccount1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lbAccount1.setText("Khuyến mãi");
        lbAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAccount1MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));
        pnSlideMenu.add(svgVou, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));

        pnMain.add(pnSlideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 600));

        pnContainer.setBackground(new java.awt.Color(204, 255, 255));
        pnContainer.setPreferredSize(new java.awt.Dimension(900, 500));
        pnContainer.setLayout(new java.awt.CardLayout());

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setPreferredSize(new java.awt.Dimension(900, 531));
        jpHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHomea.setBackground(new java.awt.Color(255, 255, 255));
        jpHomea.setPreferredSize(new java.awt.Dimension(800, 450));
        jpHomea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("MUA");
        jpHomea.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 187, 24));
        jLabel12.setText("TẶNG");
        jpHomea.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 160)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(242, 187, 24));
        jLabel13.setText("1");
        jpHomea.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Áp dụng cho 3 món sau");
        jpHomea.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Matcha latte");
        jpHomea.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cappuccino");
        jpHomea.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Espresso");
        jpHomea.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));
        jpHomea.add(svgA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 300, 300));
        jpHomea.add(svgB, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 60, 60));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(100, 19, 19));
        jLabel19.setText("Áp dụng từ 18.05 - 31.05.2024");
        jpHomea.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 190, -1));

        jpHome.add(jpHomea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 532));

        pnContainer.add(jpHome, "card4");

        jpAccount.setBackground(new java.awt.Color(247, 223, 200));
        jpAccount.setForeground(new java.awt.Color(0, 0, 0));
        jpAccount.setPreferredSize(new java.awt.Dimension(900, 531));
        jpAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(" Username");
        jpAccount.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        amUsername.setBackground(new java.awt.Color(255, 255, 255));
        amUsername.setForeground(new java.awt.Color(0, 0, 0));
        amUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amUsernameActionPerformed(evt);
            }
        });
        jpAccount.add(amUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tên");
        jpAccount.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        amName.setBackground(new java.awt.Color(255, 255, 255));
        amName.setForeground(new java.awt.Color(0, 0, 0));
        amName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amNameActionPerformed(evt);
            }
        });
        jpAccount.add(amName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Số điện thoại");
        jpAccount.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 90, -1));

        amPhone.setBackground(new java.awt.Color(255, 255, 255));
        amPhone.setForeground(new java.awt.Color(0, 0, 0));
        amPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amPhoneActionPerformed(evt);
            }
        });
        jpAccount.add(amPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 200, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Password");
        jpAccount.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        amPassword.setBackground(new java.awt.Color(255, 255, 255));
        amPassword.setForeground(new java.awt.Color(0, 0, 0));
        amPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amPasswordActionPerformed(evt);
            }
        });
        jpAccount.add(amPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Địa chỉ");
        jpAccount.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 50, -1));

        amAddress.setBackground(new java.awt.Color(255, 255, 255));
        amAddress.setForeground(new java.awt.Color(0, 0, 0));
        amAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amAddressActionPerformed(evt);
            }
        });
        jpAccount.add(amAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 200, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 19, 19));
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");
        jpAccount.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        amSavebt.setBackground(new java.awt.Color(100, 19, 19));
        amSavebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amSavebt.setForeground(new java.awt.Color(255, 255, 255));
        amSavebt.setText("Lưu");
        amSavebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amSavebtActionPerformed(evt);
            }
        });
        jpAccount.add(amSavebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 80, 40));

        amID.setBackground(new java.awt.Color(255, 255, 255));
        amID.setForeground(new java.awt.Color(0, 0, 0));
        amID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amIDActionPerformed(evt);
            }
        });
        jpAccount.add(amID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ID");
        jpAccount.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        amSignDate.setBackground(new java.awt.Color(255, 255, 255));
        amSignDate.setForeground(new java.awt.Color(0, 0, 0));
        amSignDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amSignDateActionPerformed(evt);
            }
        });
        jpAccount.add(amSignDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 200, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Giới tính");
        jpAccount.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        amSex.setBackground(new java.awt.Color(255, 255, 255));
        amSex.setForeground(new java.awt.Color(0, 0, 0));
        amSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amSexActionPerformed(evt);
            }
        });
        jpAccount.add(amSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 200, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Ngày đăng ký");
        jpAccount.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        amDeletebt.setBackground(new java.awt.Color(255, 255, 255));
        amDeletebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amDeletebt.setForeground(new java.awt.Color(0, 0, 0));
        amDeletebt.setText("Xoá");
        amDeletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amDeletebtActionPerformed(evt);
            }
        });
        jpAccount.add(amDeletebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 80, 40));

        pnContainer.add(jpAccount, "card3");

        jpVoucher.setBackground(new java.awt.Color(255, 255, 255));
        jpVoucher.setForeground(new java.awt.Color(0, 0, 0));
        jpVoucher.setPreferredSize(new java.awt.Dimension(900, 531));
        jpVoucher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel312.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel312.setForeground(new java.awt.Color(0, 0, 0));
        jLabel312.setText("DANH SÁCH KHUYẾN MÃI");
        jpVoucher.add(jLabel312, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jPanel7.setBackground(new java.awt.Color(242, 231, 220));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(163, 149, 134));
        jLabel20.setText("GIẢM 50%");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel308.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel308.setForeground(new java.awt.Color(163, 149, 134));
        jLabel308.setText("HSD: 18.5 - 31.5.2024");
        jPanel7.add(jLabel308, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton4.setBackground(new java.awt.Color(100, 19, 19));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Lưu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 109, 60, -1));

        jpVoucher.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 250, 150));

        jPanel9.setBackground(new java.awt.Color(242, 231, 220));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel309.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel309.setForeground(new java.awt.Color(163, 149, 134));
        jLabel309.setText("GIẢM 50%");
        jPanel9.add(jLabel309, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel310.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel310.setForeground(new java.awt.Color(163, 149, 134));
        jLabel310.setText("HSD: 18.5 - 31.5.2024");
        jPanel9.add(jLabel310, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton5.setBackground(new java.awt.Color(100, 19, 19));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Lưu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 109, 60, -1));

        jpVoucher.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 250, 150));

        jPanel10.setBackground(new java.awt.Color(242, 231, 220));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel311.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel311.setForeground(new java.awt.Color(163, 149, 134));
        jLabel311.setText("GIẢM 50%");
        jPanel10.add(jLabel311, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel313.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel313.setForeground(new java.awt.Color(163, 149, 134));
        jLabel313.setText("HSD: 18.5 - 31.5.2024");
        jPanel10.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton6.setBackground(new java.awt.Color(100, 19, 19));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Lưu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 109, 60, -1));

        jpVoucher.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 250, 150));

        jPanel11.setBackground(new java.awt.Color(242, 231, 220));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel314.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(163, 149, 134));
        jLabel314.setText("GIẢM 50%");
        jPanel11.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel315.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(163, 149, 134));
        jLabel315.setText("HSD: 18.5 - 31.5.2024");
        jPanel11.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton7.setBackground(new java.awt.Color(100, 19, 19));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Lưu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 109, 60, -1));

        jpVoucher.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 250, 150));

        jPanel12.setBackground(new java.awt.Color(242, 231, 220));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel316.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel316.setForeground(new java.awt.Color(163, 149, 134));
        jLabel316.setText("GIẢM 50%");
        jPanel12.add(jLabel316, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel317.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(163, 149, 134));
        jLabel317.setText("HSD: 18.5 - 31.5.2024");
        jPanel12.add(jLabel317, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton8.setBackground(new java.awt.Color(100, 19, 19));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Lưu");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 109, 60, -1));

        jpVoucher.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 250, 150));

        jPanel13.setBackground(new java.awt.Color(242, 231, 220));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel318.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(163, 149, 134));
        jLabel318.setText("GIẢM 50%");
        jPanel13.add(jLabel318, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel319.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(163, 149, 134));
        jLabel319.setText("HSD: 18.5 - 31.5.2024");
        jPanel13.add(jLabel319, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton9.setBackground(new java.awt.Color(100, 19, 19));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Lưu");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 109, 60, -1));

        jpVoucher.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 250, 150));

        pnContainer.add(jpVoucher, "card3");

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpMenu.setPreferredSize(new java.awt.Dimension(900, 531));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 531));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCaphe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCaphe.setForeground(new java.awt.Color(100, 19, 19));
        lbCaphe.setText("Cà phê");
        lbCaphe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCapheMouseClicked(evt);
            }
        });
        jPanel1.add(lbCaphe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbTra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTra.setForeground(new java.awt.Color(100, 19, 19));
        lbTra.setText("Trà");
        lbTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTraMouseClicked(evt);
            }
        });
        jPanel1.add(lbTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lbBanh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBanh.setForeground(new java.awt.Color(100, 19, 19));
        lbBanh.setText("Bánh");
        lbBanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBanhMouseClicked(evt);
            }
        });
        jPanel1.add(lbBanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        MenuCard.setBackground(new java.awt.Color(255, 255, 204));
        MenuCard.setPreferredSize(new java.awt.Dimension(548, 1628));
        MenuCard.setLayout(new java.awt.CardLayout());

        MenuCaphe.setBackground(new java.awt.Color(255, 255, 255));
        MenuCaphe.setPreferredSize(new java.awt.Dimension(728, 1088));
        MenuCaphe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(242, 231, 220));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(146, 124, 102));
        jLabel21.setText("Cà phê óc chó");
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel22.setForeground(new java.awt.Color(146, 124, 102));
        jLabel22.setText("Giá");
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel23.setForeground(new java.awt.Color(146, 124, 102));
        jLabel23.setText("Số lượng");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel15.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox5.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox5.setText("Mua");
        jPanel15.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("20000");
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("56");
        jPanel15.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel82.setForeground(new java.awt.Color(146, 124, 102));
        jLabel82.setText("Kho");
        jPanel15.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf16.png"))); // NOI18N
        jPanel15.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1370, 160, 250));

        jPanel17.setBackground(new java.awt.Color(242, 231, 220));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(146, 124, 102));
        jLabel31.setText("Caramel đá xay");
        jPanel17.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel32.setForeground(new java.awt.Color(146, 124, 102));
        jLabel32.setText("Giá");
        jPanel17.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel33.setForeground(new java.awt.Color(146, 124, 102));
        jLabel33.setText("Số lượng");
        jPanel17.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel17.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox7.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox7.setText("Mua");
        jPanel17.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("20000");
        jPanel17.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("56");
        jPanel17.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel85.setForeground(new java.awt.Color(146, 124, 102));
        jLabel85.setText("Kho");
        jPanel17.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf13.png"))); // NOI18N
        jPanel17.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 160, 250));

        jPanel16.setBackground(new java.awt.Color(242, 231, 220));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(146, 124, 102));
        jLabel26.setText("Oreo đá xay");
        jPanel16.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel27.setForeground(new java.awt.Color(146, 124, 102));
        jLabel27.setText("Giá");
        jPanel16.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel28.setForeground(new java.awt.Color(146, 124, 102));
        jLabel28.setText("Số lượng");
        jPanel16.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel16.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox6.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox6.setText("Mua");
        jPanel16.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("20000");
        jPanel16.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("56");
        jPanel16.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel83.setForeground(new java.awt.Color(146, 124, 102));
        jLabel83.setText("Kho");
        jPanel16.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf14.png"))); // NOI18N
        jLabel84.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel16.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1100, 160, 250));

        jPanel18.setBackground(new java.awt.Color(242, 231, 220));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(146, 124, 102));
        jLabel36.setText("Cookie đá xay");
        jPanel18.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel37.setForeground(new java.awt.Color(146, 124, 102));
        jLabel37.setText("Giá");
        jPanel18.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel38.setForeground(new java.awt.Color(146, 124, 102));
        jLabel38.setText("Số lượng");
        jPanel18.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel18.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox8.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox8.setText("Mua");
        jPanel18.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("20000");
        jPanel18.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("56");
        jPanel18.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel87.setForeground(new java.awt.Color(146, 124, 102));
        jLabel87.setText("Kho");
        jPanel18.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf15.png"))); // NOI18N
        jPanel18.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1100, 160, 250));

        jPanel19.setBackground(new java.awt.Color(242, 231, 220));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(146, 124, 102));
        jLabel41.setText("Coldbrew");
        jPanel19.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabel42.setForeground(new java.awt.Color(146, 124, 102));
        jLabel42.setText("Giá");
        jPanel19.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel43.setForeground(new java.awt.Color(146, 124, 102));
        jLabel43.setText("Số lượng");
        jPanel19.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel19.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox9.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox9.setText("Mua");
        jPanel19.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("20000");
        jPanel19.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("56");
        jPanel19.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel89.setForeground(new java.awt.Color(146, 124, 102));
        jLabel89.setText("Kho");
        jPanel19.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf1.png"))); // NOI18N
        jLabel90.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel19.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 250));

        jPanel20.setBackground(new java.awt.Color(242, 231, 220));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(146, 124, 102));
        jLabel46.setText("Bạc sĩu");
        jPanel20.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel47.setForeground(new java.awt.Color(146, 124, 102));
        jLabel47.setText("Giá");
        jPanel20.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel48.setForeground(new java.awt.Color(146, 124, 102));
        jLabel48.setText("Số lượng");
        jPanel20.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel20.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox10.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox10.setText("Mua");
        jPanel20.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("20000");
        jPanel20.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("56");
        jPanel20.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel91.setForeground(new java.awt.Color(146, 124, 102));
        jLabel91.setText("Kho");
        jPanel20.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf2.png"))); // NOI18N
        jLabel92.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel20.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 250));

        jPanel21.setBackground(new java.awt.Color(242, 231, 220));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(146, 124, 102));
        jLabel51.setText("Cà phê muối");
        jPanel21.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel52.setForeground(new java.awt.Color(146, 124, 102));
        jLabel52.setText("Giá");
        jPanel21.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel53.setForeground(new java.awt.Color(146, 124, 102));
        jLabel53.setText("Số lượng");
        jPanel21.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel21.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox11.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox11.setText("Mua");
        jPanel21.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("20000");
        jPanel21.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("56");
        jPanel21.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel93.setForeground(new java.awt.Color(146, 124, 102));
        jLabel93.setText("Kho");
        jPanel21.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf3.png"))); // NOI18N
        jLabel94.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel21.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, 250));

        jPanel22.setBackground(new java.awt.Color(242, 231, 220));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(146, 124, 102));
        jLabel56.setText("Cà phê caramel");
        jPanel22.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel57.setForeground(new java.awt.Color(146, 124, 102));
        jLabel57.setText("Giá");
        jPanel22.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel58.setForeground(new java.awt.Color(146, 124, 102));
        jLabel58.setText("Số lượng");
        jPanel22.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel22.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox12.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox12.setText("Mua");
        jPanel22.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("20000");
        jPanel22.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("56");
        jPanel22.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel95.setForeground(new java.awt.Color(146, 124, 102));
        jLabel95.setText("Kho");
        jPanel22.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf4.png"))); // NOI18N
        jPanel22.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 250));

        jPanel24.setBackground(new java.awt.Color(242, 231, 220));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(146, 124, 102));
        jLabel61.setText("Bạc sĩu caramel");
        jPanel24.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel62.setForeground(new java.awt.Color(146, 124, 102));
        jLabel62.setText("Giá");
        jPanel24.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel63.setForeground(new java.awt.Color(146, 124, 102));
        jLabel63.setText("Số lượng");
        jPanel24.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel24.add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox13.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox13.setText("Mua");
        jPanel24.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("20000");
        jPanel24.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("56");
        jPanel24.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel97.setForeground(new java.awt.Color(146, 124, 102));
        jLabel97.setText("Kho");
        jPanel24.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf5.png"))); // NOI18N
        jPanel24.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 250));

        jPanel25.setBackground(new java.awt.Color(242, 231, 220));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(146, 124, 102));
        jLabel66.setText("Cà phê trứng");
        jPanel25.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel67.setForeground(new java.awt.Color(146, 124, 102));
        jLabel67.setText("Giá");
        jPanel25.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel68.setForeground(new java.awt.Color(146, 124, 102));
        jLabel68.setText("Số lượng");
        jPanel25.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel25.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox14.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox14.setText("Mua");
        jPanel25.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("20000");
        jPanel25.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("56");
        jPanel25.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel99.setForeground(new java.awt.Color(146, 124, 102));
        jLabel99.setText("Kho");
        jPanel25.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf6.png"))); // NOI18N
        jLabel100.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel25.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 250));

        jPanel26.setBackground(new java.awt.Color(242, 231, 220));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(146, 124, 102));
        jLabel71.setText("Cà phê đen");
        jPanel26.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabel72.setForeground(new java.awt.Color(146, 124, 102));
        jLabel72.setText("Giá");
        jPanel26.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel73.setForeground(new java.awt.Color(146, 124, 102));
        jLabel73.setText("Số lượng");
        jPanel26.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel26.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox15.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox15.setText("Mua");
        jPanel26.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("20000");
        jPanel26.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("56");
        jPanel26.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel101.setForeground(new java.awt.Color(146, 124, 102));
        jLabel101.setText("Kho");
        jPanel26.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf7.png"))); // NOI18N
        jPanel26.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 250));

        jPanel27.setBackground(new java.awt.Color(242, 231, 220));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(146, 124, 102));
        jLabel76.setText("Cà phê sữa tươi");
        jPanel27.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel77.setForeground(new java.awt.Color(146, 124, 102));
        jLabel77.setText("Giá");
        jPanel27.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel78.setForeground(new java.awt.Color(146, 124, 102));
        jLabel78.setText("Số lượng");
        jPanel27.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel27.add(jSpinner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox16.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox16.setText("Mua");
        jPanel27.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("20000");
        jPanel27.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("56");
        jPanel27.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel103.setForeground(new java.awt.Color(146, 124, 102));
        jLabel103.setText("Kho");
        jPanel27.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf8.png"))); // NOI18N
        jPanel27.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 250));

        jPanel28.setBackground(new java.awt.Color(242, 231, 220));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(146, 124, 102));
        jLabel105.setText("Cà phê sương sáo");
        jPanel28.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        jLabel106.setForeground(new java.awt.Color(146, 124, 102));
        jLabel106.setText("Giá");
        jPanel28.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel107.setForeground(new java.awt.Color(146, 124, 102));
        jLabel107.setText("Số lượng");
        jPanel28.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel28.add(jSpinner17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox17.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox17.setText("Mua");
        jPanel28.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("20000");
        jPanel28.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel109.setForeground(new java.awt.Color(0, 0, 0));
        jLabel109.setText("56");
        jPanel28.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel110.setForeground(new java.awt.Color(146, 124, 102));
        jLabel110.setText("Kho");
        jPanel28.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf9.png"))); // NOI18N
        jPanel28.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 250));

        jPanel29.setBackground(new java.awt.Color(242, 231, 220));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(146, 124, 102));
        jLabel112.setText("Cà phê đá xay");
        jPanel29.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel113.setForeground(new java.awt.Color(146, 124, 102));
        jLabel113.setText("Giá");
        jPanel29.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel114.setForeground(new java.awt.Color(146, 124, 102));
        jLabel114.setText("Số lượng");
        jPanel29.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel29.add(jSpinner18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox18.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox18.setText("Mua");
        jPanel29.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel115.setForeground(new java.awt.Color(0, 0, 0));
        jLabel115.setText("20000");
        jPanel29.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("56");
        jPanel29.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel117.setForeground(new java.awt.Color(146, 124, 102));
        jLabel117.setText("Kho");
        jPanel29.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf10.png"))); // NOI18N
        jPanel29.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 160, 250));

        jPanel30.setBackground(new java.awt.Color(242, 231, 220));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(146, 124, 102));
        jLabel119.setText("Chocolate đá xay");
        jPanel30.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, -1));

        jLabel120.setForeground(new java.awt.Color(146, 124, 102));
        jLabel120.setText("Giá");
        jPanel30.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel121.setForeground(new java.awt.Color(146, 124, 102));
        jLabel121.setText("Số lượng");
        jPanel30.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner19.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel30.add(jSpinner19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox19.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox19.setText("Mua");
        jPanel30.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("20000");
        jPanel30.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setText("56");
        jPanel30.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel124.setForeground(new java.awt.Color(146, 124, 102));
        jLabel124.setText("Kho");
        jPanel30.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf11.png"))); // NOI18N
        jPanel30.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 160, 250));

        jPanel31.setBackground(new java.awt.Color(242, 231, 220));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(146, 124, 102));
        jLabel126.setText("Milo đá xay");
        jPanel31.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabel127.setForeground(new java.awt.Color(146, 124, 102));
        jLabel127.setText("Giá");
        jPanel31.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel128.setForeground(new java.awt.Color(146, 124, 102));
        jLabel128.setText("Số lượng");
        jPanel31.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner20.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel31.add(jSpinner20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox20.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox20.setText("Mua");
        jPanel31.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setText("20000");
        jPanel31.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("56");
        jPanel31.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel131.setForeground(new java.awt.Color(146, 124, 102));
        jLabel131.setText("Kho");
        jPanel31.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf12.png"))); // NOI18N
        jPanel31.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuCaphe.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 830, 160, 250));

        MenuCard.add(MenuCaphe, "card2");

        MenuTra.setBackground(new java.awt.Color(255, 255, 255));
        MenuTra.setPreferredSize(new java.awt.Dimension(728, 1088));
        MenuTra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(242, 231, 220));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(146, 124, 102));
        jLabel96.setText("Sinh tố xoài");
        jPanel32.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabel98.setForeground(new java.awt.Color(146, 124, 102));
        jLabel98.setText("Giá");
        jPanel32.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel135.setForeground(new java.awt.Color(146, 124, 102));
        jLabel135.setText("Số lượng");
        jPanel32.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner21.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel32.add(jSpinner21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox21.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox21.setText("Mua");
        jPanel32.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel136.setForeground(new java.awt.Color(0, 0, 0));
        jLabel136.setText("20000");
        jPanel32.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel137.setForeground(new java.awt.Color(0, 0, 0));
        jLabel137.setText("56");
        jPanel32.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel138.setForeground(new java.awt.Color(146, 124, 102));
        jLabel138.setText("Kho");
        jPanel32.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t1.png"))); // NOI18N
        jPanel32.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 250));

        jPanel33.setBackground(new java.awt.Color(242, 231, 220));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(146, 124, 102));
        jLabel140.setText("Trà thơm");
        jPanel33.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel141.setForeground(new java.awt.Color(146, 124, 102));
        jLabel141.setText("Giá");
        jPanel33.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel142.setForeground(new java.awt.Color(146, 124, 102));
        jLabel142.setText("Số lượng");
        jPanel33.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner22.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel33.add(jSpinner22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox22.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox22.setText("Mua");
        jPanel33.add(jCheckBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel143.setForeground(new java.awt.Color(0, 0, 0));
        jLabel143.setText("20000");
        jPanel33.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel144.setForeground(new java.awt.Color(0, 0, 0));
        jLabel144.setText("56");
        jPanel33.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel145.setForeground(new java.awt.Color(146, 124, 102));
        jLabel145.setText("Kho");
        jPanel33.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t2.png"))); // NOI18N
        jPanel33.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 250));

        jPanel34.setBackground(new java.awt.Color(242, 231, 220));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel147.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(146, 124, 102));
        jLabel147.setText("Trà nhiệt đới");
        jPanel34.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel148.setForeground(new java.awt.Color(146, 124, 102));
        jLabel148.setText("Giá");
        jPanel34.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel149.setForeground(new java.awt.Color(146, 124, 102));
        jLabel149.setText("Số lượng");
        jPanel34.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner23.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel34.add(jSpinner23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox23.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox23.setText("Mua");
        jPanel34.add(jCheckBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel150.setForeground(new java.awt.Color(0, 0, 0));
        jLabel150.setText("20000");
        jPanel34.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel151.setForeground(new java.awt.Color(0, 0, 0));
        jLabel151.setText("56");
        jPanel34.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel152.setForeground(new java.awt.Color(146, 124, 102));
        jLabel152.setText("Kho");
        jPanel34.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t3.png"))); // NOI18N
        jPanel34.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, 250));

        jPanel35.setBackground(new java.awt.Color(242, 231, 220));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel154.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(146, 124, 102));
        jLabel154.setText("Trà mùa xuân");
        jPanel35.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel155.setForeground(new java.awt.Color(146, 124, 102));
        jLabel155.setText("Giá");
        jPanel35.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel156.setForeground(new java.awt.Color(146, 124, 102));
        jLabel156.setText("Số lượng");
        jPanel35.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner24.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel35.add(jSpinner24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox24.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox24.setText("Mua");
        jPanel35.add(jCheckBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel157.setForeground(new java.awt.Color(0, 0, 0));
        jLabel157.setText("20000");
        jPanel35.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel158.setForeground(new java.awt.Color(0, 0, 0));
        jLabel158.setText("56");
        jPanel35.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel159.setForeground(new java.awt.Color(146, 124, 102));
        jLabel159.setText("Kho");
        jPanel35.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t4.png"))); // NOI18N
        jPanel35.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 250));

        jPanel36.setBackground(new java.awt.Color(242, 231, 220));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel161.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(146, 124, 102));
        jLabel161.setText("Trà mùa hạ");
        jPanel36.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabel162.setForeground(new java.awt.Color(146, 124, 102));
        jLabel162.setText("Giá");
        jPanel36.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel163.setForeground(new java.awt.Color(146, 124, 102));
        jLabel163.setText("Số lượng");
        jPanel36.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner25.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel36.add(jSpinner25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox25.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox25.setText("Mua");
        jPanel36.add(jCheckBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel164.setForeground(new java.awt.Color(0, 0, 0));
        jLabel164.setText("20000");
        jPanel36.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel165.setForeground(new java.awt.Color(0, 0, 0));
        jLabel165.setText("56");
        jPanel36.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel166.setForeground(new java.awt.Color(146, 124, 102));
        jLabel166.setText("Kho");
        jPanel36.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t5.png"))); // NOI18N
        jPanel36.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 250));

        jPanel37.setBackground(new java.awt.Color(242, 231, 220));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel168.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(146, 124, 102));
        jLabel168.setText("Trà dâu");
        jPanel37.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel169.setForeground(new java.awt.Color(146, 124, 102));
        jLabel169.setText("Giá");
        jPanel37.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel170.setForeground(new java.awt.Color(146, 124, 102));
        jLabel170.setText("Số lượng");
        jPanel37.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner26.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel37.add(jSpinner26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox26.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox26.setText("Mua");
        jPanel37.add(jCheckBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel171.setForeground(new java.awt.Color(0, 0, 0));
        jLabel171.setText("20000");
        jPanel37.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel172.setForeground(new java.awt.Color(0, 0, 0));
        jLabel172.setText("56");
        jPanel37.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel173.setForeground(new java.awt.Color(146, 124, 102));
        jLabel173.setText("Kho");
        jPanel37.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t6.png"))); // NOI18N
        jPanel37.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 250));

        jPanel38.setBackground(new java.awt.Color(242, 231, 220));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel175.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(146, 124, 102));
        jLabel175.setText("Sữa dâu");
        jPanel38.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel176.setForeground(new java.awt.Color(146, 124, 102));
        jLabel176.setText("Giá");
        jPanel38.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel177.setForeground(new java.awt.Color(146, 124, 102));
        jLabel177.setText("Số lượng");
        jPanel38.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner27.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel38.add(jSpinner27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox27.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox27.setText("Mua");
        jPanel38.add(jCheckBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel178.setForeground(new java.awt.Color(0, 0, 0));
        jLabel178.setText("20000");
        jPanel38.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel179.setForeground(new java.awt.Color(0, 0, 0));
        jLabel179.setText("56");
        jPanel38.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel180.setForeground(new java.awt.Color(146, 124, 102));
        jLabel180.setText("Kho");
        jPanel38.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t7.png"))); // NOI18N
        jPanel38.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 250));

        jPanel39.setBackground(new java.awt.Color(242, 231, 220));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel182.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(146, 124, 102));
        jLabel182.setText("Matcha đá xay");
        jPanel39.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel183.setForeground(new java.awt.Color(146, 124, 102));
        jLabel183.setText("Giá");
        jPanel39.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel184.setForeground(new java.awt.Color(146, 124, 102));
        jLabel184.setText("Số lượng");
        jPanel39.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner28.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel39.add(jSpinner28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox28.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox28.setText("Mua");
        jPanel39.add(jCheckBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel185.setForeground(new java.awt.Color(0, 0, 0));
        jLabel185.setText("20000");
        jPanel39.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel186.setForeground(new java.awt.Color(0, 0, 0));
        jLabel186.setText("56");
        jPanel39.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel187.setForeground(new java.awt.Color(146, 124, 102));
        jLabel187.setText("Kho");
        jPanel39.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t8.png"))); // NOI18N
        jPanel39.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 250));

        jPanel40.setBackground(new java.awt.Color(242, 231, 220));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel189.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(146, 124, 102));
        jLabel189.setText("Dừa xay việt quốc");
        jPanel40.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        jLabel190.setForeground(new java.awt.Color(146, 124, 102));
        jLabel190.setText("Giá");
        jPanel40.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel191.setForeground(new java.awt.Color(146, 124, 102));
        jLabel191.setText("Số lượng");
        jPanel40.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner29.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel40.add(jSpinner29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox29.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox29.setText("Mua");
        jPanel40.add(jCheckBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel192.setForeground(new java.awt.Color(0, 0, 0));
        jLabel192.setText("20000");
        jPanel40.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel193.setForeground(new java.awt.Color(0, 0, 0));
        jLabel193.setText("56");
        jPanel40.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel194.setForeground(new java.awt.Color(146, 124, 102));
        jLabel194.setText("Kho");
        jPanel40.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t9.png"))); // NOI18N
        jPanel40.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, -1));

        MenuTra.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 250));

        jPanel41.setBackground(new java.awt.Color(242, 231, 220));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel196.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(146, 124, 102));
        jLabel196.setText("Dừa xay mâm xôi");
        jPanel41.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        jLabel197.setForeground(new java.awt.Color(146, 124, 102));
        jLabel197.setText("Giá");
        jPanel41.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel198.setForeground(new java.awt.Color(146, 124, 102));
        jLabel198.setText("Số lượng");
        jPanel41.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner30.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel41.add(jSpinner30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox30.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox30.setText("Mua");
        jPanel41.add(jCheckBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel199.setForeground(new java.awt.Color(0, 0, 0));
        jLabel199.setText("20000");
        jPanel41.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel200.setForeground(new java.awt.Color(0, 0, 0));
        jLabel200.setText("56");
        jPanel41.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel201.setForeground(new java.awt.Color(146, 124, 102));
        jLabel201.setText("Kho");
        jPanel41.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t10.png"))); // NOI18N
        jPanel41.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        MenuTra.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 160, 250));

        jPanel42.setBackground(new java.awt.Color(242, 231, 220));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel203.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(146, 124, 102));
        jLabel203.setText("Kem dừa cookie");
        jPanel42.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, -1));

        jLabel204.setForeground(new java.awt.Color(146, 124, 102));
        jLabel204.setText("Giá");
        jPanel42.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel205.setForeground(new java.awt.Color(146, 124, 102));
        jLabel205.setText("Số lượng");
        jPanel42.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner31.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel42.add(jSpinner31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox31.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox31.setText("Mua");
        jPanel42.add(jCheckBox31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel206.setForeground(new java.awt.Color(0, 0, 0));
        jLabel206.setText("20000");
        jPanel42.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel207.setForeground(new java.awt.Color(0, 0, 0));
        jLabel207.setText("56");
        jPanel42.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel208.setForeground(new java.awt.Color(146, 124, 102));
        jLabel208.setText("Kho");
        jPanel42.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t11.png"))); // NOI18N
        jPanel42.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        MenuTra.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 160, 250));

        jPanel43.setBackground(new java.awt.Color(242, 231, 220));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel210.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(146, 124, 102));
        jLabel210.setText("Kem dâu cookie");
        jPanel43.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, -1));

        jLabel211.setForeground(new java.awt.Color(146, 124, 102));
        jLabel211.setText("Giá");
        jPanel43.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel212.setForeground(new java.awt.Color(146, 124, 102));
        jLabel212.setText("Số lượng");
        jPanel43.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner32.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel43.add(jSpinner32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox32.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox32.setText("Mua");
        jPanel43.add(jCheckBox32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel213.setForeground(new java.awt.Color(0, 0, 0));
        jLabel213.setText("20000");
        jPanel43.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel214.setForeground(new java.awt.Color(0, 0, 0));
        jLabel214.setText("56");
        jPanel43.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel215.setForeground(new java.awt.Color(146, 124, 102));
        jLabel215.setText("Kho");
        jPanel43.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t12.png"))); // NOI18N
        jPanel43.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuTra.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 830, 160, 250));

        MenuCard.add(MenuTra, "card3");

        MenuBanh.setBackground(new java.awt.Color(255, 255, 255));
        MenuBanh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setBackground(new java.awt.Color(242, 231, 220));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel217.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(146, 124, 102));
        jLabel217.setText("Bánh mì lát");
        jPanel44.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel218.setForeground(new java.awt.Color(146, 124, 102));
        jLabel218.setText("Giá");
        jPanel44.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel219.setForeground(new java.awt.Color(146, 124, 102));
        jLabel219.setText("Số lượng ");
        jPanel44.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner33.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel44.add(jSpinner33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox33.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox33.setText("Mua");
        jPanel44.add(jCheckBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel220.setForeground(new java.awt.Color(0, 0, 0));
        jLabel220.setText("20000");
        jPanel44.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel221.setForeground(new java.awt.Color(0, 0, 0));
        jLabel221.setText("56");
        jPanel44.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel222.setForeground(new java.awt.Color(146, 124, 102));
        jLabel222.setText("Kho");
        jPanel44.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck1.png"))); // NOI18N
        jPanel44.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 250));

        jPanel45.setBackground(new java.awt.Color(242, 231, 220));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel224.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(146, 124, 102));
        jLabel224.setText("Bánh sừng bò");
        jPanel45.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel225.setForeground(new java.awt.Color(146, 124, 102));
        jLabel225.setText("Giá");
        jPanel45.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel226.setForeground(new java.awt.Color(146, 124, 102));
        jLabel226.setText("Số lượng ");
        jPanel45.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner34.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel45.add(jSpinner34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox34.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox34.setText("Mua");
        jPanel45.add(jCheckBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel227.setForeground(new java.awt.Color(0, 0, 0));
        jLabel227.setText("20000");
        jPanel45.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel228.setForeground(new java.awt.Color(0, 0, 0));
        jLabel228.setText("56");
        jPanel45.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel229.setForeground(new java.awt.Color(146, 124, 102));
        jLabel229.setText("Kho");
        jPanel45.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck2.png"))); // NOI18N
        jPanel45.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 250));

        jPanel46.setBackground(new java.awt.Color(242, 231, 220));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel231.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(146, 124, 102));
        jLabel231.setText("Bánh vòng");
        jPanel46.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel232.setForeground(new java.awt.Color(146, 124, 102));
        jLabel232.setText("Giá");
        jPanel46.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel233.setForeground(new java.awt.Color(146, 124, 102));
        jLabel233.setText("Số lượng ");
        jPanel46.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner35.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel46.add(jSpinner35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox35.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox35.setText("Mua");
        jPanel46.add(jCheckBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel234.setForeground(new java.awt.Color(0, 0, 0));
        jLabel234.setText("20000");
        jPanel46.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel235.setForeground(new java.awt.Color(0, 0, 0));
        jLabel235.setText("56");
        jPanel46.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel236.setForeground(new java.awt.Color(146, 124, 102));
        jLabel236.setText("Kho");
        jPanel46.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck3.png"))); // NOI18N
        jPanel46.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, 250));

        jPanel47.setBackground(new java.awt.Color(242, 231, 220));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel238.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(146, 124, 102));
        jLabel238.setText("Bánh tổ ong");
        jPanel47.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jLabel239.setForeground(new java.awt.Color(146, 124, 102));
        jLabel239.setText("Giá");
        jPanel47.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel240.setForeground(new java.awt.Color(146, 124, 102));
        jLabel240.setText("Số lượng ");
        jPanel47.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner36.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel47.add(jSpinner36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox36.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox36.setText("Mua");
        jPanel47.add(jCheckBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel241.setForeground(new java.awt.Color(0, 0, 0));
        jLabel241.setText("20000");
        jPanel47.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel242.setForeground(new java.awt.Color(0, 0, 0));
        jLabel242.setText("56");
        jPanel47.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel243.setForeground(new java.awt.Color(146, 124, 102));
        jLabel243.setText("Kho");
        jPanel47.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel244.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck4.png"))); // NOI18N
        jPanel47.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 250));

        jPanel48.setBackground(new java.awt.Color(242, 231, 220));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel245.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(146, 124, 102));
        jLabel245.setText("Hamburger");
        jPanel48.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel246.setForeground(new java.awt.Color(146, 124, 102));
        jLabel246.setText("Giá");
        jPanel48.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel247.setForeground(new java.awt.Color(146, 124, 102));
        jLabel247.setText("Số lượng ");
        jPanel48.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner37.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel48.add(jSpinner37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox37.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox37.setText("Mua");
        jPanel48.add(jCheckBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel248.setForeground(new java.awt.Color(0, 0, 0));
        jLabel248.setText("20000");
        jPanel48.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel249.setForeground(new java.awt.Color(0, 0, 0));
        jLabel249.setText("56");
        jPanel48.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel250.setForeground(new java.awt.Color(146, 124, 102));
        jLabel250.setText("Kho");
        jPanel48.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel251.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck5.png"))); // NOI18N
        jPanel48.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 250));

        jPanel49.setBackground(new java.awt.Color(242, 231, 220));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel252.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(146, 124, 102));
        jLabel252.setText("Bánh ngọt");
        jLabel252.setToolTipText("");
        jPanel49.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel253.setForeground(new java.awt.Color(146, 124, 102));
        jLabel253.setText("Giá");
        jPanel49.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel254.setForeground(new java.awt.Color(146, 124, 102));
        jLabel254.setText("Số lượng ");
        jPanel49.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner38.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel49.add(jSpinner38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox38.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox38.setText("Mua");
        jPanel49.add(jCheckBox38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel255.setForeground(new java.awt.Color(0, 0, 0));
        jLabel255.setText("20000");
        jPanel49.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel256.setForeground(new java.awt.Color(0, 0, 0));
        jLabel256.setText("56");
        jPanel49.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel257.setForeground(new java.awt.Color(146, 124, 102));
        jLabel257.setText("Kho");
        jPanel49.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck6.png"))); // NOI18N
        jPanel49.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 250));

        jPanel50.setBackground(new java.awt.Color(242, 231, 220));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel259.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(146, 124, 102));
        jLabel259.setText("Tiramisu");
        jPanel50.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel260.setForeground(new java.awt.Color(146, 124, 102));
        jLabel260.setText("Giá");
        jPanel50.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel261.setForeground(new java.awt.Color(146, 124, 102));
        jLabel261.setText("Số lượng ");
        jPanel50.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner39.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel50.add(jSpinner39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox39.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox39.setText("Mua");
        jPanel50.add(jCheckBox39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel262.setForeground(new java.awt.Color(0, 0, 0));
        jLabel262.setText("20000");
        jPanel50.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel263.setForeground(new java.awt.Color(0, 0, 0));
        jLabel263.setText("56");
        jPanel50.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel264.setForeground(new java.awt.Color(146, 124, 102));
        jLabel264.setText("Kho");
        jPanel50.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel265.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck7.png"))); // NOI18N
        jPanel50.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 250));

        jPanel51.setBackground(new java.awt.Color(242, 231, 220));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel266.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(146, 124, 102));
        jLabel266.setText("Mousse chanh dây");
        jPanel51.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel267.setForeground(new java.awt.Color(146, 124, 102));
        jLabel267.setText("Giá");
        jPanel51.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel268.setForeground(new java.awt.Color(146, 124, 102));
        jLabel268.setText("Số lượng ");
        jPanel51.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner40.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel51.add(jSpinner40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox40.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox40.setText("Mua");
        jPanel51.add(jCheckBox40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel269.setForeground(new java.awt.Color(0, 0, 0));
        jLabel269.setText("20000");
        jPanel51.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel270.setForeground(new java.awt.Color(0, 0, 0));
        jLabel270.setText("56");
        jPanel51.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel271.setForeground(new java.awt.Color(146, 124, 102));
        jLabel271.setText("Kho");
        jPanel51.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck8.png"))); // NOI18N
        jPanel51.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 250));

        jPanel52.setBackground(new java.awt.Color(242, 231, 220));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel273.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(146, 124, 102));
        jLabel273.setText("Cupcake");
        jPanel52.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel274.setForeground(new java.awt.Color(146, 124, 102));
        jLabel274.setText("Giá");
        jPanel52.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel275.setForeground(new java.awt.Color(146, 124, 102));
        jLabel275.setText("Số lượng ");
        jPanel52.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner41.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel52.add(jSpinner41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox41.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox41.setText("Mua");
        jPanel52.add(jCheckBox41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel276.setForeground(new java.awt.Color(0, 0, 0));
        jLabel276.setText("20000");
        jPanel52.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel277.setForeground(new java.awt.Color(0, 0, 0));
        jLabel277.setText("56");
        jPanel52.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel278.setForeground(new java.awt.Color(146, 124, 102));
        jLabel278.setText("Kho");
        jPanel52.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel279.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck13.png"))); // NOI18N
        jPanel52.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        MenuBanh.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 160, 250));

        jPanel53.setBackground(new java.awt.Color(242, 231, 220));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel280.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(146, 124, 102));
        jLabel280.setText("Donut noel");
        jPanel53.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel281.setForeground(new java.awt.Color(146, 124, 102));
        jLabel281.setText("Giá");
        jPanel53.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel282.setForeground(new java.awt.Color(146, 124, 102));
        jLabel282.setText("Số lượng ");
        jPanel53.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner42.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel53.add(jSpinner42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox42.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox42.setText("Mua");
        jPanel53.add(jCheckBox42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel283.setForeground(new java.awt.Color(0, 0, 0));
        jLabel283.setText("20000");
        jPanel53.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel284.setForeground(new java.awt.Color(0, 0, 0));
        jLabel284.setText("56");
        jPanel53.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel285.setForeground(new java.awt.Color(146, 124, 102));
        jLabel285.setText("Kho");
        jPanel53.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel286.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck10.png"))); // NOI18N
        jPanel53.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        MenuBanh.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 160, 250));

        jPanel54.setBackground(new java.awt.Color(242, 231, 220));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel287.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel287.setForeground(new java.awt.Color(146, 124, 102));
        jLabel287.setText("Bánh quy");
        jPanel54.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel288.setForeground(new java.awt.Color(146, 124, 102));
        jLabel288.setText("Giá");
        jPanel54.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel289.setForeground(new java.awt.Color(146, 124, 102));
        jLabel289.setText("Số lượng ");
        jPanel54.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner43.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel54.add(jSpinner43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox43.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox43.setText("Mua");
        jPanel54.add(jCheckBox43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel290.setForeground(new java.awt.Color(0, 0, 0));
        jLabel290.setText("20000");
        jPanel54.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel291.setForeground(new java.awt.Color(0, 0, 0));
        jLabel291.setText("56");
        jPanel54.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel292.setForeground(new java.awt.Color(146, 124, 102));
        jLabel292.setText("Kho");
        jPanel54.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel293.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck11.png"))); // NOI18N
        jPanel54.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        MenuBanh.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 160, 250));

        jPanel55.setBackground(new java.awt.Color(242, 231, 220));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel294.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(146, 124, 102));
        jLabel294.setText("Macaroon");
        jPanel55.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel295.setForeground(new java.awt.Color(146, 124, 102));
        jLabel295.setText("Giá");
        jPanel55.add(jLabel295, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel296.setForeground(new java.awt.Color(146, 124, 102));
        jLabel296.setText("Số lượng ");
        jPanel55.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner44.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel55.add(jSpinner44, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox44.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox44.setText("Mua");
        jPanel55.add(jCheckBox44, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel297.setForeground(new java.awt.Color(0, 0, 0));
        jLabel297.setText("20000");
        jPanel55.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel298.setForeground(new java.awt.Color(0, 0, 0));
        jLabel298.setText("56");
        jPanel55.add(jLabel298, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel299.setForeground(new java.awt.Color(146, 124, 102));
        jLabel299.setText("Kho");
        jPanel55.add(jLabel299, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel300.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck12.png"))); // NOI18N
        jPanel55.add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        MenuBanh.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 830, 160, 250));

        jPanel56.setBackground(new java.awt.Color(242, 231, 220));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel301.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel301.setForeground(new java.awt.Color(146, 124, 102));
        jLabel301.setText("Donut");
        jPanel56.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel302.setForeground(new java.awt.Color(146, 124, 102));
        jLabel302.setText("Giá");
        jPanel56.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel303.setForeground(new java.awt.Color(146, 124, 102));
        jLabel303.setText("Số lượng ");
        jPanel56.add(jLabel303, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jSpinner45.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel56.add(jSpinner45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox45.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox45.setText("Mua");
        jPanel56.add(jCheckBox45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 20));

        jLabel304.setForeground(new java.awt.Color(0, 0, 0));
        jLabel304.setText("20000");
        jPanel56.add(jLabel304, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel305.setForeground(new java.awt.Color(0, 0, 0));
        jLabel305.setText("56");
        jPanel56.add(jLabel305, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel306.setForeground(new java.awt.Color(146, 124, 102));
        jLabel306.setText("Kho");
        jPanel56.add(jLabel306, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel307.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck9.png"))); // NOI18N
        jPanel56.add(jLabel307, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        MenuBanh.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 250));

        MenuCard.add(MenuBanh, "card4");

        scrollPane1.add(MenuCard);

        jPanel1.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 580, 460));

        btnReset.setBackground(new java.awt.Color(100, 19, 19));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 70, 35));

        jpMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 580, -1));

        jPanel3.setBackground(new java.awt.Color(242, 231, 220));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(100, 19, 19));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("THANH TOÁN");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 280, 40));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên", "SL", "Giá"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(100, 19, 19));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 450));

        jpMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 531));

        pnContainer.add(jpMenu, "card5");

        jpThanhtoan.setBackground(new java.awt.Color(255, 255, 255));
        jpThanhtoan.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.setPreferredSize(new java.awt.Dimension(900, 531));
        jpThanhtoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel320.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(0, 0, 0));
        jLabel320.setText("Phương thức thanh toán");
        jpThanhtoan.add(jLabel320, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel321.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(100, 19, 19));
        jLabel321.setText("THANH TOÁN");
        jpThanhtoan.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel322.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(0, 0, 0));
        jLabel322.setText("Mã giảm giá");
        jpThanhtoan.add(jLabel322, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel323.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(0, 0, 0));
        jLabel323.setText("Địa chỉ");
        jpThanhtoan.add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel324.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(0, 0, 0));
        jLabel324.setText("Địa chỉ chi tiết (nếu có)");
        jpThanhtoan.add(jLabel324, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel325.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel325.setForeground(new java.awt.Color(0, 0, 0));
        jLabel325.setText("Lưu ý cho nhân viên");
        jpThanhtoan.add(jLabel325, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel326.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel326.setForeground(new java.awt.Color(0, 0, 0));
        jLabel326.setText("Hẹn giờ đặt (nếu có)");
        jpThanhtoan.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "VNPay", "Momo", "Apple Pay" }));
        jpThanhtoan.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TETVN", "TCH50", "TCH70", "TCH0D" }));
        jpThanhtoan.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Địa chỉ khác" }));
        jpThanhtoan.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, 40));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 250, 40));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 125, 40));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 250, 50));

        jButton1.setBackground(new java.awt.Color(100, 19, 19));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xác nhận");
        jpThanhtoan.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 100, 40));

        jButton2.setBackground(new java.awt.Color(100, 19, 19));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Quay lại");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpThanhtoan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 100, 40));

        jPanel4.setBackground(new java.awt.Color(100, 19, 19));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(320, 720));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel371.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel371.setForeground(new java.awt.Color(168, 138, 107));
        jLabel371.setText("THE COFFEE HOME");
        jPanel8.add(jLabel371, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel372.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel372.setForeground(new java.awt.Color(0, 0, 0));
        jLabel372.setText("HOÁ ĐƠN THANH TOÁN");
        jPanel8.add(jLabel372, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel373.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel373.setForeground(new java.awt.Color(0, 0, 0));
        jLabel373.setText("Mã hoá đơn: HD01");
        jPanel8.add(jLabel373, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel374.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel374.setForeground(new java.awt.Color(0, 0, 0));
        jLabel374.setText("Ngày: 19-05-2024");
        jPanel8.add(jLabel374, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "SL", "Giá", "Tiền"
            }
        ));
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 170));

        jLabel375.setForeground(new java.awt.Color(0, 0, 0));
        jLabel375.setText("Tổng số món: 5");
        jPanel8.add(jLabel375, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel376.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel376.setForeground(new java.awt.Color(0, 0, 0));
        jLabel376.setText("Tiền ship:");
        jPanel8.add(jLabel376, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel377.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel377.setForeground(new java.awt.Color(0, 0, 0));
        jLabel377.setText("Tổng tiền:");
        jPanel8.add(jLabel377, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel378.setForeground(new java.awt.Color(0, 0, 0));
        jLabel378.setText("Thanh toán tiền mặt");
        jPanel8.add(jLabel378, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jLabel379.setForeground(new java.awt.Color(0, 0, 0));
        jLabel379.setText("----------------------------------------------------------------------------");
        jPanel8.add(jLabel379, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 370, -1));

        jLabel380.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel380.setForeground(new java.awt.Color(0, 0, 0));
        jLabel380.setText("Khuyến mãi:");
        jPanel8.add(jLabel380, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel381.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel381.setForeground(new java.awt.Color(0, 0, 0));
        jLabel381.setText("Điểm tích luỹ:");
        jPanel8.add(jLabel381, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel382.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel382.setForeground(new java.awt.Color(0, 0, 0));
        jLabel382.setText("Cảm ơn quý khách!");
        jPanel8.add(jLabel382, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

        jLabel383.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel383.setForeground(new java.awt.Color(0, 0, 0));
        jLabel383.setText("   thecoffeehome.com.vn");
        jPanel8.add(jLabel383, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 130, -1));

        jLabel384.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel384.setForeground(new java.awt.Color(0, 0, 0));
        jLabel384.setText("TP. Thủ Đức, TP. Hồ Chí Minh");
        jPanel8.add(jLabel384, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        jLabel385.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel385.setForeground(new java.awt.Color(0, 0, 0));
        jLabel385.setText("Địa chỉ: 22/52 Đường Võ Văn Ngân, ");
        jPanel8.add(jLabel385, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel386.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel386.setForeground(new java.awt.Color(0, 0, 0));
        jLabel386.setText("20,000 Đ");
        jPanel8.add(jLabel386, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel387.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel387.setForeground(new java.awt.Color(0, 0, 0));
        jLabel387.setText("100,000 Đ");
        jPanel8.add(jLabel387, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel388.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel388.setForeground(new java.awt.Color(0, 0, 0));
        jLabel388.setText("10");
        jPanel8.add(jLabel388, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 60, -1));

        jLabel389.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel389.setForeground(new java.awt.Color(0, 0, 0));
        jLabel389.setText("490,000 Đ");
        jPanel8.add(jLabel389, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 60, -1));

        jLabel390.setForeground(new java.awt.Color(0, 0, 0));
        jLabel390.setText("Khách hàng: Đỗ Minh Nghiêm");
        jPanel8.add(jLabel390, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        jLabel391.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel391.setForeground(new java.awt.Color(0, 0, 0));
        jLabel391.setText("Thành tiền:");
        jPanel8.add(jLabel391, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel392.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel392.setForeground(new java.awt.Color(0, 0, 0));
        jLabel392.setText("580,000 Đ");
        jPanel8.add(jLabel392, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel393.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel393.setForeground(new java.awt.Color(168, 138, 107));
        jLabel393.setText("THE COFFEE HOME");
        jPanel14.add(jLabel393, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel394.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel394.setForeground(new java.awt.Color(0, 0, 0));
        jLabel394.setText("HOÁ ĐƠN THANH TOÁN");
        jPanel14.add(jLabel394, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel395.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel395.setForeground(new java.awt.Color(0, 0, 0));
        jLabel395.setText("Mã hoá đơn: HD01");
        jPanel14.add(jLabel395, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel396.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel396.setForeground(new java.awt.Color(0, 0, 0));
        jLabel396.setText("Ngày: 19-05-2024");
        jPanel14.add(jLabel396, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "SL", "Giá", "Thành tiền"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jPanel14.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 170));

        jLabel397.setForeground(new java.awt.Color(0, 0, 0));
        jLabel397.setText("Tổng số món: 5");
        jPanel14.add(jLabel397, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel398.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel398.setForeground(new java.awt.Color(0, 0, 0));
        jLabel398.setText("Tiền ship:");
        jPanel14.add(jLabel398, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel399.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel399.setForeground(new java.awt.Color(0, 0, 0));
        jLabel399.setText("Tổng tiền:");
        jPanel14.add(jLabel399, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel400.setForeground(new java.awt.Color(0, 0, 0));
        jLabel400.setText("Thanh toán tiền mặt");
        jPanel14.add(jLabel400, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jLabel401.setForeground(new java.awt.Color(0, 0, 0));
        jLabel401.setText("--------------------------------------------------------------");
        jPanel14.add(jLabel401, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jLabel402.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel402.setForeground(new java.awt.Color(0, 0, 0));
        jLabel402.setText("Khuyến mãi:");
        jPanel14.add(jLabel402, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel403.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel403.setForeground(new java.awt.Color(0, 0, 0));
        jLabel403.setText("Điểm tích luỹ:");
        jPanel14.add(jLabel403, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel404.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel404.setForeground(new java.awt.Color(0, 0, 0));
        jLabel404.setText("Cảm ơn quý khách!");
        jPanel14.add(jLabel404, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

        jLabel405.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel405.setForeground(new java.awt.Color(0, 0, 0));
        jLabel405.setText("   thecoffeehome.com.vn");
        jPanel14.add(jLabel405, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 130, -1));

        jLabel406.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel406.setForeground(new java.awt.Color(0, 0, 0));
        jLabel406.setText("TP. Thủ Đức, TP. Hồ Chí Minh");
        jPanel14.add(jLabel406, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        jLabel407.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel407.setForeground(new java.awt.Color(0, 0, 0));
        jLabel407.setText("Địa chỉ: 22/52 Đường Võ Văn Ngân, ");
        jPanel14.add(jLabel407, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel408.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel408.setForeground(new java.awt.Color(0, 0, 0));
        jLabel408.setText("20,000 Đ");
        jPanel14.add(jLabel408, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel409.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel409.setForeground(new java.awt.Color(0, 0, 0));
        jLabel409.setText("100,000 Đ");
        jPanel14.add(jLabel409, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel410.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel410.setForeground(new java.awt.Color(0, 0, 0));
        jLabel410.setText("10");
        jPanel14.add(jLabel410, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 60, -1));

        jLabel411.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel411.setForeground(new java.awt.Color(0, 0, 0));
        jLabel411.setText("490,000 Đ");
        jPanel14.add(jLabel411, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 60, -1));

        jLabel412.setForeground(new java.awt.Color(0, 0, 0));
        jLabel412.setText("Khách hàng: Đỗ Minh Nghiêm");
        jPanel14.add(jLabel412, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        jLabel413.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel413.setForeground(new java.awt.Color(0, 0, 0));
        jLabel413.setText("Thành tiền:");
        jPanel14.add(jLabel413, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel414.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel414.setForeground(new java.awt.Color(0, 0, 0));
        jLabel414.setText("580,000 Đ");
        jPanel14.add(jLabel414, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 330, 720));

        scrollPane2.add(jPanel8);

        jPanel4.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 0, 350, 460));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(100, 19, 19));
        jButton10.setText("Hoàn tất");
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 475, 350, 40));

        jpThanhtoan.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 410, 530));

        pnContainer.add(jpThanhtoan, "card3");

        pnMain.add(pnContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, -1, 531));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 185, 130));
        jLabel8.setText("THE COFFEE HOME");
        pnMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        openMenu.setText(" ");
        openMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenuMouseClicked(evt);
            }
        });
        pnMain.add(openMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        userUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userUsername.setForeground(new java.awt.Color(255, 255, 255));
        userUsername.setText("username");
        pnMain.add(userUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addSVG() // Thêm file svg vào giao diện
    {
        svgA.setSVGImage("image_svg/logo.svg", 300, 300);
        svgB.setSVGImage("image_svg/discount.svg", 60, 60);
        openMenu.setSVGImage("image_svg/menu.svg", 30, 30);
        closeMenu.setSVGImage("image_svg/closemenu.svg", 30, 30);
        mainLogo.setSVGImage("image_svg/mainlogo.svg", 90, 90);
        svgHome.setSVGImage("image_svg/home.svg", 30, 30);
        svgAccount.setSVGImage("image_svg/account.svg", 30, 30);
        svgVou.setSVGImage("image_svg/voucher.svg", 30, 30);
        svgShop.setSVGImage("image_svg/shop.svg", 30, 30);
        svgHistory.setSVGImage("image_svg/his.svg", 30, 30);
        svgChat.setSVGImage("image_svg/chat.svg", 30, 30);
        svgLogout.setSVGImage("image_svg/logout.svg", 30, 30);
    }
    
    // THIẾT KẾ GIAO DIỆN
    
    // Method open MenuBar
    public void openMenuBar(){
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < width; i++){
                    pnSlideMenu.setSize(i, height);
                    // mở từ từ 
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
    // Method close MenuBar
    public void closeMenuBar(){
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = width; i > 0; i--){
                    pnSlideMenu.setSize(i, height);
                    // mở từ từ 
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
    // XỬ LÝ TRÊN FRAME QUẢN LÝ TÀI KHOẢN 
    
    public void Account() // set up cho frame quản lý tài khoản (ĐANG LỖI)
    { 
        amID.setEditable(false);
        amSignDate.setEditable(false);
        
        id_user = user.getUserID(userUsername.getText());
        user_data = user.getUserData(id_user);
        
        // thêm dữ liệu vào TextField
        amID.setText(user_data[0]);
        amName.setText(user_data[1]);
        amSex.setText(user_data[2]);
        amPhone.setText(user_data[3]);
        amAddress.setText(user_data[4]);
        amSignDate.setText(user_data[5]);
        amUsername.setText(user_data[6]);
        amPassword.setText(user_data[7]);
    }
    
    public boolean isAccountEmpty() // Lúc thay đổi thì tất cả các TextField đều phải chứa dữ liệu
    {
        if (amName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Tên không được để trống", "Cảnh báo", 2);
            return false;
        }
        if (amPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống", "Cảnh báo", 2);
            return false;
        }
        if (amAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống", "Cảnh báo", 2);
            return false;
        }
        if (amUsername.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Username không được để trống", "Cảnh báo", 2);
            return false;
        }
        if (amPassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Password không được để trống", "Cảnh báo", 2);
            return false;
        }
        return true;
    }
    
    private boolean checkAccount() // Kiểm tra xem lúc thay đổi thì username và phone có bị trùng không
    {
        String new_username = amUsername.getText();
        String new_phone = amPhone.getText();
        
        if (new_username.equals(user_data[6])){
            return false;
        } else {
            if (!new_username.equals(user_data[6])){
                boolean c = user.isUsernameExist(new_username);
                if (c){
                    JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại", "Cảnh báo", 2);
                }
                return c;
            }
            if (!new_phone.equals(user_data[3])){
                boolean c = user.isPhoneExist(new_phone);
                if (c){
                    JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại", "Cảnh báo", 2);
                }
                return c;
            }
        }
        return false;
    }
    
    // XỬ LÝ TRÊN FRAME MENU
    
    public void reset(){
        // reset lựa chọn
        jSpinner5.setValue(0); jSpinner6.setValue(0); jSpinner7.setValue(0); jSpinner8.setValue(0);
        jSpinner9.setValue(0); jSpinner10.setValue(0); jSpinner11.setValue(0); jSpinner12.setValue(0);
        jSpinner13.setValue(0); jSpinner14.setValue(0); jSpinner15.setValue(0); jSpinner16.setValue(0);
        jSpinner17.setValue(0); jSpinner18.setValue(0); jSpinner19.setValue(0); jSpinner20.setValue(0);
        jSpinner21.setValue(0); jSpinner22.setValue(0); jSpinner23.setValue(0); jSpinner24.setValue(0);
        jSpinner25.setValue(0); jSpinner26.setValue(0); jSpinner27.setValue(0); jSpinner28.setValue(0);
        jSpinner29.setValue(0); jSpinner30.setValue(0); jSpinner31.setValue(0); jSpinner32.setValue(0);
        jSpinner33.setValue(0); jSpinner34.setValue(0); jSpinner35.setValue(0); jSpinner36.setValue(0);
        jSpinner37.setValue(0); jSpinner38.setValue(0); jSpinner39.setValue(0); jSpinner40.setValue(0);
        jSpinner41.setValue(0); jSpinner42.setValue(0); jSpinner43.setValue(0); jSpinner44.setValue(0);
        jSpinner45.setValue(0);
        // reset hoá đơn 
    }
    
    // Thông báo Logout
    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?","Đăng xuất",JOptionPane.YES_NO_OPTION);
        if (a == 0){
            new First().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpAccount.setVisible(true);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbAccountMouseClicked

    private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
        closeMenuBar();
        jpHomea.setVisible(true);
        jpAccount.setVisible(false);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbHomeMouseClicked

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuMouseClicked
        openMenuBar();
    }//GEN-LAST:event_openMenuMouseClicked

    private void closeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMenuMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_closeMenuMouseClicked

    private void mainLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLogoMouseClicked
        closeMenuBar();
        jpHomea.setVisible(true);
        jpAccount.setVisible(false);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_mainLogoMouseClicked

    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpAccount.setVisible(false);
        jpMenu.setVisible(true);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbMenuMouseClicked

    private void amAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amAddressActionPerformed
    
    }//GEN-LAST:event_amAddressActionPerformed

    private void amPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amPasswordActionPerformed
      
    }//GEN-LAST:event_amPasswordActionPerformed

    private void amPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amPhoneActionPerformed
       
    }//GEN-LAST:event_amPhoneActionPerformed

    private void amNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amNameActionPerformed
       
    }//GEN-LAST:event_amNameActionPerformed

    private void amUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amUsernameActionPerformed
        
    }//GEN-LAST:event_amUsernameActionPerformed

    private void amIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amIDActionPerformed
        
    }//GEN-LAST:event_amIDActionPerformed

    private void amSignDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amSignDateActionPerformed
        
    }//GEN-LAST:event_amSignDateActionPerformed

    private void amSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amSexActionPerformed
        
    }//GEN-LAST:event_amSexActionPerformed

    // Chỉnh sửa tài khoản
    private void amSavebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amSavebtActionPerformed
        if (isAccountEmpty()){
            if(!checkAccount()){
                String name = amName.getText();
                String sex = amSex.getText();
                String phone = amPhone.getText();
                String address = amAddress.getText();
                String username = amUsername.getText();
                String password = amPassword.getText();
                user.updateAccount(id_user, name, sex, phone, address, username, password);
            }
        }
    }//GEN-LAST:event_amSavebtActionPerformed

    // Xoá tài khoản
    private void amDeletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amDeletebtActionPerformed
       user.deleteAccount(id_user);
    }//GEN-LAST:event_amDeletebtActionPerformed

    private void lbPurchase1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPurchase1MouseClicked
        
    }//GEN-LAST:event_lbPurchase1MouseClicked

    private void lbPurchase2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPurchase2MouseClicked
      
    }//GEN-LAST:event_lbPurchase2MouseClicked

    private void lbCapheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCapheMouseClicked
        MenuCaphe.setVisible(true);
        MenuTra.setVisible(false);
        MenuBanh.setVisible(false);
    }//GEN-LAST:event_lbCapheMouseClicked

    private void lbTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTraMouseClicked
        MenuCaphe.setVisible(false);
        MenuTra.setVisible(true);
        MenuBanh.setVisible(false);
    }//GEN-LAST:event_lbTraMouseClicked

    private void lbBanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBanhMouseClicked
        MenuCaphe.setVisible(false);
        MenuTra.setVisible(false);
        MenuBanh.setVisible(true);
    }//GEN-LAST:event_lbBanhMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void lbAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccount1MouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpAccount.setVisible(false);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(true);
    }//GEN-LAST:event_lbAccount1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jpMenu.setVisible(false);
        jpThanhtoan.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jpMenu.setVisible(true);
        jpThanhtoan.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuBanh;
    private javax.swing.JPanel MenuCaphe;
    private javax.swing.JPanel MenuCard;
    private javax.swing.JPanel MenuTra;
    private javax.swing.JTextField amAddress;
    private javax.swing.JButton amDeletebt;
    private javax.swing.JTextField amID;
    private javax.swing.JTextField amName;
    private javax.swing.JTextField amPassword;
    private javax.swing.JTextField amPhone;
    private javax.swing.JButton amSavebt;
    private javax.swing.JTextField amSex;
    private javax.swing.JTextField amSignDate;
    public static javax.swing.JTextField amUsername;
    private javax.swing.JButton btnReset;
    private userView.SVGImage closeMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner28;
    private javax.swing.JSpinner jSpinner29;
    private javax.swing.JSpinner jSpinner30;
    private javax.swing.JSpinner jSpinner31;
    private javax.swing.JSpinner jSpinner32;
    private javax.swing.JSpinner jSpinner33;
    private javax.swing.JSpinner jSpinner34;
    private javax.swing.JSpinner jSpinner35;
    private javax.swing.JSpinner jSpinner36;
    private javax.swing.JSpinner jSpinner37;
    private javax.swing.JSpinner jSpinner38;
    private javax.swing.JSpinner jSpinner39;
    private javax.swing.JSpinner jSpinner40;
    private javax.swing.JSpinner jSpinner41;
    private javax.swing.JSpinner jSpinner42;
    private javax.swing.JSpinner jSpinner43;
    private javax.swing.JSpinner jSpinner44;
    private javax.swing.JSpinner jSpinner45;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel jpAccount;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpHomea;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpThanhtoan;
    private javax.swing.JPanel jpVoucher;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbAccount1;
    private javax.swing.JLabel lbBanh;
    private javax.swing.JLabel lbCaphe;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbPurchase1;
    private javax.swing.JLabel lbPurchase2;
    private javax.swing.JLabel lbTra;
    private userView.SVGImage mainLogo;
    private userView.SVGImage openMenu;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSlideMenu;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane2;
    private userView.SVGImage svgA;
    private userView.SVGImage svgAccount;
    private userView.SVGImage svgB;
    private userView.SVGImage svgChat;
    private userView.SVGImage svgHistory;
    private userView.SVGImage svgHome;
    private userView.SVGImage svgLogout;
    private userView.SVGImage svgShop;
    private userView.SVGImage svgVou;
    public static javax.swing.JLabel userUsername;
    // End of variables declaration//GEN-END:variables
}
