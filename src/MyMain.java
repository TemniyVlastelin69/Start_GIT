import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        //Массивы данных и циклы
        int [] arr = new int[4]; //создали массив и выделили память под длину массива в размере 4 элементов
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.print("ВВедите число: ");
            int value = scanner.nextInt();
            arr [i] = value;
        //В результате будет предложено ввести 4 раза числовые данные в массив
        }
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minimum)
                minimum = arr[i];
            /* в итоге мы будем проверять введенные значения пока не сработает условие, в данном случае будем
            искать среди введенных значений наименьшее, чтобы в последующем вывести его на экран при помощи Sout
            */
        }
        System.out.println(minimum);

    }
}