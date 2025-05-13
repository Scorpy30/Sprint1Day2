import java.util.Scanner;
public class ECart {
    String itemName;
    double itemValue;
    int itemId;

    public void printItem() {
        System.out.println("Item ID: "+itemId);
        System.out.println("Item Name: "+itemName);
        System.out.println("Item Value: "+itemValue);
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Number of items to be added in cart: ");
        int itemCount = sc.nextInt();
        sc.nextLine();

        ECart[] cart = new ECart[itemCount];
        int validItems = 0;
        double orderTotal = 0;

        for(int i=0; i < itemCount; i++){
            System.out.println("\nEnter details for item "+(i+1));

            System.out.print("Item ID(+ve integer): ");
            int itemId = sc.nextInt();
            sc.nextLine();

            System.out.print("Item Name(non-empty): ");
            String itemName = sc.nextLine();

            System.out.print("Item Value (+ve number): ");
            double itemValue = sc.nextDouble();
            sc.nextLine();

            if(itemId <= 0 || itemName.isBlank() || itemValue <= 0){
                System.out.println("Invalid item details. Skipped.");
                continue;
            }

            ECart item = new ECart();
            item.itemId = itemId;
            item.itemName = itemName;
            item.itemValue = itemValue;

            cart[validItems] = item;
            orderTotal += itemValue;
            validItems++;
        }
        
        System.out.println("\n------ ORDER SUMMARY ------");
        for(int i = 0; i< validItems; i++){
            cart[i].printItem();
        }
        System.out.println("Toral Items: " + validItems);
        System.out.println("Order Total: "+orderTotal);
    }
}