package Heroes;

public class Warrior extends Hero {


    public Warrior(int health, int strength, int dexterity, int intelligence) {
        level=1;
        health= 150;
        strength=10;
        dexterity=3;
        intelligence=1;
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public int getDexterity() {
        return super.getDexterity();
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(strength);
    }

    @Override
    public void setDexterity(int dexterity) {
        super.setDexterity(dexterity);
    }
}
