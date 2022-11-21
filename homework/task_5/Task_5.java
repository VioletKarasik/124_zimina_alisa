import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        ArrayList<Integer> element = new ArrayList<>();
        for(Integer i : data) {
            if ((i%k == 0) && (i%n != 0)) {
                element.add(i);
            }
        }
        return element;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        ArrayList<Integer> spisok = new ArrayList<>();
        for(int i=1;i<=size;i++){
            int j=0;
            if(spisok.size()<size)
                while(j<i && spisok.size()<size) {
                    spisok.add(i);
                    j++;
                }
        }
        return spisok;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        HashSet<Integer> hashmnozhestvs = new HashSet<>(s1);
        hashmnozhestvs.retainAll(s2);
        return hashmnozhestvs;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        HashSet<Integer> hashmnozhestvs = new HashSet<>();
        hashmnozhestvs.addAll(s1);
        hashmnozhestvs.addAll(s2);
        return hashmnozhestvs;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> hashmnozhestvs = new HashSet<>(s1);
        hashmnozhestvs.addAll(s2);
        hashmnozhestvs.removeAll(s1);
        return hashmnozhestvs;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        HashSet<Integer> mnozhestvo = new HashSet<>();
        for(Integer i:s1) {
            if (s2.contains(i)) {
                continue;
            } else {
                mnozhestvo.add(i);
            }
        }
        for(Integer i:s2) {
            if (s1.contains(i)) {
                continue;
            } else {
                mnozhestvo.add(i);
            }
        }
        return mnozhestvo;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        HashMap<String, Double> slovar = new HashMap<>();
        int k = 0;
        for(String i:data){
            String[] slova = i.split(" ");
            for(String j :slova){
                if(slovar.containsKey(j)) {
                    slovar.put(j,slovar.get(j)+1);
                } else
                    slovar.put(j, 1.0);
                k++;
            }
        }
        for(HashMap.Entry <String, Double> vvod:slovar.entrySet()){
            double pr = (vvod.getValue()*100)/k;
            vvod.setValue(pr);
        }
        return slovar;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        double max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, summa = 0;
        for(Double i : data){
            summa += i;
            if(i>max) {
                max = i;
            } if(i<min) {
                min = i;
            }
        }
        HashMap<String, Double> slovar = new HashMap<>();
        slovar.put("mean", summa/data.size());
        slovar.put("max", max);
        slovar.put("min", min);
        return slovar;
    }
}
