import java.util.HashSet;
import java.util.Scanner;

public class DuplicateEmailRemover {
    HashSet<String> emailSet;

    public DuplicateEmailRemover(){
        emailSet = new HashSet<>();
    }

    public void addEmail(String email){
        if(emailSet.add(email.toLowerCase())) {
            System.out.println("Email Added");
        } else {
            System.out.println("Email already exists");
        }
    }

    public void displayEmails(){
        if(emailSet.isEmpty()) {
            System.out.println("No emails to display");
        } else {
            System.out.println("Unique emails are:");
            for(String email : emailSet) {
                System.out.println(email);
            }
        }
    }

    public static void main(String[] args) {
        DuplicateEmailRemover remover = new DuplicateEmailRemover();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Add email");
            System.out.println("2. Display Unique Emails");
            System.out.println("3: Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice){
                case 1:
                    System.out.print("Enter Email:");
                    String email = sc.nextLine();
                    remover.addEmail(email);
                    break;

                case 2:
                    remover.displayEmails();
                    break;

                case 3:
                    System.out.println("Exiting");
                    break;
                
                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice != 3);
    }
}
