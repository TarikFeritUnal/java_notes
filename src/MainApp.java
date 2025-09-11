public class MainApp {
    public static void main(String[] args) {
        int [] a = new int[10];
         ArrayApp.print_arrayID_random(a);  //başka classlardan metod çağırmak için önce class adı sonrada method ismini çağırdık.
        ArrayApp.print_array_assign(a); //methodları başka classda hazırla ana classda kulllan. //aynı isimde iki method oluşturduk bir parametre döndürüyor diğeri döndürmüyor method overloading olmuş oluyor yani methodu hem içine değişken atayarak hemde normal kullanabiliriz.
        int [] c =ArrayApp.print_array_assign(); // method içinde oluşturduğumuz diziyi return etmiştik yazdırmak için yeni bir değişkene atamamız gerekiyor
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }

        int [][] b = {{5,6,7,8,9,10},{1,2,3,4,5}};
        ArrayApp.print_array_min_var(b);
    }
}