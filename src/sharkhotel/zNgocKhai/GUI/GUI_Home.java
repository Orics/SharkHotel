/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sharkhotel.zNgocKhai.DTO.DTOEmployee;
import sharkhotel.zNgocKhai.GUI.guis.GUI_Home_Controller;

/**
 *
 * @author Orics
 */
public class GUI_Home {
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
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="properties">
    private static Stage _gui;
    private static GUI_Home_Controller _controller;
    
    private static GUI_ThongTinChung _thongtinchung;
    private static GUI_DatPhong _datphong;
    private static GUI_QuanLyPhong _quanlyphong;
    private static GUI_DichVu _dichvu;
    private static GUI_NhanVien _nhanvien;
    private static GUI_KhachHang _khachhang;
    private static GUI_HoaDon _hoadon;
    private static GUI_ThongKe _thongke;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="gettrer, settter">
    public static Stage getGUI() {
        return _gui;
    }

    public static GUI_Home_Controller getController() {
        return _controller;
    }

    public static GUI_ThongTinChung getThongTinChung() {
        return _thongtinchung;
    }

    public static GUI_DatPhong getDatPhong() {
        return _datphong;
    }

    public static GUI_QuanLyPhong getQuanLyPhong() {
        return _quanlyphong;
    }

    public static GUI_DichVu getDichVu() {
        return _dichvu;
    }

    public static GUI_NhanVien getNhanVien() {
        return _nhanvien;
    }

    public static GUI_KhachHang getKhachHang() {
        return _khachhang;
    }

    public static GUI_HoaDon getHoaDon() {
        return _hoadon;
    }

    public static GUI_ThongKe getThongKe() {
        return _thongke;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="public method">
    public GUI_Home(DTOEmployee nv) {
        // khởi tạo các thành phần con
        _thongtinchung = new GUI_ThongTinChung();
        _datphong = new GUI_DatPhong();
        _quanlyphong = new GUI_QuanLyPhong();
        _dichvu = new GUI_DichVu();
        _nhanvien = new GUI_NhanVien();
        _khachhang = new GUI_KhachHang();
        _hoadon = new GUI_HoaDon();
        _thongke = new GUI_ThongKe();
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/guis/GUI_Home.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 1366, 768));
            _gui = stage;
            _controller = loader.getController();
            _controller.setNhanVien(nv);
            _controller.load();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Home_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="private method">
    
//</editor-fold>
}
