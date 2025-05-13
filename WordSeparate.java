public class WordSeparate {
    public static void main(String[] args) {
        String example = "This is an example sentence";
        String[] result = example.split(" ");
        System.out.println("The words of the sentence are: ");
        for (String s : result) {
            System.out.println(s);
        }
        
    }
}
