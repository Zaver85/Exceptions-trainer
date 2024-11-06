/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

package hw.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if ("".equals(str)) {
            throw new Exception("Введена пустая строка!");
        } else {
            System.out.println(str);
        }
    }
}
