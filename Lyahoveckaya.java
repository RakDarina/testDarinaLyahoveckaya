import java.util.Scanner;

public class Lyahoveckaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();

        // В задании непонятно. Нужно чтобы выводило a=b или 5=5. Сделала 2 вариант, но могу и поменять на ("a = b")
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }


        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

       if (b != 0) {
            System.out.println(a + " / " + b + " = " + (double) a / b);
        } else {
            System.out.println("На ноль не делят");
        }

        scanner.close();
    }
}
