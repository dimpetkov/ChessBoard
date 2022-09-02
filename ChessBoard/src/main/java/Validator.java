public class Validator {

    static boolean isValidInt(String input) {
        int data;
        try {
            data = Integer.parseInt(input);
            return data > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
