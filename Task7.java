import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (; true;) {
            int number = Integer.parseInt(reader.readLine());
            count += number;
            if (number == -1) {
                System.out.println(count);
                break;
            }
        }
    }
}
