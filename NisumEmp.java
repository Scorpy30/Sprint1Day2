class Nisum{
    String companyName = "Nisum Technologies";
    String location = "Bhubaneswar";
}

class Employee extends Nisum{
    String EmpName;
    int EmpID;

    public Employee(String EmpName, int EmpID){
        this.EmpName = EmpName;
        this.EmpID = EmpID;
    }

    public void display(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Location: "+location);
        System.out.println("Employee Name: "+EmpName);
        System.out.println("Employee ID:"+EmpID);
    }
}
public class NisumEmp {
    public static void main(String[] args){
        Employee emp = new Employee("Tarush", 3210);
        emp.display();
    }
}
