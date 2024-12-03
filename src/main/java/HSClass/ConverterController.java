package HSClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class ConverterController {
        @FXML
        public TextField txtValue = new TextField();
        @FXML
        public TextField txtNewValue = new TextField();
        @FXML
        public TextField txtNewUnit = new TextField();
        @FXML
        public Label lblValue = new Label();
        @FXML
        public Label lblUnit = new Label();
        @FXML
        public Label lblConvertTo = new Label();
        @FXML
        public Label lblNewValue = new Label();
        @FXML
        public Label lblNewUnit = new Label();
        @FXML
        public Button btnConvert = new Button();
        @FXML
        public Button btnReset = new Button();
        @FXML
        public ComboBox<String> EventType = new ComboBox<>();
        Converter converter = new Converter(0, 0, null, null);

        public void initialize(){
            EventType.getItems().addAll("km", "m");
        }

        public void onClickConvert(ActionEvent event) {
            try {
                int value = Integer.parseInt(txtValue.getText());
                String unit = EventType.getValue();

                converter.setValue(value);
                converter.setUnit(unit);

                // Perform conversion
                if ("km".equals(unit)) {
                    converter.convertKilo();
                } else if ("m".equals(unit)) {
                    converter.convertMeters();
                }

                // Update output fields
                txtNewValue.setText(String.valueOf(converter.getNewValue()));
                txtNewUnit.setText(converter.getNewUnit());

            } catch (NumberFormatException e) {
                txtNewValue.setText("Invalid input");
            }
        }
        public void onClickReset(ActionEvent event) {
            converter.clearFields();
            txtValue.clear();
            txtNewValue.clear();
            txtNewUnit.clear();
            EventType.setValue(null);
        }
    }

