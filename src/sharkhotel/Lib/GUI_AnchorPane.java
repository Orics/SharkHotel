/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.Lib;

import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Orics
 */
public abstract class GUI_AnchorPane {
    protected AnchorPane gui;
    protected GUI_Controller controller;

    public AnchorPane getGUI() {
        return gui;
    }

    public GUI_Controller getController() {
        return controller;
    }  
    
    public void hide(){
        if(gui != null)
            gui.setVisible(false);
    }
    public void show(){
        if(gui != null)
            gui.setVisible(true);
    }
}
