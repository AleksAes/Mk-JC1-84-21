package home_work_1;

import java.util.Scanner;

public class OperatorsMain3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");

        int a = scanner.nextInt();
            System.out.println("Введите 1 если нужно перевести в килобайты");
            System.out.println("Введите 2 если нужно перевести в байты");

        int b = scanner.nextInt();

        if (b == 1) {
            System.out.println("Ответ равен " + a / 1024.0 );
        }
        else if (b == 2){
            System.out.println("Ответ" + a * 1024);
        }
    }
}
