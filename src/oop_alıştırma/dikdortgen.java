public class dikdortgen {
    double uzunkenar;
    double kisakenar;


    dikdortgen(int uzunkenar, int kisakenar) {
        this.uzunkenar = uzunkenar;
        this.kisakenar = kisakenar;
    }

    double cevrehesaplama(){ //uzunkenar ve kısakenar anaclassda tanımlı olduğu için parametre girmemize gerek yok
        return 2*uzunkenar+2*kisakenar;
    }
    double alanhesaplama(){
        return uzunkenar*kisakenar;
    }


}