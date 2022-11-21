package task;

public class BattleUnit {
    //конструкторы
    private int Strength, Armor, Health, X, Y;
    public BattleUnit(int Strength, int Armor, int Health, int X, int Y) {
        this.Strength = Strength;
        this.Armor = Armor;
        this.Health = Health;
        this.X = X;
        this.Y = Y;
    }

    //методы
    public int getStrength() {
        return Strength;
    }
    public int getArmor() {
        return Armor;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public int getHealth() {
        return Health;
    }
    //движение
    public void moveUp(){
        Y--;
    }

    public void moveDown(){
        Y++;
    }

    public void moveLeft(){
        X--;
    }
    public void moveRight(){
        X++;
    }
    public  boolean isAlive(){
        return Health>0;
    }
    //атака
    private int uron;
    public void attacked(BattleUnit enemy){
        if (Armor>0) {
            if (enemy.Strength >= Armor) {
                uron = enemy.Strength - Armor;
                Health -= uron;
            } else {
                Health = Health;
            }
        }
        else {
            Health -= enemy.Strength;}
    }
}
