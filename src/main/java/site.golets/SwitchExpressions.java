package site.golets;

public class SwitchExpressions {

    public static String findDayOfTheWeek(int day) throws IllegalAccessException {
        String dayOfWeek = "";
        switch (day) {
            case 0:
                dayOfWeek = "Sunday";
                break;
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            default:
                throw new IllegalAccessException("Invalid Option : " + day);
        }
        return dayOfWeek;
    }

    // Switch Expression -> Java 14
    public static String findDayOfTheWeekSwitchExpr(int day) throws IllegalAccessException {
        String dayOfWeek =
        switch (day) {
            case 0 -> {
                System.out.println("Some complex logic");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> throw new IllegalAccessException("Invalid Option : " + day);
        };
        return dayOfWeek;
    }

    public static void main(String[] args) {

    }

}
