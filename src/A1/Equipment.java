package A1;

public class Equipment {
    private String name;
    private int attackBonus, defenseBonus;

    // Konstruktor
    public Equipment(String name, int attackBonus, int defenseBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttackBonus() {
        return attackBonus;
    }
    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }
    public int getDefenseBonus() {
        return defenseBonus;
    }
    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }
}
