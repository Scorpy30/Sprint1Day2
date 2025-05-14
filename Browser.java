import java.util.Scanner;
import java.util.Stack;

public class Browser{
    Stack<String> history = new Stack<>();

    void visit(String url){
        history.push(url);
        System.out.println("Visited: "+url);
    }

    void back(){
        if(history.size() > 1){
            String last = history.pop();
            System.out.println("Last visited site: "+last);
        } else {
            System.out.println("Start Browsing to create history");
        }
    }

    void currentPage(){
        if(!history.isEmpty()){
            System.out.println("Current page: "+history.peek());
        } else {
            System.out.println("No pages visited yet");
        }
    }

    void showHistory() {
        if(history.isEmpty()) {
            System.out.println("History is empty");
        } else {
            System.out.println("Browsing History: ");
            for(int i = 0; i < history.size(); i++){
                System.out.println((i + 1) + " . " + history.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Browser browse = new Browser();
        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("\nStack Menu:");
            System.out.println("1. Visit Page");
            System.out.println("2. Back to Previous Site");
            System.out.println("3. View Current Page");
            System.out.println("4. View History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the website");
                    String site = sc.nextLine();
                    browse.visit(site);
                    break;

                case 2:
                    browse.back();
                    break;

                case 3:
                    browse.currentPage();
                    break;
                
                case 4:
                    browse.showHistory();
                    break;
                
                case 5:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

    }
}