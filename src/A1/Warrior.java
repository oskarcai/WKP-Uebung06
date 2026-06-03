package A1;

public class Warrior extends Character {
    private int amor;

    // Unterklassen-Konstruktor mit super(...)
    public Warrior(String name, int health, int damage, int amor, Equipment equipment) {
        super(name, health, damage, equipment);
        this.amor = amor;
    }

    @Override
    public void takeDamage(int damage) {
        if (damage <= amor) {
            amor -= damage;
        } else {
            amor = 0;
            this.setHealth(this.getHealth() - (damage-amor) );
        }
    }
}
