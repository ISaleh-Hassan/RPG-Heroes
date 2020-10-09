package Heroes;

import java.util.HashMap;

public class Mage implements CanLevelUp {

    private int level;
    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int experience;

    public Mage() {
        this.level=1;
        this.health= 100;
        this.strength=2;
        this.dexterity=3;
        this.intelligence=10;
        this.experience=0;
    }

    @Override
    public void gainSuperPowers() {
        health      = health + 15;
        strength    = strength + 1;
        dexterity   = dexterity + 2;
        intelligence= intelligence + 5;
    }

    @Override
    public void setExperienceToZeroOnLevelUp() {
        experience=0;
    }

    public void printNewLevel(){
        System.out.println("Level up!");
        System.out.println("Now level " + getLevel());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(getExpectedToNextLevel(level)-getExperience() + " needed to level up");
    }

    public HashMap<Integer, Integer> getExpectedToNextLevels(int gainedExperience){
        int expetedToNextLevel=100;
        int newTarget=1;
        HashMap<Integer, Integer> newTargets = new HashMap<Integer, Integer>();

            for(int i=0; i<gainedExperience; i++) {
                newTargets.put(newTarget,expetedToNextLevel);
                expetedToNextLevel += expetedToNextLevel * 0.1;
                newTarget++;
        }
        return newTargets;
    }

    public int getExpectedToNextLevel(int myLevel){
        int expetedToNextLevel=100;

        if(myLevel>1){
            for(int i=0; i<myLevel; i++) {
                expetedToNextLevel += expetedToNextLevel * 0.1;

            }
        }
        return expetedToNextLevel;
    }

    public int getExperienceTargetByLevel(int myLevel){
        HashMap<Integer, Integer> experienceTargetsList = getExpectedToNextLevels(myLevel);

        return experienceTargetsList.get(myLevel);
    }



    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //Main method which triggs the other methods.
    @Override
    public void gainExperience(int gainedExperience) {
        HashMap<Integer, Integer> experienceTargetsList = new HashMap<Integer, Integer>();
        experienceTargetsList= getExpectedToNextLevels(gainedExperience);
        int expectedValueToNextLevel = getExpectedToNextLevel(this.level + 1);
        experience = gainedExperience;

        System.out.println("Warrior gaining "+ gainedExperience + "xp");

        for (Integer i=level;  i<experienceTargetsList.size(); i++) {
            experience = experience- experienceTargetsList.get(i);
            level++;
            System.out.println("Now level " + level);

            if(experience-experienceTargetsList.get(i)<0){
                System.out.println(experience + " more needed to level up!");
                break;
            }
        }

    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
