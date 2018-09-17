package lesson_1_java_8.array_tasks;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner scanChar = new Scanner(System.in);
        System.out.println("Enter symbol: ");
        char character = scanChar.next().charAt(0);

        Scanner scanString = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = scanString.nextLine();

        long count = string.chars().filter(ch -> ch == character).count();
        System.out.printf("Total amount of char '%c' in string is %d", character, count);

    }
}
