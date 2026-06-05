package A1;

public class Warrior extends Character {
    private int armor;

    // Unterklassen-Konstruktor mit super(...)
    public Warrior(String name, int health, int damage, int armor, Equipment equipment) {
        super(name, health, damage, equipment);
        this.armor = armor;
    }

    @Override
    public void takeDamage(int damage) {
        if (damage > armor) {
            super.takeDamage(damage - armor);
        } // else -> health verändert sich nicht, da Schaden durch Rüstung geblockt
    }
}
