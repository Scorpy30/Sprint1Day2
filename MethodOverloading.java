public class MethodOverloading {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        MethodOverloading over = new MethodOverloading();
        System.out.println(over.add(3,5));
        System.out.println(over.add(3, 5, 7));
        System.out.println(over.add(4.6, 6.42));
        
    }
    
}
