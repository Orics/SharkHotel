/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sharkhotel.zNgocKhai.GUI.GUIHome;
import sharkhotel.zNgocKhai.GUI.GUILogin;
import sharkhotel.zNgocKhai.FX.FXHome;
//import sharkhotel.Lib.SQLConnection;
/**
 *
 * @author Orics
 */
public class SharkHotel extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       (new GUILogin()).show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
