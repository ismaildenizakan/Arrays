package day011;

/**
 * Metotların overload edilmesi
 */

public class Calculator {


    public static void main(String[] args) {
    topla(4.5,4.2);
    topla(4.3,4);

    }
    public static int topla(int x,int y){
        return x+y;
    }
    public static double topla(double x,double y){
        return x+y;
    }

}
