public class Palindrome {
    public static void main(String[] args) {
        String word = "�����";
        String answer = isPalindrome(word) ? "��" : "���";
        System.out.println("����� \"" + word + "\" ���������? " + answer);
    }

    public static boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String result = builder.toString();
        return result.equalsIgnoreCase(word);
    }
}
