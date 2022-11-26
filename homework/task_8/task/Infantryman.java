package task;

public class Infantryman extends BattleUnitBase {
    //Конструктор:
    public Infantryman (String name, int maximhealth, int basicstrength, int maximarmor) {
        super(name, maximhealth, basicstrength, maximarmor);
    }
    //Методы:
    @Override
    public void specialAbility (BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
    }
    @Override
    public void attack (BattleUnit other) {
        double Strength1 = (this.strength()/2), Strength2 = (this.strength()/4);
        if (Strength1 < 1){
            Strength1 = 1;
        }
        if (Strength2 < 1){
            Strength2 = 1;
        }
        if (other.armor() > 0){
            other.takeDamage((int) Strength1);
            other.damageArmor((int) Strength2);
        }
        else {
            other.takeDamage((int) this.strength);
        }
    }
    @Override
    public String name() {
        return null;
    }

    @Override
    public int health() {
        return 0;
    }

    @Override
    public int maxHealth() {
        return 0;
    }

    @Override
    public void setMaxHealth(int value) {

    }

    @Override
    public void heal(int value) {

    }

    @Override
    public void takeDamage(int value) {

    }

    @Override
    public int strength() {
        return 0;
    }

    @Override
    public void setStrength(int value) {

    }

    @Override
    public int baseStrength() {
        return 0;
    }

    @Override
    public int armor() {
        return 0;
    }

    @Override
    public void restoreArmor(int value) {

    }

    @Override
    public void damageArmor(int value) {

    }

    @Override
    public int maxArmor() {
        return 0;
    }

    @Override
    public void setMaxArmor(int value) {

    }
}
