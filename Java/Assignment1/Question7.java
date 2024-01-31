public class Question7 {
    // Write a program to use different String methods. 
    
    public static void main(String[] args) {
        // Create a sample string
        String sampleString = "Hello, World!";

        // 1. Length of the String
        int length = sampleString.length();
        System.out.println("1. Length of the string: " + length);

        // 2. Convert to lowercase
        String lowercaseString = sampleString.toLowerCase();
        System.out.println("2. To Lowercase: " + lowercaseString);

        // 3. Convert to uppercase
        String uppercaseString = sampleString.toUpperCase();
        System.out.println("3. To Uppercase: " + uppercaseString);

        // 4. Substring
        String substring = sampleString.substring(7);
        System.out.println("4. Substring from index 7: " + substring);

        // 5. Concatenation
        String newString = sampleString.concat(" How are you?");
        System.out.println("5. Concatenation: " + newString);

        // 6. Replace
        String replacedString = sampleString.replace("Hello", "Hi");
        System.out.println("6. Replace: " + replacedString);

        // 7. Check if a string contains a substring
        boolean containsWorld = sampleString.contains("World");
        System.out.println("7. Contains 'World': " + containsWorld);

        // 8. Index of a character
        int indexOfComma = sampleString.indexOf(',');
        System.out.println("8. Index of ',': " + indexOfComma);

        // 9. Split a string
        String[] words = sampleString.split(" ");
        System.out.println("9. Split into words:");
        for (String word : words) {
            System.out.println("   " + word);
        }

        // 10. Trim leading and trailing spaces
        String stringWithSpaces = "   leading and trailing spaces   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("10. Trimmed String: '" + trimmedString + "'");
    }
}
