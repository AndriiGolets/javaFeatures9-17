package site.golets;

public class StringApiRunner {

    public static void main(String[] args) {
        // isBlank()
        System.out.println("".isBlank());

        // strip - similar to trim() but based on Character.isWhiteSpace()
        System.out.println("  LR  ".strip());
        System.out.println("  LR  ".stripTrailing());
        System.out.println("  LR  ".stripLeading());

        // lines()
        "lin1\nline3\nline5".lines().forEach(System.out::println);

        // transform() - java 12
        System.out.println((String) "UPPER".transform(s-> s.substring(2)));

        // formatted() - java 15
        System.out.println("My name is %s. My age is %d.".formatted("Ranga", 25));


/* Java - 14
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "srt" is null
	at site.golets.StringApiRunner.main(StringApiRunner.java:24)
* */
        // String srt = null;
        // System.out.println(srt.isBlank());
    }

}
