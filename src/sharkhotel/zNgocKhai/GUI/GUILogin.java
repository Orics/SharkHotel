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
import sharkhotel.zNgocKhai.FX.FXLogin;



/**
 *
 * @author Orics
 */
public class GUILogin extends Stage{
    private FXLogin controller;
    
    public GUILogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FX/FXLogin.fxml"));
            Parent root = loader.load();
            this.initStyle(StageStyle.UNDECORATED);
            this.setScene(new Scene(root, 600, 450));
            controller = loader.getController();
            
        } catch (IOException ex) {
            Logger.getLogger(GUILogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
