import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static String firstFileName;
    public static String secondFileName;

    static {
        //firstFileName = "D:/input.txt";
        //secondFileName = "D:/output.txt";

        //BufferedReader reader = new BufferedReader(new FileReader());

        Scanner scanner = new Scanner(System.in);
        firstFileName = scanner.nextLine();
        secondFileName = scanner.nextLine();
        scanner.hasNextLine();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        StringBuilder builder = new StringBuilder();

        String fullFullName;
        String content = "";

        @Override
        public void run() {
            Scanner scanner = null;
            try {
                scanner = new Scanner(new java.io.FileReader(fullFullName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine()).append(" ");
            }
            content = builder.toString();
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fullFullName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return content;
        }
    }
}
