// Cleric.java
// Represents a cleric character, a subclass of Character.
// Clerics typically have higher defense and healing abilities.

package Classes;

public class Cleric extends Player {

    public Cleric(String name){
        super(name, 18, 60, 30, 90);
    }

    @Override
    public String getCharacterInformString() {
        return "Clerics are usually dwarf. Have higher defense but low agility ";
    }

    // Returns a description of the cleric's weapon (if any)
    public String getWeaponInformString() {
        return null;
    }

    @Override
    public int calculateAttack() {
        return super.calculateAttack() + 1;
    }
}