package lesson_1_java_8.array_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        arrRotation_v_1();

        arrRotation_v_2();
    }

    private static void arrRotation_v_1() {

        int inputValues[] = new int[2];

        Scanner scanValues = new Scanner(System.in);
        System.out.println("Enter array length and number of elements for moving: ");
        for (int i = 0; i < inputValues.length; i++) {
            if ((inputValues[i] = scanValues.nextInt()) <= 0) {
                throw new IllegalArgumentException("You values must not be negative");
            }
        }

        int arrayLength = inputValues[0];
        int elemForMoving = inputValues[1];

        int[] array = new int[arrayLength];

        Scanner scan = new Scanner(System.in);
        System.out.println("Fill in the array: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] = scan.nextInt()) <= 0) {
                throw new IllegalArgumentException("Array length must be higher than 0!");
            }
        }

        int currIndex = 0;
        int newIndex = 0;
        int backupVal = array[currIndex];
        int newVal = array[currIndex];

        for (int i = 0; i < array.length; i++) {
            currIndex = newIndex;
            newIndex = (arrayLength - elemForMoving + currIndex) % arrayLength;
            backupVal = array[newIndex];
            array[newIndex] = newVal;
            newVal = backupVal;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void arrRotation_v_2() {

        int inputValues[] = new int[2];

        Scanner scanValues = new Scanner(System.in);
        System.out.println("Enter array length and number of elements for moving: ");
        for (int i = 0; i < inputValues.length; i++) {
            if ((inputValues[i] = scanValues.nextInt()) <= 0) {
                throw new IllegalArgumentException("You values must not be negative");
            }
        }

        int arrayLength = inputValues[0];
        int elemForMoving = inputValues[1];
        int restElem = arrayLength - elemForMoving;

        int[] array = new int[arrayLength];

        Scanner scan = new Scanner(System.in);
        System.out.println("Fill in the array: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] = scan.nextInt()) <= 0) {
                throw new IllegalArgumentException("Array length must be higher than 0!");
            }
        }

        int[] movedElements = new int[elemForMoving];
        int[] arrayNew = new int[arrayLength];

        for (int i = 0; i < elemForMoving; i++) {
            movedElements[i] = array[i];
        }

        for (int i = 0; i < restElem; i++) {
            arrayNew[i] = array[i + restElem - 1];
        }

        for (int i = 0; i < elemForMoving; i++) {
            arrayNew[i + restElem] = movedElements[i];
        }
        System.out.println(Arrays.toString(arrayNew));
    }

}
