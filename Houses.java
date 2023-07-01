import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Houses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt((reader.readLine()));

        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }

        if (sum1 > sum2) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (sum2 > sum1) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else if (sum1 == sum2) {

        }

    }
}
