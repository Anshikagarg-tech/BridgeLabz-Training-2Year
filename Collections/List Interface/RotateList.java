import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        System.out.println("Original List: " + list);
        rotate(list, rotateBy);
        System.out.println("Rotated List: " + list);
    }

    public static <T> void rotate(List<T> list, int n) {
        int size = list.size();
        n = n % size; // handle rotation greater than size
        List<T> temp = new ArrayList<>();

        for (int i = n; i < size; i++)
            temp.add(list.get(i));

        for (int i = 0; i < n; i++)
            temp.add(list.get(i));

        for (int i = 0; i < size; i++)
            list.set(i, temp.get(i));
    }
}
