package ch18_ImmutableClass;

public class C03_OCA_equals {
    public static void main(String[] args) {
        String  a = "";

        String c = "2cfalse";
        a+= 2;
        a+= 'c';
        a+= false;

        System.out.println("a = " + a);
        String b = "2cfalse";
        System.out.println("b = " + b);

        if (a == b ){// bu sart calismaz reference degerleri farkli
            System.out.println("a == b calisir");
        }

        if (a == "2cfalse"){// reference yok ki kiyas yapsin
            System.out.println("a == 2cfalse calisir");
        }

        if (c == b) {//calisir ayni ref ve String constant pool da tutuldugu icin
            System.out.println("c == b calisir");

        }

        if (a.equals("2cfalse")){//calisir
            System.out.println("a equals  2cfalse");
        }
        if (a.equals(b)){//string equls ile degere bakar ve true verir
            System.out.println("a equals b");
        }
        if (c.equals(b)){//string equls ile degere bakar ve true verir
            System.out.println("c equals b");
        }


    }
}
