import java.util.HashMap;
public class Counter {
    public HashMap<Integer, Integer> count(int[] arr) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (Integer num : arr) {
            if (numbers.containsKey(num)) {
                numbers.put(num, numbers.get(num) + 1);
            }
            else {
                numbers.put(num, 1);
            }
        }
        return numbers;
    }
}