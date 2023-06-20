package ch12_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Array elemanı varlığını  kontrol etme...
        //istenen sayiyi arrayda varmi yokmu kontrol ediniz

        int [] numbers= {12,13,55,66,35,3,4,34,33,63,72};

        int istenenSayi = 35;

        int count =0;
        boolean flag = false;

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] == istenenSayi){
                count++;
                flag = true ;
                break;
            }
        }

        //count mantigi ile bulma
        if (count >=1 ){
            System.out.println("senin sayi bizde var " +istenenSayi);
        }else System.out.println("yoktur senin sayi bizde");

        System.out.println("senin sayinin adeti  = " + count);

        //flag mantigi ile kontrol
        if (flag){//flag true ise calisir
            System.out.println("senin istedigin sayi var bizim array de "+istenenSayi);
        }else System.out.println("senin sayi bizim array de yoktur");


        Arrays.sort(numbers);
        System.out.println("numbers = " + numbers); // numbers = [I@79698539
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        // Arrays.toString(numbers) = [3, 4, 12, 13, 33, 34, 35, 55, 63, 66, 72]

        System.out.println("Arrays.binarySearch(numbers,istenenSayi) = " +

                Arrays.binarySearch(numbers, istenenSayi));//Arrays.binarySearch(numbers,istenenSayi) = 6




    }
}
