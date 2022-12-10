package task;

public abstract class BattleUnitBase implements BattleUnit {

    private final int maximamor;

    public BattleUnitBase(String name, int maximhealth, int basicstrength, int maximarmor) {
        this.name = name;
        this.maximhealth = this.health = maximhealth;
        this.basicstrength = this.strength = basicstrength;
        this.maximamor = this.armor = maximarmor;
    }

    //Конструктор:
    protected final String name;
    protected int maximarmor;
    protected int basicstrength;
    protected int maximhealth;
    protected int armor;
    protected int health;
    protected int strength;

    //Абстрактные методы:
    public abstract void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);

    public abstract void attack(BattleUnit other);


    //реализованные методы
    public String name() {
        return this.name;
    }

    @Override
    public int health() {
        return this.health;
    }

    @Override
    public int maxHealth() {
        return this.maximhealth;
    }

    @Override
    public void setMaxHealth(int value) {
        this.maximhealth = value;
        if (this.health >= maximhealth) {
            this.health = maximhealth;
        }
    }

    @Override
    public void heal(int value) {
        this.health = this.health + value;
        if (this.health >= maximhealth) {
            this.health = maximhealth;
        }
    }

    @Override
    public void takeDamage(int value) {
        this.health = this.health - value;
        if (this.health <= 0) {
            this.health = 0;
        }
    }
}
