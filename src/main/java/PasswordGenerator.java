import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";

    public static String generate(int length, boolean useUpper, boolean useDigits, boolean useSpecial) {
        StringBuilder charPool = new StringBuilder(LOWERCASE);
        if (useUpper) charPool.append(UPPERCASE);
        if (useDigits) charPool.append(DIGITS);
        if (useSpecial) charPool.append(SPECIAL_CHARACTERS);

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        System.out.println(generate(12, true, true, true));
    }
}
