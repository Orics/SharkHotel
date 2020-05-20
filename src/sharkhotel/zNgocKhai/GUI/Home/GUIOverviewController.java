/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI.Home;

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
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javax.swing.BorderFactory;

/**
 * FXML Controller class
 *
 * @author Orics
 */
public class GUIOverviewController implements Initializable {
    
    private GUIRooms rooms_gui;
    private GUI_LichPhong schedule_gui;
    private GUI_HoatDong activities_gui;
    
    @FXML
    private Tab rooms_tab;
    @FXML
    private Tab schedule_tab;
    @FXML
    private Tab activities_tab;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rooms_gui = new GUIRooms();
    }    
    
    public void load(){
        rooms_tab.setContent(rooms_gui);
        schedule_tab.setContent(new GUI_LichPhong().getGUI());
    }
 
}


//<editor-fold defaultstate="collapsed" desc="class: GUI_Phong">
class GUIRooms extends VBox{
    
    public GUIRooms(){
        this.setPrefSize(1130, 620);
        this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        
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
            timkiem_tf.setPromptText("Nhập tên, sđt, cmnd của khách hàng");
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
                thuephong_mi.setGraphic(new ImageView(getClass().getResource("../../Icons/thuephong_icon.png").toExternalForm()));
                thuephong_mi.setOnAction((e) -> {
                    System.out.println("ThuePhong");
                });
                
                MenuItem chitiet_mi = new MenuItem("Xem chi tiết");
                chitiet_mi.setOnAction((e) -> {
                    System.out.println("Xem chi tietg");
                });
                tuychon_cm.getItems().addAll(thuephong_mi, chitiet_mi);
                
                Label tenloaiphong_lb = new Label("Đơn - Tiêu chuẩn");
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
                
                Label trangthai_lb = new Label("Trống");
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
        this.getChildren().addAll(boloc_pn, scrollpane);
        
    }
}
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="class: GUI_LichPhong">
class GUI_LichPhong {
    private Parent gui;
    
    public Parent getGUI() {
        return gui;
    }
    
    private static int n = 0;
    
    public GUI_LichPhong(){
        VBox root = new VBox();
        root.setPrefSize(1130, 620);
        root.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        
            HBox boloc_pn = new HBox();
            boloc_pn.setStyle(
                "-fx-pref-width: 1130; "+
                "-fx-pref-height: 50; "+
                "-fx-alignment: CENTER_LEFT; "+
                "-fx-border-width: 0 0 1 0; "+
                "-fx-border-color: #929292; "
            );
        
            AnchorPane lichphong_pn = new AnchorPane();
            lichphong_pn.setPrefSize(1130, 570);
            
            HBox cacngay_hbox = new HBox();
            cacngay_hbox.setPrefSize(1000, 560);
            cacngay_hbox.setLayoutX(120);
            cacngay_hbox.setLayoutY(10);
            cacngay_hbox.setStyle(
                "-fx-border-width: 0 1 0 1; "+
                "-fx-spacing: 0; "
            );
            for (int i = 0; i < 10; i++) {
                VBox ngay_vbox = new VBox();
                if(i==2){
                    ngay_vbox.setStyle(
                        "-fx-background-color: rgb(230, 230, 255); "+
                        "-fx-pref-width: 100; "+
                        "-fx-pref-height: 560; "+
                        "-fx-border-color: #CBCBCB; "+
                        "-fx-border-width: 2 1 0 1; "
                    );
                }
                else{
                    ngay_vbox.setStyle(
                        "-fx-background-color: white; "+
                        "-fx-pref-width: 100; "+
                        "-fx-pref-height: 560; "+
                        "-fx-border-color: #CBCBCB; "+
                        "-fx-border-width: 2 1 0 1; "
                    );
                }
                Label thu_lb = new Label("Thứ Hai");
                thu_lb.setStyle(
                    "-fx-background-color: rgba(0,0,0, 0.06); "+
                    "-fx-alignment: center; "+
                    "-fx-font: 12px \"Segoe UI\"; "+
                    "-fx-pref-width: 102; "+
                    "-fx-pref-height: 18; "
                );

                Label ngay_lb = new Label("12/05");
                ngay_lb.setStyle(
                    "-fx-background-color: rgba(0,0,0, 0.06); "+
                    "-fx-alignment: center; "+
                    "-fx-font: 12px \"Segoe UI\"; "+
                    "-fx-pref-width: 102; "+
                    "-fx-pref-height: 22; "+
                    "-fx-border-color: #CBCBCB; "+
                    "-fx-border-width: 0 0 2 0; "
                );
                ngay_vbox.getChildren().addAll(thu_lb, ngay_lb);
                cacngay_hbox.getChildren().add(ngay_vbox);
            }

            ScrollPane cactang_spn = new ScrollPane();
            cactang_spn.setPrefSize(1110, 520);
            cactang_spn.setFitToWidth(true);
            cactang_spn.setLayoutX(10);
            cactang_spn.setLayoutY(50);
            cactang_spn.setStyle(
                    "-fx-border-color: #CBCBCB; "+
                            "-fx-border-width: 2 2 2 0; "
            );
            cactang_spn.getStylesheets().add(getClass().getResource("GUIOverview.css").toExternalForm());
            cactang_spn.setContent(loadFloors());

            Button btn = new Button("Sort by");
            btn.setLayoutX(10);
            btn.setLayoutY(10);
            btn.setStyle(
                "-fx-background-color: white; "+
                "-fx-pref-width: 105; "+
                "-fx-pref-height: 35; "+
                "-fx-border-color: #CBCBCB; "+
                "-fx-border-width: 1; "
            );
            btn.setOnAction((e) -> {
                cactang_spn.setContent(loadFloors());
                System.out.println("btn click");
            });
            lichphong_pn.getChildren().addAll(btn,cacngay_hbox, cactang_spn);

        root.getChildren().addAll(boloc_pn, lichphong_pn);
        
        gui = root;
    }
    
    private Parent loadFloors(){
        n++;
        VBox cactang_vbox = new VBox();
        cactang_vbox.setPrefWidth(1110);

        for (int i = 0; i < n+5; i++) {
            TitledPane tang_tpn = new TitledPane();
            tang_tpn.setPrefWidth(1110);
            tang_tpn.setText("Tầng " + String.valueOf(n));

            VBox cacphong_vbox = new VBox();
            cacphong_vbox.setPrefWidth(1110);
            cacphong_vbox.setPadding(Insets.EMPTY);
            for (int j = 0; j < n; j++) {
                Pane phong_pn = new Pane();
                phong_pn.setStyle(
                    "-fx-background-color: transparent; "+
                    "-fx-pref-width: 1110; "+
                    "-fx-pref-height: 50; "
                );
                    Label sophong_lb = new Label("Phòng 10"+ String.valueOf(n));
                    sophong_lb.setLayoutX(0);
                    sophong_lb.setLayoutY(0);
                    sophong_lb.setStyle(
                        "-fx-alignment: center; "+
                        "-fx-pref-width: 110; "+
                        "-fx-pref-height: 50; "+
                        "-fx-border-color: #CBCBCB; "+
                        "-fx-border-width: 1 2 1 2; "
                    );

                phong_pn.getChildren().addAll(sophong_lb);
                cacphong_vbox.getChildren().add(phong_pn);
            }

            tang_tpn.setContent(cacphong_vbox);
            cactang_vbox.getChildren().add(tang_tpn);

        }
        return cactang_vbox;
    }
}
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="class: GUI_HoatDong">
class GUI_HoatDong{
    
}
//</editor-fold>
