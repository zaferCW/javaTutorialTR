package ch31_Map.task31;

public class Task02_Kartvizit {//POJO
    String isim;
    String email;
    String adress;
    String telefon;
    int id=1000;

    public Task02_Kartvizit(String isim, String email, String adress, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adress = adress;
        this.telefon = telefon;
        this.id++;
    }
    @Override
    public String toString() {
        return "Task02_Kartvisit{" +
                "isim='" + isim + '\'' +
                ", eamil='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", telefon='" + telefon + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


}
