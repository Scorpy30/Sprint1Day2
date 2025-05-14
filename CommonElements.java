import java.util.*;

public class CommonElements {
    public static List<Integer> getCommon(List<Integer> a, List<Integer> b) {
        List<Integer> common = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i)) && !common.contains(a.get(i))) {
                common.add(a.get(i));
            }
        }
        return common;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        System.out.println(getCommon(list1, list2));
    }
}

