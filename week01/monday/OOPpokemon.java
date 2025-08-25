public class OOPpokemongame {
    public static void main(String[] args) {
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
        }
    }
}

class Pokemon {
    private int attack, defense;
    private double hp;
    private String name;

    public Pokemon(String name, int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
        this.hp = 100;
        this.name = name;
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
}
