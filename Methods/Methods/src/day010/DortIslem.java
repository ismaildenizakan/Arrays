package day010;

public class DortIslem {
    public static void main(String[] args) {
        int x=7;
        int y=3;
        ikiSayiyiTopla(x,y);
        ikiSayiyiTopla(9,8);


    }
    //iki tam sayıyı toplayan bir metot yazınız. sonuç ekranda gösterilsin.
    //Örnek: iki sayının toplamı 25'dir.

    public static void ikiSayiyiTopla(int a, int b){
        int toplam=a+b;
        System.out.println(String.format("İki sayının toplamı %d.",toplam));

    }

}
