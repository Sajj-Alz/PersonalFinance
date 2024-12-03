package PersonalFinance;

import java.time.LocalDate;

public class Expense {
    private double value;
    private String description;
    private String category;
    private LocalDate expenseDate;
    private static int totalExpenseCount = 0;
    private static double totalExpenses = 0;

    public Expense(String description, double value, String category, LocalDate expenseDate) {
        this.description = description;
        this.value = value;
        this.category = category;
        this.expenseDate = expenseDate;
        totalExpenseCount++;
    }
    public void addToTotalExpenses(){
        totalExpenses=totalExpenses+this.value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }
    public static double getTotalExpenses() {
        return totalExpenses;
    }
    public String toString() {
        String x=expenseDate+"\t "+description + "\t $"+value+"\t "+category+"\n";
        return x;
    }
}