import java.util.ArrayList;

public class Practice_1128_2 {
    public static void main(String[] args) {
        APCalendar a1 = new APCalendar();
        int x = a1.dayOfWeek(1,10,2000);
        System.out.println(x);
    }
}

class APCalendar {

    // Returns true if year is a leap year and false otherwise.
    private static boolean isLeapYear(int year) {
        // implementation not shown
        return false;
    }

    //  Returns the value representing the day of the week for the first day of year,
    // where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
    private static int firstDayOfYear(int year) {
        // implementation not shown
        return 3;
    }

    //  Returns n, where month, day, and year specify the nth day of the year.
    //  Returns 1 for January 1 (month = 1, day = 1) of any year.
    //  Precondition: The date represented by month, day, year is a valid date.
    private static int dayOfYear(int month, int day, int year) {
        // implementation not shown
        return 10;
    }

    //  Returns the number of leap years between year1 and year2, inclusive.
    //  Precondition: 0 <= year1 <= year2
    public static int numberOfLeapYears(int year1, int year2) {
        int x = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                x = x + 1;
            }
        }
        return x;
    }

    //  Returns the value representing the day of the week for the given date
    //  (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
    //  and 6 denotes Saturday.
    //  Precondition: The date represented by month, day, year is a valid date.
    public static int dayOfWeek(int month, int day, int year) {
        int x = firstDayOfYear(year);
        int y = dayOfYear(month, day, year);

        int theDay = y - 1;
        for (int i = 0; i < theDay; i++) {
            x = x + 1;
            x = x % 7;
        }
        return x;
    }
}