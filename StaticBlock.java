public class StaticBlock {
    static int a;
    static String message;

    static{
        System.out.println("Static block on.");
        a = 10;
        message = "static power!";
    }

    public static void main(String[] args){
        System.out.println("Main is on");
        System.out.println("Value of a: "+a);
        System.out.println("Message: "+message);
    }

}
