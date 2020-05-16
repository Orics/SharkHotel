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

/**
 * FXML Controller class
 *
 * @author Orics
 */
public class GUI_Home_Controller implements Initializable {
    
    //<editor-fold defaultstate="collapsed" desc="properties">
    private NhanVien nhanvien;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="fxml properties">
    @FXML
    private Button thoat_btn;
    @FXML
    private Label anhdd_lb;
    @FXML
    private Label tennv_lb;
    @FXML
    private Label chucvu_lb;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getter, setter">
    public NhanVien getNhanVien() {
        return nhanvien;
    }
    
    public void setNhanVien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
        load();
    }
//</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="public method">
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initEvents();
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
    }
    
    private void load(){
        tennv_lb.setText(nhanvien.HoTen);
        chucvu_lb.setText(nhanvien.ChucVu);
    }
//</editor-fold>
    
}
