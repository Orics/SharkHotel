/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import sharkhotel.zNgocKhai.GUI.guis.GUI_Home_Controller;
import sharkhotel.zNgocKhai.GUI.guis.GUI_Login_Controller;

/**
 *
 * @author Orics
 */
public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       // GUI_Home.get().show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        C1 c1 = new C1();
        C2 c2 = new C2();
        c1.print();
        c2.print();
    }
}