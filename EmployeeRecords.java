import java.util.*;
class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString(){
        return "ID: "+id+", Name: "+name+", Depatment: "+department+", Salary: "+salary;
    }
}

public  class EmployeeRecords{
    TreeSet<Employee> emp;

    public EmployeeRecords() {
        emp = new TreeSet<>(new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2){
                int nameComp = e1.name.compareToIgnoreCase(e2.name);
                if(nameComp != 0) {
                    return nameComp;
                } else {
                    return Integer.compare(e1.id, e2.id);
                }
            }
        });
    }

    public void addEmployee(Employee e){
        if(emp.add(e)){
            System.out.println("Employee added");
        } else {
            System.out.println("Employee already exists");
        }
    }

    public void viewEmployee() {
        if(emp.isEmpty()){
            System.out.println("No employee record");
        } else {
            System.out.println("Employee Records: ");
            for(Employee e : emp){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeRecords record = new EmployeeRecords();
        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("\nEmployee Record System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    Employee e = new Employee(id, name, dept, salary);
                    record.addEmployee(e);
                    break;

                case 2:
                    record.viewEmployee();
                    break;

                case 3:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 3);
    }
}