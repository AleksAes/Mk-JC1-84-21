package home_work_1;

public class OperatorsMain1 {

    public static void main(String[] args){

        int a = 8;
        int b = 14;
        int c = 11;

        if  (a > b && a < c) {
            System.out.print("Число " + a + " среднее");
        }
        else if (b > a && b < c){
            System.out.print("Число " + b + " среднее");
        }
        else if (c > a && c < b){
            System.out.print("Число " + c + " среднее");
        }
    }
}
