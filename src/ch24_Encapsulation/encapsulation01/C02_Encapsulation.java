package ch24_Encapsulation.encapsulation01;

public class C02_Encapsulation {

    /*
    //POJO class create ederken yapilacaklar
    1 -> field larin yazilmasi ve encapsule edilmesi
    2 -> constructorlarin create edilmesi
    3 -> toString methodunun vreate edilmesi
    4 -> getter ve setter larin create edilmesi
     */

   private int id ;
   private  String name;

    public C02_Encapsulation() {
    }

    public C02_Encapsulation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

  // public void setId(int id) {
  //     this.id = id;
  // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name = " + name);
    }

    public int idGetirenMethod(){
        return id;
    }

    @Override
    public String toString() {
        return "C02_Encapsulation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
