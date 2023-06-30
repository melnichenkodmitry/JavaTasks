import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DivBy {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> tmp3 = new ArrayList<>(); //Создан промежуточный список для хранения чисел, которые делятся без остатка на 2
        ArrayList<Integer> tmp2 = new ArrayList<>(); //Создан промежуточный список для хранения чисел, которые делятся без остатка на 3
        ArrayList<Integer> tmpOth = new ArrayList<>(); //Создан промежуточный список для хранения чисел, которые не вошли в первые два условия
        for (Integer x : numbers) {
            if (x % 3 == 0) {
                tmp3.add(x);
            }
            if (x % 2 == 0) {
                tmp2.add(x);
            }
            if (x % 2 != 0 && x % 3 != 0) {
                tmpOth.add(x);
            }
        }
        divBy3.addAll(tmp3);
        divBy2.addAll(tmp2);
        others.addAll(tmpOth);
        printList(divBy3);
        printList(divBy2);
        printList(others);

    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
