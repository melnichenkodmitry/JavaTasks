public class WordCount {
    public static void main(String[] args) {
        String string = "��� ������ ����������?";
        int getWordCount = getWordCount(string);
        System.out.println("���������� ���� � ������ \"" + string + "\" ����� " + getWordCount);
    }

    public static int getWordCount(String string) {
        String[] words = string.split(" ");
        int count = 0;
        for (String word : words) {
            count++;
        }
        return count;
    }
}
