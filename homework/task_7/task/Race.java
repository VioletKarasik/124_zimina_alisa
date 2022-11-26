package task;
public enum Race {
    Orc(6,12,2),
    Elf(2, 9, 9),
    Dwarf(6, 10, 4),
    Halfling(1, 8, 11),
    Human(6, 7, 7);
    private final int Health;
    private final int Skills;
    Race(int Strength, int Health, int Skills){
        this.Strength = Strength;
        this.Health = Health;
        this.Skills = Skills;
    }

    private int Strength, health, dexterity;

    public int Strength (){
        return Strength;
    }

    public int Health (){
        return Health;
    }

    public int Skills (){
        return Skills;
    }

}