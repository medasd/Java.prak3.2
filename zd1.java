import java.util.Scanner;

public class zd1 {
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; 
            number /= 10; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Сумма цифр числа: " + sumDigits(number));

        scanner.close();
    }
}
