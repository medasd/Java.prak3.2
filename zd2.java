import java.util.Scanner;

public class zd2 {
    // Метод, который возвращает факториал числа
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // Рекурсивный вызов
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        // Вызов метода factorial и вывод результата
        System.out.println("Факториал числа: " + factorial(number));

        scanner.close();
    }
}
