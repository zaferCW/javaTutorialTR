package ch15_Varargs;

public class Task01 {
    public static void main(String[] args) {

        /*
        Task ->
        verilen Stringleri birlestiren concat isimli METHOD create ediniz.
        String [] arr1 = {  "m", "e", "r", "v", "e"};
        String [] arr2 = {  "a", "l", "i"};

        input : "m", "e", "r", "v", "e";
        output : merve

        input : "a", "l", "i";
        output : ali
         */

        String [] arr1 = {  "m", "e", "r", "v", "e"};
        String [] arr2 = {  "a", "l", "i"};

        concat(arr1);
        concat(arr2);
        concat("arr2","java","software","development");
        concat("tester","qa","sdet","scrum", "master");



    }

    private static void concat(String... var) {
        String  ss= "";
        for (String w : var   ) {
            ss += w;
        }
        System.out.println(ss);
    }
}
