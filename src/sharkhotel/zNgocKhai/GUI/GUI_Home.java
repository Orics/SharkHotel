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
import sharkhotel.zNgocKhai.DTO.NhanVien;
import sharkhotel.zNgocKhai.GUI.guis.GUI_Home_Controller;

/**
 *
 * @author Orics
 */
public class GUI_Home {
    //<editor-fold defaultstate="collapsed" desc="properties">
    private Stage gui;
    private GUI_Home_Controller controller;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="gettrer, settter">
    public Stage getGUI() {
        return gui;
    }
    
    public GUI_Home_Controller getController() {
        return controller;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="public method">
    public GUI_Home(NhanVien nv) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/guis/GUI_Home.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 1366, 768));
            gui = stage;
            controller = loader.getController();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Home_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="private method">
    
//</editor-fold>
}
