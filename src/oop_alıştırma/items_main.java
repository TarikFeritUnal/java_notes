import java.util.ArrayList;
import java.util.Scanner;

public class items_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<items> item = new ArrayList<>();

// Read the names of persons from the user
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String itemsname = scanner.nextLine();
            if (itemsname.isEmpty()) {
                break;
            }


            // Add to the list a new person
            // whose name is the previous user input
            item.add(new items(itemsname));
        }

// Print the number of the entered persons, and their individual information
        System.out.println();
        System.out.println("İtems in total: " + item.size());
        System.out.println("İtems name: ");

        for (int i = 0; i < item.size(); i++) {
            item.get(i).print();
        }
    }
}
