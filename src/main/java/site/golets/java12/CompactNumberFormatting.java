package site.golets.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

    public static void main(String[] args) {

        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
        assert  "2.59K".equals(likesShort.format(2592));

        NumberFormat likesLong =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        likesLong.setMaximumFractionDigits(2);
        assert "2.59 thousand".equals(likesLong.format(2592));

    }

}
