package ch12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
       Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
       Array olusturulurken 2 seyi declare etmeliyiz:
       1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
       2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
       array= tepsiye benzer..
       Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
        isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
        */
    public static void main(String[] args) {

        //Array tanimlama
        int a ; //primitive data type tanimlandi
        int [] arr ;//declare edilen ama deger atanmayan int data type li ARRAY

      //  System.out.println("a = " + a);//Variable 'a' might not have been initialized
      //  System.out.println("arr = " + arr);//Variable 'arr' might not have been initialized


        //task nameArray isminde isimleri tutan array create ediniz
        String [] nameArray = {"rumeysa" , "ahmet" , "zeynep" , "tommy", "ali" ,"omer"} ;
        //HEM ATAMA HEM DE TANIMLAMA YAPILAN ARRAY

        //task number tutan array create ediniz
        int [] numArray = {11 ,22 , 333 , 66 , 55 , 44 , 88 , 99 , 55 , 2,44,55,6};//dublicate e izin veriyor

       // int [] sayiArr= new int[];  ///Array initializer expected

        int [] sayiArr= new int[5]; //bu array 5 elemanli olacak demis olduk
       // heap memory de bunlar nasil bulunur

        System.out.println("sayiArr = " + sayiArr);//sayiArr = [I@3498ed reference value

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));//Arrays.toString(sayiArr) = [0, 0, 0, 0, 0]

        sayiArr[0] = 35 ;//arrayin 0. indexteki elemanina 35 degeri atandi


        System.out.println("Arrays.toString(sayiArr) = " +
                Arrays.toString(sayiArr));//Arrays.toString(sayiArr) = [35, 0, 0, 0, 0]


        sayiArr[1] = 34 ;//arrayin 1. indexteki elemanina 34 degeri atandi
        sayiArr[2] = 9 ;//arrayin 2. indexteki elemanina 9 degeri atandi
        sayiArr[3] = 48 ;//arrayin 3. indexteki elemanina 48 degeri atandi
        sayiArr[4] = 7 ;//arrayin 4. indexteki elemanina 7 degeri atandi

        System.out.println("Arrays.toString(sayiArr) = " +
                Arrays.toString(sayiArr));//Arrays.toString(sayiArr) = [35, 34, 9, 48, 7]


      //RTE  sayiArr[5] = 77 ; //arrayin 4. indexteki elemanina 7 degeri atandi

        // java.lang.ArrayIndexOutOfBoundsException


        System.out.println ("sayiArr.length = " + sayiArr.length) ; // sayiArr.length = 5
        System.out.println("nameArray.length = " + nameArray.length); //nameArray.length = 6
        System.out.println("numArray.length = " + numArray.length);  // numArray.length = 13

        //task herbir array in son elemanin print ediniz

        System.out.println("sayiArr[sayiArr.length-1] = " + sayiArr[sayiArr.length - 1]); // sayiArr[sayiArr.length-1] = 7

        System.out.println("nameArray[nameArray.length-1] = " + nameArray[nameArray.length - 1]); // nameArray[nameArray.length-1] = omer

        System.out.println("numArray[numArray.length-1] = " + numArray[numArray.length - 1]); // numArray[numArray.length-1] = 6

        //task name array deki son elemani update ediniz
        nameArray[nameArray.length-1] = "QA Omer" ;

        System.out.println("nameArray = " + nameArray);//nameArray = [Ljava.lang.String;@73f792cf

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
                //Arrays.toString(nameArray) = [rumeysa, ahmet, zeynep, tommy, ali, QA Omer]


        //loop ile array in elemanlari arasinda gezinme
        for (int i = 0; i < nameArray.length ; i++) {
            System.out.print(nameArray[i] +" ");
            //rumeysa ahmet zeynep tommy ali QA Omer
        }

        System.out.println();

        // task numArray deki cift index olan elemanlari print ediniz
        for (int i = 0; i <numArray.length ; i+=2) {
            System.out.print(numArray[i]+ " ");//11 333 55 88 55 44 6
        }

        System.out.println();

        //task name array in  elemanlarindan 5 harfli olan elemanlari print ediniz
        for (int i = 0; i <nameArray.length ; i++) {
            if (nameArray[i].length() == 5){
                System.out.println(nameArray[i]);
            }
        }

        System.out.println(" // sort //");
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayiArr);

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));



    }
}
