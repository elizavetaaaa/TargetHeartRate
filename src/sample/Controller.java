package sample;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button calculateButton;

    @FXML
    private TextField ageTextField;

    @FXML
    public TextField maxHeartRateEntry;

    @FXML
    private TextField targetHeartRateEntry;





        private void initialize() {
            ageTextField.setDisable(true);
            maxHeartRateEntry.setDisable(true);
            targetHeartRateEntry.setDisable(true);
            //maxHeartRateEntry.setEditable(false);
    }


    @FXML
    void action(ActionEvent event) {
        try{
            Double age  = new Double(ageTextField.getText());
            //находим max rate
            Double max = (220 - age);
            int roundOff = max.intValue();
            maxHeartRateEntry.setText(Integer.toString(roundOff));
            //находим область возможного target rate
            Double mintar = new Double(0.5*max);
            int mintar1 = mintar.intValue();


            Double maxtar = new Double(0.85*max);
            //Double average = ((maxtar+mintar)/2);
            int maxtar1 = maxtar.intValue();

            targetHeartRateEntry.setText(Integer.toString(mintar1)+ "-" + Integer.toString(maxtar1));


        }
        catch (NumberFormatException ex) {
            ageTextField.setText("Not a number!");
            ageTextField.selectAll();
            ageTextField.requestFocus();
        }

}}
