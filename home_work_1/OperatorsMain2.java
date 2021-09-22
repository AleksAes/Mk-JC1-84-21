package home_work_1;

public class OperatorsMain2 {

    public static void main(String[] args){

        int a = 12;
        int b = 3;
        int c = a / b;
        int d = a % b;

        if (c >= 1 ){
            System.out.println("Число " + a + " делится на " + b );
            System.out.println("Частное равняетя " + c );
            System.out.println("Остаток равен " + d );
        }
        else
            System.out.print("Число " + a + " не делится нацело на " + b);
    }
}
