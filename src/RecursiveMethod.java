public class RecursiveMethod {
            //Recursive Methodlar:Recursive methodlar, kendi kendini çağıran methodlardır. Bir problemin çözümünü daha küçük alt problemlere bölerek çözmek için kullanılır.
            //Recursive methodun çalışma mantığı kendi kendini çağırmasıdır ancak her methodda bir base case yani temel durum olması gerekir yoksa method sonsuz döngüye girer sonlanmaz
            //Recursive Methodlar 2 temel bileşenden oluşur.
            //1-Base Case (durdurma şartı) recursive işlemini durduran koşul
            //2-Recursive Case (kendi kendini çağırma) problemi küçük parçalara bölerek devam ettirme

 public static int toplam (int n){ //1den ne kadar olan sayıların toplamını veren recursive method
     if (n==0) { //base case temel durum methodu durdurmak için
         return 0;
     }
     else{
         return n+toplam(n-1); //recursive case methodu tekrar çağırmak için.
     }
 }

 public static void yazdir (int n){ // 1 den n e kadar olan sayıları yazdıran recursive method.
     System.out.println(n+" ");
     //base case temel durum
     if (n==0) {
         return;
     }
     //recursive case
     yazdir(n-1);
 }

    public static int usalma (int taban,int us){ //üs alma
     //base case
        if (us==0) {
            return 1;
        }
            //recursive case
            return taban*usalma(taban,us-1);

    }

    public static int cifttoplam (int n){ //1 den n e kadar olan sayılardan çift olanların toplamını bulan recursive method.
     //base case:Methodu durdurduğumuz yer
        if (n==0) {
            return n;
        }
        //recursive case: methodu döndürdüğümüz yer
        if (n%2==0) {
            return n+cifttoplam(n-1); //n çift sayı ise n ile toplayıp döndürüyoruz
        }
        else{
            return cifttoplam(n-1); //n çift sayı değilse n ile toplamadan döndürüyoruz
        }

    }
    public static int fibonacci(int n){ //fibonacci sayısını bulan method.
        //Base case
        if (n==0 || n==1){
            return n;
        }
        //Recursive case
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int enkucukeleman(int[] arr, int index) {
        // Base Case: Dizide tek eleman kaldıysa onu döndür
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Dizinin geri kalan kısmındaki minimum değeri bul
        int minRest = enkucukeleman(arr, index + 1);

        // Küçük olanı döndür
        if (arr[index] < minRest) {
            return arr[index];
        } else {
            return minRest;
        }
    }

    public static int enbuyukeleman(int[] arr, int index) {
     //Base case:
     if (index == arr.length - 1) {
         return arr[index];
     }
     //recursive case
     int maxRest = enbuyukeleman(arr, index + 1);

     if (arr[index] > maxRest) {
         return arr[index];
     }
     else {
         return maxRest;
     }
    }















}
