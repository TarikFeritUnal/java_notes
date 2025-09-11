public class film {
    private final String film_name; // burdaki final kodu değişkenin değerinin atandıktan sonra değiştirilmemesi içindir yani constructor de atama yaptıktan sonra birdaha atama yapılmaz.
    private int duration;

    film(String film_name, int duration) {
        this.film_name = film_name;
        this.duration = duration;
    }

    public void print() {
        System.out.println(film_name+"\t"+duration);
    }




}
