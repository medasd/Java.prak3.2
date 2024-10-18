import java.util.Scanner;

public class zd3 {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1; 
        }
        return a * power(a, n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Введите степень: ");
        int n = scanner.nextInt();

        System.out.println(a + " в степени " + n + " равно " + power(a, n));

        scanner.close();
    }
}
