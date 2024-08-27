import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        int result =0;
        while (true){
            System.out.println("Введите путь к файлу: ");
            String path= new Scanner(System.in) .nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) {
                System.out.println("Указанный путь ведет к файлу, который не существует!");
                continue;
            } else if (isDirectory){
                System.out.println("Указанный путь ведет к папке!");
                continue;
            }
            result++;
            System.out.println("Путь указан верно. Это файл номер " + result);
            }
        }

    }