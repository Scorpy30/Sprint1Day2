import java.util.*;

class Product {
    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return name + " " + category + " " + price;
    }
}

public class ProductSort {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Pen", "Stationery", 2.5));
        list.add(new Product("Notebook", "Stationery", 1.5));
        list.add(new Product("Milk", "Grocery", 1.2));
        list.add(new Product("Apple", "Grocery", 0.9));

        Collections.sort(list, new Comparator<Product>() {
            public int compare(Product a, Product b) {
                if (!a.category.equals(b.category)) {
                    return a.category.compareTo(b.category);
                } else {
                    return Double.compare(a.price, b.price);
                }
            }
        });

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
