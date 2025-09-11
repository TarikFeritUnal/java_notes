public class Mainclass {
    public static void main(String[] args) throws InterruptedException {
        dikdortgen dikdortgen1 = new dikdortgen(3,5);

        System.out.println("Dikdörtgenin uzunkenarı: "+dikdortgen1.uzunkenar+" Dikdörtgenin kısakenarı: "+dikdortgen1.kisakenar);

        double cevre1 = dikdortgen1.cevrehesaplama();
        double alan1 = dikdortgen1.alanhesaplama();

        System.out.println(cevre1);
        System.out.println(alan1);

        /*saat saat1 = new saat(23,59,59);
        saat1.saatyazdirma();*/

        takvim takvim1 = new takvim(3,7,2025);
        takvim1.takvimyazdirma();

       /* while(true){   // buda while döngüsü ile sayaç yapma yolu
            saat1.saatyazdirma();
            Thread.sleep(1000); //1 er saniye ara ile yazmamızı sağlıyor 1000
        } */
    }

}

