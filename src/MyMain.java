import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        System.out.println("***********************************************************************************");
        System.out.println("***Добро пожаловать в базовый калькулятор для вычислений стандартных матопераций***");
        System.out.println("-----------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double res;

        System.out.print("Укажите действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine(); //без этого калькулятор не сможет работать, т.к. в функцию выше будет определено
        //значение из nextDouble для num2

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат сложения чисел: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат вычитания чисел: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат умножения чисел: " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("ERROR");
                }
                else {
                    res = num1 / num2;
                    System.out.println("Результат деления чисел: " + res);
                }
                break;
            default:
                System.out.println("Введены некорректные данные");
        }
    }
}