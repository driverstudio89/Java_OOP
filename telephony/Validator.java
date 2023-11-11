package telephony;

public class Validator {

    public static boolean containsDigit(String str) {
        boolean isDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                isDigit = true;
            }
        }
        return isDigit;
    }

    public static boolean containsNonDigit(String str) {
        boolean isNotDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isNotDigit = true;
            }
        }
        return isNotDigit;
    }
}
