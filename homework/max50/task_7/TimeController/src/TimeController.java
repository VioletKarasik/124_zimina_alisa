import java.util.ArrayList;

public class TimeController {
    public String getActionWithMaxTime(ArrayList<String> titles, ArrayList<Integer> times) {
        int maxTime = times.get(0);
        int index = 0;

        for (int i = 0; i < times.size(); i++) {
            if (maxTime < times.get(i)) {
                maxTime = times.get(i);
                index = i;
            }
        }
        return titles.get(index);
    }
}