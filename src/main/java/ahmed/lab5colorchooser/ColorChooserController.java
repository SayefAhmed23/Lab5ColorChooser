package ahmed.lab5colorchooser;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.converter.NumberStringConverter;

public class ColorChooserController {

    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;

    @FXML private TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;

    @FXML private Rectangle colorRectangle;

    @FXML
    private void initialize() {

        Bindings.bindBidirectional(redTextField.textProperty(), redSlider.valueProperty(), new NumberStringConverter());
        Bindings.bindBidirectional(greenTextField.textProperty(), greenSlider.valueProperty(), new NumberStringConverter());
        Bindings.bindBidirectional(blueTextField.textProperty(), blueSlider.valueProperty(), new NumberStringConverter());
        Bindings.bindBidirectional(alphaTextField.textProperty(), alphaSlider.valueProperty(), new NumberStringConverter());


        redSlider.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
        greenSlider.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
        blueSlider.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
        alphaSlider.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());


        redTextField.textProperty().addListener((obs, oldVal, newVal) -> updateColor());
        greenTextField.textProperty().addListener((obs, oldVal, newVal) -> updateColor());
        blueTextField.textProperty().addListener((obs, oldVal, newVal) -> updateColor());
        alphaTextField.textProperty().addListener((obs, oldVal, newVal) -> updateColor());


        updateColor();
    }

    private void updateColor() {
        try {
            double r = redSlider.getValue() / 255.0;
            double g = greenSlider.getValue() / 255.0;
            double b = blueSlider.getValue() / 255.0;
            double a = alphaSlider.getValue();

            colorRectangle.setFill(Color.color(r, g, b, a));
        } catch (NumberFormatException ex) {

        }
    }
}
