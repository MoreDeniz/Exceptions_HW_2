// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа
// и выполняет их деление. Если второе число равно нулю,
// программа должна выбрасывать исключение DivisionByZeroException
// с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить результат деления.

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        while (true) {
            try {
                System.out.print("Введите число a: ");
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: некорректный ввод");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                try {
                    System.out.print("Введите число b: ");
                    b = scanner.nextInt();
                    myInput(a, b);
                } catch (DivisionByZeroException ex) {
                    System.out.println("! " + ex.getMessage());
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: некорректный ввод");
                scanner.nextLine();
            }
        }
    }

    public static void myInput(int a, int value) throws DivisionByZeroException {
        if(value == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        System.out.println(a + " / " + value + " = " + a/value);
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String mes) {
        super(mes);
    }
}

