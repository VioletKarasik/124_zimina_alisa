import java.math.*;
public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) {
        // Вычислить и вернуть минимальный из трех полученных аргументов (first, second, third)
        int minim = 100000;
        if (first<second) {
            minim = first;
        }else {
            minim = second;
        }
        if (minim>third) {
            minim = third;
        }
        return minim; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public boolean subtask_2_if(int year) {
        // Проверить, является ли год, переданный в параметре year, високосным.
        // Високосный год - это год, кратный четырем, но не кратный 100, либо кратный 400
        if ((year % 4 == 0) && (year % 100 !=0)) {
            return true;
        }else if (year % 400 == 0){
            return true;
        }
        else {
            return false; // Замените данный оператор кодом, решающим поставленную задачу.
        }
    }
    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {
        // Проверить, лежит ли точка с координатами (x, y) внутри невырожденного квадрата
        // со сторонами, параллельными осям координат, левый верхний угол которого имеет
        // координаты (left_up_x, left_up_y), ширина которого width, высота height.
        // Точка на границе считается не лежащей внутри.
        // В качестве результата вернуть:
        // 0 - не лежит
        // 1 - лежит
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        //if (((x > left_up_x) && (x< (left_up_x+width))) && ((y<left_up_y) && (y>(left_up_y - height)))) {
        //return  1;
        //}//else if (((x >= left_up_x) || (x<= (left_up_x+width))) || ((y<=left_up_y) || (y>=(left_up_y - height)))) {
        // return 2; // Замените данный оператор кодом, решающим поставленную задачу.
        //}
        if ((height == width) && (height>0)) {
            if (((left_up_x+width)-x <= 0.000001 || x - left_up_x <= 0.000001) || (left_up_y - y <= 0.000001 || y - (left_up_y - height) <= 0.000001)) {
                return 0;
            }else {
                if (x > left_up_x && x < (left_up_x+width) && y < left_up_y && y > (left_up_y-height)){
                    return 1;
                }else {
                    return 0;
                }
            }
        }
        else {
            return 2;
        }

    }
    @Override
    public int subtask_4_if(double x0, double y0, double k, double b) {

        if (Math.abs(y0 - (k*x0 + b)) <= 0.000001)
            return 2;
        else
        if (y0 < k*x0 + b)
            return 1;
        else
            return 0;
    }


    @Override
    public String subtask_5_switch(int day_od_week) {
        // По номеру дня недели day_od_week вернуть его название на русском языке, записанное
        // с большой буквы. Дни едели отсчитываются с единицы. Если номер задан некорректно,
        // вернуть строку "Ошибка"
        if (day_od_week==1) {
            return "Понедельник";
        }else if (day_od_week==2) {
            return "Вторник";
        }else if (day_od_week==3) {
            return "Среда";
        }else if (day_od_week==4) {
            return "Четверг";
        }else if (day_od_week==5) {
            return "Пятница";
        }else if (day_od_week==6) {
            return "Суббота";
        }else if (day_od_week==7) {
            return "Воскресенье";
        }else {
            return "Ошибка"; // Замените данный оператор кодом, решающим поставленную задачу.
        }

    }
    @Override
    public String subtask_6_switch(int direction) {
        // По заданному направлению direction вернуть его название:
        // 1 - север
        // 2 - юг
        // 3 - запад
        // 4 - восток
        // Во всех остальных случаях вернуть пустую строку
        if (direction==1) {
            return "север";
        }else if (direction==2) {
            return "юг";
        }else if (direction==3) {
            return "запад";
        }else if (direction==4) {
            return "восток";
        }else {
            return ""; // Замените данный оператор кодом, решающим поставленную задачу.
        }

    }
    @Override
    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        // Проверить, достигнет ли снаряд, летяший из точки (0, 0, 0)
        // в направлении (vx, vy, vz) со скоростью speed стены, параллельной плоскости OYZ,
        // имеющей координату x равной wall, за время time
        // 0 - не достигнет
        // 1 - достигнет
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        double distance = Math.sqrt(wall*wall*Math.abs(vx) + wall*wall*Math.abs(vy) + wall*wall*Math.abs(vz));
        if(time > 0 && speed > 0)
            if((distance/speed <= time && vx != 0) || Math.abs(distance/speed - time) <= 0.000001 )
                return 1;
            else
                return 0;
        else
            return 2;
    }
    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
        // Проверить, как друг относительно друга располагаются прямые y = k1*x + b1 и
        // y = k2*x + b2. Вернуть
        // 1 - если параллельны
        // 2 - если пересекаются
        // 3 - если совпадают
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        if ((k1 == k2) && (b1 != b2)) {
            return 1;
        } else if ((k1 != k2) && (b1 != b2)) {
            return 2;
        }
        else  {
            return 3;
        }


    }
}