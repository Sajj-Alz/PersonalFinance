package HSClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HSClass {
    private boolean semester1;
    private boolean semester2;
    private String className;
    private static int classNum;
    private int semester1Grade;
    private int semester2Grade;
    private int semester1Marks;
    private int semester2Marks;
    private char classBlock;
    private String classCode;
    private int classFinalGrade;
    ArrayList<HSClass> classList=new ArrayList<>();
    public HSClass(boolean semester1, int semester1Marks, boolean semester2, int semester2Marks, String className, char block, String classCode) {
        this.semester1 = semester1;
        this.semester1Marks = semester1Marks;
        this.semester2 = semester2;
        this.semester2Marks = semester2Marks;
        this.className = className;
        this.classNum = 0;

        if (semester1 == true) {
            this.semester1Grade= (int)((this.semester1Marks/4)+0.5);
            if (this.semester1Grade>7) {
                this.semester1Grade=7;
            }
        } else {
            this.semester1Grade = 0;
        }
        if (semester2 == true) {
            this.semester2Grade= (int)((this.semester2Marks/4)+0.5);
            if (this.semester2Grade>7) {
                this.semester2Grade=7;
            }
        }
        else {
            this.semester2Grade = 0;
        }
        this.classBlock = block;
        this.classCode = classCode;
        if (semester1 == true && semester2 == true) {
            int x= (semester1Marks+semester2Marks);
                if (2<=x && x<10) this.classFinalGrade=1;
                else if (11<=x && x<18) this.classFinalGrade=2;
                else if (19<=x && x<28)this.classFinalGrade=3;
                else if (29<=x && x<36) this.classFinalGrade=4;
                else if (37<=x && x<46)this.classFinalGrade=5;
                else if (47<=x && x<54) this.classFinalGrade=6;
                else if (55<=x && x<64)this.classFinalGrade=7;
            }
        else if (semester1 == true && semester2 == false) {
            this.classFinalGrade = (semester1Grade);
        }
        else if (semester1 == false && semester2 == true) {
            this.classFinalGrade = (semester2Grade);
        }
        else{
            this.classFinalGrade = 0;
        }
        classNum++;
        classList.add(this);

    }
    public String toString(){
        int x = classList.size()+1;
        String n="Semester 1 Taken?: "+this.semester1;
        n=n+", "+"Semester 1 Grade: "+this.semester1Grade;
        n=n+", "+"Semester 1 Marks: "+this.semester1Marks;
        n=n+", "+"Semester 2 Taken?: "+this.semester2;
        n=n+", "+"Semester 2 Marks: "+this.semester2Marks;
        n=n+", "+"Semester 2 Grade: "+this.semester2Grade;
        n=n+", "+"Class Name: "+this.className;
        n=n+", "+"Class Block: "+this.classBlock;
        n=n+", "+"Class Code: "+this.classCode;
        n=n+", "+"Final Grade: "+this.classFinalGrade;
        n=n+",Class Number: "+(x);
        return n;
    }
}
