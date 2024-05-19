package dao;

import connection.JDBCUtil;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserDao {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public UserDao(){
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Set ID cho database 
    public int getMaxRow(){
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT MAX(ID_User) FROM C_USER");
            while(rs.next()){
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
    
    // Kiểm tra username đã tồn tại hay chưa
    public boolean isUsernameExist(String username){
        try {
            ps = con.prepareStatement("SELECT * FROM C_USER WHERE User_Username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Kiểm tra phone number đã tồn tại hay chưa
    public boolean isPhoneExist(String phone){
        try {
            ps = con.prepareStatement("SELECT * FROM C_USER WHERE Phone = ?");
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Thêm dữ liệu người đăng ký vào tabel C_USER
    public void insert(int id, String phone, Date signday, String username, String password){
        String sql = "INSERT INTO C_USER (ID_User, Phone, Register_Date, User_Username, User_Password) VALUES(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, phone);
            ps.setDate(3, signday);
            ps.setString(4, username);
            ps.setString(5, password);
            if (ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Đăng ký tài khoản thành công");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Lấy dữ liệu từ User
    public String[] getUserData(int id){
        String[] data = new String[8];
        try {
            ps = con.prepareStatement("SELECT * FROM C_USER WHERE ID_User = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                data[6] = rs.getString(7);
                data[7] = rs.getString(8);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    // Lấy ID từ User
    public int getUserID(String username){
        int id = 0;
        try {
            ps = con.prepareStatement("SELECT ID_User FROM C_USER WHERE User_Username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    // Cập nhật dữ liệu user (ĐANG LỖI)
    public void updateAccount(int id, String name, String sex, String phone, String address, String username, String password){
        String sql = "UPDATE C_USER SET Name = ?, Sex = ?, Phone = ?, Address = ?, User_Username = ?, User_Password = ? WHERE ID_User = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, sex);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.setString(5, username);
            ps.setString(6, password);
            ps.setInt(7, id);
            if (ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Xoá tài khoản
    public void deleteAccount(int id){
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xoá tài khoản không?", "Xoá tài khoản", JOptionPane.OK_CANCEL_OPTION, 0);
        if (x == JOptionPane.OK_OPTION){
            try {
                ps = con.prepareStatement("DELETE FROM C_USER WHERE ID_User = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Xoá tài khoản thành công");
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
