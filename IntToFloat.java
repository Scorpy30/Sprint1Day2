
import java.util.Scanner;

public class IntToFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        float result = Float.parseFloat(str);

        System.out.println(result);
    }
}
