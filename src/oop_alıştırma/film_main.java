import java.util.ArrayList;
import java.util.Scanner;

public class film_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<film> films = new ArrayList<>();

        while (true) {
            System.out.print("Enter the film title. empty will end: ");
            String title = sc.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Enter the duration: ");
            int duration = sc.nextInt();
            sc.nextLine();

            films.add(new film(title, duration));
        }

        for (film f : films) {
            f.print();
        }

        sc.close();
    }
}

