class Parent{
    public static void display(){
        System.out.println("This is Parent Static Method");
    }
}
public class Child extends Parent {
    public static void main(String[] args) {
        Parent.display();

        display(); // inherited from Parent
    }
}
