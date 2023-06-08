package ch04_JavaOperators.jo02_AssignmentOperators;

public class C01_AtamaOperator {
    public static void main(String[] args) {

        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3


        int yas = 33 ;//create edilen yas variable ina 33 degeri atandi
        yas += 5 ;    //yas 5 artirildi ve atandi
        yas *= 2 ;    // yas 2 ile carpilip degerine atandi
        yas /= 2 ;    // yas 2 ye bolunup degerine atandi

        System.out.println("yas = " + yas);//yas = 38


    }
}
