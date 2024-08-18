import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Сумма чисел равна: " + sum);
        int difference  = firstNumber - secondNumber;
        System.out.println("Разность чисел равна: " + difference );
        int product = firstNumber * secondNumber;
        System.out.println("Произведение чисел равно: " + product);
        double  quotient  = (double) firstNumber / secondNumber;
        System.out.println("Частное чисел равно: " + quotient);
    }
}
