public class RemoveSpaces {
    public static void main(String[] args) {
        String input = "This  is   an example   sentence nothing more";

        String modified = input.replaceAll(" +"," ");
        System.out.println("Original : "+input);
        System.out.println("After removing Multiple Spaces : "+modified);
    }
}
