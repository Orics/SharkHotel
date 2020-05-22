/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.zNgocKhai.GUI;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author Orics
 */
public class GUIHomeReceptionistSchedule extends AnchorPane{

    private static int n = 0;
    
    public GUIHomeReceptionistSchedule(){
        
        this.setPrefSize(1130, 620);
        this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox wrapper = new VBox();
        wrapper.setPrefSize(1130, 620);
        wrapper.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        
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
            cacngay_hbox.setPrefSize(1000, 557);
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
                        "-fx-pref-height: 557; "+
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
                    "-fx-pref-height: 23; "
                );

                Label ngay_lb = new Label("12/05");
                ngay_lb.setStyle(
                    "-fx-background-color: rgba(0,0,0, 0.06); "+
                    "-fx-alignment: center; "+
                    "-fx-font: 12px \"Segoe UI\"; "+
                    "-fx-pref-width: 102; "+
                    "-fx-pref-height: 27; "+
                    "-fx-border-color: #CBCBCB; "+
                    "-fx-border-width: 0 0 2 0; "
                );
                ngay_vbox.getChildren().addAll(thu_lb, ngay_lb);
                cacngay_hbox.getChildren().add(ngay_vbox);
            }

            ScrollPane cactang_spn = new ScrollPane();
            cactang_spn.setPrefSize(1110, 507);
            cactang_spn.setFitToWidth(true);
            cactang_spn.setLayoutX(10);
            cactang_spn.setLayoutY(60);
            cactang_spn.setStyle(
                    "-fx-border-color: #CBCBCB; "+
                            "-fx-border-width: 2 2 2 0; "
            );
            cactang_spn.getStylesheets().add(getClass().getResource("../FX/FXHomeReceptionist.css").toExternalForm());
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

        wrapper.getChildren().addAll(boloc_pn, lichphong_pn);
        
        this.getChildren().add(wrapper);
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