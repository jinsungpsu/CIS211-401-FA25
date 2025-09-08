import java.util.ArrayList;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        Stack<Integer> intStack = new Stack<>();
        Stack blah = new Stack();

        intStack.push(1);
        blah.push(1);
        blah.push("Hi");

        for (int i = 0; i < 10; i++) {
            intStack.push(i+10);
        }

        // at this point, in the stack
        // [1, 10, 11 ... 19]

        System.out.println(intStack);

        System.out.println(intStack.peek()); // 19

        System.out.println(intStack.pop()); // 19 AND remove it
        System.out.println(intStack.pop()); // 18 AND remove it

        intStack.push(99);
        // [1, 10, 11 ... 17, 99]
        System.out.println(intStack.pop()); // 99
        System.out.println(intStack.pop()); // 17

        while(!intStack.isEmpty()) {
            System.out.println("Popping: " + intStack.pop());
        }

        System.out.println(intStack);

    }
}