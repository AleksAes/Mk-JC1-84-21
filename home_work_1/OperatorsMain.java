package home_work_1;

public class OperatorsMain {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        if (a == 0)
            a++;

        if (b==0)
            b++;

        if ((a % 2 == 1 & b % 2 == 1) | (a == b))
            a++;

        if (a % 2 == 1) {
            System.out.print("Число " + a + " нечетное");
        }

        if (b % 2 == 1) {
            System.out.print("Число " + b + " нечетное");
        }
    }
}
