/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class schoolmanagement extends Application{
    
    public void start(Stage stage) throws Exception{
        Parent  root=FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("school management system");
        stage.show();
        
    }
    public static void main(String[] args){
        launch(args);
    }
    
}