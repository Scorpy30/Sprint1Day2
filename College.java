public class College {
    String collegeName;
    String location;

    public College(String collegeName, String location){
        this.collegeName = collegeName;
        this.location = location;
    }

    public void displayCollegeInfo(){
        System.out.println("College Name: "+collegeName);
        System.out.println("College Location:" + location);
    }
}

class Student {
    String name;
    int roll;

    private int subject1;
    private int subject2;
    private int subject3;

    public Student(String name, int roll, int subject1, int subject2, int subject3){
        this.name = name;
        this.roll = roll;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public void displayStudentInfo(){
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number: "+roll);
    }
    public void MarksInfo(){
        int total = subject1 + subject2 + subject3;
        double average = total/3.0;
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+average);
    }
}
class Main{
    public static void main(String[] args){
        College college = new College("KIIT", "Odisha");
        Student student = new Student("Tarush", 3210, 95, 99, 90);

        System.out.println("<----- College Information ----->");
        college.displayCollegeInfo();

        System.out.println("\n<----- Student Information ----->");
        student.displayStudentInfo();
        student.MarksInfo();
    }
}