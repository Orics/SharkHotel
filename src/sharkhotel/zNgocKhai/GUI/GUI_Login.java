/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sharkhotel.zNgocKhai.DLL.DLL_DangNhap;
import sharkhotel.zNgocKhai.DTO.NhanVien;

/**
 * FXML Controller class
 *
 * @author Orics
 */
public class GUI_Login implements Initializable {

    @FXML
    private Button thoat_btn;
    @FXML
    private TextField tendangnhap_tf;
    @FXML
    private PasswordField matkhau_pf;
    @FXML
    private Button dangnhap_btn;
    @FXML
    private Label thongbao_lb;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initEvents();
    }    
    
    public static Stage get(){
        try {
            Parent root = FXMLLoader.load(GUI_Login.class.getResource("../GUI/GUI_Login.fxml"));
            Stage stage = new Stage(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 600, 450));
            return stage;
        } catch (IOException ex) {
            Logger.getLogger(GUI_Login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    private void initEvents(){
        
        thoat_btn.setOnAction((e) -> {
            ((Stage)(((Button)e.getSource()).getScene().getWindow())).close();
        });
        
        matkhau_pf.setOnAction((e)->{
            String manv = tendangnhap_tf.getText();
            String matkhau = matkhau_pf.getText();
            NhanVien nv = DLL_DangNhap.DangNhap(manv, matkhau);
            if(nv != null){
                
            }
            thongbao_lb.setText(DLL_DangNhap.ThongBao);
        });
        
        dangnhap_btn.setOnAction((e)->{
            String manv = tendangnhap_tf.getText();
            String matkhau = matkhau_pf.getText();
            NhanVien nv = DLL_DangNhap.DangNhap(manv, matkhau);
            if(nv != null){
                
            }
            thongbao_lb.setText(DLL_DangNhap.ThongBao);
        });
    }
}
