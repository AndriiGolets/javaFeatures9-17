package site.golets.java16;

public class JavaRecords {

    // Java 16
   record Person(String name, String email, String phoneNumber){}

    public static void main(String[] args) {
        Person person = new Person("Andrii", "a300113@gmail.com", "3060113");

        System.out.println(person);
    }

}
