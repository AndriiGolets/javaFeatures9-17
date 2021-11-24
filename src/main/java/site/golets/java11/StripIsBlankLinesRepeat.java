package site.golets.java11;

public class StripIsBlankLinesRepeat {

    public static void main(String[] args) {
        // isBlank()
        System.out.println("".isBlank());

        // strip - similar to trim() but based on Character.isWhiteSpace()
        System.out.println("  LR  ".strip());
        System.out.println("  LR  ".stripTrailing());
        System.out.println("  LR  ".stripLeading());

        // lines()
        "lin1\nline3\nline5".lines().forEach(System.out::println);

        // repeat(int n)
        System.out.println("abc".repeat(3));

    }

}
