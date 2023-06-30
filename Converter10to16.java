public class Converter10to16 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("ƒес€тичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Ўестнадцатеричное число " + hexNumber + " равно дес€тичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hex = "";
        while (decimalNumber > 0) {
            hex = HEX.charAt(decimalNumber % 16) + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        int decimal = 0;
        if (hexNumber == null || hexNumber == "") {
            return 0;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            decimal = 16 * decimal + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimal;
    }
}
