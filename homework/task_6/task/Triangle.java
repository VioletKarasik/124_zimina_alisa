package task;

public class Triangle {
    //конструкторы
    private double a;
    private double b;
    private double c;
    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //методы
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public boolean isValid() {
        if (a>0 && b>0 && c>0 && (a+b) > c && (a+c) > b && (b+c) > a){
            return true;
        }
        return false;
    }
    public double perimeter() {
        if(isValid())
            return a+b+c;
        else
            return -1;
    }
    public double square() {
        if(isValid()){
            double p = (perimeter()/2);
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        } else
            return -1;
    }
}
