package site.golets.java12;

public class StringTransform {

    public static void main(String[] args) {
        // transform() - java 12
        System.out.println((String) "UPPER".transform(s-> s.substring(2)));
    }

}
