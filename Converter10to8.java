public class Converter10to8 {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("ƒес€тичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("¬осьмеричное число " + octalNumber + " равно дес€тичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) {
            return 0;
        }
        int octal = 0;
        for (int i = 0; decimalNumber != 0; i++) {
            octal = octal + decimalNumber % 8 * (int) Math.pow(10, i);
            decimalNumber /= 8;
        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) {
            return 0;
        }
        int decimal = 0;
        for (int i = 0; octalNumber != 0; i++) {
            decimal = decimal + octalNumber % 10 * (int) Math.pow(8, i);
            octalNumber /= 10;
        }
        return decimal;
    }
}
