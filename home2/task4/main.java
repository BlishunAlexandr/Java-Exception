package home2.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.printf("Введите текст: ");
        String text = scanner.nextLine();
        try {
            if (text.isEmpty()) throw new Exception();
            else System.out.println(text);;
        } catch (Exception e) {
            System.out.println("Текст не введен");
        }
    }
}


