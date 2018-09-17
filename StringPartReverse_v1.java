package lesson_1_java_8.array_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class StringPartReverse_v1 {
    public static void main(String[] args) {

        stringPartReverse_v1();
    }

    private static void stringPartReverse_v1() {
        Scanner scanCharArray = new Scanner(System.in);
        System.out.println("Enter string: ");
        String userString = scanCharArray.nextLine();

        char[] array = userString.replaceAll("\\s", "").toCharArray();

        Scanner scanStartIndex = new Scanner(System.in);
        System.out.println("Enter start index: ");
        int startIndex = scanStartIndex.nextInt();

        Scanner scanEndIndex = new Scanner(System.in);
        System.out.println("Enter end index (max " + (array.length - 1) + "): ");
        int endIndex = scanEndIndex.nextInt();

        //int counter = startIndex;
        for (int i = endIndex; i > endIndex / 2; i--) {
            char temp = array[startIndex];
            array[startIndex] = array[i];
            array[i] = temp;
            startIndex++;
        }
        System.out.println(Arrays.toString(array));
    }
}
