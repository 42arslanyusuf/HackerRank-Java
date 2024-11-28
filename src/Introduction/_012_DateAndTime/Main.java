package Introduction._012_DateAndTime;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

    }
    public static String findDay(int month, int day, int year) {
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month - 1, day);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
