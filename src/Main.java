import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static int sayi7 =5;
    public static void main(String[] args) {
        byte b1; // -127 den 127 e kadar değer alır, 1 byte = 8 bit,yaygın kullanımları yoktur
        short s1; // -32k dan +32k ya kadar değer alır; 2 byte = 16 bit, yaygın bir kullanımları yoktur
        int sayi; // 4 byte lık yer kaplar yani 32 bit
        float f1; // kesirli sayılar için değişken olarak kullanılır 4 byte
        long l1; // 8 byte yer kaplar
        double d1; // 8 byte yer kaplar kesirli sayı tanımlar
        // buraya kadar olanlar sayı değişkeni olarak kullanılır
        char c1; // karakter değişkeni tutar illaki harf olmak zorunda değil not: tek tırnak kullanılır
        // örn: 'a' '5' '='
        boolean bool = false; // ifadenin yanlış olduğunu tanımlar
        boolean bool2 = true; // ifadenin doğru olduğunu tanımlar
        // 1)boolean tanımlandığı zaman eğer if komutu kullanılacaksa parantez içine
        // bool==true yazmak yerine parantez içine bool yazmak yeterlidir çünkü
        // boolean sadece doğru veya yanlış değer alır ifin okuması için ekstra
        // bi tanımlama yapmaya gerek yoktur

        //örn: bunu yapmak yerine
        boolean ifade = false;
        if (ifade == true) { // ifade true olmadığı için bu blok çalışmaz
            System.out.println("ifade=doğrudur");
        } else if (ifade == false) { // ifade false olduğu için bu blok çalışır
            System.out.println("ifade=yanlıştır");
        }
        // bunu yapmak daha mantıklı
        boolean ifade = false;
        if (ifade) {  // ifade zaten bir boolean, == true yazmaya gerek yok
            System.out.println("ifade=doğrudur");
        } else if (!ifade) {  // ! ifade ifadenin false olup olmadığını kontrol eder
            System.out.println("ifade=yanlıştır");
        }
        // yada en sade haliyle şöyle yazılabilir
        boolean ifade = false;
        if (ifade) {  // ifade true ise çalışır
            System.out.println("ifade=doğrudur");
        } else {  // ifade false ise çalışır
            System.out.println("ifade=yanlıştır");
        }
        //üstteki kodun en sade hali olmasını sağlayan şey iki ifade olduğu için dğru olduğunu kontrol etmesi yeterlidir değilse zaten false dur o yüzden else(değilse=else) yazmak yeterlidir.


        String str = "s.a world"; // bir cümle tanımlar algoritma hafızasına kaydeder


        int sayikesirli = 3.5; // bu kod çalışmaz çunkü int komutu sadece tam sayıları tanımlar

        int sayi = 5;
        sayi = sayi + 5; // yada sayi+=5 diyede yazılabilir
        sayi = sayi * 5;
        sayi = sayi / 5;// int tanımlaması sadece tam sayı olduğu için en küçük tam sayıya eşitler mesela 20/3 normalde 6.6 devirli iken ekrana 6 sayısı çıkar
        //eğer bu sayıyı kesirli çıkarmak istiyorsan double olarak yeni bir değişken ata atadığın sonuç olusn ardından birde böldüğün sayıyı kesirli yaz çünkü tamı tama bölersen sonuç kesirli çıkmaz yada değikenlerden birini işelm içinde 1.0 ile çarp
        double sayi2 = sayi / 3; //en sondada sayi2 yi print etmek gerekir
        sayi = sayi + 10 / 5; // işlem önceliğine dikkat et 10 u 5 e böler sonra sayıyla toplar
        //string komutu ilede toplama çıkarma gibi işlemleri yapabiliriz
        //örn.
        String str = "merhaba";
        String isim = "tarık";
        String mesaj;

        mesaj = str + isim;
        System.out.println("mesaj = " + mesaj);
        // uzun değişken adı kullanmaktan çekinme çünkü zaten intelijjde yazması rahat ve senin için tamamlıytor ve ilerde iş yaptığın zaman başka bi yazılımca yada sen o işe geri döndüğü zaman anlaşılması kolay olur unutulmaz 

        // kullanıcıdan veri alma nasıl yapılır

        Scanner oku = new Scanner(System.in); //ide otomatik olarak scannerı tanımladığı için heryerde kullanabiliriz
        int sayi5;
        System.out.println("bir sayı giriniz: "); // eğer println yerine print kullanırsan alt satıra geçmez o yüzden kod çalışırken  bir sayı girinizin altına değil yanına girersin
        sayi5 = oku.nextInt(); //kullanıcıdan veri alma kodu next int yerine başka tanımlamalarda yapılabilir

        System.out.println("Girmiş olduğunuz sayı= " + sayi5);
        /* System.exit(0); kodun kapanmasını sağlar */
        String yeniisim;
        System.out.print("isminizi giriniz");
        yeniisim = oku.next(); // kullanıcıdan veri alır eğer sadece next ile kullanılırsa girdiğimiz ismin boşluktan sonrasını okumaz ama nextLine dersek okur

        System.out.println("merhaba +" + yeniisim);


        // if else bloklarında string tanımlaması yapıldığı zaman == işareti kullanılmaz onun yerine str.equals kalıbı kullanılır


        String string = "ferro";
        if (str.equals("ferro")) {

            System.out.println("isim eşittir ferro");

        } // köşeli parantezin yani scorpların içinde tanımladığımız değişkenler sadece o scorplara özgü olur onun dışında çalışmaz tekrardan tanımlamak gerekir

        int sayi9 = 10;
        int sayi7 = 9; // ben bu class içerisinde sayi7 yi tanımladğım için scorp dışındaki int sayi = 5; tanımlamam geçersiz sayılır

        if (sayi9 == 10) {

            int sayi7 = 5; // eğer scorp dışında sayi7 yi tanımlarsak scorp içindeki tanımlama geçersiz sayılır

            System.out.println(sayi9); // ama scorpun dışında tanımladığım scorpun içinde geçerli
        } else {

            int sayi7 = 8;  // bu kod hata vermez ve else bloğunda çalıştırdığımız sout kodu 8 verir eğer sayi7 yi tanımladığımız scorp dışında print edersek ana classdaki 5 değerini alırız
            System.out.println(sayi7);// buradaki sayi 7 değişkenini tanıyamaz çünkü o değişkeni if bloğundaki scorpa yazdık
            // eğer sayi7 yi main classımın dışına tanımlarsam algılamaz çünkü static değil
            // bundan dolayı sayi9 public static void mainin içide olduğu için ana scorpun içindeki scorplarda tanımlanabiliyor
            // sayi 7 yi static yapmak için başına static eki getiriyoruz ve sayi 7 tanımlı oluyor

        }
        // DÖNGÜLER

        for (int i = 0; i < 10; i++) {       //ilk yazılan dögünün nerden başlayacağıdır ikinci yazılan döngünün hangi duruma kadar süreceğini söyler üçüncüde yapılacak olan işlemi söyler
            // yani burdaki döngünün açılımı "önce i ye bir başlangıç değeri atadım sonra i 10 dan küçük olduğu sürece i yi birer bire arttırdım" demek

            System.out.println("i = " + i);
            if (i / 5 * 5 == i)
                break; //break; komutu döngüden çıkma anlamındadır yani i sayısı beşe bölünüyorsa döngüden çık anlamına geliyor
            continue; //continue komutu for düngüsüne devam etme kodudur for döngüsü bitene kadar devam ettirir döngü bitmeden alt satıra geçirmez


            int sayi31 = 31;
            while (sayi31 > 0) { //while döngüsü koşul sağlandığı sürece geçerli olur yani sayi31 değişkeni 0 dan büyük olduğu sürece scop içindeki komutları çalıştırır
                System.out.println(sayi31);
            }
            do
            { //do direkt yap komutu verir for veya while gibi şarta bağlı değildir eğer önce do kullanılırsa do yu bitirir sonra while döngsüne girer şartı uyarsa

            }

            switch (sayi) {  // parantez içi neyi kontrol ettiğimi gösterir ardından örneğin kontrol ettiği değer 1 ise case 1 deki işlemleri yapar eğer 2 ise 2 deki
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                default: // default komutu ise kontroller sonucu sayı ile case yapısı eşleşmez ise en son durum olarak yapılır if else mantığındaki else benzer koşulların hiçbiri gerçekleşmezse default komutu çalışır2r+
                    System.out.println("seçim yanlış");
            }


            // matematiksel işlemler
            int taban = 5;
            int us = 2;
            int sayi22 = -6;
            int sayi23 = Math.abs(sayi22); //Math.abs kodu sayının mutlak değerini alır Math.abs komutundan sonra istediğimiz veri tipimne atayabiliriz illaki int den inte zorunlu değil
            System.out.println(sayi23);  //sonuç 6 olarak çıkar çünkü Math.abs kodu girilen sayının mutlak değerini alır
            long sayi55 = Math.round(sayi55); //Math.round kodu sayıyı en yakın tam sayıya yuvarlar
            double sayi552 = Math.random(); //Math.random 0 ile 1 arasında rastgele bir sayı üretir satı 0 ile 1 arasında olduğundan kesirli olur oyüzden double veya floot değişkeni kullanılır
            double sayi553 = Math.random() * 10; //Math.random 0 ile 1 arasında rastgele bir sayı üretir satı 0 ile 1 arasında olduğundan kesirli olur oyüzden double veya floot değişkeni kullanılır eğer () parantezinden sonra herhangi bir sayı ile çarparsam 0 ile o sayı arasında sayı üretir yani 0 ile 10 arasında üretir +1 eklersek *10 un sonuna 0 ile 11 arasında sayı üretir
            int sayi554 = Math.random() * 10; //Math.random 0 ile 1 arasında rastgele bir sayı üretir üretilen sayının bir tam sayı olmasını istiyorsak başındaki değişkeni int yaparız ve defaultda double olduğu için inte çevirmekl için tip dönüşümü yaparak dounle ı inte çeviriririz
            int sayi555 = Math.max(5, 6);// bu iki sayı arasından büyük olanı yazar  max yerine min yazarsam küçük olan değeri alır
            int sayi556 = (int) Math.sqrt(9);// karekökünü alır burda tip dönüşümü yapmazsak hata verir çünkü karekök bir tam sayı olmadığından çıkan sonuç  3.0 olur onuda inte çevirmek gerekir
            double sonuc = Math.pow(taban, us); // bu komut üs almaya yarar ilk yazılan taban olur ikinci yazılan ise üs olur
            double sonuc2 = Math.ceil(5.42);//Math.ceil komutu ondalıklı olan sayı yukarı yuvarlar yani kendinden büyük olan en yakın tamsayıya yuvarlar sonuç 6 çıkar
            double sonuc3 = Math.floor(sayi); //Math.floor komutu ondalıklı olan sayıyı aşşağıya yuvarlar yani kendinden küçük olan en yakın tamsayıya yuvarlar

            // dizile r

            int[] dizi = new int[10]; //10 elemanli bir dizi olusturur ikinci kapali parantez ici dizi uzunlugunu belirler
            int[] dizi2 = new int[]{43, 45, 763, 67474, 324, 76, 6, 5, 7, 8, 76, 34,};// dizinin elemanlarini manuel olarakda belirleyebiliriz
            System.out.println(dizi.length);//bu komut dizinin uzunlugunu yazdirir
            System.out.println(dizi2[3]);// dizinin 3. elemanini yazmaya yarar
            //Not:dizi elamanlarinin sirasi 0 dan degil 1 den baslar ornek olarak dizi 2 deki 0. eleman 43 dur 1. eleman ise 45 dir
            int[] dizi3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// bu sekildede yazilabilir diziler
            int h = 2;
            dizi3[h] = dizi3[4] + dizi3[6];// burdaki kod dizinin 4. ve 6/ elemanlarini toplayip cikan sonucu dizideki h. yani 2. ci eleman yerine atar
            int[][] ciftkatlidizi = {{3, 5, 6, 5, 85, 5}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};// çift katlı dizi yapmak için int in yanına iki tane kapalı parantez koyuyoruz
            System.out.println(ciftkatlidizi[1][3]); // çift katlı dizilerde yazdırılırkende iki tane kapalı parantez kullanılır önce sout yazılır sonra hangi diziyi sonrada hangi elemanını yazdıracağımız yazılır ilk yazılan kaçıncı dizi olduğu ikinci yazılan ise seçilen dizinin kaçıncı elemanı olduğu
            String[] arabamarkalari = {"volvo", "bmw", "ford"}; // string değişken tipindede dizi oluşturabiliriz burda dikkat etmemiz gereken dizideki elemanlar string olduğu için "" tırnak içinde yazılması gerekir
            arabamarkalari[0] = "opel"; //dizideki belirli bir elemanı değiştirmek için = ifadesini kullanarak atama yaparız
            //dizi elemanlarını yazdırmak için iki farklı yöntem vardır
            //1. yöntem klasik for döngüsü kullanarak (bu yöntem çalışır ama her zaman elverişli değildir)
            for (int ze = 1; ze < arabamarkalari.length; ze++) {   //burda ze diye bir değişken tanımladık ondan sonra ze yi dizimizin eleman sayısından küçük olduğu sürece arttırdık sonrada her seferinde dizinin ze. elemanını yazdırdık
                System.out.println(arabamarkalari[ze]);
            }
            //2. yöntem dizilere özel bir for döngüsü kullanmaktır
            for (String araba : arabamarkalari) {
                System.out.println(araba);
            }

            // string islemleri
            String string1 = "Hello World";
            int k = string1.indexOf(" ");// indexOf komutu parantez icine yazilan degeri bulur stringin kacinci elemani oldugunu yani kacincio index oldugunu bulur ve onu integer olarak tutar
            System.out.println(str.length());// stringin karakter uzunlugunu yazdirir not:bosluklarida sayar
            String string2 = string1.substring(0); // stringden yeni bir string olusturur .substring den once hangi stringden kopartilicaksa o stringin ismi yazilir parantezin icine yazilan deger hangi indexden sonrasini alacagini belirtir istersek iki index vererek baslanngic ve bitis indexlerini ayarlayabiliriz bu direkt hello world yazdirir eger 1 yazarsak ello world yazdirir yazilan iki degerden 1. olani yazdirir ikinci yazdigimizi almaz
            String string3 = string1.toUpperCase();// bu kod stringin tum harflerini buyuk harfe cevirir LowerCase dersek kucultur
            String string4 = string1.replace("o", "O");// replace kodu parantez icine yazilan ilk harfi ikinci harfe cevirir ne kadar harf varsa hepsini cevirir;

            if (string1.contains("o")) { // bu kod stringin  icinde varmi yokmuyu kontrol eder bir suru kod var string1. yaparak acilan pencereden tum komutlari gorebilirsin
                System.out.println("Cumlenin icinde o harfi var.");
            } else System.out.println("Cumlenin icinde o harfi yok.");

            //Tip dönüşümleri
            int t = 50;
            double dbl = 3.14;
            // t = dbl           // bu kod calismaz cunku double bir degeri integer bir tam sayiya donusturemeyiz
            t = (int) dbl;       // bu kod calisir cunku deger atamasi yapmadan once tip donusumu yaptik double i inte cevirdik eger bu sonucu ekrana yazdirirsak 3 cikar cunku double i inte cevirdigimiz icin kesirli olan kismi atar sadece tam sayi olan kisim kalir not:eger deger 3.99 olsaydi yine uc yazdirirdi cunku sayi yuvarlama yok sadece kesirli kismi atma var

            // String s=t;         // bu kod calismaz cunku tanimlama degerleri farkli biri integer biri string bunlari esitlemek icin tip donusumu yapmamiz gerekiyor
            String s = String.valueOf(t); // bu kod t degerini stringe cevirdi cevirmek istedigimiz veri tipi yazarken pencerede cikar

            String strr = "12";
            //t=strr; // bu kod calismaz cunku string bir ifadeyi inte cevrilmez

            i = Integer.valueOf(strr);// bu kod strr stringinin integer degerini alip degistirir stringi inte cevirir
            // print f formati
            int sayi89 = 55;
            System.out.printf("%,d", sayi89);// %,d olursa yazdirilan sayiyi yuzdelik ondalik virgullerle ayirir
            System.out.printf("%d", sayi89);// bu kodda cift tirnak icindeki %d komutu bosluk atmaya yarar basina hangi sayiyi girersen o kadar bosluk birakir
            // %d olmasi int tipinde yazdirdigimiz icin double icin %f kulllanmak gerekir
            double doublesayi89 = 55.45 / 82;
            System.out.printf("%10.2f", doublesayi89);// bu kod sayiyi yazdirirken %.2f yazdigimiz icin virgulden sonraki iki sayiyi yazdirir sadece yani hangi sayiyi yazarsak o kadar virgulden sonrasini yazar noktanin soluna yazdigimiz sayi ise sayiyi print ederken kac basamak print edecegini belirler
            // stringdede ayni mantik vardir

            String sttr = "Merhaba Dunya";
            System.out.printf("%s", sttr);// stringde ise %s ile yazdiriyoruz mantik yine ayni soluna s nin soluna yazdigimiz sayi kadar yer aciyor
            System.out.printf("%17s", sttr);// tanimladigimiz string degerinden index olarak kucuk birsey yazarsak yine stringi yazdirir stringin index degerinden buyuk birsey yazdirirsak once string degerini yaazdirir ondan sonra kalan index sayisini bosluk olarak yazdirir %s nin soluna veya saginada bir yazi yazarsak onuda ekler nereye yazarsak

            //Array listler

            ArrayList<Integer> list = new ArrayList<>(); // array list bir siniftir buyuktur kucuktur isareti icine dizinin sinifi yazilir normal dizilere gore siniri bell' degildir veya elemani olmasina gerek yoktur istersek eklenebilir
            ArrayList<Objects> list3 = new ArrayList<>(); // < > icine object yazarak farkli turde veri tipleri ekleyebiliriz
            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));// bu dizi turune eleman eklemek icin Arrays.asList() koymak gerekir
            list2.add(12);// bu arraylistlere eleman ekleme kodudur dizinin sonuna ekler //array listlerde sinif olusturulabildigi icin normal diziler gibi manuel ekleme islemi yapmayiz ve islemler hizlanir
            System.out.println("Dizi boyutu :" + list2.size());// dizi boyutunu yazdirmak icin normal dizilerdeki lenght kullanilmaz onun yerine .size kullanilir
            list2.add(2, 100); // bu kod ise normal dizilerde oldugu gibi indexi 2 olan elemanin yerine 100 atamaz onun yerine 2. indexe 100 u ekler diger kalanlari birer basamak saga kaydirir. sadece eklemedir cikartmaz sadece belirledigimiz indexe atar \
            list2.set(1, 100);// bu kod ise elemani belirledigimiz indexdeki sayi ile degistirir
            list2.remove(2);// bu kod ise indexini yazdigimiz elemanin diziden silinmesine yarar
            System.out.println(list2.get(1));// bu kod ise dizinin icinden bir elemani cagirmaya yarar .get() kodu ile yapilir
            // not: Seçim, uygulamanın gereksinimlerine bağlıdır. Örneğin, sabit boyutlu ve hızlı erişim gerekiyorsa diziler, esnek boyutlama ve kolay kullanım gerekiyorsa ArrayList tercih edilebilir.

            // METOTLAR:

            // Tanimi:Java'da metotlar, bir sınıfın içinde tanımlanan ve belirli bir görevi gerçekleştirmek için kullanılan kod bloklarıdır. Metotlar, programın modülerliğini artırarak kodun yeniden kullanılabilir, okunabilir ve düzenlenebilir olmasını sağlar. Bir metot, genellikle bir işlevi yerine getirmek için giriş (parametre) alabilir, bu girişler üzerinde işlemler yapabilir ve bir sonuç (return) döndürebilir veya sadece bir işlemi gerçekleştirebilir.
            // metototlar yazılırken main classın dışına yazılır yani dış scopuna
            int[] metotdizi = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            diziyaz(metotdizi);// metotlar hazır fonksiyonlar gibidir fonksiyonu ana class dışında oluşturduktan sonra kullanmak için çağırmamız gerekiyor çağırmak içinde metodun ismini yazdıktan sonra parantez içinde hangi veriyi kullanmak istiyorsak onu yazmamız gerekli
            // metodu kolay yolla yazmak istiyorsak üsteki gibi yeni bir metod ismi yazıp parantez içini doldurduğumuz zaman hatalı kod olur ardındanda hatayı düzelt diyip metodu ide ye oluşturttururuz
            int toplam = diziyitopla(metotdizi);// burada diziyi topla metodunu kullanarak gerekli işlemleri yapıp değeri döndürdük
            System.out.println(toplam); // burda ise fonkisyon ile değer atadığımız toplamı yazdırırız
            int toplamaislemi = toplama(4, 5); // burada metodu oluşturdukdan sonra otomatik olarak ide value yani değişken atadı i1 i2 diye
            double toplamaislemi2 = toplama(4.4, 5.5);// aynı isimle farklı değişken tipinde aynı metodu tekrar oluşturabiliriz ide otomatik algılar hangi değişkenli metodu kullanacağını yani burda double kullandığımız için double değikeni olan toplama metodunu kullanır
            System.out.println(toplamaislemi2);
            // recursive fonksiyonlarda faktöriyel işleminde for döngüsü kullanmak daha verimlidir recursive hem yavaş hemde veri kullanımı fazla.

        }
            // MATRİSLER:javada matrisler çok boyutlu dizilerdir satır ve sütundan oluşur
            int [][] matris = new int[2][5];//iki katlı dizi gibi yazılır ama ilk scopa yazılan satır ikinci scopea yazılan sütundur yani iki satır 5 sütundan oluşan boş bir dizidir
            int [][] matris2 = { //matrisi manuel olarak oluşturduğumuz zaman yazımı bu şekildedir
                    {1,2,3,4},
                    {5,6,7,8},   // scoplar arasında , bulunması gerekir ve en sonda süslü parantezin sonuna noktalı virgül konulması gerekir
                    {9,10,11,12}
            };
        System.out.println(matris2[1][3]); //matris elemanlarına erişimde iki katlı dizi ile aynıdır 1. satırın 3. sütununu yazdırır yani çıktı olarak 8 alırız
        matris2[2][3] = 20; // 3. satır, 4. sütun değerini 20 olarak günceller

        //matris elemanlarını yazdırma

        for (int i = 0; i < matris2.length; i++) { // satırları döndürürüz ilk satırdan sonra alttaki for a girer ve sütunları döndürür
            for (int j = 0; j < matris2[i].length; j++) { //
                System.out.print(matris2[i][j] + " ");
            }
            System.out.println(); // Her satırı yazdırdıktan sonra diğer  satıra geçmek için boşluk yazdırırız
        }

        //matris işlemleri
        //transpoz alma : bir matrisin transpozu satır ve sütunların yerini değiştirmesi ile elde edilir
        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        // transpoz örnekleri
       /* Orijinal Matris:
        1 2 3
        4 5 6

        Transpoz Matris:
        1 4
        2 5
        3 6     */
        /*
        1 2 3      1 4 7
        4 5 6  ->  2 5 8
        7 8 9      3 6 9    */ // Kare matrislerde (satır ve sütun sayısı eşit olduğunda) transpoz işlemi, köşegen (diagonal) elemanlar sabit kalacak şekilde elemanların yer değiştirmesiyle yapılır.

        //matris toplamı : matris toplamı yapabilmek için satır ve sütun sayılarının aynı olması gerekiyor
        //örnek kod:
        public static int[][] matrisToplama(int[][] A, int[][] B) {
            int satir = A.length; // a matrisinin uzunluğu ile satır sayısını bulup bir değişkene atıyoruz.
            int sutun = A[0].length; // a matrisinin 0 satırının kaç elemanlı olduğunu bulup bir değişkene atıyoruz yani dizinin sütununu buluyoruz
            int[][] C = new int[satir][sutun]; //burada bulduğumuz satır ve sütunu kullanarak yeni bir matris oluşturuyoruz

            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    C[i][j] = A[i][j] + B[i][j]; // iki matrisinde aynı elemanlarını toplayarak yeni matrisimize atıyoruz
                }
            }
            return C;
        }
        // düzensiz arraylar : her satır farklı sütun uzunluğuna sahip olabilir
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];  // 2 elemanlı ilk satır
        jaggedArray[1] = new int[4];  // 4 elemanlı ikinci satır
        jaggedArray[2] = new int[3];  // 3 elemanlı üçüncü satır

        // dot product işlemi:Java'da dot product (nokta çarpımı veya skaler çarpım), iki vektörün karşılık gelen elemanlarının çarpılıp toplamının alınmasıyla elde edilen bir sayıdır.
        public static int dotProduct(int[] a, int[] b) {
            if (a.length != b.length) {
                throw new IllegalArgumentException("Vektörlerin boyutları eşit olmalı!");
            }

            int result = 0;
            for (int i = 0; i < a.length; i++) {
                result += a[i] * b[i];
            }
            return result;
        }




















    }




  //sa world intelijin commit özelliğini test ediyoruz.













    private static double toplama(double v, double v1) {
        return v+v1;// değeri return ettikten sonra dışarda ayrı bir değikene atamamız gerekir.

    }

    private static int toplama(int i, int i1) {
        return i+i1;

    }

    private static int diziyitopla(int[] metotdizi) {    // burada void yerine int yazmamızın sebebi metodumuzu bir int değişkenine atamamızdan
        int toplam=0;
        for (int i = 0; i < metotdizi.length; i++) {
            toplam+=metotdizi[i];
      }
    return toplam;
    } // burada hata vermesinin sebebi döndürdüğümüz değeri dışarı çıkarmamamız hatayı düzeltmek için return kodunu kullanmamız gerekiyor
      // methodların sıralaması önemli değil

    private static void diziyaz(int[] metotdizi) { // burada void olmasının sebebi bizim bir değer döndürmememiz sadede print ettiğimiz için yani sayısal bir değerler uğraşmadığımız için void yazdık
        for (int i = 0; i < metotdizi.length; i++) {
            System.out.println(metotdizi[i]);
        }
    }
}