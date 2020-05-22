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




/**
 *
 * @author Orics
 */
public class GUIHomeReceptionist extends AnchorPane{
    
    private sharkhotel.zNgocKhai.FX.FXHomeReceptionist controller;

    public GUIHomeReceptionist() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FX/FXHomeReceptionist.fxml"));
            this.getChildren().add(loader.load());
            controller = loader.getController();
            controller.load();
        } catch (IOException ex) {
            Logger.getLogger(GUIHomeReceptionist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
