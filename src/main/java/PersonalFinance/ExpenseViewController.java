package PersonalFinance;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;

public class ExpenseViewController {
    //@FXML
    @FXML Label LBTotalExpensesLabel=new Label("Total Expenses");
    //@FXML
    @FXML TextArea TAExpenseList= new TextArea();
    //@FXML
    @FXML DatePicker DPDatePicker = new DatePicker();
    //@FXML
    @FXML TextField TFDescription = new TextField();
    //@FXML
    @FXML TextField TFCategory = new TextField();
    //@FXML
    @FXML TextField TFValue= new TextField();
    public void PicksExpenseDate(ActionEvent actionEvent) {
        LocalDate td=DPDatePicker.getValue();
    }

    public void AddsExpense(ActionEvent actionEvent) {
        // read values from input
        LocalDate td=DPDatePicker.getValue();
        String description=TFDescription.getText();
        String category=TFCategory.getText();
        double value=Double.parseDouble(TFValue.getText());
        //Create new objects based on inputs
        Expense t1= new Expense(description,value,category,td);
        TAExpenseList.setText(TAExpenseList.getText()+t1.toString());
        TAExpenseList.setText("Total Expenses: " + Expense.getTotalExpenses());

    }

    public void SetsExpense(ActionEvent actionEvent) {
        LocalDate td=DPDatePicker.getValue();
        String description=TFDescription.getText();
        String category=TFCategory.getText();
        double value=Double.parseDouble(TFValue.getText());
        //Create new objects based on inputs
        Expense e1= new Expense(description,value,category,td);
        e1.addToTotalExpenses();
    }
}
