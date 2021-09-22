package home_work_1;

import java.util.Scanner;

public class OperatorsMain10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");

        String a = scanner.next();

        switch (a) {
            case "Вася":
                System.out.println("Привет!" );
                System.out.print("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.print("Я тебя так долго ждал");
                break;
            default:
                System.out.print("Добрый день, а вы кто?");
                break;
        }
    }
}
