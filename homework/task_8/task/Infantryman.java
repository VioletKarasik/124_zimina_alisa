package task;

public class Infantryman extends BattleUnitBase {
    public Infantryman (String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {

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

    @Override
    public void attack (BattleUnit other) {

    }
}
