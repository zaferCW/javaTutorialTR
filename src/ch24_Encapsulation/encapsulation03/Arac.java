package ch24_Encapsulation.encapsulation03;

public class Arac {

     /*
        TASK
    1- fieldları(encapsulated) model(String), renk(String), motor(int),
    yil (int)
   olan Arac  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- Runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const ile , 1 adet parametresiz cons ile , toplam 3 adet
    araba create ediniz

    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı
   veri girisine karsi kontrol ediniz.
     */
    private String model ;
    private String renk ;
    private int motor;
    private int yil;

    public Arac() {
    }

    public Arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        setMotor(motor);
        setYil(yil);
      //  this.motor = motor;
      //  this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor < 1000){
            System.out.println("findik kadar motor mu olur yakitlar pahali galiba");
            this.motor = 1001 ;

        }else this.motor = motor;


    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            System.out.println("eksi yil girdin farkinda misin");
            this.yil = (-1) * yil;
        }else if (yil> 2025) {
            System.out.println("o yilda ki arabanin burda ne isi var");
            this.yil = 2023 ;
        }else  this.yil = yil;

    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
