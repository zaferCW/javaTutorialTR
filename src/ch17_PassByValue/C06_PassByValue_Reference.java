package ch17_PassByValue;

public class C06_PassByValue_Reference {
    public static void main(String[] args) {

        int x = 10;

        //pass by value ornegi
        incrementInt(x);
        System.out.println("x = " + x);

        //pass by reference ornegi
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("arr = " + arr); //arr = [I@6b2fad11

        System.out.println("method call oncesi arr[0] = " + arr[0]);
        incrementArr(arr);
        System.out.println("method call sonrasi arr[0] = " + arr[0]);

    }
    private static void incrementArr(int[] arr) {
        arr[0]=arr[0]+1;
        System.out.println("method icinden arr[0] " +arr[0] );
    }

    private static void incrementInt(int x) {
        x += 1;
        System.out.println("meethod icinden x "+x);
    }
}
