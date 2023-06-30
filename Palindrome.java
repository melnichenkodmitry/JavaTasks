public class Palindrome {
    public static void main(String[] args) {
        String word = "Ротор";
        String answer = isPalindrome(word) ? "Да" : "Нет";
        System.out.println("Слово \"" + word + "\" палиндром? " + answer);
    }

    public static boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String result = builder.toString();
        return result.equalsIgnoreCase(word);
    }
}
