import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Read_File_Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = null;
        try {
            sc = new Scanner(Paths.get("C:\\Users\\tarik\\IdeaProjects\\donem2_vizesonrasi_2\\src\\test2.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        while (sc.hasNextInt()) {
            int row = sc.nextInt();
            System.out.println(row);
            list.add(row);

        }

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 1  ; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }
}
