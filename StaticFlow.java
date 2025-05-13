public class StaticFlow {
    static int num = initialize();

    static{
        System.out.println("Static block ON");
    }

    public static int initialize(){
        System.out.println("Static variable 'num' is initialized");
        return 10;
    }

    public static void staticMethod(){
        System.out.println("Static Method Run");
    }

    public static void main(String[] args){
        System.out.println("Main is ON");
        staticMethod();
    }
}
