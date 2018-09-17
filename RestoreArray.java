package lesson_1_java_8.array_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class RestoreArray {
    public static void main(String[] args) {

        Scanner scanArrLength = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrLength = scanArrLength.nextInt();


        int[] array = new int[arrLength];

        Scanner scanArrElem = new Scanner(System.in);
        System.out.println("Fill in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanArrElem.nextInt();
        }
        scanArrElem.close();

        int[] arrayNew = new int[arrLength];

        arrayNew[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            arrayNew[i] = array[i];
            if (array[i] < 0) {
                if ((array[i + 1]) > (array[i - 1])) {
                    arrayNew[i] = ((array[i - 1]) + (array[i + 1])) / 2;
                } else if ((array[i - 1]) > (array[i + 1])) {
                    arrayNew[i] = ((array[i - 1]) + (array[i + 1])) / 2;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }

}

