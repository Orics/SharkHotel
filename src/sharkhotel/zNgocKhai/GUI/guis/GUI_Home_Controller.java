/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI.guis;

import sharkhotel.zNgocKhai.GUI.guis.GUI_Login_Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sharkhotel.zNgocKhai.DTO.NhanVien;
import sharkhotel.zNgocKhai.GUI.GUI_Home;

/**
 * FXML Controller class
 *
 * @author Orics
 */
public class GUI_Home_Controller implements Initializable {
  
    //<editor-fold defaultstate="collapsed" desc="properties">
    private static NhanVien nhanvien;
    
    private AnchorPane ttc_tab_pn;
    private AnchorPane dp_tab_pn;
    private AnchorPane qlp_tab_pn; 
    private AnchorPane dv_tab_pn;
    private AnchorPane nv_tab_pn;
    private AnchorPane kh_tab_pn;
    private AnchorPane hd_tab_pn;
    private AnchorPane tk_tab_pn;
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="fxml properties">
    
    @FXML
    private AnchorPane root;
    
    @FXML
    private Button thoat_btn;
    @FXML
    private Label anhdd_lb;
    @FXML
    private Label tennv_lb;
    @FXML
    private Label chucvu_lb;
    
    @FXML 
    private Label ttc_tab_lb;
    @FXML 
    private Label dp_tab_lb;
    @FXML 
    private Label qlp_tab_lb;
    @FXML 
    private Label dv_tab_lb;
    @FXML 
    private Label nv_tab_lb;
    @FXML 
    private Label kh_tab_lb;
    @FXML 
    private Label hd_tab_lb;
    @FXML 
    private Label tk_tab_lb;
    
    @FXML
    private AnchorPane tabs_pn;
   
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getter, setter">
    public static NhanVien getNhanVien() {
        return nhanvien;
    }
    
    public void setNhanVien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }
//</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="public method">
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initEvents();
    }
    
    public void load(){
        // load thông tin nhân viên lên GUI
        tennv_lb.setText(nhanvien.HoTen);
        chucvu_lb.setText(nhanvien.ChucVu);

        // khỏi tạo các pane chức năng
        ttc_tab_pn = GUI_Home.getThongTinChung().getGUI();
        dp_tab_pn = GUI_Home.getDatPhong().getGUI();
        qlp_tab_pn = GUI_Home.getQuanLyPhong().getGUI(); 
        dv_tab_pn = GUI_Home.getDichVu().getGUI();
        nv_tab_pn = GUI_Home.getNhanVien().getGUI();
        kh_tab_pn = GUI_Home.getKhachHang().getGUI();
        hd_tab_pn = GUI_Home.getHoaDon().getGUI();
        tk_tab_pn = GUI_Home.getThongKe().getGUI();
        
        // thêm các pane vào 
        tabs_pn.getChildren().addAll(
                ttc_tab_pn, 
                dp_tab_pn,
                qlp_tab_pn,
                dv_tab_pn,
                nv_tab_pn,
                kh_tab_pn,
                hd_tab_pn,
                tk_tab_pn
                );
        
    }
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="private method">
    private void initEvents(){
        thoat_btn.setOnAction((e) -> {
            ((Stage)(((Button)e.getSource()).getScene().getWindow())).close();
        });
        
        anhdd_lb.setOnMouseClicked((e) -> {
            System.out.println("click ok");
        });
        
       
        ttc_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.THONGTINCHUNG);
        });
        dp_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.DATPHONG);
        });
        qlp_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.QUANLYPHONG);
        });
        dv_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.DICHVU);
        });
        nv_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.NHANVIEN);
        });
        kh_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.KHACHHANG);
        });
        hd_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.HOADON);
        });
        tk_tab_lb.setOnMouseClicked((e) -> {
            GUI_Home.switchTab(GUI_Home.Tabs.THONGKE);
        });
    }
//</editor-fold>
    
}
