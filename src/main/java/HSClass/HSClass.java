package HSClass;

import java.util.ArrayList;


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
        if (this.semester1Marks==0){
            setSemester1(false);
        }
        this.semester2 = semester2;
        this.semester2Marks = semester2Marks;
        if (this.semester2Marks==0){
            setSemester2(false);
        }
        this.className = className;
        this.classNum = 0;

        if (semester1) {
            this.semester1Grade= (int)((semester1Marks/4)+0.5);
            if (this.semester1Grade>7) {
                this.semester1Grade=7;
            }
        }
        else {
            this.semester1Grade = 0;
        }
        if (semester2) {
            this.semester2Grade= (int)((semester2Marks/4)+0.5);
            if (this.semester2Grade>7) {
                this.semester2Grade=7;
            }
        }
        else {
            this.semester2Grade = 0;
        }
        this.classBlock = block;
        this.classCode = classCode;
        this.classFinalGrade = 0;
        if ((semester1) && (semester2)) { //Correction in use of boolean statement within selection
            int x= (semester1Marks+semester2Marks);
                if ((2<=x) && (x<=10)) this.classFinalGrade=1;
                else if ((11<=x) && (x<=18)) this.classFinalGrade=2;
                else if ((19<=x) && (x<=28)) this.classFinalGrade=3;
                else if ((29<=x) && (x<=36)) this.classFinalGrade=4;
                else if ((37<=x) && (x<=46)) this.classFinalGrade=5;
                else if ((47<=x) && (x<=54)) this.classFinalGrade=6;
                else if ((55<=x) && (x<=64)) this.classFinalGrade=7;
            }
        else if (!semester2) { //Correction in use of boolean statement within selection
             // only using this method because I know it works and despite corrections to previous it would not work as expected
            if ((1<=semester1Marks) && (semester1Marks<=5)) this.classFinalGrade=1;
            else if ((6<=semester1Marks) && (semester1Marks<=9)) this.classFinalGrade=2;
            else if ((10<=semester1Marks) && (semester1Marks<=14))this.classFinalGrade=3;
            else if ((15<=semester1Marks) && (semester1Marks<=18)) this.classFinalGrade=4;
            else if ((19<=semester1Marks) && (semester1Marks<=23))this.classFinalGrade=5;
            else if ((24<=semester1Marks) && (semester1Marks<=27)) this.classFinalGrade=6;
            else if ((55<=semester1Marks) && (semester1Marks<=32))this.classFinalGrade=7;
        }
        else if (!semester1) { //Correction in use of boolean statement within selection
             // only using this method because I know it works and despite corrections to previous it would not work as expected
            if ((1<=semester2Marks) && (semester2Marks<=5)) this.classFinalGrade=1;
            else if ((6<=semester2Marks) && (semester2Marks<=9)) this.classFinalGrade=2;
            else if ((10<=semester2Marks) && (semester2Marks<=14)) this.classFinalGrade=3;
            else if ((15<=semester2Marks) && (semester2Marks<=18)) this.classFinalGrade=4;
            else if ((19<=semester2Marks) && (semester2Marks<=23)) this.classFinalGrade=5;
            else if ((24<=semester2Marks) && (semester2Marks<=27)) this.classFinalGrade=6;
            else if ((28<=semester2Marks) && (semester2Marks<=32)) this.classFinalGrade=7;
        }
        classNum++;
        classList.add(this);

    }

    public boolean isSemester1() {
        return semester1;
    }

    public void setSemester1(boolean semester1) {
        this.semester1 = semester1;
    }

    public boolean isSemester2() {
        return semester2;
    }

    public void setSemester2(boolean semester2) {
        this.semester2 = semester2;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static int getClassNum() {
        return classNum;
    }

    public static void setClassNum(int classNum) {
        HSClass.classNum = classNum;
    }

    public int getSemester1Grade() {
        return semester1Grade;
    }

    public void setSemester1Grade(int semester1Grade) {
        this.semester1Grade = semester1Grade;
    }

    public int getSemester2Grade() {
        return semester2Grade;
    }

    public void setSemester2Grade(int semester2Grade) {
        this.semester2Grade = semester2Grade;
    }

    public int getSemester1Marks() {
        return semester1Marks;
    }

    public void setSemester1Marks(int semester1Marks) {
        this.semester1Marks = semester1Marks;
    }

    public int getSemester2Marks() {
        return semester2Marks;
    }

    public void setSemester2Marks(int semester2Marks) {
        this.semester2Marks = semester2Marks;
    }

    public char getClassBlock() {
        return classBlock;
    }

    public void setClassBlock(char classBlock) {
        this.classBlock = classBlock;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public int getClassFinalGrade() {
        return classFinalGrade;
    }

    public void setClassFinalGrade(int classFinalGrade) {
        this.classFinalGrade = classFinalGrade;
    }
    @Override
    public String toString(){
        int x = classList.size();
        String n="Class Name: "+this.className;
        n=n+", "+"Class Block: "+this.classBlock;
        n=n+", "+"Class Code: "+this.classCode;
        n=n+", "+"Semester 1 Taken?: "+this.semester1; // Change in ordering due sensible order being class attributes then score IMO
        n=n+", "+"Semester 1 Grade: "+this.semester1Grade;
        n=n+", "+"Semester 1 Marks: "+this.semester1Marks;
        n=n+", "+"Semester 2 Taken?: "+this.semester2;
        n=n+", "+"Semester 2 Marks: "+this.semester2Marks;
        n=n+", "+"Semester 2 Grade: "+this.semester2Grade;
        n=n+", "+"Final Grade: "+this.classFinalGrade;
        n=n+",Class Number: "+(x);
        return n;
    }
}
