package site.golets;

public class RecordsRunner {

    // Java 16
   record Person(String name, String email, String phoneNumber){}

    public static void main(String[] args) {
        Person person = new Person("Andrii", "a300113@gmail.com", "3060113");

        System.out.println(person);
    }

}
