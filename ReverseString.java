public class ReverseString {
    public static void main(String[] args) {
        String example = "example string";
        StringBuffer sb = new StringBuffer(example);

        sb.reverse();
        String reversed = sb.toString();
        System.out.println("Reversed String : "+reversed);
    }
}
