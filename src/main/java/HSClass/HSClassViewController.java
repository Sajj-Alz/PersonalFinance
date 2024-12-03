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
    @FXML TextField TFSem1Grade=new TextField();
    @FXML TextField TFSem2Grade=new TextField();
    @FXML TextField TFClassName=new TextField();
    @FXML TextField TFClassBlock=new TextField();
    @FXML TextField TFClassCode=new TextField();
    @FXML VBox VBClasses=new VBox();
    @FXML TextArea TAClassList=new TextArea();
    @FXML CheckBox CBSemester2True1;//=new CheckBox("Semester 2 True");
    @FXML CheckBox CBSemester1True1;//=new CheckBox("Semester 1 True");
    @FXML VBox VBLB = new VBox();
    @FXML VBox VBFill = new VBox();
    @FXML ImageView tKSLogoIMView;

    //InputStream stream = new FileInputStream("HSClass/images.png");
   // Image tKSLogo = new Image(stream);
    //ImageView tKSLogoIMView = new ImageView();
    ArrayList<HSClass> classList=new ArrayList<>();


    public HSClassViewController() throws FileNotFoundException {
        //Image tKSLogo = new Image("file:HSClass/images.png");
        //tKSLogoIMView.setImage(tKSLogo);
    }

    public void AddsSemester1Grade(ActionEvent actionEvent) {
        int firstGrade=Integer.parseInt(TFSem1Grade.getText());
    }

    public void AddsSemester2Grade(ActionEvent actionEvent) {
        int secondGrade=Integer.parseInt(TFSem2Grade.getText());
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
        int firstGrade=Integer.parseInt(TFSem1Grade.getText());
        int secondGrade=Integer.parseInt(TFSem2Grade.getText());
        if (CBSemester1True1.isSelected() == false) {
            firstGrade=0;}
        if (CBSemester2True1.isSelected() == false) {
            secondGrade=0;}
        String className=TFClassName.getText();
        char classBlock=TFClassBlock.getText().charAt(0);
        String classCode=TFClassCode.getText();
        boolean sem1True1=CBSemester1True1.isSelected();
        boolean sem2True2=CBSemester2True1.isSelected();
        //Create new objects based on inputs
        HSClass class1= new HSClass(sem1True1,firstGrade,sem2True2,secondGrade,className,classBlock,classCode);
        classList.add(class1);
        TFSem1Grade.clear();
        TFSem2Grade.clear();
        TFClassBlock.clear();
        TFClassCode.clear();
        TFClassName.clear();
        CBSemester1True1.setSelected(false);
        CBSemester2True1.setSelected(false);
    }
}
