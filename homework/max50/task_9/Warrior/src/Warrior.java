public class Warrior {
    protected String name;
    protected int attack;
    protected int health;

    public Warrior(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public int getAttack() {
        return this.attack;
    }
    public int getHealth() {
        return this.health;
    }
    public void takeDamage(Warrior other) {
        this.health -= other.getAttack();
    }


}