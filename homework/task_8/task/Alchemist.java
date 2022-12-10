package task;

public class Alchemist extends BattleUnitBase {
    public Alchemist (String name, int maximhealth, int basicstrength, int maximarmor) {
        super(name, maximhealth, basicstrength, maximarmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maximhealth = 0;
        int minimhealth = Integer.MAX_VALUE;
        for (int i = 0; i < ownTeam.length; i++){
            BattleUnit own = ownTeam[i];
            if ((own.health()>maximhealth) && (own.health()>0)){
                maximhealth = own.health();
            }
            if ((own.health()<maximhealth) && (own.health()>0)){
                maximhealth = own.health();
            }
        }
    }

    @Override
    public void attack(BattleUnit other) {
        other.setStrength(other.strength() - 2);
        other.setMaxHealth(other.maxHealth() - 4);
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
