package task;

public class BattleUnit {
    //конструкторы
    private int Strength, Armor, Health, X, Y;
    public BattleUnit(int Sstrength, int Armor, int Health, int X, int Y) {
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
    public void moveUp() {
        Y -= 1;
    }
    public void moveDown() {
        Y += 1;
    }
    public void moveLeft() {
        X -= 1;
    }
    public void moveRight() {
        X += 1;
    }
    public boolean isAlive() {
        if (Health>0) {
            return true;
        }
        return false;
    }

    //атака
    private int uron;
    public void attacked(BattleUnit enemy) {
        if (Armor>0 && Health>0) {
            if (enemy.Strength >= Armor) {
                uron = enemy.Strength - Armor;
                Health -= uron;
            } else {
                Health = Health;
            }
        } else {
            Health -= enemy.Strength;
        }
    }
}
