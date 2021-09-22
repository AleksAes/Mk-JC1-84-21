package home_work_1;

import java.util.Scanner;

public class OperatorsMain4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String a = "a";
        String z = "z";
        char A = 'A';
        char Z = 'Z';

            System.out.println("Введите код значения по таблице ASCII");

        int b = scanner.nextInt();

        if ( b >= 65 && b <= 90 || b >= 97 && b <= 122){
            System.out.println("Символ " + b + " соответствует символу английского алфавита");
        }
        else{
            System.out.println("Символ " + b + " не соответсуте символу английского алфавита");
        }
    }
}
