import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {

        long start, end;

        // ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<>();
        start = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++) list.add(i);
        long sum1 = 0;
        for(int num : list) sum1 += num;
        end = System.currentTimeMillis();
        System.out.println("ArrayList Time: " + (end - start) + " ms");

        // int[]
        int arr[] = new int[1_000_000];
        start = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++) arr[i] = i;
        long sum2 = 0;
        for(int num : arr) sum2 += num;
        end = System.currentTimeMillis();
        System.out.println("Array Time: " + (end - start) + " ms");
    }
}
