import java.util.*;

public class NextGreaterFrequency {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 2, 1};
        int n = arr.length;

        int result[] = nextGreaterFrequency(arr, n);

        System.out.println(Arrays.toString(result));
    }

    public static int[] nextGreaterFrequency(int arr[], int n) {
        int result[] = new int[n];
        Arrays.fill(result, -1);

        // Step 1: Frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        

        // Step 2: Stack for indices
        Stack<Integer> stack = new Stack<>();

        // Step 3: Process array
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && 
                   freq.get(arr[i]) > freq.get(arr[stack.peek()])) {
                result[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        return result;
    }
}