package Array;

public class StudentArray {
    public static void main(String[] args){
        Student[] school = new Student[5];

        school[0] = new Student(1001, "김민정");
        school[1] = new Student(1002,"최준홍");
        school[2] = new Student(1003,"류종범");
        school[3] = new Student(1004,"강기모");
        school[4] = new Student(1005,"정우현");

        for(int i = 0; i<school.length; i++){
            school[i].showStudentInfo();
        }
    }
}
