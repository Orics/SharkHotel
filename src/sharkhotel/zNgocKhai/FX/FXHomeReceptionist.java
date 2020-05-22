/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.FX;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import sharkhotel.zNgocKhai.GUI.GUIHomeReceptionistRooms;
import sharkhotel.zNgocKhai.GUI.GUIHomeReceptionistSchedule;

/**
 * FXML Controller class
 *
 * @author Orics
 */
public class FXHomeReceptionist implements Initializable {
    
    private GUIHomeReceptionistRooms rooms;
    private GUIHomeReceptionistSchedule schedule;
//    private GUI_HoatDong activities_gui;
    
    @FXML
    private Tab roomsTab;
    @FXML
    private Tab scheduleTab;
    @FXML
    private Tab activitiesTab;
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rooms = new GUIHomeReceptionistRooms();
        roomsTab.setContent(rooms);
        
        schedule = new GUIHomeReceptionistSchedule();
        scheduleTab.setContent(schedule);
    }    
    
    public void load(){
//        rooms_tab.setContent(rooms_gui);
//        schedule_tab.setContent(new GUI_LichPhong().getGUI());
    }
 
}


////<editor-fold defaultstate="collapsed" desc="class: GUI_HoatDong">
//
////</editor-fold>
