package HSClass;

public class Converter {
    private int value;
    private int newValue;
    private String unit;
    private String newUnit;

    // Constructor
    public Converter(int value, int newValue, String unit, String newUnit) {
        this.value = value;
        this.newValue = newValue;
        this.unit = unit;
        this.newUnit = newUnit;
    }

    // Getter and Setter Methods
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNewUnit() {
        return newUnit;
    }

    public void setNewUnit(String newUnit) {
        this.newUnit = newUnit;
    }

    // Conversion Logic (example)
    public void convertKilo() {
        newValue = value * 1000;
        newUnit = "m";
    }

    public void convertMeters() {
        newValue = value / 1000;
        newUnit = "km";
    }
    public void clearFields() {
        value = 0;
        newValue = 0;
        unit = null;
        newUnit = null;
    }

    @Override
    public String toString() {
        return "New value: " + newValue + " " + newUnit;
    }
}

