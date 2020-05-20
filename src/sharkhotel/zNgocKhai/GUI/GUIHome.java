/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import sharkhotel.zNgocKhai.GUI.Home.GUIOverview;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sharkhotel.zNgocKhai.DTO.DTOEmployee;
import sharkhotel.zNgocKhai.FX.FXHome;

/**
 *
 * @author Orics
 */
public class GUIHome extends Stage{
    //<editor-fold defaultstate="collapsed" desc="enum">
    public enum Tabs {
        THONGTINCHUNG,
        DATPHONG,
        QUANLYPHONG,
        DICHVU,
        NHANVIEN,
        KHACHHANG,
        HOADON,
        THONGKE
    };
//</editor-fold>//</editor-fold>//</editor-fold>//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="properties">
    private static FXHome _controller;
    
   // private static GUIOverview _overview;
//    private static GUI_DatPhong _;
//    private static GUI_QuanLyPhong _quanlyphong;
//    private static GUI_DichVu _dichvu;
//    private static GUI_NhanVien _nhanvien;
//    private static GUI_KhachHang _khachhang;
//    private static GUI_HoaDon _hoadon;
//    private static GUI_ThongKe _thongke;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="gettrer, settter">
    public static FXHome getController() {
        return _controller;
    }

//    public static GUIOverview getOverview() {
//        return _overview;
//    }
//
//    public static GUI_DatPhong getDatPhong() {
//        return _datphong;
//    }
//
//    public static GUI_QuanLyPhong getQuanLyPhong() {
//        return _quanlyphong;
//    }
//
//    public static GUI_DichVu getDichVu() {
//        return _dichvu;
//    }
//
//    public static GUI_NhanVien getNhanVien() {
//        return _nhanvien;
//    }
//
//    public static GUI_KhachHang getKhachHang() {
//        return _khachhang;
//    }
//
//    public static GUI_HoaDon getHoaDon() {
//        return _hoadon;
//    }
//
//    public static GUI_ThongKe getThongKe() {
//        return _thongke;
//    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="public method">
    public GUIHome(DTOEmployee nv) {
        // khởi tạo các thành phần con
       // _overview = new GUIOverview();
//        _datphong = new GUI_DatPhong();
//        _quanlyphong = new GUI_QuanLyPhong();
//        _dichvu = new GUI_DichVu();
//        _nhanvien = new GUI_NhanVien();
//        _khachhang = new GUI_KhachHang();
//        _hoadon = new GUI_HoaDon();
//        _thongke = new GUI_ThongKe();
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FX/FXHome.fxml"));
            Parent root = loader.load();
            this.initStyle(StageStyle.UNDECORATED);
            this.setScene(new Scene(root, 1366, 768));
            _controller = loader.getController();
            _controller.setNhanVien(nv);
            _controller.load();
        } catch (IOException ex) {
            Logger.getLogger(FXHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="private method">
    
//</editor-fold>
}
