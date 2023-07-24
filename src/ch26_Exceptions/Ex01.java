package ch26_Exceptions;

public class Ex01 {
    public static void main(String[] args) {
        // Aşağıdaki code output ne olur ?

        String  name="";
        try {
            name+="Hardy";
        }catch (Exception e) {
            name+="Miller";

        }finally {name+=" Java developer ";
        }
        name+="Clarusway";
        System.out.println(name);

        // Hardy Java developer Clarusway
    }
}
