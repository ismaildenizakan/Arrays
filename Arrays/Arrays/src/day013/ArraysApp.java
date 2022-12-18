package day013;

import java.util.Scanner;

public class ArraysApp {
    public static void main(String[] args) {
        int x;
        //ilkel olmayan bir tip initialize edildiği zaman içerisinde bulunan ilkel tiplerin varsayılan değerleri
        //atanır. int -->0, double -->0.0, boolean-->false

        int[] numbers={3,5,7,9,11};//heap
        String isim="Ahmet";//heap
        Scanner i=new Scanner(System.in);//heap
        int a=4; //stack



        //int[] numbers=new int[5];

        for (int i= 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }


        }


    }

