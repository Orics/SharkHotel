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
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sharkhotel.zNgocKhai.DTO.DTOEmployee;
import sharkhotel.zNgocKhai.FX.FXHome;

/**
 *
 * @author Orics
 */

public class GUIHome extends Stage{
    
    /***************************************************************************
     *  BEGIN static public properties
     **************************************************************************/
    
    public static final int RECEPTIONIST = 1;
    
    public static final int BOOKKING = 2;
    
    /***************************************************************************
     *  END static public properties
     **************************************************************************/
    
    //--------------------------------------------------------------------------
    
    /***************************************************************************
     *  BEGIN static private properties
     **************************************************************************/
    
    static private FXHome _controller;
    
    /***************************************************************************
     *  END static private properties
     **************************************************************************/
    
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    
    /***************************************************************************
     *  BEGIN public properties
     **************************************************************************/
    
    /***************************************************************************
     *  END public properties
     **************************************************************************/
    
    //--------------------------------------------------------------------------
    
    /***************************************************************************
     *  BEGIN pubic method
     **************************************************************************/
    
    public GUIHome(DTOEmployee employee) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FX/FXHome.fxml"));
            Parent root = loader.load();
            this.initStyle(StageStyle.UNDECORATED);
            this.setScene(new Scene(root, 1366, 768));
            _controller = loader.getController();
            _controller.setEmployee(employee);
            _controller.load();
        } catch (IOException ex) {
            Logger.getLogger(FXHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /***************************************************************************
     *  BEGIN pubic method
     **************************************************************************/
    //--------------------------------------------------------------------------
    /***************************************************************************
     *  BEGIN private method
     **************************************************************************/
    /***************************************************************************
     *  END private method
     **************************************************************************/

}
