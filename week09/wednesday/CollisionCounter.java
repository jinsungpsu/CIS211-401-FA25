import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Pokemon {
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }
}

public class CollisionCounter {
    public static void main(String[] args) {
        HashMap<String, Pokemon> pokedex = new HashMap<>(800000);
        try {
            Scanner input = new Scanner(new File("pokemon.csv"));
            input.nextLine(); // get rid of header row
            while (input.hasNextLine()) {
                String pokeName = input.nextLine().split(",")[1].trim();
                pokedex.insert(pokeName, new Pokemon(pokeName));
            }
            System.out.println("# of collisions were: " + pokedex.getCollisions());
            System.out.println("% of collisions: " + (((double)pokedex.getCollisions() / pokedex.getCount())*100) + "%");
        } catch (FileNotFoundException e) {

        }
    }

}
