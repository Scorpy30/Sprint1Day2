import java.util.Scanner;

public class CharacterAtIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        System.out.print("Enter an Index: ");
        int index = sc.nextInt();

        if(index >=0 && index < input.length()){
            char result = input.charAt(index);
            System.out.println("The character at Index "+index+" of the given string is :"+result);
        } else {
            System.out.println("Invalid Index");
        }
    }
}