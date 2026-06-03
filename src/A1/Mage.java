package A1;

public class Mage extends Character {
    private int mana, spellPower;

    // Unterklassen-Konstruktor mit super(...)
    public Mage(String name, int health, int damage, int mana, int spellPower, Equipment equipment) {
        super(name, health, damage, equipment);
        this.mana = mana;
        this.spellPower = spellPower;
    }

    @Override
    public void attack(Character target) {
        if (mana >= spellPower) {
            mana -= spellPower;
            target.takeDamage(spellPower);
        }
    }

}
