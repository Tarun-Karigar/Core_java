public class ColorCode {
    public static void validateColorCode(String code) {
        if (code == null || !code.matches("^#[0-9A-Fa-f]{6}$")) {
            throw new IllegalArgumentException("Invalid color code: " + code);
        }
        System.out.println("Valid color code: " + code);
    }

    public static void main(String[] args) {
        String colorCode = "#1A2B3C"; // change to test invalid codes

        try {
            validateColorCode(colorCode);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
