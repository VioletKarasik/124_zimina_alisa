import java.util.HashMap;
import java.util.Map;

public class SummCalculator {
    public int calculateSumm(HashMap<String, Integer> cart, HashMap<String, Integer> product) {
        int summ = 0;
        for (Map.Entry entry : cart.entrySet()) {
            if (product.containsKey(entry.getKey())) {
                summ += product.get(entry.getKey()) * cart.get(entry.getKey());
            }
        }
        return summ;
    }
}