package A1;

import javax.xml.xpath.XPathExpression;

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
        // super.takeDamage(Math.max(0, damage - armor)); ginge auch
    }

    @Override
    public void gainXp(int amount) {
        super.gainXp(amount);
        if(this.getXp() >= 100) {
            armor++;
            super.gainXp(this.getXp() - 100);
        }
    }
}
