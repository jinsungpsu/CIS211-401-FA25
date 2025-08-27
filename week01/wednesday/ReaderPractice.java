import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderPractice {
    // could do this, but irresponsible
    // public static void main(String[] args) throws FileNotFoundException {

    public static void main(String[] args) {
        try {
            BufferedReader pokeReader = new BufferedReader(new FileReader("pokemon.csv"));

            Pokemon[] pokedex = new Pokemon[800];
            int pokeCount = 0;
            // no constructor call
            // so i'm not actually creating any pokemon objects
            // what I AM creating is an array of 800
            // pokemon ref vars

            String line;

            try {
                pokeReader.readLine();
                while ((line = pokeReader.readLine()) != null) {
                    // go to the file
                    // read the next line, assign it to the var "line"
                    // if readLine returns null, it means
                    // we've reached EOF
                    // so exit the loop

                    //System.out.println(line);

                    // now that we have the info about the single pokemon
                    // in the line string
                    // let's "split" it into useful pieces

                    String[] data = line.split(",");

                    // System.out.println("=============== POKEMON ==========");
                    for (String pokeData: data) {
                        //System.out.println(pokeData);
                    }

                    // line = "1,2,3";
                    // blah[] = line.split(",");
                    // blah = {"1", "2", "3"};

                    // if i want to create a pokemon
                    // i need name, attack, defense

                    // #,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary
                    // name = index 1 (2nd item)
                    // HP is index 5
                    // Attack is 6
                    // defense is 7

                    // constructor
                    // name, attack, defense, hp
                    Pokemon pokemon = new Pokemon(data[1], Integer.parseInt(data[6]), Integer.parseInt(data[7]), Double.parseDouble(data[5]));
                    pokedex[pokeCount++] = pokemon;
                    //System.out.println(pokemon);
                } // this is the end of the buffered reader loop
                // this is after i read all the file and made
                // a pokedex array

                System.out.println("Contents of my pokedex in RAM!!!");
                for (Pokemon each: pokedex) {
                    System.out.println(each);
                }
                // pokedex is now in RAM
                // not in the file
            } catch (IOException e) {
                // error
            }

        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file... we should do something...");
        }


    }
}
