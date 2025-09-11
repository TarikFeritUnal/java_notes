import java.util.concurrent.TimeUnit;

public class takvim {
    int gun,ay,yil;


    takvim(int gun ,int ay,int yil) {
        this.ay = ay;
        this.gun = gun;
        this.yil = yil;
    }
    void takvimyazdirma() throws InterruptedException {
        gun++;
        if(gun == 30){
            ay++;
            gun = 1;
            if(ay == 12){
                yil++;
                ay = 1;
                if(yil == 9999){
                    yil = 1;
                }
            }
        }
        System.out.println(gun+"/"+ay+"/"+yil);
        TimeUnit.SECONDS.sleep(1);
        takvimyazdirma();
    }



}
