package HomeWork_les3;

import java.util.Scanner;

public class HomeWork {

    public static void main (String[] args){
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


    }
    public static Scanner input (){
        return new Scanner (System.in);
    }

    //Задание 1. Написать программу для вывода названия поры года по номеру месяца с применением switch case
    //зима-1,2,12; весна - 3,4,5; лето - 6,7,8; осень - 9,10,11
    public static void setSeasonsSwitch (){
        System.out.print("Введите числовое значение месяца для определения поры года: ");
        int num = input().nextInt();
        switch (num){
            case 1:
                System.out.println("Зима - Winter");
                break;
            case 2:
                System.out.println("Зима - Winter");
                break;
            case 3:
                System.out.println("Весна - Spring");
                break;
            case 4:
                System.out.println("Весна - Spring");
                break;
            case 5:
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
    public static void setSeasonsIfElse (){
        System.out.print("Введите числовое значение месяца для определения поры года: ");
        int num = input().nextInt();
        if (num == 1 || num == 2 || num == 12) System.out.println("Зима - Winter");
        else if (num == 3 || num == 4 || num == 5) System.out.println("Весна - Spring");
        else if (num == 6 || num == 7 || num == 8) System.out.println("Лето - Summer");
        else if (num == 9 || num == 10 || num == 11) System.out.println("Осень - Autumn");
        else System.out.println("Введены не корректные данные");
    }

    /*Задание 3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное
    число или нет. Для определения четности числа используйте операцию получения остатка от деления - операция выглядит
    так: '% 2').
         */
    public static void setEvenOddNumber (){
        System.out.print ("Введите число для определения его четности: ");
        int num = input().nextInt();
        int res = num % 2;
        if (res == 0) System.out.println("Вы ввели четное число");
        else System.out.println("Вы ввели нечетное число");
    }


    /*Задание 4. Для введенного числа t (температура на улице) вывести
    Если t>–5, то вывести «Тепло».
    Если –5>= t > –20, то вывести «Нормально».
    Если –20>= t, то вывести «Холодно».
         */
    public static void setTemperatureParameters () {
        System.out.print ("Введите число градусов на улице: ");
        int t = input().nextInt();
        if (t > -5) System.out.println("Тепло");
        else if (t <= -5 && t > -20) System.out.println("Нормально");
        else if (t <= -20) System.out.println("Холодно");
        else System.out.println("Введены некорректные данные");
    }

    //Задание 5. По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.)
    public static void setColorRainbow (){
        System.out.print ("Введите число от 1 до 7 для определения цвета радуги: ");
        int num = input().nextInt();
        switch (num){
            case 1:
                System.out.println("Числу " + num + " " + "соответствует красный цвет радуги");
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
    public static void enterOddNumbers (){
        for (int i = 0; i < 100; i++){
            if (i %2 == 0)
                continue;
            System.out.println(i);
        }

    }

    //Задание 7. Необходимо вывести на экран числа от 5 до 1. При решении используйте операцию декремента (--).
    public static void outputNumbers (){
        for (int i = 5; i > 0; i--){
            System.out.println(i);
        }
    }

    /* Задание 8. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    все числа от 1 до введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.
         */
    public static void getSumNumbers (){ //помог AI
        System.out.print ("Введите целое положительное число больше нуля: ");
        int num = input().nextInt();
        int res = 0; //начальное значение результата 0, пока нет совершенных действий по суммированию
        for (int i = 1; i <= num; i++){
            /* Пока значение переменной не достигнет числа, которое мы ввели, увеличиваем данную переменную на единицу.
            Конечный результат получаем путем суммирования нулевого результата с постоянно (пока не достигнем значения
            введенного числа i<=num (Scanner) ) инкрементируемой переменной и затем выводим на экран сумму.
                         */
            res += i;
        }
            System.out.println("Сумма значений чисел от 1 до " + num + " равна: " + res);
    }//решено с помощью AI

    /* Задание 9. Необходимо, чтоб программа выводила на экран вот такую последовательность:
    7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    В решении используйте цикл while.

          int iStart = 7; //версия AI
          int iEnd = 98;
          while (iStart <= iEnd){
          System.out.println(iStart);
          iStart+=7;
          }
                */
    public static void outputSequence(){ //моя версия
        int i = 7;
        while (i >= 7 && i <=98){
            System.out.println(i);
            i+=7;
            if (i %7 != 0){
                continue;
            } if (i > 98){
                break;
            }
//
        }


    }

    // Задание 10. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void outputNewSeq (){ //с помощью AI
        int n = 10; // Количество элементов последовательности
        for (int i = 0; i < n; i++) { //объявим новую переменную i, которая будет принимать значения из
            // последовательности и пока 0 <= i < 10 будем увеличивать i на 1 (0,1,2,3,4,5,6,7,8,9)

            int number = i * -5; // объявим новую переменную number, которая будет принимать значения интересующей
            //последовательности с учетом изменяемого значения i

            System.out.print(number + " ");  // Вывод первых 10 чисел последовательности
        }

    }//решено с помощью AI

    // Задание 11. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    public static void outputSquareNumbers(){
        for (int i = 10; i <= 20; i++){
            int res = i * i;
            System.out.println("Квадрат числа " + i + " равен: " + res);
        }

    }


}
