import java.util.Scanner;

public class Lyahoveckaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 задание
        System.out.println(" Задание 1 ");
        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();

        // Или можно было бы написать (a + ">" + b)

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        
        if (b != 0) {
            System.out.println("Деление: " + (double) a / b);
        } else {
            System.out.println("Деление: На ноль делить нельзя");
        }

        scanner.nextLine(); 

        // 2 задание
        System.out.println("\n Задание 2 ");
        System.out.print("Введите строку a: ");
        String strA = scanner.nextLine();
        System.out.print("Введите строку b: ");
        String strB = scanner.nextLine();

        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // 3 задание
        System.out.println("\n Задание 3 ");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Чётные числа из массива: ");
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 

        scanner.close();
    }
}
