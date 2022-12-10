package task;

public class ArmorDestroyer extends BattleUnitBase {
    public ArmorDestroyer (String name, int maximhealth, int basicstrength, int maximarmor) {
        super(name, maximhealth, basicstrength, maximarmor);
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
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int max_enemy_armor = 0;
        for (int i = 0; i < enemyTeam.length; i++){
            BattleUnit enemy = enemyTeam[i];
            if ((enemy.armor()>max_enemy_armor) && (enemy.health()>0)){
                max_enemy_armor = enemy.armor();
            }
        }
    }
    @Override
    public void attack(BattleUnit other) {

    }
}
