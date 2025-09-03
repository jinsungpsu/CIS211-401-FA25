import java.util.ArrayList;

public class ListWithDetails {
    private String menuItem1;
    private ArrayList<String> stuff = new ArrayList<>();

    public void add(String menuItem) {
        // menuItem1 = menuItem;
        if (stuff.add(menuItem)) {
            System.out.println("Added");
        } else {
            System.out.println("Already exists..");
        }
    }

    public void remove(String thingToRemove) {
//        if (menuItem1.equals(thingToRemove)) {
//            menuItem1 = null;
//        }
        stuff.remove(thingToRemove);
    }

    public int size() {
        // should return how many menu items
//        if (menuItem1 != null) return 1;
//        return 0;
        return stuff.size();
    }
}
