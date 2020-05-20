/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;


/**
 *
 * @author Orics
 */
public class GUI_DatPhong{
    
    //<editor-fold defaultstate="collapsed" desc="properties">
    private AnchorPane gui;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getter, setter">
    public AnchorPane getGUI() {
        return gui;
    }
//</editor-fold>
    
    public GUI_DatPhong() {
        AnchorPane pn = new AnchorPane();
        pn.setPrefWidth(1150);
        pn.setPrefHeight(700);
        pn.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        pn.setVisible(true);
        gui = pn;
    }
    
    //<editor-fold defaultstate="collapsed" desc="public method">
    
//</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="private method">
    private AnchorPane createRootPane(){
        AnchorPane root = new AnchorPane();
        root.setPrefWidth(1150);
        root.setPrefHeight(700);
        root.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        
        return root;
    } 
//</editor-fold>
}
