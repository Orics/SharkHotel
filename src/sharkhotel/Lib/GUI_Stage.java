/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.Lib;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Orics
 */
public abstract class GUI_Stage {
    protected Stage gui;
    protected GUI_Controller controller;

    public Stage getGUI() {
        return gui;
    }

    public GUI_Controller getController() {
        return controller;
    }  
}
