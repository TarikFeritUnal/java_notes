import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> alist_persons = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(31);
        num.add(32);

        Person john = new Person("John");
        alist_persons.add(john);

        alist_persons.add(new Person("Matthew"));
        alist_persons.add(new Person("Martin"));

        for (Person person: alist_persons) {
            System.out.println(person);
        }













    }
}