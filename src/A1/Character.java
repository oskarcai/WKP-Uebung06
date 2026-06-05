package A1;

public class Character {
    private String name;
    private int health, damage;
    private Equipment equipment;

    // Konstruktor 1
    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    // Konstruktor 2 (überladen)
    public Character(String name, int baseHealth, int baseDamage, Equipment equipment) {
        this.name = name;
        this.health = baseHealth + equipment.getDefenseBonus();
        this.damage = baseDamage + equipment.getAttackBonus();
        this.equipment = equipment;
    }

    public void takeDamage(int damage) {
        if (damage >= health) {
            health = 0;
        } else {
            health = health - damage;
        }
    }

    public void attack(Character target) {
        target.takeDamage(damage);
    }

    // Setter
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
        health = health + equipment.getDefenseBonus();
        damage = damage + equipment.getAttackBonus();
    }

    // für Klasse Warrior health- Getter und Setter
    /* public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

     */
}
