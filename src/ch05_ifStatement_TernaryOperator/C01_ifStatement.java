package ch05_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

        int yasMeryem = 35;
        int yasAhmet  = 33;

        if (yasMeryem == yasAhmet) {//meryem ve ahmetin yaslari birbirine esit mi ? esit ise bu if calisir degilse calismaz
            //Condition 'yasMeryem == yasAhmet' is always 'false'
            System.out.println("ayni yastasiniz");
        }
        if (yasMeryem > 40) {//burada meryem i n yasi 40 dan buyuk mu kontrol edildi
            System.out.println("yasi 40 dan buyuk");
        }

        if (yasMeryem + yasAhmet > 50)
            System.out.println("ikisinin yaso 50 den buyuktur");
        //if else block larinda herzman {} suslu parantezler olmayabilir
        //if in scope u ilk ; noktali vurgule kladardir
























    }
}
