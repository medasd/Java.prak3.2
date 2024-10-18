import java.util.Scanner;

public class zd4 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер числа Фибоначчи: ");
        int n = scanner.nextInt();

        System.out.println(n + "-ое число Фибоначчи: " + fibonacci(n));

        scanner.close();
    }
}
