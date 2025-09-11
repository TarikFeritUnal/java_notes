public class BubbleSort { //sıralama algoritmaları: Kabarcık sıralama
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) { //her tur için. algoritma en sağdaki eleman en büyük eleman kabul ettiği için en son elemanı kıyaslamıyoruz for döngüsü içinde.Algoritma verimliliği açısından önemlidir.
                if (arr[j] > arr[j + 1]) {
                    // Değiştir (Swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            printArray(arr);
            // Eğer iç döngüde hiç değişiklik yapılmadıysa, dizi zaten sıralıdır.Not:BubbleSort algoritmasının orijinalinde bu durdurma elemanı yok sadece ekstra verimilik için
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] dizi = {4,3,5,1,6,7,8,2};
        System.out.println("Sıralanmadan önce:");
        printArray(dizi);

        bubbleSort(dizi);

        System.out.println("Sıralandıktan sonra:");
        printArray(dizi);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}



/*
Bu algoritma O(n²) karmaşıklığına sahiptir ve büyük veri setlerinde verimsizdir. Ancak küçük veri setleri için veya eğitim amaçlı kullanışlıdır.

 Bubble Sort Algoritmasında boolean swapped Değişkeni Ne İşe Yarar?
Kodda kullandığım boolean swapped değişkeni, optimize edilmiş Bubble Sort algoritmasının bir parçasıdır. Bu değişkenin işlevi şudur:

Bir döngü turu içinde hiç değişiklik yapılmazsa, dizinin zaten sıralı olduğunu anlarız ve gereksiz döngüleri çalıştırmadan algoritmayı erken sonlandırırız.
Böylece, en kötü durumdaki O(n²) karmaşıklığı azaltılmış olur ve en iyi durumda (dizi zaten sıralıysa) O(n) gibi bir performans elde edebiliriz.

 */

