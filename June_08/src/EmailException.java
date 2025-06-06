public class EmailException {
    public static void main(String[] args) {
        String email = "user@example.com"; // try changing to test

        try {
            if (!email.contains("@")) {
                throw new IllegalArgumentException("Invalid email format: '@' missing");
            }

            try {
                if (!email.endsWith(".com")) {
                    throw new IllegalArgumentException("Invalid domain: must end with '.com'");
                }
                System.out.println("Email is valid: " + email);
            } catch (IllegalArgumentException e) {
                System.out.println("Domain Error: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Format Error: " + e.getMessage());
        }
    }
}
