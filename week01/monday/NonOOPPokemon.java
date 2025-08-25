//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //

        int num = 5;

        int[] nums = {1,2, 99, 50, -10, -99};
        int[] nums2 = new int[5];

        System.out.println(nums[3]);
        System.out.println(nums[5]);
        System.out.println(nums[nums.length-1]);

        System.out.println("------------------");
        for (int i = 0; i < 6; i++) {
            System.out.println("number in index: " + i + " is: " + nums[i]);
        }

        for (int each: nums) {
            System.out.println("number in array: " + each);
        }

        String[] pokemons = {"Charizard", "Pikachu", "Raichu"};
        int[] pokemonAttack = {100, 90, 55};
        int[] pokemonDefense = {70, 99, 30};
        double[] hp = {100, 100, 100};

        int aliveCount = pokemons.length;

        while (aliveCount > 1) {
            for (int attacker = 0; attacker < pokemons.length; attacker++) {
                if (hp[attacker] <= 0) continue; // Skip dead Pokémon

                // Choose a target
                int target = -1;
                for (int i = 0; i < pokemons.length; i++) {
                    if (i != attacker && hp[i] > 0) {
                        target = i;
                        break;
                    }
                }

                if (target == -1) continue; // No valid targets left

                // Calculate damage
                double damage = pokemonAttack[attacker] - (pokemonDefense[target] / 2.0);
                damage = Math.max(damage, 1); // Ensure at least 1 damage

                hp[target] -= damage;
                System.out.println(pokemons[attacker] + " attacks " + pokemons[target] + " for " + damage + " damage!");

                if (hp[target] <= 0) {
                    hp[target] = 0;
                    System.out.println(pokemons[target] + " has fainted!");
                }
            }

            // Count how many are still alive
            aliveCount = 0;
            for (double health : hp) {
                if (health > 0) aliveCount++;
            }

            // Display current HP status
            System.out.println("\n--- Current HP ---");
            for (int i = 0; i < pokemons.length; i++) {
                System.out.println(pokemons[i] + ": " + hp[i] + " HP");
            }
            System.out.println("------------------\n");
        }

        // Announce winner
        for (int i = 0; i < pokemons.length; i++) {
            if (hp[i] > 0) {
                System.out.println(pokemons[i] + " wins the battle!");
                break;
            }
        }

        for (String pokemon: pokemons) {
            System.out.println(pokemon);
        }





        String[] stuff = {"I haven't", "programmed", "all summer"};




    }
}
