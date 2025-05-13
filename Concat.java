import java.lang.*;
import java.util.Scanner;
public class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "Given String";
        
        System.out.println("Enter the another string: ");
        String str2 = sc.nextLine();

        System.out.print("After concatenation : ");
        System.out.println(str2.concat(str1));
    }
    
}
