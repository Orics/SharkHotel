/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.DLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.Syntax;
import sharkhotel.Lib.SQLConnection;
import sharkhotel.zNgocKhai.DTO.NhanVien;

/**
 *
 * @author Orics
 */
public class DLL_DangNhap {
    //
    public static String ThongBao;
    
    public static NhanVien DangNhap(String manv, String matkhau){
        NhanVien nv = null;
        try {
            Connection conn = SQLConnection.getConnection();
            String sql1 = "SELECT * FROM NhanVien WHERE MaNhanVien = ? ";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, manv);
            ResultSet rs1 = ps1.executeQuery();
            
            if(rs1.next()){ //mã nhân viên đúng
                String sql2 = "SELECT * FROM NhanVien WHERE MaNhanVien = ? and MatKhau = ?";
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                ps2.setString(1, manv);
                ps2.setString(2, matkhau);
                ResultSet rs2 = ps2.executeQuery();
                
                if(rs2.next()){ // mật khẩu đúng
                    if(rs2.getString("TrangThai").compareTo("online") == 0){ //tài khoản không online
                        ThongBao = "Đăng nhập thành công";
                        nv = new NhanVien();
                        nv.MaNhanVien = rs2.getString("MaNhanVien");
                        nv.MatKhau = rs2.getString("MatKhau");
                        nv.ChucVu = rs2.getString("MaNhanVien");
                        nv.HoTen = rs2.getString("HoTen");
                        nv.GioiTinh = rs2.getString("GioiTinh");
                        nv.NgaySinh = rs2.getDate("NgaySinh").toLocalDate();
                        nv.SDT = rs2.getString("SDT");
                        nv.Email = rs2.getString("Email");
                        nv.TrangThai = rs2.getString("TrangThai");
                        
                    }
                    else{  //tài khoản đang online
                        ThongBao = "Tài khoản đã đăng nhập ở nơi khác";
                    }
                }
                else{ //mật khẩu sai
                     ThongBao = "Mật khẩu không đúng";
                }
            }
            else{
                ThongBao = "Mã nhân viên không đúng";
            }
        } catch (SQLException ex) {
            ThongBao = "Đã có lỗi xảy ra";
        }
        return nv;
    }
}
