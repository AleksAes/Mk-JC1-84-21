package home_work_1;

import java.util.Scanner;

public class OperatorsMain5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год");

        int a = scanner.nextInt();

        if (a % 4 == 0 )
            if (a % 100 !=0){
                System.out.println("Год " + a + " високосный");
            }

            else if(a % 100 == 0 && a % 400 == 0){
                System.out.println("Год " + a + " високосный");
            }
        else {
            System.out.println("Год " + a + " не високосный");
        }
    }
}
