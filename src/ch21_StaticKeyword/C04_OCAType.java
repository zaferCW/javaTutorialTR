package ch21_StaticKeyword;

public class C04_OCAType {


    public static long square(int x){
        long y=(long)x*x;
        x=-1;
        return y;
    }

    public static void main(String[] args) {
        int value=9;
        long result=square(value);
        System.out.println("value= "+value); //9


    }

}
