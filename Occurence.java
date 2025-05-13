

public class Occurence {
    public static void main(String[] args) {
        String str = "Super Man Spider Man Bat Man";
        char[] ch = str.toCharArray();
        boolean[] b = new boolean[str.length()];

        System.out.println("Character Occurences: ");
        for (int i = 0; i < ch.length; i++) {
            if(b[i]) continue;
            int count = 1;
            for(int j = i+1; j<ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                    b[j] = true;
                }
            }
            System.out.println(ch[i] + ":"+count);
        }
    }
}
