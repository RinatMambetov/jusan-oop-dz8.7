package ru.rinat;

public class Utils {

    public static String formatNumber(double number) {
        String numberStr = String.valueOf(number);
        int dotPosition = numberStr.indexOf('.');
        String beforeDot = numberStr.substring(0, dotPosition);
        return insertUnderscores(beforeDot);
    }

    private static String insertUnderscores(String number) {
        StringBuilder result = new StringBuilder();
        int length = number.length();
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (count == 3) {
                result.insert(0, "_");
                count = 0;
            }
            result.insert(0, number.charAt(i));
            count++;
        }
        return result.toString();
    }
}
