package HSClass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HSClassViewController {
    @FXML TextField TFFinalGrade =new TextField();
    @FXML TextField TFSem1Marks =new TextField();
    @FXML TextField TFSem2Marks =new TextField();
    @FXML TextField TFClassName=new TextField();
    @FXML TextField TFClassBlock=new TextField();
    @FXML TextField TFClassCode=new TextField();
    @FXML VBox VBClasses=new VBox();
    @FXML TextArea TAClassList=new TextArea();
    @FXML CheckBox CBSemester2True;//=new CheckBox("Semester 2 True");
    @FXML CheckBox CBSemester1True;//=new CheckBox("Semester 1 True");
    @FXML VBox VBLB = new VBox();
    @FXML VBox VBFill = new VBox();
    @FXML ImageView tKSLogoIMView;

    //InputStream stream = new FileInputStream("HSClass/images.png");
   // Image tKSLogo = new Image(stream);
    //ImageView tKSLogoIMView = new ImageView();
    ArrayList<HSClass> classList=new ArrayList<>();


    public HSClassViewController() throws FileNotFoundException {
        //Image tKSLogo = new Image("file:HSClass/images.png"); Commentation of method as image moved to resources folder
        //tKSLogoIMView.setImage(tKSLogo);
    }

    public void AddsSemester1Grade(ActionEvent actionEvent) {
        int firstGrade=Integer.parseInt(TFSem1Marks.getText());
    }

    public void AddsSemester2Grade(ActionEvent actionEvent) {
        int secondGrade=Integer.parseInt(TFSem2Marks.getText());
    }

    public void AddsClassName(ActionEvent actionEvent) {
        String className=TFClassName.getText();
    }

    public void AddsClassBlock(ActionEvent actionEvent) {
        String classBlock=TFClassBlock.getText();
    }

    public void AddsClassCode(ActionEvent actionEvent) {
        String classCode=TFClassCode.getText();
    }

    public void ShowsClasses (ActionEvent actionEvent) {
        String result =classList.toString();
        TAClassList.setText(result);
    }

    public void CreatesClass(ActionEvent actionEvent) {
        int firstGrade;
        int secondGrade;
        // only declared variables to avoid previous errors found in the
        // trial and error testing found in the combined decleration and assignment
        // of firstGrade and sceondGrade if one is deselected
        try {
            firstGrade = Integer.parseInt(TFSem1Marks.getText());
        } catch (NumberFormatException e) {
            // Handle invalid input for Semester 1 Grade
            firstGrade=0;
            return;
        }

        try {
            secondGrade = Integer.parseInt(TFSem2Marks.getText());
        } catch (NumberFormatException e) {
            // Handle invalid input for Semester 2 Grade
            secondGrade=0;
            return;
        }
        String className=TFClassName.getText();
        char classBlockLowerCase=TFClassBlock.getText().charAt(0);
        char classBlockUpperCase= Character.toUpperCase(classBlockLowerCase); // ensures class block will be upper case
        String classCode=TFClassCode.getText();
        boolean sem1True1=CBSemester1True.isSelected();
        boolean sem2True2=CBSemester2True.isSelected();
        //Create new objects based on inputs
        HSClass class1= new HSClass(sem1True1,firstGrade,sem2True2,secondGrade,className,classBlockUpperCase,classCode);
        class1.setClassFinalGrade(Integer.parseInt(TFFinalGrade.getText())); // Brute Forcing solution since there is no time to fix it
        classList.add(class1);
        TFSem1Marks.clear();
        TFSem2Marks.clear();
        TFClassBlock.clear();
        TFClassCode.clear();
        TFClassName.clear();
        TFFinalGrade.clear();
        CBSemester1True.setSelected(false);
        CBSemester2True.setSelected(false);
    }

    public void SetsFinalGrade(ActionEvent actionEvent) {
        final int finalGrade=Integer.parseInt(TFFinalGrade.getText());
    }

    public void ClearsEverything(ActionEvent actionEvent) {
        classList.clear();
        TAClassList.clear();
        CBSemester1True.setSelected(false);
        CBSemester2True.setSelected(false);
        TFSem1Marks.clear();
        TFSem2Marks.clear();
        TFClassBlock.clear();
        TFClassCode.clear();
        TFClassName.clear();
        TFFinalGrade.clear();
    } // Clear Function without closing application
}
