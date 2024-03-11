import java.security.SecureRandom;

class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHAR = "!@#$%&*_=+-/"; 
    private static final String PASSWORD_ALLOW = CHAR_LOWER + CHAR_UPPER + NUMBER + SPECIAL_CHAR;
    private static final SecureRandom random = new SecureRandom();

   

    public static String generatePassword(int length) {
        if (length < 1) throw new IllegalArgumentException("Password length must be at least 1.");

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(PASSWORD_ALLOW.length());
            password.append(PASSWORD_ALLOW.charAt(randomIndex));
        }
        return password.toString();
    }
}

public class Question4
{
    public static void main(String[] args) 
    {
        try
        {
            String password = PasswordGenerator.generatePassword(Integer.parseInt(args[0]));
            System.out.println("Your password is: "+password);

        }
        catch(Exception e)
        {
            System.out.println("Some error occured: "+e.getMessage());
        }
    }    
}
