package sharkhotel.zNgocKhai.FX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sharkhotel.zNgocKhai.DLL.DLLLogin;
import sharkhotel.zNgocKhai.DTO.DTOEmployee;
import sharkhotel.zNgocKhai.GUI.GUIHome;


public class FXLogin implements Initializable{
    
    @FXML
    private Button exitButton;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private Button loginButton;
    @FXML
    private Label notifycationLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initEvents();
    }    
    
    
    private void initEvents(){
        
        exitButton.setOnAction((e) -> {
            ((Stage)(((Button)e.getSource()).getScene().getWindow())).close();
        });
        
        passwordPasswordField.setOnAction((e)->{
            String manv = usernameTextField.getText();
            String matkhau = passwordPasswordField.getText();
            DTOEmployee nv = DLLLogin.Login(manv, matkhau);
            if(nv != null){
                new GUIHome(nv).show();
                ((Stage)(((PasswordField)e.getSource()).getScene().getWindow())).close();
            }
            notifycationLabel.setText(DLLLogin.ThongBao);
        });
        
        loginButton.setOnAction((e)->{
            String manv = usernameTextField.getText();
            String matkhau = passwordPasswordField.getText();
            DTOEmployee nv = DLLLogin.Login(manv, matkhau);
            if(nv != null){
                new GUIHome(nv).show();
                ((Stage)(((PasswordField)e.getSource()).getScene().getWindow())).close();
            }
            notifycationLabel.setText(DLLLogin.ThongBao);
        });
    }
}
