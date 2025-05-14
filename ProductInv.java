import java.util.HashMap;
import java.util.Scanner;

public class ProductInv{
    HashMap<String, Integer> inventory;

    public ProductInv(){
        inventory = new HashMap<>();
    }

    public void addProduct(String name, int quantity){
        if(inventory.containsKey(name)){
            System.out.println("Product already exists. Use update instead.");
        } else {
            inventory.put(name, quantity);
            System.out.println("Product added to inventory");
        }
    }

    public void updateProduct(String name, int quantity){
        if(inventory.containsKey(name)){
            inventory.put(name, quantity);
            System.out.println("Product quantity updated");
        } else {
            System.out.println("Add first to update.");
        }
    }

    public void removeProduct(String name){
        if(inventory.containsKey(name)){
            inventory.remove(name);
            System.out.println("Product removed successfully");
        } else {
            System.out.println("The product does not exists in the inventory");
        }
    }

    public void checkStock(String name) {
        if(inventory.containsKey(name)){
            int stock = inventory.get(name);
            if(stock > 0){
                System.out.println("Existing stock of "+name+": "+stock);
            } else {
                System.out.println("Product is Out of stock");
            }
            
        } else {
            System.out.println("Item does not exist in inventory");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (String name : inventory.keySet()) {
                System.out.println(name + ": " + inventory.get(name));
            }
        }
    }

    public static void main(String[] args) {

        ProductInv pi = new ProductInv();
        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("\nMenu:");
            System.out.println("1. Add New Product");
            System.out.println("2. Update Product Quantity");
            System.out.println("3: Remove an Existing Product");
            System.out.println("4: Stock of a Product");
            System.out.println("5: Display the Inventory");
            System.out.println("6: Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Product");
                    String name = sc.nextLine();
                    System.out.println("Enter its quantity");
                    int quantity = sc.nextInt();
                    pi.addProduct(name, quantity);
                    break;

                case 2:
                    System.out.println("Enter Product whose details to be updated");
                    String Pname = sc.nextLine();
                    System.out.println("Enter its new quantity");
                    int new_quantity = sc.nextInt();
                    pi.updateProduct(Pname, new_quantity);
                    break;
                
                case 3:
                    System.out.println("Enter name of product to remove");
                    String remove = sc.nextLine();
                    pi.removeProduct(remove);
                    break;

                case 4:
                    System.out.println("Enter name of product to check stock");
                    String stockString = sc.nextLine();
                    pi.checkStock(stockString);
                    break;

                case 5:
                    pi.displayInventory();
                    break;

                case 6:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}
