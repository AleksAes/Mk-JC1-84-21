package home_work_1;

import java.util.Scanner;

public class OperatorsMain9 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String a = scanner.next();

        if (a.equals ("Вася")){
            System.out.println("Привет!");
            System.out.print("Я тебя так долго ждал");
        }

        else if (a.equals ("Анастасия")) {
            System.out.print("Я тебя так долго ждал");
        }

        else {
            System.out.print("Добрый день, а вы кто?");
        }
    }
}
