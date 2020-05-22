/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.FX;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sharkhotel.zNgocKhai.DTO.DTOEmployee;
import sharkhotel.zNgocKhai.GUI.GUIHome;
import sharkhotel.zNgocKhai.GUI.GUIHomeReceptionist;

public class FXHome implements Initializable {
    
    private static DTOEmployee employee;
    
    private AnchorPane receptionistTab;
    private AnchorPane bookingTab;
 
    @FXML private AnchorPane content;
    @FXML private Button exit;
    @FXML private Label avatar;
    @FXML private Label fullname;
    @FXML private Label position;
    @FXML private Label receptionistTabTitle;
    @FXML private Label bookingTabTitle;

    

    public static DTOEmployee getEmployee() {
        return employee;
    }
    
    public void setEmployee(DTOEmployee employee) {
        this.employee = employee;
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initEvents();
        receptionistTab = new GUIHomeReceptionist();
        content.getChildren().addAll(receptionistTab);
    }
    
    public void load(){
        
    }

    private void initEvents(){
        exit.setOnAction((e) -> {
            ((Stage)(((Button)e.getSource()).getScene().getWindow())).close();
        });
        
        avatar.setOnMouseClicked((e) -> {
            System.out.println("click ok");
        });
        
        receptionistTabTitle.setOnMouseClicked((e) -> {
            switchTab(GUIHome.RECEPTIONIST);
        });
        bookingTabTitle.setOnMouseClicked((e) -> {
            switchTab(GUIHome.BOOKKING);
        });
        
    }
    
    public void switchTab(int tab){
        receptionistTab.setVisible(false);
//        dp_tab_pn.setVisible(false);
//        qlp_tab_pn.setVisible(false); 
//        dv_tab_pn.setVisible(false);
//        nv_tab_pn.setVisible(false);
//        kh_tab_pn.setVisible(false);
//        hd_tab_pn.setVisible(false);
//        tk_tab_pn.setVisible(false);
        
        // hiện tab được chọn
        switch(tab){
            case GUIHome.RECEPTIONIST:
                receptionistTab.setVisible(true);
                break;
//            case GUIHome.BOOKKING:
//                bookingTab.setVisible(true);
//                break;
//            case DATPHONG:
//                dp_tab_pn.setVisible(true);
//                break;
//            case KHACHHANG:
//                kh_tab_pn.setVisible(true);
//                break;
//            case QUANLYPHONG:
//                qlp_tab_pn.setVisible(true);
//                break;
//            case NHANVIEN:
//                nv_tab_pn.setVisible(true);
//                break;
//            case DICHVU:
//                dv_tab_pn.setVisible(true);
//                break;
//            case HOADON:
//                hd_tab_pn.setVisible(true);
//                break;
//            case THONGKE:
//                tk_tab_pn.setVisible(true);
//                break;
        }
    }
}
