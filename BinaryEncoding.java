public class BinaryEncoding {
    public static void main(String[] args) {
        String string = "JavaTasks";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            print(charArray[i]);
        }
    }

    private static void print(int number) {
        String result = String.format("����� ������� %s � ������� Unicode - %d, � � �������� ������� - %s", (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
