import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] big = new int[20];

        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(reader.readLine());

        }

        int[] small1 = Arrays.copyOfRange(big, 0, 10);
        int[] small2 = Arrays.copyOfRange(big, 10, 20);

        for (int i = 0; i < small1.length; i++) {
            System.out.println(small1[i]);
        }

        for (int i = 0; i < small2.length; i++) {
            System.out.println(small2[i]);
        }
    }
}
