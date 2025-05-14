import java.util.ArrayList;
import java.util.Scanner;

class Item{
    String name;
    double price;
    int quantity;
    
    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return price * quantity;
    }

    public String toString(){
        return name + " -$" + price + " x "+ quantity + " =$"+getTotalPrice();
    }
}

public class ShoppingCart{
    ArrayList<Item> cart;
    public ShoppingCart(){
        cart = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        cart.add(new Item(name, price, quantity));
        System.out.println("Item added to cart");
    }

    public void removeItem(String name) {
        boolean removed = false;
        for(int i=0; i<cart.size(); i++){
            if(cart.get(i).name.equalsIgnoreCase(name)) {
                cart.remove(i);
                removed = true;
                System.out.println("Item removed from cart");
                break;
            }
        }
        if(!removed) {
            System.out.println("Item not found in the cart");
        }
    }

    public void viewCart(){
        if(cart.isEmpty()){
            System.out.println("Your cart is empty");
        } else {
            System.out.println("Items in your cart:");
            for(Item item : cart){
                System.out.println(item);
            }
        }
    }

    public void calculateTotal(){
        double total = 0;
        for(Item item : cart) {
            total += item.getTotalPrice();
        }
        System.out.printf("Total Price: $%.2f\n", total);
    }

    public static void main(String[] args) {
        ShoppingCart sCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        int choice;

        do { 
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice){
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the item Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = sc.nextInt();
                    sCart.addItem(name, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String remove = sc.nextLine();
                    sCart.removeItem(remove);
                    break;
                case 3:
                    sCart.viewCart();
                    break;
                case 4:
                    sCart.calculateTotal();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }
}