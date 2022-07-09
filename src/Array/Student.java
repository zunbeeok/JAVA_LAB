package Array;

public class Student {
    int studentID;
    String name;

    public Student(){}

    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName(){
        return name;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void showStudentInfo(){
        System.out.println(studentID + " , " + name);
    }
}
