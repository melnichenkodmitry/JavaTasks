public class Converter10to2 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("���������� ����� " + decimalNumber + " ����� ��������� ����� " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("�������� ����� " + binaryNumber + " ����� ����������� ����� " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binary = "";
        while (decimalNumber > 0) {
            binary = decimalNumber % 2 + binary;
            decimalNumber = decimalNumber / 2;
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber == "") {
            return 0;
        }
        int j = binaryNumber.length() - 1;
        int decimal = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {

            decimal = decimal + Character.getNumericValue(binaryNumber.charAt(j)) * (int) Math.pow(2, i);
            j--;
        }
        return decimal;
    }
}
