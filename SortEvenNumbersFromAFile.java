import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEvenNumbersFromAFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream("D:/" + s));
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            list.add(a);
        }
        reader.close();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            }
        }

        for (Integer x : list1) {
            System.out.println(x);
        }
        scanner.close();
    }
}
