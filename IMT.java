import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IMT {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double IMT = weight / Math.pow(height, 2);
            if (IMT < 18.5) {
                System.out.println("Недовес: меньше, чем 18.5");
            }
            if (IMT > 18.5 && IMT < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if (IMT > 25 && IMT < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            }
            if (IMT > 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
