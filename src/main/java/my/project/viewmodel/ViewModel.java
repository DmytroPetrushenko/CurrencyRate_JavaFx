package my.project.viewmodel;

import java.util.Set;
import javafx.beans.property.StringProperty;
import javafx.scene.text.Text;
import my.project.model.Model;

public class ViewModel {
    private final Text text = new Text();
    private final Text textTimeStamp = new Text();
    private final Model model;

    public ViewModel(Model model) {
        this.model = model;
    }

    public Set<String> getRatesNameSet() {
        return model.getRatesNameSet();
    }

    public StringProperty getTextOutput() {
        return text.textProperty();
    }

    public StringProperty getTextTimeStampOutput() {
        return textTimeStamp.textProperty();
    }

    public void handleButton(String value) {
        text.setText(model.getTextData(value));
        textTimeStamp.setText(model.getTextTimeStampData() );
    }
}
