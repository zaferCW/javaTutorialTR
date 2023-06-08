package ch04_JavaOperators.tasks04;

public class Task01 {
	public static void main(String[] args) {
            int x = 4;
            x++; // 4+1=5
            x += x; // 5+5= 10
            --x; // 10-1= 9
            x = 7 + x; // 7+9= 16
            x *= x; // 16*16= 256
            x -= 3; // 256-3= 253

            System.out.println(" x = " + x);

            int a = 3;
            double d = 4.5;
            d += a; // 4.5 + 3=> d= 7.5 ve a= 3
            a += d; // 3 + 7.5=> a= 10 ve d= 7.5 -> a sayisi int oldugu icin ondalik kismi siler
            d -= a; // 7.5 - 10=> d= -2.5 ve a= 10
            a -= d; // 10 -(-2.5) => a= 12 ve d= -2.5-> burada d ile a`yi toplayip a`ya atarken yine ondalik kismi isleme katmaz
            System.out.println(" d = " + ++d);// d = -1.5 yazar
            System.out.println(" a = " + a--);// a = 12 yazar ancak bu işlemden sonra a'ya 11 değerini atar.



    }

}
