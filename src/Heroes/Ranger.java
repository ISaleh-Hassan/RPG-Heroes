package Heroes;

public class Ranger extends Hero {

    public Ranger() {
        this.level=1;
        this.health= 120;
        this.strength=5;
        this.dexterity=5;
        this.intelligence=1;
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
