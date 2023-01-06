public class ArmoredWarrior extends Warrior {
    private int armor;

    public ArmoredWarrior(String name, int attack, int health, int armor) {
        super(name, attack, health);
        this.armor = armor;
    }
    public int getArmor() {
        return this.armor;
    }
    @Override
    public void takeDamage(Warrior other) {
        int damage = other.getAttack() - this.armor;
        if (damage >= 1) {
            this.health -= damage;
        }
    }
}