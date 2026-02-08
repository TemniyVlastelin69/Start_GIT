package HomeWork_les3;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        // для проверки Метода убрать обозначение комментария "//"
        //setSeasonsSwitch ();
        //setSeasonsIfElse ();
        //setEvenOddNumber ();
        //setTemperatureParameters();
        //setColorRainbow();
        //enterOddNumbers();
        //outputNumbers();
        //getSumNumbers();
        //outputSequence();
        //outputNewSeq();
        //outputSquareNumbers();
//        outputFibonacсi();
        //calculateDeposit();
//        int[] arr = new int[]{3, 4, 5, 6};
//        int summa1 = summaArray(arr);
//
//        System.out.println(summa1);
        tabl();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    //Задание 1. Написать программу для вывода названия поры года по номеру месяца с применением switch case
    //зима-1,2,12; весна - 3,4,5; лето - 6,7,8; осень - 9,10,11
    public static void setSeasonsSwitch() {
        System.out.print("Введите числовое значение месяца для определения поры года: ");
        int num = input().nextInt();
        switch (num) {
            case 1:
                System.out.println("Зима - Winter");
                break;
            case 2:
                System.out.println("Зима - Winter");
                break;
            case 3, 4, 5:
                System.out.println("Весна - Spring");
                break;
            case 6:
                System.out.println("Лето - Summer");
                break;
            case 7:
                System.out.println("Лето - Summer");
                break;
            case 8:
                System.out.println("Лето - Summer");
                break;
            case 9:
                System.out.println("Осень - Autumn");
                break;
            case 10:
                System.out.println("Осень - Autumn");
                break;
            case 11:
                System.out.println("Осень - Autumn");
                break;
            case 12:
                System.out.println("Зима - Winter");
                break;
            default:
                System.out.println("Введены не корректные данные");
        }
    }

    //Задание 2. Написать программу для вывода названия поры года по номеру месяца с применением if-else-if
    public static void setSeasonsIfElse() {
        System.out.print("Введите числовое значение месяца для определения поры года: ");
        int num = input().nextInt();

        if (num == 1 || num == 2 || num == 12) {
            System.out.println("Зима - Winter");
        } else if (num == 3 || num == 4 || num == 5) {
            System.out.println("Весна - Spring");
        } else if (num == 6 || num == 7 || num == 8) {
            System.out.println("Лето - Summer");
        } else if (num == 9 || num == 10 || num == 11) {
            System.out.println("Осень - Autumn");
        } else {
            System.out.println("Введены не корректные данные");
        }

        if (num < 1 || num > 12) {
            System.out.println("Введены не корректные данные");
        } else if (num < 3 || num == 12) {
            System.out.println("Зима - Winter");
        } else if (num < 6) {
            System.out.println("Весна - Spring");
        } else if (num < 9) {
            System.out.println("Лето - Summer");
        } else {
            System.out.println("Осень - Autumn");
        }
    }

    /*Задание 3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное
    число или нет. Для определения четности числа используйте операцию получения остатка от деления - операция выглядит
    так: '% 2').
         */
    public static void setEvenOddNumber() {
        System.out.print("Введите число для определения его четности: ");
        int num = input().nextInt();
        int res = num % 2;

        if (res == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }

    /*Задание 4. Для введенного числа t (температура на улице) вывести
    Если t>–5, то вывести «Тепло».
    Если –5>= t > –20, то вывести «Нормально».
    Если –20>= t, то вывести «Холодно».
         */
    public static void setTemperatureParameters() {
        System.out.print("Введите число градусов на улице: ");
        int t = input().nextInt();

        if (t > -5) System.out.println("Тепло");
        else if (t > -20) System.out.println("Нормально");
        else System.out.println("Холодно");
    }

    //Задание 5. По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.)
    public static void setColorRainbow() {
        System.out.print("Введите число от 1 до 7 для определения цвета радуги: ");
        int num = input().nextInt();
        switch (num) {
            case 1:
                System.out.println("Числу " + num + " соответствует красный цвет радуги");
                break;
            case 2:
                System.out.println("Числу " + num + " " + "соответствует оранжевый цвет радуги");
                break;
            case 3:
                System.out.println("Числу " + num + " " + "соответствует желтый цвет радуги");
                break;
            case 4:
                System.out.println("Числу " + num + " " + "соответствует зеленый цвет радуги");
                break;
            case 5:
                System.out.println("Числу " + num + " " + "соответствует голубой цвет радуги");
                break;
            case 6:
                System.out.println("Числу " + num + " " + "соответствует синий цвет радуги");
                break;
            case 7:
                System.out.println("Числу " + num + " " + "соответствует фиолетовый цвет радуги");
                break;
            default:
                System.out.println("Введены не корректные данные");
        }
    }

    /*Задание 6. При помощи цикла for вывести на экран нечетные числа от 1 до 99. При решении используйте операцию
    инкремента (++).
         */
    public static void enterOddNumbers() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) continue;

            System.out.println(i);
        }
    }

    //Задание 7. Необходимо вывести на экран числа от 5 до 1. При решении используйте операцию декремента (--).
    public static void outputNumbers() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    /* Задание 8. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    все числа от 1 до введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.
         */
    public static void getSumNumbers() { //помог AI
        System.out.print("Введите целое положительное число больше нуля: ");
        int num = input().nextInt();

        int res = 0; //начальное значение результата 0, пока нет совершенных действий по суммированию

        for (int i = 1; i <= num; i++) {
            /* Пока значение переменной не достигнет числа, которое мы ввели, увеличиваем данную переменную на единицу.
            Конечный результат получаем путем суммирования нулевого результата с постоянно (пока не достигнем значения
            введенного числа i<=num (Scanner) ) инкрементируемой переменной и затем выводим на экран сумму.
                         */
            res = res + i;
        }
        System.out.println("Сумма значений чисел от 1 до " + num + " равна: " + res);
    }//решено с помощью AI

    /* Задание 9. Необходимо, чтоб программа выводила на экран вот такую последовательность:
    7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    В решении используйте цикл while.
            ***версия AI***
          int iStart = 7;
          int iEnd = 98;
          while (iStart <= iEnd){
          System.out.println(iStart);
          iStart+=7;
          }
                */
    public static void outputSequence() { //моя версия
//        int i = 7;
//        while (i >= 7 && i <= 98) {
//            System.out.println(i);
//            i += 7;
//            if (i % 7 != 0) {
//                continue;
//            }
//            if (i > 98) {
//                break;
//            }

        int i = 7;

        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
//        }
    }

    // Задание 10. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void outputNewSeq() { //с помощью AI
        for (int i = 0; i < 10; i++) { //объявим новую переменную i, которая будет принимать значения из
            // последовательности и пока 0 <= i < 10 будем увеличивать i на 1 (0,1,2,3,4,5,6,7,8,9)
            System.out.print(i * -5 + " ");  // Вывод первых 10 чисел последовательности
        }
    }//решено с помощью AI

    // Задание 11. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    public static void outputSquareNumbers() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Квадрат числа " + i + " равен: " + i * i);
        }
    }

    // Задание 12. Выведите на экран первые 11 членов последовательности Фибоначчи.
    public static void outputFibonacсi() {
        //решил только данным примитивным методом, поскольку не смог найти решения через циклы. Были мысли с массивами,
        // (как оказалось AI также предложил решение через массив) но сам я не смог додумать до конца решение через них.
        // *** решение данной задачи через AI***
        /* Количество членов последовательности Фибоначчи
        int n = 11;

        // Массив для хранения чисел Фибоначчи
        int[] fibonacci = new int[n];

        // Первые два числа Фибоначчи
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Генерация последовательности Фибоначчи
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        // Вывод последовательности
        for (int i = 0; i < fib.length; i++) {
            System.out.print(num + " ");
            }
         */
//        int a, b, c, d, e, f, g, h, i, j, k;
//        a = 0;
//        b = 1;
//        c = a + b;
//        d = b + c;
//        e = c + d;
//        f = d + e;
//        g = e + f;
//        h = f + g;
//        i = g + h;
//        j = h + i;
//        k = i + j;
//        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " \n" +
//                +j + " " + k);

        int first = 0;
        int second = 1;

        System.out.print(first + " " + second);

        for (int i = 1; i <= 9; i++) {
            int next = first + second;
            System.out.print(" " + next);

            first = second;
            second = next;
        }
    }

    // Задание 13. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    //Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную
    // сумму вклада с учетом начисления процентов за каждый месяц.
    //Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
    public static void calculateDeposit() { //float программа просит изменить на дабл
        System.out.print("Введите сумму вклада: ");
        float deposit = input().nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int period = input().nextInt();

        float sum = 0.0f;
        sum = (float) ((float) deposit + deposit * 0.07 * period);
        System.out.println(sum);
    }

    //Задание 14. Вывести на экран таблицу умножения.

    /* Задание не выполнял. Вижу решение через запрос числа и последующий вывод через System.out.println с помощью
    ф-ции switch case String-го значения таблицы. Например, на вывод поставить при запросе числа 2: 2х0=0: 2x1=2 и тд
     */
    public static void tabl() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }


    public static int summaArray(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        return sum;
    }
}