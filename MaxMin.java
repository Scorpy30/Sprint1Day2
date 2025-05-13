public class MaxMin {
    public static void main(String[] args) {
        int i1 = 27;
        int i2 = -45;
        double d1 = 84.6;
        double d2 = 0.45;

        //for integers
        int minInt = Math.min(i1, i2);
        int maxInt = Math.max(i1, i2);

        //for doubles
        double minDouble = Math.min(d1, d2);
        double maxDouble = Math.max(d1, d2);

        System.out.println("Minimum out of "+i1+" and "+i2+" is: "+minInt);
        System.out.println("Maximum out of "+i1+" and "+i2+" is: "+maxInt);
        System.out.println("Minimum out of "+d1+" and "+d2+" is: "+minDouble);
        System.out.println("Maximum out of "+d1+" and "+d2+" is: "+maxDouble);
    }
}
