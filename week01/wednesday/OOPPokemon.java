public class OOPpokemongame {
    public static void main(String[] args) {
        int num = 5;
        Pokemon raichu = new Pokemon("Raichu", 150, 29);
        Pokemon pichu = new Pokemon("Pichu", 79, 200);

        while(raichu.isAlive() && pichu.isAlive()) {
            if (raichu.isAlive()) {
                raichu.attack(pichu);
            }
            if (!pichu.isDead()) {
                pichu.attack(raichu);
            }
            System.out.println(raichu.toString());
            System.out.println(pichu.toString());
            break;
        }
    }
}

class Pokemon {
    // instance vs static variables
    // these are all instance variables (by default)
    private int attack, defense;
    private double hp;
    private String name;

    // constructors
    // a function in a class, aka, a method
    // a constructor is a special kind of method
    // it's used to create an instance of an object of this class
    // role: initialize the object
    public Pokemon(String name, int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
        this.hp = 100;
        this.name = name;
    }

    // other overloaded constructors
    // different ways of creating pokemon ojects
    public Pokemon(String name, int attack, int defense, double hp) {
        this(name, attack, defense);
        this.hp = hp;
    }

    // shift + f6 (refactor) - better than find and replace

    public void attack(Pokemon target) {
        // when main calls raichu.attack(pichu);
        // in line 9, "this" is the raichu object
        // and "target" is pichu

        // in line 12, "this" is pichu
        // and "target" is raichu
        System.out.println(this.name + " is attacking " + target.name);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public boolean isDead() {
        return !isAlive();
    }


    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public double getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    // generate code
    // on windows
    // alt + insert
    @Override
    public String toString() {
        // usually returns some combination
        // of its data
        // in a readable form
        String output = "";

        output += "Pokemon name: " + name;
        output += "\nHP: " + hp;

        return output;
    }

}
