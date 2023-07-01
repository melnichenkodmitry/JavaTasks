import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class NOD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        if (b > a) { //Меняет местами значения переменных так, чтобы a всегда была больше b
            int k = b;
            b = a;
            a = k;
        }
        for (int i = b; i > 0; i--) { //Цикл начинается с конца. Когда происходит первое совпадение, то цикл останавливается
            if (b % i == 0 && a % i == 0) { //Если a и b целочисленно делятся на i, то это и есть НОД
                System.out.println(i);
                break;
            }
        }
    }
}
