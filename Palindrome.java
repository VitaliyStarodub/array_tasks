package lesson_1_java_8.array_tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String string = scanner.nextLine();

        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }

        System.out.println(string.equals(reverseString) ? "is palindrome" : "is not palindrome");
    }
}
