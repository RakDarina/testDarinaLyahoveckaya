import java.util.Scanner;

public class Lyahoveckaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        // Сравнение
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        // Арифметика
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

       if (b != 0) {
            System.out.println(a + " / " + b + " = " + (double) a / b);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        scanner.close();
    }
}
