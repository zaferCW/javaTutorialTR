package ch12_Arrays.task12;

public class Task16 {
    public static void main(String[] args) {
        // task->  Mdarr'deki son elemanların çarpımını print eden code create ediniz

        int carpim=1;
        int[][] MDarr = {{1, 2, 3}, {4, 5, 6,8}, {7, 8, 9, 0,2,3,2}};

        for (int i = 0; i < MDarr.length; i++) {

            carpim*=   MDarr[i][MDarr[i].length - 1];//her dairenin son elemani al

            System.out.println("MDarr[i][MDarr[i].length - 1] = " + MDarr[i][MDarr[i].length - 1]);

        }
        System.out.println("carpim = " + carpim);

        //3 u nasil aliriz
        System.out.println("MDarr[0][2] = " + MDarr[0][2]);//3
        System.out.println("MDarr[0][MDarr.length-1] = " + MDarr[0][MDarr.length - 1]);///3


    }
}
