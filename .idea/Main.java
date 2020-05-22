import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1
        int [] arrayTask1 = {0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arrayTask1.length; i++) {
            if (arrayTask1[i] == 0) {
                arrayTask1[i] = 1;
            } else {
                arrayTask1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayTask1));

        //2
        int [] arrayTask2 = new int[8];
        for (int i = 1; i <= arrayTask2.length; i++) {
            arrayTask2[i-1] = (i - 1) * 3;
        }
        System.out.println(Arrays.toString(arrayTask2));

        //3
        int [] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] < 6) {
                arrayTask3[i] = arrayTask3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayTask3));

        //4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayTask4Size = scanner.nextInt();
        int [][] arrayTask4 = new int[arrayTask4Size][arrayTask4Size];
        for (int i = 0; i < arrayTask4Size; i++) {
            arrayTask4 [i][i] = 1;
        }
        for (int i = 0; i < arrayTask4Size; i++ ) {
            for (int j = 0; j < arrayTask4Size; j++) {
                System.out.print(arrayTask4 [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arrayTask4));

        //5
        Scanner scanner1 = new Scanner(System.in);
        int maximum;
        int minimum;
        System.out.println("Введите размер массива");
        int arrayTask5Size = scanner.nextInt();
        int[] arrayTask5 = new int[arrayTask5Size];
        System.out.println("Заполните массив значениями");
        for (int i = 0; i < arrayTask5.length; i++) {
            arrayTask5[i] = scanner1.nextInt();
        }

        maximum = arrayTask5[0];
        minimum = arrayTask5[0];

        for (int i = 1; i < arrayTask5.length; i++) {
            if (arrayTask5[i] < minimum) {
                minimum = arrayTask5[i];
            } else { minimum = minimum; }
        }

        for (int i = 1; i < arrayTask5.length; i++) {
            if (arrayTask5[i] > maximum) {
                maximum = arrayTask5[i];
            } else { maximum = maximum; }
        }

        System.out.println("Минимальное значение массива равно " + minimum);
        System.out.println("Максимальное значение массива равно " + maximum);

        //7
        array7Offset();
    }

    static void array7Offset() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int array7Size = scanner2.nextInt();
        int[] arrayTask7 = new int[array7Size];
        System.out.println("Заполните массив значениями");
        for (int i = 0; i < arrayTask7.length; i++) {
            arrayTask7[i] = scanner2.nextInt();
        }
        System.out.println("Введите смещение");
        int k = scanner2.nextInt(); //величина сдвига
        if (k > 0) {
            for (int i = 0; i < k; i++) {
                int tmp = arrayTask7[array7Size - 1];
                for (int j = array7Size - 1; j > 0; j--) {
                    arrayTask7[j] = arrayTask7[j - 1];
                }
                arrayTask7[0] = tmp;
            }
            System.out.println(Arrays.toString(arrayTask7));
        } else if (k < 0){
            for (int i = 0; i < -k; i++) {
                int tmp = arrayTask7[0];
                for (int j = 0; j < array7Size - 1; j++) {
                    arrayTask7[j] = arrayTask7[j + 1];
                }
                arrayTask7[array7Size - 1] = tmp;
            }
            System.out.println(Arrays.toString(arrayTask7));
        } else { System.out.println("Смещение равно нулю"); }

    }
}