import java.util.Scanner;

public class Methodlar {
        //Methodlar bir program içinde belirli bir görevi yerine getiren kod bloklarıdır.
        //Kod tekrarını önler.
        //Kodun okunabilirliğini artırır.

    public static void selam (){ //method herhangi bir değer döndürmediği için void parametresini kullandık
        System.out.println("S.A");
    }
    public static int kareal(int a){ //method sonucunda bir değer döndürdüğü için void yerine int parametresini alır
        return a*a;      //bir dönüş değeri tanımladığımız methodun çalışabilmesi için mutlaka bir değer döndürmemiz gerekir ve onu return etmemiz gerekir.
    }
        //Method overloading:aynı isimle farklı parametrelerle methodlar oluşturabiliriz.

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
    //return ettiğimiz değerleri bir değişkene atamamız gerekir.

}
