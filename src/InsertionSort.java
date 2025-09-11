public class InsertionSort { // sıralama algoritmaları : Eklemeli sıralama .Not:bubble sorta göre biraz daha verimli.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,1,6,7,8,2};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}




/* 2 temel argüman
--Key (anahtar) kullanılır.(Anahtar 1. indisli elemandan başlar.
--Anahtarın sol tarafı sıralı kabul edilir. bu yüzden algoritmanın verimliliği ortaya çıkar
--Küçük veri setlerinde daha verimlidir.
örn: 4   3   5   1   6   7   8   2
        key
     3   4   5   1   6   7   8   2 //key ile 5 karşılaştırıldığında küçük değilse sol taraf sıralı olduğu için işlem yapılmaz o yüzden algoritmanın verimliliği ortaya çıkar
            key
     3   4   5   1   6   7   8   2 //key ile 5 karşılarştırıldığında küçük olduğu için sırayla karşılaştırırlır küçük ise yer değiştirip küçük olmayana kadar işlem devam eder
                key
     1   3   4   5   6   7   8   2
                    key
     1   3   4   5   6   7   8   2 // tek tek key kontrol edilip sağa kayar ve ikiye gelir
                                key
     1   2   3   4   5   6   7   8 // sonuç

 */
