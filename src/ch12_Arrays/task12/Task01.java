package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> kullanıcidan alınan değerlerle bir int array elemanlarını bukukten kucuge   print eden code create ediniz.

        Scanner input=new Scanner(System.in);

        System.out.println("kac elamanli array istersin");
        int boyut=input.nextInt();

        int [] arr=new int[boyut];//kullaniciidan alinan deger yeni array in boyutu olarak belirlendi

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
        System.out.println("seniin istedigin array budur = "+ Arrays.toString(arr));

        Arrays.sort(arr);//burada array kucukten buyuge siralandi

        for (int i = arr.length-1/*en buyuk eleman en sagda oldugu icin ordan basladik*/; i >=0 ; i--) {
            System.out.print( arr[i]+" ");
        }




    }
}
