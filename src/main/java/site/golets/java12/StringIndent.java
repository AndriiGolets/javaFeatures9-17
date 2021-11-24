package site.golets.java12;

public class StringIndent {

    /**
     *  indent() adjusts the indentation of each line based on the integer parameter.
     *  If the parameter is greater than zero, new spaces will be inserted at the beginning of each line.
     *  On the other hand, if the parameter is less than zero, it removes spaces from the begging of each line.
     *  If a given line does not contain sufficient white space, then all leading white space characters are removed.
     * */
    public static void main(String[] args) {

        String text = "Hello \nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);

    }

}
