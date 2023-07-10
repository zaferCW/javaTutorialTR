package ch19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //1. bos bir sb objesi olusturup append ile eklemek

        StringBuilder sb1 = new StringBuilder();//default capacity 16 olan value olmayan bos sb
        System.out.println("sb1.length() = " + sb1.length());  //sb1.length() = 0
        System.out.println("sb1.capacity() = " + sb1.capacity());  //sb1.capacity() = 16
            /// Twice the old capacity, plus 2

        sb1.append("javAslan"); // bos olan sb objesine javaAslan eklendi
        System.out.println("sb1 = " + sb1); //sb1 = javAslan
        System.out.println("sb1.capacity() = " + sb1.capacity());  //sb1.capacity() = 16

        sb1.append(" selam ").
                append(" nasilsin ").
                append(" maaslara zam isi noldu ").
                append(63).
                append(" ").
                append(true);
        System.out.println("sb1 = " + sb1); //sb1 = javAslan selam  nasilsin  maaslara zam isi noldu 63 true
        System.out.println("sb1.capacity() = " + sb1.capacity());  // sb1.capacity() = 70

        //2. yol String builder create etme
        StringBuilder sb2 = new StringBuilder("Tommy Lee Jones");
        System.out.println("sb2.length() = " + sb2.length()); //sb2.length() = 15
        System.out.println("sb2.capacity() = " + sb2.capacity()); //sb2.capacity() = 31
            // 16 default bos olan sb objesi icindir. burda baslangicta ekleme yapildigi icin length + 16 = capacity verir

        //trimToSize () length e dokunmaz capacity den fazlaliklari alir
        System.out.println("trimToSize()");
        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity()); //sb2.capacity() = 15
        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15

        StringBuilder sb3 = new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());//sb3.length() = 0
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 11
        sb3.append("Rumeysa hanim QA");
        System.out.println("sb3.capacity() = " + sb3.capacity()); //sb3.capacity() = 24

        //girilen indexteki karakteri getirmek icin
        System.out.println("sb3.charAt(4) = " + sb3.charAt(4));  //sb3.charAt(4) = y

        //istenen index araligindaki deger getirmek icin subSequence
        System.out.println("sb1.subSequence(3,10) = " + sb1.subSequence(3, 10)); //sb1.subSequence(3,10) = Aslan s
        System.out.println("sb1.subString(3,10) = " + sb1.substring(3, 10)); //sb1.subString(3,10) = Aslan s


        //girilen iki int index arasini siler delete()
        System.out.println("sb1.delete(3,10) = " + sb1.delete(3, 10)); //sb1.delete(3,10) = javelam  nasilsin  maaslara zam isi noldu 63 true

        //girilen int index teki karakteri silendeleteChatAt
        System.out.println("sb1.deleteCharAt(6) = " + sb1.deleteCharAt(6));
            //sb1.deleteCharAt(6) = javela  nasilsin  maaslara zam isi noldu 63 true

        //istenen indexe istenen ifadeyi ekler
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(7 , \";)\") = " + sb3.insert(7, ";)"));

        //belirli bir stringbuilder in istenen indexine verilen string in istenen index araligini ekleme
        System.out.println("sb3.insert(0,\"hi\",3,7) = " + sb3.insert(15, "hello", 1, 3));
            //sb3.insert(0,"hi",3,7) = Rumeysa;) hanimel QA


        //belirli indexteki karakteri degistirme
        sb3.setCharAt(5,'S');
        System.out.println("sb3 = " + sb3);//sb3 = RumeySa;) hanimel QA



        //istenen aralikta ki degeri siler ve yerine istenen string i ekler
        System.out.println("sb3.replace(7,9,\"mesgul\") = " + sb3.replace(7, 9, "mesgul"));
        //sb3.replace(7,9,"mesgul") = RumeySamesgul hanimel QA


    }
}
