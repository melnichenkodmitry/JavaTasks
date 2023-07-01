import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RequestParser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int start = url.indexOf("?");
        String s = url.substring(start + 1, url.length());
        String[] arr = s.split("&");
        for (int i = 0; i < arr.length; i++) {
            String[] arr1 = arr[i].split("=");
            System.out.print(arr1[0] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            String[] arr1 = arr[i].split("=");

            if (arr1[0].equals("obj")) {
                try {
                    alert(Double.parseDouble(arr1[1]));
                } catch (Exception e) {
                    alert(arr1[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
