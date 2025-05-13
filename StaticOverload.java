public class StaticOverload {
    public static void greet(){
        System.out.println("Hello!");
    }

    public static void greet(String name) {
        System.out.println("Hello, "+name+"!");
    }

    public static void greet(String name, String id){
        System.out.println("Hello, "+name+"_"+id+"!!");
    }

    public static void main(String[] args){
        greet();
        greet("Tarush");
        greet("Tarush", "3210");
    }
}


