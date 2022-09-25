package day011;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Max= " + getMax(5, 30));

        //verilen iki sayıdan büyük olanı tespit eden metot yazınız.


        int kucukSayi = getMin(14, 28);
        getMin(6,4);
        System.out.println("küçük sayı= "+kucukSayi);
        System.out.println("küçük Sayı= "+getMin(44,35));

    }
    public static int getMax(int x, int y){
       int max=x;
        if(y>max){
            max=y;
        }
        return max;

    }
    //verilen iki sayıdan küçük olanı tespit eden metot yazınız.
    public  static int getMin(int a,int b){
        int min=a;
        if(b<min){
            min=b;
        }
        return min;
    }
}
