/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI.guis;

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
import sharkhotel.zNgocKhai.DLL.DLLLogin;
import sharkhotel.zNgocKhai.DTO.DTOEmployee;
import sharkhotel.zNgocKhai.GUI.GUI_Home;

/**
 * FXML Controller class
 *
 * @author Orics
 */
public class GUI_Login_Controller implements Initializable {

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
    
    
    private void initEvents(){
        
        thoat_btn.setOnAction((e) -> {
            ((Stage)(((Button)e.getSource()).getScene().getWindow())).close();
        });
        
        matkhau_pf.setOnAction((e)->{
            String manv = tendangnhap_tf.getText();
            String matkhau = matkhau_pf.getText();
            DTOEmployee nv = DLLLogin.Login(manv, matkhau);
            if(nv != null){
                GUI_Home home = new GUI_Home(nv);
                home.getGUI().show();
                ((Stage)(((PasswordField)e.getSource()).getScene().getWindow())).close();
            }
            thongbao_lb.setText(DLLLogin.ThongBao);
        });
        
        dangnhap_btn.setOnAction((e)->{
            String manv = tendangnhap_tf.getText();
            String matkhau = matkhau_pf.getText();
            DTOEmployee nv = DLLLogin.Login(manv, matkhau);
            if(nv != null){
                GUI_Home home = new GUI_Home(nv);
                home.getGUI().show();
                ((Stage)(((Button)e.getSource()).getScene().getWindow())).close();
            }
            thongbao_lb.setText(DLLLogin.ThongBao);
        });
    }
}
