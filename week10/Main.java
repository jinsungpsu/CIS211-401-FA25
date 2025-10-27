import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int NUM_EXPERIMENTS = 30;

    public static void main(String[] args) {

        int[] myarr = createRandomArry(50000);
        


        try {
            PrintWriter output = new PrintWriter("factorialResults.csv");
            output.write("Experiment #, run time");

            countdown(11);

        /*
        for next lab, how do we measure execution time
        not a scientifically valid way of actually learning anything
        you can notice bigger patterns
         */

            long[] factorialRunTimes = new long[NUM_EXPERIMENTS];
            for (int i = 0; i < NUM_EXPERIMENTS; i++) {
                long start = System.nanoTime();
                // you can also use currentTimeMillis()
                // trivia: time ellapsed since epoch (jan 1 1970)
                System.out.println(factorial(17));

                long end = System.nanoTime();

                factorialRunTimes[i] = (end - start);

                System.out.println("Factorial took " + (end - start) + " nanoseconds.");

                output.write("\n" + i + ", " + factorialRunTimes[i]);
            }
            System.out.println("Average run time was: " + average(factorialRunTimes));

            output.close();
        } catch (IOException e) {

        }

    }

    static int[] createRandomArry(int size) {
        Random rng = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rng.nextInt();
        }
        return arr;

    }
    static long average(long[] nums) {
        return 0;
    }
    // direct recursion
    static void bad() {
        bad();
    }

    // indirect recursion
    static void simpleBadIndirect1() {
        simpleBadIndirect2();
    }

    static void simpleBadIndirect2() {
        simpleBadIndirect1();
    }

    static void countdown(int num) {
        if (num < 0) {
            return;
        }
        System.out.println(num + " ");
        countdown(num-1);
        System.out.println("this line hasn't run yet for the function call where value is: " + num);
    }

    static int factorial(int num) {
        if (num==0) return 1;
        return num * factorial(num-1);
    }

}
