import java.util.Scanner;
public class UserProfile {
    String name;
    int age;
    int roll;
    String email;
    String phone;

    public UserProfile(String name, int age, int roll, String email, String phone){
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.email = email;
        this.phone = phone;
    }

    public void printUser(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Roll: "+this.roll);
        System.out.println("Email: "+this.email);
        System.out.println("Phone: "+this.phone);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user name: ");
        String name = sc.nextLine();

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        System.out.print("Enter the roll no.: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the email: ");
        String email = sc.nextLine();

        System.out.print("Enter the phone number: ");
        String phone = sc.nextLine();


        UserProfile user = new UserProfile(name, age, roll, email, phone);

        System.out.println("\nUser Profile");
        user.printUser();
    }
}
