public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        int arrfirst[] = new int[size];
        arrfirst[0]=a0;
        for (int i = 1; i < size; i++){
            arrfirst[i] = arrfirst[i-1] + d;
        }
        return arrfirst;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        int arrsecond[] = new int[size];
        int sumprev = 2;
        for(int i = 0; i < size; i++)
        {
            if (i <= 1) {
                arrsecond[i] = 1;
            }
            else {
                arrsecond[i] = sumprev;
                sumprev += sumprev;
            }
        }
        return arrsecond;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        int arrthird[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            if (i==0) {
                arrthird[i] = 0;
            }
            else {
                if (i==1){
                    arrthird[i] = 1;
                }
                else {
                    arrthird[i]=arrthird[i-1]+arrthird[i-2];
                }
            }
        }
        return arrthird;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int max_num = Integer.MIN_VALUE;;
        for(int i = 0; i < data.length; i++) {
            if (data[i] > max_num){
                max_num = data[i];
            }
        }
        return max_num;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int max_num = Integer.MIN_VALUE;;
        for(int i = 0; i < data.length; i++) {
            if ((data[i] > max_num) && (data[i] % k == 0)){
                max_num = data[i];
            }
        }
        return max_num;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        return null;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}
