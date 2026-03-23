// Warrior.java
// Represents a warrior character, inheriting from Character.
// A warrior has higher HP and defense but lower agility compared to other classes.

package Classes;

public class Warrior extends Player {

    // Constructor for Warrior, sets name, health, attack, and defense
    public Warrior(String name) {
        super(name, 20, 60, 40, 100);
    }

    @Override
    public String getCharacterInformString() {
        return "Fighters are often human.Have higher HP and defence but low agility.";
    }

    @Override
    public int calculateAttack() {
        return super.calculateAttack() + 2;
    }
}