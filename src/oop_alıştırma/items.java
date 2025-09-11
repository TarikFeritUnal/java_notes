import java.time.LocalDate;
import java.time.LocalTime;

public class items {
    private String itemsname;
    LocalDate current_date;
    LocalTime current_time;


    items(String name) {
        current_date = LocalDate.now();
        current_time = LocalTime.now();
        this.itemsname = name;
    }
    public void print() {
        System.out.println(itemsname+"\t"+current_date+"\t"+current_time);
    }


}
