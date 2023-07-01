// Задача 1:
//Напишите программу, которая запрашивает у пользователя число и проверяет,
// является ли оно положительным. Если число отрицательное или равно нулю,
// программа должна выбрасывать исключение InvalidNumberException с сообщением
// "Некорректное число".
// В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;

        while (true) {
            try {
                try {
                    System.out.print("Введите число: ");
                    a = scanner.nextInt();
                    myInput(a);
                } catch (InvalidNumberException ex) {
                    System.out.println("! " + ex.getMessage());
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: некорректный ввод");
                scanner.nextLine();
            }
        }
    }

    public static void myInput(int value) throws InvalidNumberException {
        if(value <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
        System.out.println("Число корректно: " + value);
    }
}

class InvalidNumberException extends Exception{
    public InvalidNumberException(String mes) {
        super(mes);
    }
}
