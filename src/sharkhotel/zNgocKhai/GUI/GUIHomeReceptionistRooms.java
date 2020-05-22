/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
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
import sharkhotel.zNgocKhai.FX.FXHome;

/**
 *
 * @author Orics
 */
public class GUIHomeReceptionistRooms extends AnchorPane{
    /***************************************************************************
     *  BEGIN static public properties
     **************************************************************************/
    
    /***************************************************************************
     *  END static public properties
     **************************************************************************/
    
    //--------------------------------------------------------------------------
    
    /***************************************************************************
     *  BEGIN static private properties
     **************************************************************************/
    
    /***************************************************************************
     *  END static private properties
     **************************************************************************/
    
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
    
    public GUIHomeReceptionistRooms(){
        this.setPrefSize(1130, 620);
        this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        
            VBox wrapper = new VBox();
            wrapper.setPrefSize(1130, 620);

            HBox boloc_pn = new HBox();
            boloc_pn.setStyle(
                "-fx-pref-width: 1130; "+
                "-fx-pref-height: 50; "+
                "-fx-alignment: CENTER_LEFT; "+
                "-fx-border-width: 0 0 0 0; "+
                "-fx-spacing: 20; "+
                "-fx-padding: 0 30 0 30; "+
                "-fx-border-color: rgb(180,180,180); "
            );
                ComboBox<String> loaiphong_cbb = new ComboBox<String>();
                loaiphong_cbb.setPrefWidth(200);
                loaiphong_cbb.setValue("Loại phòng");

                ComboBox<String> cophong_cbb = new ComboBox<String>();
                cophong_cbb.setPrefWidth(200);
                cophong_cbb.setValue("Cỡ phòng");

                ComboBox<String> trangthai_cbb = new ComboBox<String>();
                trangthai_cbb.setValue("Trạng thái");
                trangthai_cbb.setPrefWidth(200);

                TextField timkiem_tf = new TextField();
                timkiem_tf.setPromptText("Enter name or phone or idcard of guest");
                timkiem_tf.setPrefWidth(350);

                Button loc_btn = new Button("Lọc");
                loc_btn.setStyle(
                    "-fx-text-fill: white; "+
                    "-fx-font-weight: bold; "+
                    "-fx-pref-width: 80px; "+
                    "-fx-background-color: #3889B8; "+
                    "-fx-background-radius: 2px;"
                );

            boloc_pn.getChildren().addAll(loaiphong_cbb, cophong_cbb, trangthai_cbb, timkiem_tf, loc_btn);

            ScrollPane scrollpane = new ScrollPane();
            scrollpane.setPrefSize(1130, 570);
            scrollpane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
            scrollpane.setFitToWidth(true);
            VBox vbox = new VBox();
            vbox.setPrefSize(1120, 610);
            vbox.setPadding(new Insets(0, 20, 20, 30));
            vbox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
            for (int i = 0; i < 10; i++) {
                Label tennhom_lb = new Label();
                tennhom_lb.setText("Tầng 1");
                tennhom_lb.setStyle(
                    "-fx-padding: 10px 0px 10px 0px; "+
                    "-fx-text-fill: #4C60B9; "+
                    "-fx-font: bold 12pt \"Segoe UI\"; "
                );
                vbox.getChildren().add(tennhom_lb);

                FlowPane flowpane = new FlowPane();
                flowpane.setPrefSize(1120, 595);
                flowpane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
                flowpane.setHgap(10);
                flowpane.setVgap(10);
                flowpane.setVisible(true);

                for (int j = 0; j < 10; j++) {
                    Pane phong_pn = new Pane();
                    phong_pn.setStyle(
                        "-fx-background-color: rgb(40,206,62); "+
                        "-fx-effect: dropshadow(two-pass-box, rgba(0, 0, 0, 0.5), 3, 0.0, 0, 0); "
                    );
                    phong_pn.setPrefSize(168, 70);

                    ContextMenu tuychon_cm = new ContextMenu();
                    MenuItem thuephong_mi = new MenuItem("Thuê phòng");
                    thuephong_mi.setGraphic(new ImageView(getClass().getResource("../Icons/thuephong_icon.png").toExternalForm()));
                    thuephong_mi.setOnAction((e) -> {
                        System.out.println("ThuePhong");
                    });

                    MenuItem chitiet_mi = new MenuItem("Xem chi tiết");
                    chitiet_mi.setOnAction((e) -> {
                        System.out.println("Xem chi tietg");
                    });
                    tuychon_cm.getItems().addAll(thuephong_mi, chitiet_mi);

                    Label tenloaiphong_lb = new Label("STD - SINGLE");
                    phong_pn.getChildren().add(tenloaiphong_lb);
                    tenloaiphong_lb.setLayoutX(7);
                    tenloaiphong_lb.setLayoutY(0);
                    tenloaiphong_lb.setStyle(
                        "-fx-pref-width: 150; "+
                        "-fx-pref-height: 20; "+
                        "-fx-border-width: 0, 0, 1, 0; "+
                        "-fx-border-color: lightgray; "+
                        "-fx-text-fill: white; "+
                        "-fx-font: 12px \"Segoe UI\"; "
                    );


                    Label sophong_lb = new Label("101");
                    phong_pn.getChildren().add(sophong_lb);
                    sophong_lb.setLayoutX(7);
                    sophong_lb.setLayoutY(20);
                    sophong_lb.setStyle(
                        "-fx-alignment: center; "+
                        "-fx-pref-width: 150; "+
                        "-fx-pref-height: 30; "+
                        "-fx-border-width: 0, 0, 1, 0; "+
                        "-fx-border-color: lightgray; "+
                        "-fx-text-fill: white; "+
                        "-fx-font: bold 20px \"Segoe UI\"; "
                    );

                    Label trangthai_lb = new Label("Empty");
                    phong_pn.getChildren().add(trangthai_lb);
                    trangthai_lb.setLayoutX(7);
                    trangthai_lb.setLayoutY(50);
                    trangthai_lb.setStyle(
                        "-fx-pref-width: 150; "+
                        "-fx-pref-height: 20; "+
                        "-fx-border-width: 0, 0, 1, 0; "+
                        "-fx-border-color: lightgray; "+
                        "-fx-text-fill: white; "+
                        "-fx-font: 12px \"Segoe UI\"; "
                    );
                    phong_pn.setVisible(true);

                    phong_pn.setOnMouseEntered((e) -> {
                        phong_pn.setStyle(
                            "-fx-background-color: rgb(40,206,62); "+
                            "-fx-border-color: yellow; "+
                            "-fx-border-width: 2px; "+
                            "-fx-effect: dropshadow(two-pass-box, rgba(0, 0, 0, 0.5), 20, 0.0, 0, 0); "
                        );
                    });
                    phong_pn.setOnMouseExited((e) -> {
                        phong_pn.setStyle(
                            "-fx-background-color: rgb(40,206,62); "+
                            "-fx-border-width: 0; "+
                            "-fx-effect: dropshadow(two-pass-box, rgba(0, 0, 0, 0.5), 3, 0.0, 0, 0); "
                        );
                    });
                    phong_pn.setOnContextMenuRequested((e) -> {
                        tuychon_cm.show(phong_pn, Side.RIGHT, -80, 30);
                    });
                    flowpane.getChildren().add(phong_pn);
                }
                vbox.getChildren().add(flowpane);
            }
            scrollpane.setContent(vbox);
            wrapper.getChildren().addAll(boloc_pn, scrollpane);
        this.getChildren().add(wrapper);
    }
}