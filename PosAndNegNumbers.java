import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PosAndNegNumbers {
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
        int countp = 0;
        int countm = 0;

        if (a > 0) { //Условие положительности
            countp++; //Инкремент, если условие срабатывает
        }
        else {
            if (a < 0) {
                countm++;
            }
        }
        if (b > 0) {
            countp++;
        }
        else {
            if ( b < 0) {
                countm++;
            }
        }
        if (c > 0) {
            countp++;
        }
        else {
            if (c < 0) {
                countm++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countm);
        System.out.println("количество положительных чисел: " + countp);
    }
}
