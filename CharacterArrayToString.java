public class CharacterArrayToString {
    public static void main(String[] args) {
        Character[] charArray = {'h', 'e', 'l', 'l', 'o'};

        StringBuilder sb = new StringBuilder();
        for(Character c : charArray){
            sb.append(c);
        }

        String str = sb.toString();
        System.out.println("Converted String: "+str);
    }
}
