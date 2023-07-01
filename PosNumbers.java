import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PosNumbers {
    public static void main(String[] args)
            throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        String e = reader.readLine();
        String f = reader.readLine();
        int a = Integer.parseInt(d);
        int b = Integer.parseInt(e);
        int c = Integer.parseInt(f);
        int count = 0;

        if (a > 0) {
            count ++;
        }
        if (b > 0) {
            count ++;
        }
        if (c > 0) {
            count ++;
        }
        System.out.println(count);
    }
}
