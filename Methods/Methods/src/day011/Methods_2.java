package day011;

public class Methods_2 {
    public static void main(String[] args) {
        int sayi1=5;
        System.out.println("5 tek mi? "+tekMi(5));
        System.out.println("6 tek mi? "+tekMi(6));

        System.out.println("Benim Yaşım = "+calculateAge(1972,2022));

    }

    //Bir sayının tek olup olmadığını test eden bir metot yazınız.
    public static boolean tekMi(int sayi){
        boolean result=(sayi%2)==1;
        return result;
    }

    //yaş hesaplayan metot yazınız.

    public static int calculateAge(int birthYear, int currentYear){
        int age=currentYear-birthYear;
   return age;
    }

}
