import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyConstructor {

    int x=3;
    int y=5;

    public MyConstructor() {
        x+=1;//inst. variable +1 update edildi
        System.out.println("-x"+x);
    }

    public MyConstructor(int i ){
        this();//p'siz cons. call edildi   Call to 'this()' must be first statement in constructor body
        this.y = i;//conc. parametresi i değeri inst. variable y'ye atandı
        x+=y;//inst. y değeri inst. x değerine atandı
        System.out.println("-x"+x);
    }

    public MyConstructor(int i, int i2) {
        this(i2);//int p'li cons.  parametre 3 atanarak call edildi
        this.x -= i;//inst. x variable -4  update edildi
        System.out.println("-x"+x);
    }
    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4,3);//2 int parametre 4 ve 3 atanarak cons. call edildi
    }
}
