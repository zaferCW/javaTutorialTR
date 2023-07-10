package ch19_StringBuilder;

public class SB_OCA01 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println("sb1 = " + sb1);// sb1 = abbaccca
    }
}
