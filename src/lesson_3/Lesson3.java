package lesson_3;
//METHODS
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args){
        //BMI Calculator
        //Body Mass Index Calculator - это формула, которая высчитывает ваши данные исходя из роста и веса
        // Есть стандартная таблица проверки пропорций тела, если вы меньше, то надо поднабрать вес, если вы в рамках -
        // отлично, если вы больше - надо скинуть вес.

        // 1. Пригласить пользователя и объяснить
        // 2. Позволить ему ввести данные
        // 3. Обработать данные
        // 4. Вывести результаты расчета
        startBMI();

    }
    public static void startBMI (){
        //загрузочный метод
        introduceBMIcalc();
        getData();
    }

    // информирует пользователя о программе и правилах
    public static void introduceBMIcalc(){
        System.out.println("Welcome to BMI Calculator. It counts proportion of your height and weight.");
        System.out.println("You will be able to enter a value of your height in CM, your weight in KG.");
        System.out.println("***************************************************************************");
    }

    //запрашивает данные пользователя
    public static void getData(){
        Scanner input = new Scanner(System.in); //input - имя экземпляра объекта/класса Scanner
        System.out.print ("Please, enter your height in CM: ");
        double height = input.nextDouble();
        // . -> обращение к внутренностям класса/объекта; input. -> дает возможность обратиться к методам класса
        System.out.print ("Please, enter your weight in KG: ");
        double weight = input.nextDouble();

        calculateResult(height, weight); // передача данных height & weight методу calculateResult
    }
    // вычисление индекса
    public static void calculateResult (double height, double weight){
        height /= 100; // чтобы привести к метрам
        double indexBMI = weight / (height * height);

        getBMIindexMsg (indexBMI);

    }
    //Вывод результата на экран
    public static void getBMIindexMsg (double indexBMI){
        System.out.println("YOURS BMI IS: " + Math.round(indexBMI));
    }
    // в Java есть специальный математический класс Math, который позволяет использовать базовые математические операции
    // округление, квадрат, Math.floor - вниз до целого округляет, Math.round - согласно правил округления действует
    // Math.pow - возведение в степень, Math.random - получение псевдослучайных чисел

}
