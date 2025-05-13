public class StaticAccess {
    int instanceVar = 21;

    public static void staticMethod(){
        // System.out.println(instanceVar); --> results in error since no direct access

        StaticAccess obj = new StaticAccess();
        System.out.println("use object to access instance variable from method static: "+obj.instanceVar);
    }

    public static void main(String[] args){
        staticMethod();
    }
}
