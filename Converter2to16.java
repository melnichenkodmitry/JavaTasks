public class Converter2to16 {
    public static final String HEX = "0123456789abcdef";
    private static final String[] BINARY = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};


    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("ƒвоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Ўестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null || binaryNumber.equals(""))
            return hexNumber;
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) < 48 || binaryNumber.charAt(i) > 49) {
                return hexNumber;
            }
        }


        while (binaryNumber.length() % 4 != 0)
            binaryNumber = 0 + binaryNumber;

        for (int a = 0; a < binaryNumber.length() / 4; a++) {
            int i = a * 4;
            String ABC = "";
            for (int g = 0; g < 4; g++) {
                ABC = ABC + binaryNumber.charAt(i);
                i++;
            }
            int TEMP = 0;
            for (int b = 0; b < 4; b++) {

                int tempc = 0;
                if (ABC.charAt(b) == 49)
                    tempc = 1;

                TEMP += (int) (tempc * Math.pow(2, ABC.length() - 1 - b));

            }
            hexNumber = hexNumber + HEX.charAt(TEMP);
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null || (hexNumber.replaceAll("[0-9, a-f]", "")).length() > 0) {
            return binaryNumber;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            for (int j = 0; j < HEX.length(); j++) {
                if (hexNumber.charAt(i) == HEX.charAt(j)) {
                    binaryNumber += BINARY[j];
                }
            }
        }
        return binaryNumber;
    }
}
