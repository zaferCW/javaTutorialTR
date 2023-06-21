package ch12_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyOf(arr,newLength);-> girilen arr'yin newLength kadar ilk elemanını copyalar

        int [] sayi = {84,72,63,3,39,55,66,654,85,35};

        int yeniArr[] = Arrays.copyOf(sayi, 15);

        System.out.println("Arrays.toString(yeniArr) = " +
                Arrays.toString(yeniArr));  //Arrays.toString(yeniArr) = [84, 72, 63, 3, 39, 55, 66, 654, 85, 35, 0, 0, 0, 0, 0]


        int rangeArr [] = Arrays.copyOfRange(sayi ,5,15);
        System.out.println("Arrays.toString(rangeArr) = " +
                Arrays.toString(rangeArr));  // Arrays.toString(rangeArr) = [55, 66, 654, 85, 35, 0, 0, 0, 0, 0]


        // fill methodu update icin kullanilir  istenilen değerle fuller(rukiye|)

        Arrays.fill(rangeArr,5);

        System.out.println("Arrays.toString(rangeArr) = " +
                Arrays.toString(rangeArr)); //Arrays.toString(rangeArr) = [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]


        Arrays.fill(rangeArr,2,7,0);
        System.out.println("Arrays.toString(rangeArr) = " +
                Arrays.toString(rangeArr));//Arrays.toString(rangeArr) = [5, 5, 0, 0, 0, 0, 0, 5, 5, 5]


    }
}
