package A1;

public class Character {
    private String name;
    private int health, damage;
    private Equipment equipment;
    private int xp;

    // Konstruktor 1
    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.xp = 0;
    }
    // Konstruktor 2 (überladen)
    public Character(String name, int baseHealth, int baseDamage, Equipment equipment) {
        this(name, baseHealth + equipment.getDefenseBonus(), baseDamage + equipment.getAttackBonus());
        // man kann auch - analaog wie mit super(...) - den eigenen Konstruktor mit this(...) aufrufen
        // anstatt alles einzeln zu initialisieren

        this.equipment = equipment;
    }

    public void takeDamage(int damage) {
        if (damage >= health) {
            health = 0;
        } else {
            health = health - damage;
        }
        // health = Math.max(0, health - damage); ginge auch
    }

    public void attack(Character target) {
        target.takeDamage(damage);
    }

    public void defeat(Character target) {
        if(target.health == 0) {
            gainXp(50);
        }
    }

    // Setter
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
        health = health + equipment.getDefenseBonus();
        damage = damage + equipment.getAttackBonus();
    }

    public void gainXp(int amount) {
        xp += amount;
    }

    // Getter für XP
    public int getXp() {
        return xp;
    }

}
