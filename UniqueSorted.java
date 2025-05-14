import java.util.*;

public class UniqueSorted {
    public static TreeSet<Integer> getSorted(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 9, 3, 5, 1, 7};
        System.out.println(getSorted(nums));
    }
}
