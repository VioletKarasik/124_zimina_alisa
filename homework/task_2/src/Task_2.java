import java.lang.Math;
public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int chislo = 0;
        int itog = 0;
        while (chislo <= num) {
            if (chislo * chislo <= num) {
                itog = chislo * chislo;
            }
            chislo++;
        }
        return itog;

    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int p = 1;
        if (num == 0) {
            p = 1;
        }
        if (num > 0) {
            while (num != 0) {
                p = 2 * p + 6;
                num--;
            }
        }
        return p;
    }


    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int i = base;
        while (i<num) {
            i = i * base;
        }
        return i == num;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int kolvo=0;
        while (start > end){
            if ((start % 2 != 0) || (start - end <= 2)){
                start--;
                kolvo++;
            }
            else {
                start /= 2;
                kolvo++;
            }
        }
        return kolvo;
    }
}
