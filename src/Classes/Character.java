package Classes;

//import GUI.*;

public abstract class Character {

    //Declare properties of ANY character (Player or Monster)
    String name;
//    private Weapon weapon;
    private int baseAttack;
    private int defense;
    private int agility;
    private int hitPoints;

    public Character(String name, int baseAttack, int defense, int agility, int hitPoints) {
        this.name = name;
        this.baseAttack = baseAttack;
        this.defense = defense;
        this.agility = agility;
        this.hitPoints = hitPoints;
    }

//    Getters & Setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


    //Define a getCharacterInformString() method, to be inherited by subclasses
    public String getCharacterInformString() {
        return "Stats:"+
                "\nHP: " + hitPoints +
                "\nDefense: " + defense +
                "\nAgility: " + agility +
                "\nBase Attack: " + baseAttack;
    }

//    @Override
    public String toString() {
        return "My name is " + name + ")n" +
                "HP: " + hitPoints +
                "\nDefense: " + defense +
                "\nAgility: " + agility +
                "\nBase Attack: " + baseAttack;
    }
    //I'm literally walking in the blind rn and I have just 2 hours to finish this up

    public abstract int calculateAttack();

}