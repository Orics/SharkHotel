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
import sharkhotel.zNgocKhai.DTO.DTOEmployee;

/**
 *
 * @author Orics
 */
public class DLLLogin {
    //
    public static String ThongBao;
    
    public static DTOEmployee Login(String manv, String matkhau){
        DTOEmployee nv = null;
        try {
            Connection conn = SQLConnection.getConnection();
            String sql1 = "SELECT * FROM Employee WHERE EmployeeId = ? ";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, manv);
            ResultSet rs1 = ps1.executeQuery();
            
            if(rs1.next()){ //mã nhân viên đúng
                String sql2 = "SELECT * FROM Employee WHERE EmployeeId = ? and Password = ?";
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                ps2.setString(1, manv);
                ps2.setString(2, matkhau);
                ResultSet rs2 = ps2.executeQuery();
                
                if(rs2.next()){ // mật khẩu đúng
                    if(rs2.getString("Status").compareTo("online") != 0){ //tài khoản không online
                        ThongBao = "Login Successfully";
                        nv = new DTOEmployee();
                        nv.EmployeeId = rs2.getString("EmployeeId");
                        nv.Password = rs2.getString("Password");
                        nv.Position = rs2.getString("Position");
                        nv.FullName = rs2.getString("FullName");
                        nv.Gender = rs2.getString("Gender");
                        nv.BirthDay = rs2.getDate("BirthDay").toLocalDate();
                        nv.Phone = rs2.getString("Phone");
                        nv.Status = rs2.getString("Status");
                        
                    }
                    else{  //tài khoản đang online
                        ThongBao = "You are logged into the system";
                    }
                }
                else{ //mật khẩu sai
                     ThongBao = "Password incorrect";
                }
            }
            else{
                ThongBao = "Employee ID incorrect";
            }
        } catch (SQLException ex) {
            ThongBao = "Error logging in";
        }
        return nv;
    }
}
