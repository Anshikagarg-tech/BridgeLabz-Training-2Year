import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        System.out.println("Original List: " + list);

        List<Integer> result = removeDuplicates(list);
        System.out.println("After Removing Duplicates: " + result);
    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        for (T item : list) {
            seen.add(item);
        }
        return new ArrayList<>(seen);
    }
}
