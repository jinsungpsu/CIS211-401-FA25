import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ArrayList<String> menu = new ArrayList<>();
        List blah = new ListImplementation();
        ListWithDetails menu = new ListWithDetails();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Restaurant Menu Manager ---");
            System.out.println("1. View Menu");
            System.out.println("2. Add Menu Item");
            System.out.println("3. Remove Menu Item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number!");
                scanner.next(); // discard invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
//                    if (menu.isEmpty()) {
//                        System.out.println("The menu is currently empty.");
//                    } else {
//                        System.out.println("Current Menu:");
//                        for (int i = 0; i < menu.size(); i++) {
//                            System.out.println((i + 1) + ". " + menu.get(i));
//                        }
//                    }
                    break;

                case 2:
                    System.out.print("Enter the name of the new item: ");
                    String newItem = scanner.nextLine();
                    menu.add(newItem);
                    System.out.println(newItem + " has been added to the menu.");
                    break;

                case 3:
//                    if (menu.isEmpty()) {
//                        System.out.println("The menu is empty, nothing to remove.");
//                    } else {
                    System.out.print("Enter the item name to remove: ");
                    String itemName = scanner.next();

                    menu.remove(itemName);
                    System.out.println(itemName + " has been removed from the menu.");

                    // }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

}
