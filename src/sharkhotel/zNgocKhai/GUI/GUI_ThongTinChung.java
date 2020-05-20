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
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sharkhotel.zNgocKhai.GUI.guis.GUI_Login_Controller;
import sharkhotel.zNgocKhai.GUI.guis.GUI_ThongTinChung_Controller;



/**
 *
 * @author Orics
 */
public class GUI_ThongTinChung{
    private AnchorPane gui;
    private GUI_ThongTinChung_Controller controller;

    public AnchorPane getGUI() {
        return gui;
    }
    
    public GUI_ThongTinChung() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/guis/GUI_ThongTinChung.fxml"));
            AnchorPane root = loader.load();
            gui = root;
            controller = loader.getController();
            controller.load();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Login_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
