package home2.task1;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class main {
    public static void main(String[] args) {
        boolean flag = false;
        while (flag == false) {
            try {
                Scanner scanner = new Scanner(System.in); 
                System.out.printf("Введите число: ");
                float number = scanner.nextFloat(); 
                flag = true; 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введено не число");
            } catch (Exception e) {
                System.out.println("Неизвестная ошибка");
            }
        }  
    }
}
