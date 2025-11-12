import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : items) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("Input: " + items);
        System.out.println("Frequency Map: " + freqMap);
    }
}
