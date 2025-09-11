import java.util.Scanner;
import java.util.Random;

public class ArrayApp { //class isimleri büyük harfle başlar.
    public static void print_array_assign(int[] array) { //aynı isimde iki method oluşturduk biri dışardan alıp değer döndürdüğümüz diğeri parametre girmeden çalıştırdığımız bir method biri void diğeri int farklı tipler olduğu için aşırı yükleme yapmış olduk (Method overloading)
        for (int i = 0; i < array.length; i++) {
            System.out.println( (i+1) + ".eleman: " + array[i] + " " );
        }
    }
    //atama işlemlerinde void kullanılır
    public static int [] print_array_assign() { //methodlarda parantez içine tanımladığımız değiken method içinde işlem yapılması için kullanıldığı için methoda istediğimiz değişkeni sokabiliriz methodda parantez içine tanımladığımız değiken içerideki ilemleri sembollemek için kullanılır
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array ID: ");
        int len = sc.nextInt();
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            System.out.println( (i+1) + ".eleman: ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static void print_arrayID_random(int[]array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*51);
        }
    }

    public static void print_array_min_var(int[][]array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Çift katlı dizinin en küçük elemanı: " + min);
    }

}

