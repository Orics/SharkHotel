/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 *
 * @author Orics
 */
public class GUI_HoaDon {
    private AnchorPane gui;

    public AnchorPane getGUI() {
        return gui;
    }
    
    public GUI_HoaDon() {
        AnchorPane pn = new AnchorPane();
        pn.setPrefWidth(1150);
        pn.setPrefHeight(700);
        pn.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        pn.setVisible(true);
        gui = pn;
    }
    
   
}