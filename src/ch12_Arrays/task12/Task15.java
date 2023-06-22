package ch12_Arrays.task12;

public class Task15 {
    public static void main(String[] args) {
        //task-> MDarr  tum elemalarının çarpımını print eden code create edinz
        int [][] arrMD={ {1,2,3 }, { 9,8} };

        int carpim=1;

        for (int kat = 0; kat <arrMD.length ; kat++) {
            for (int daire = 0; daire < arrMD[kat].length ; daire++) {
                carpim*=arrMD[kat][daire];
            }
        }
        System.out.println("carpim = " + carpim);


//        for (int i = 0; i <arrMD.length ; i++) {
//            for (int j = 0; j < arrMD[i].length ; j++) {
//
//            }
//        }



    }
}
