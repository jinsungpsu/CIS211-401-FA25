public class DTCCArrayList<T> {
    private final int DEFAULT_SIZE = 10;
    private int numItems;
    private T[] listItems;

    public DTCCArrayList() {
        listItems = (T[])new Object[DEFAULT_SIZE];
    }

    public DTCCArrayList(int size) {
        listItems = (T[])new Object[size];
    }

    public void add(T item) {
        // blah blah make this work
    }
}

class PokedexApp {
    public static void main(String[] args) {

        // singular pokedex, index
        // plural pokedeces OR pokedexes, indices
        Pokedex ashsPokedex = new Pokedex();
        ashsPokedex.addPokemon(new Pokemon("pikachu", 100));
    }
}

class Pokedex {
    private String trainer;
    private int pinCode;
    private DTCCArrayList<Pokemon> myPokemon = new DTCCArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        myPokemon.add(pokemon);
    }
}

class Pokemon {
    private String name;
    private int hp;

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
