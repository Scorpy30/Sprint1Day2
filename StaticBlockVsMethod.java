public class StaticBlockVsMethod{
    static{
        System.out.println("Static Block is ON");
    }

    public static void staticMethod(){
        System.out.println("Static Method is HERE");
    }

    public static void main(String[] args){
        System.out.println("Main method ON");
        staticMethod();
    }
} //static block runs first very clearly