import java.util.ArrayList;
import java.util.Scanner;

public class Stringmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        while (true){
            System.out.print("Enter the string:");
            String s = sc.nextLine();

            if (s.equals("end")){
                break;
            }

            list.add(s);

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());

        sc.close();
    }
}
