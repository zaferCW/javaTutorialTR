package ch26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputException01 {
    /*

             Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi durumlara karşılk gelen hatalara
             Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.

            Bir kod yazilirken olasi exception'lar ongorulup
            exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.

                 1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                 2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\pc\\IdeaProjects\\JavaTutorialTR\\src\\javadanEsintiler";

        FileInputStream fis = new FileInputStream(filePath);

         /*
        Eğer bir method'da Checked (CTE riski olan excp.) exception varsa method
        signature(mnethod name'den sonraki bölüm) hata uyarısı altı kırmızı çizgi verir
        komutun derlenmesine izin vermez ve kod üzerine gelidiğimde Add...  exception handle etme
        tavsiye eder otamatih throws excp eklenir.
        Bu şekilde methodu call eden komutlat try-catch alınması garanti edilmiş olur.
         */

        int c ;
        while ( (c = fis.read()) != -1   ){//bu kod input olarak verilen dosyadan son karaktere gelene kadar calis demek
            System.out.print( (char) c );
        }

        System.out.println();
        System.out.println("fis = " + fis);//ref


    }


}
