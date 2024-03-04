import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//     Задача 1
//      Объявите три массива:

        System.out.println("Task1:\nОбъявите три массива: ");
        int[] arrowsInt = new int[3];  //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        arrowsInt[0] = 1;
        arrowsInt[1] = 2;
        arrowsInt[2] = 3;
        System.out.println("Целочисленный массив,1, 2 и 3 — с помощью ключевого слова new :" + Arrays.toString(arrowsInt));

        double[] arrowsDouble = new double[]{1.57, 7.654, 9.986};  //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        System.out.println("Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986 " + Arrays.toString(arrowsDouble));

        float[] arrowsFloat = new float[]{1.5f, 5.4f, 10.0f, 54f};  //Произвольный массив. Тип и количество данных определите сами.
        System.out.println("Произвольный массив:" + Arrays.toString(arrowsFloat));

//        Задача 2
//        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        System.out.println("\nTask2: \nРаспечатайте на отдельной строчке элементы каждого массива по порядку через запятую");

        for (int i = 0; i < arrowsInt.length; i++) {
            if (i == arrowsInt.length - 1) {
                System.out.println(arrowsInt[i]);
                break;
            }
            System.out.print(arrowsInt[i] + ", ");
        }

        for (int i = 0; i < arrowsDouble.length; i++) {
            if (i == arrowsDouble.length - 1) {
                System.out.println(arrowsDouble[i]);
                break;
            }
            System.out.print(arrowsDouble[i] + ", ");
        }
        for (int i = 0; i < arrowsFloat.length; i++) {
            if (i == arrowsFloat.length - 1) {
                System.out.println(arrowsFloat[i]);
                break;
            }
            System.out.print(arrowsFloat[i] + ", ");
        }
//        Задача 3
//        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
//        В конце строки запятую ставить не надо.

        System.out.println("\nTask3: \nРаспечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.");
        for (int i = (arrowsInt.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrowsInt[i]);
                break;
            }
            System.out.print(arrowsInt[i] + ", ");
        }

        for (int i = (arrowsDouble.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrowsDouble[i]);
                break;
            }
            System.out.print(arrowsDouble[i] + ", ");
        }
        for (int i = (arrowsFloat.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrowsFloat[i]);
                break;
            }
            System.out.print(arrowsFloat[i] + ", ");
        }
//        Задача 4
//        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        System.out.println("\nTask4: \n Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными");
        for (int i = 0; i < arrowsInt.length; i++) {
            if (arrowsInt[i] % 2 != 0) {
                arrowsInt[i] += 1;
            } ;
        }
        System.out.print(Arrays.toString(arrowsInt));


    }
}