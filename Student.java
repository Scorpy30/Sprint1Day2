public class Student {
    String name;
    String address;
    String section;
    String className;

    static String college = "KIIT";
    static int rollCounter = 3210;
    int roll_no;

    public Student(String name, String address, String section, String className){
        this.name = name;
        this.address = address;
        this.section = section;
        this.className = className;
        this.roll_no = rollCounter++;
    }

    public void displayInfo(){
        System.out.println("Name     :"+name);
        System.out.println("Address  :"+address);
        System.out.println("Section  :"+section);
        System.out.println("Class    :"+className);
        System.out.println("College  :"+className);
        System.out.println("Roll No  :"+roll_no);
        System.out.println("--------------------");
    }

    public static void main(String[] args){
        Student s1 = new Student("Tarush", "Bokaro", "B", "CSE");
        Student s2 = new Student("Soham", "Kolkata", "B", "CSE");

        s1.displayInfo();
        s2.displayInfo();
    }
}
