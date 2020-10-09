package Heroes;

public class Mage extends Hero {


    public Mage(int health, int strength, int dexterity, int intelligence) {
        level=1;
        health= 100;
        strength=2;
        dexterity=3;
        intelligence=10;
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
