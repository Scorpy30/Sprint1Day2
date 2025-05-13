public class DigitOnlyString {
    public static void main(String[] args) {
        String input1 = "1234557";
        //String input2 = "agg3457"; --> change to check
        boolean allDigits = true;

        for(int i=0; i < input1.length(); i++){
            if(!Character.isDigit(input1.charAt(i))){
                allDigits = false;
                break;
            }
        }

        if(allDigits){
            System.out.println("The string contains only digits");
        } else {
            System.out.println("The string contains non-digit characters");
        }
    }
}
