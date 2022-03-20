package my.project;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import my.project.model.Model;
import my.project.view.ViewController;
import my.project.viewmodel.ViewModel;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("OutputGui.fxml"));
        Parent root = fxmlLoader.load();
        ViewController viewController = fxmlLoader.getController();
        Model model= new  Model();
        viewController.init(new ViewModel(model));
        Scene scene = new Scene(root);
        stage.setTitle("Currency rates");
        stage.setScene(scene);
        stage.show();
    }
}