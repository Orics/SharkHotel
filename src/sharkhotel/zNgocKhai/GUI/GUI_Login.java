/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import sharkhotel.zNgocKhai.GUI.guis.GUI_Login_Controller;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Orics
 */
public class GUI_Login {
    //<editor-fold defaultstate="collapsed" desc="properties">
    private Stage gui;
    private GUI_Login_Controller controller;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getter, setter">
    public Stage getGUI() {
        return gui;
    }
    
    public GUI_Login_Controller getController() {
        return controller;
    }
//</editor-fold>
    
    public GUI_Login() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/guis/GUI_Login.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 600, 450));
            gui = stage;
            controller = loader.getController();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Login_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
