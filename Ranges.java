package lesson_1_java_8.array_tasks;

import java.util.Scanner;

public class Ranges {
    public static void main(String[] args) {

        Scanner scanArrLength = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrLength = scanArrLength.nextInt();

        int[] array = new int[arrLength];

        Scanner scanArrElem = new Scanner(System.in);
        System.out.println("Fill in the array: ");
        for (int i = 0; i < arrLength; i++) {
            array[i] = scanArrElem.nextInt();
        }
        scanArrElem.close();


        int min_range = 0;
        int max_range = 0;
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            min_range = array[index];
            if ((array[i + 1] - array[i]) == 1) {
                max_range = array[i + 1];
            } else {
                index = i + 1;
                max_range = array[i];
                if (max_range == min_range) {
                    System.out.print("[" + max_range + "]");
                }
                if (max_range > min_range) {
                    System.out.print("[" + min_range + " " + max_range + "]");
                }
            }
        }
        System.out.print("[" + min_range + " " + max_range + "]");

    }
}