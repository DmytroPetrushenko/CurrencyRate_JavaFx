package my.project.view;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import my.project.viewmodel.ViewModel;

import java.util.List;

public class ViewController{
    @FXML
    Button button;
    @FXML
    Text text = new Text();
    @FXML
    Text textTimeStamp = new Text();
    @FXML
    ChoiceBox<String> choiceBox;

    private ViewModel viewModel;


    @FXML
    private void handleButton() {
        viewModel.handleButton(choiceBox.getValue());


    }

    @FXML
    private void handleChoiceBox() {
    }

    public void init(ViewModel viewModel) {
        this.viewModel = viewModel;
        text.textProperty().bind(viewModel.getTextOutput());
        textTimeStamp.textProperty().bind(viewModel.getTextTimeStampOutput());
        choiceBox.setItems(FXCollections.observableList(List.copyOf(viewModel.getRatesNameSet())));
    }


}