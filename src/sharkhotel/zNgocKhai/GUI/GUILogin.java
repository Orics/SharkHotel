/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import sharkhotel.zNgocKhai.FX.FXLogin;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 *
 * @author Orics
 */
public class GUILogin{
    private Stage gui;
    private FXLogin controller;

    public Stage getGUI() {
        return gui;
    }
    
    public GUILogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FX/FXLogin.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 600, 450));
            gui = stage;
            controller = loader.getController();
        } catch (IOException ex) {
            Logger.getLogger(FXLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
