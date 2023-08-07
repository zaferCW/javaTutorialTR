package ch31_Map.task31;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
             /*
        TaskSahaf.txt ->
         Key: isim ,email, adres, telefon
         Key'lere ait value'leri depolayan bir kartvizit map
          ve kartvisit isminde nested map create ederek title Key olsun
          yukaridaki map leri buna value olarak tanimla
         print eden code create ediniz.
         */

        Map<String ,String> fethiyeKartvisit = new HashMap<>();
        fethiyeKartvisit.put("isim" , "fethiye");
        fethiyeKartvisit.put("email" , "fethiye@email.com");
        fethiyeKartvisit.put("adres" , "koln");
        fethiyeKartvisit.put("telefon" , "34236589");


        Map<String ,String> asiyeKartvisit = new HashMap<>();
        asiyeKartvisit.put("isim" , "asiye");
        asiyeKartvisit.put("email" , "asiye@email.com");
        asiyeKartvisit.put("adres" , "duren");
        asiyeKartvisit.put("telefon" , "34568975");

        Map <String , Map<String, String> > kartvisit = new HashMap<>();
        kartvisit.put("QA Tester",fethiyeKartvisit);
        kartvisit.put("Developer",asiyeKartvisit);

        System.out.println("kartvisit = " + kartvisit);
//kartvisit = {QA Tester={telefon=34236589, adres=koln, email=fethiye@email.com, isim=fethiye}, Developer={telefon=34568975, adres=duren, email=asiye@email.com, isim=asiye}}

        System.out.println("kartvisit.get(\"QA Tester\") = " + kartvisit.get("QA Tester"));
//kartvisit.get("QA Tester") = {telefon=34236589, adres=koln, email=fethiye@email.com, isim=fethiye}

        System.out.println("kartvisit.get(\"Developer\").get(\"telefon\") = "
                + kartvisit.get("Developer").get("telefon"));
                ///kartvisit.get("Developer").get("telefon") = 34568975



        //task bir pojo class create edip
        // key int olarak id sini verin,  value POJO class yapisi ile map olusturun

        Map <Integer , Task02_Kartvizit > krt =  new HashMap<>();

        Task02_Kartvizit k1 = new Task02_Kartvizit("Yildiz" ,"email.com","berlin","256453343452");
        System.out.println("k1 = " + k1);
//k1 = Task02_Kartvisit{isim='Yildiz', eamil='email.com', adress='berlin', telefon='256453343452', id='1001'}

        krt.put(k1.id, k1);//map e ekleme yapildi

        System.out.println("krt = " + krt);

        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));
//krt.get(k1.id) = Task02_Kartvisit{isim='Yildiz', eamil='email.com', adress='berlin', telefon='256453343452', id='1001'}

        System.out.println("krt.get(1001) = " + krt.get(1001));
//krt.get(1001) = Task02_Kartvisit{isim='Yildiz', eamil='email.com', adress='berlin', telefon='256453343452', id='1001'}

    }
}
