//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon poke1;
        poke1 = new Pokemon("pika");

        // most of the time
        // we create an object and assign it
        // at the same time
        Pokemon poke2 = new Pokemon("chu");

        poke2 = poke1;

        poke2.setName("Charizard");

        System.out.println(poke1); // chu
        System.out.println(poke2); //
    }
}

class Pokemon {
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                '}';
    }
}
