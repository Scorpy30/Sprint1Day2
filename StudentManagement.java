import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    double grade;
    
    public Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentManagement{
    ArrayList<Student> students;

    public StudentManagement(){
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name, double grade){
        students.add(new Student(id, name, grade));
        System.out.println("Student added");
    }

    public void removeStudent(int id) {
        boolean removed = false;
        for(int i=0; i<students.size(); i++){
            if(students.get(i).id == id) {
                students.remove(i);
                removed = true;
                System.out.println("Student removed");
                break;
            }
        }
        if(!removed) {
            System.out.println("Student with ID "+ id + "not found");
        }
    }

    public void searchStudent(int id){
        for(Student s : students) {
            if(s.id == id){
                System.out.println("Student found: "+s);
            return;
            }
        }
        System.out.println("Student with ID "+ id + "not found");
    }

    public void displayAllStudents(){
        if(students.isEmpty()){
            System.out.println("No student in the list");
        } else {
            System.out.println("Students list:");
            for(Student s : students){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement S = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        int choice;

        do { 
            System.out.println("\nStudent Management Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Display all Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice){
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student grade: ");
                    double grade = sc.nextDouble();
                    S.addStudent(id, name, grade);
                    break;
                case 2:
                    System.out.print("Enter student ID to remove: ");
                    int remove = sc.nextInt();
                    S.removeStudent(remove);
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    int searchID = sc.nextInt();
                    S.searchStudent(searchID);
                    break;
                case 4:
                    S.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }
}