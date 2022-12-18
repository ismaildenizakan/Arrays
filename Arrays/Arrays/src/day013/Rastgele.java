package day013;

public class Rastgele {
    public static void main(String[] args) {
        //ratgele 10 adet tamsayı üretiniz.(0-100 aralığında)
        int[] ratgeleSayilar=new int[10];
        for (int i = 0; i < ratgeleSayilar.length; i++) {
            ratgeleSayilar[i]=(int)Math.round(Math.random()*100);
            System.out.print(ratgeleSayilar[i]+" ");

        }
        System.out.println("Toplam =" +toplam);
    }
}
