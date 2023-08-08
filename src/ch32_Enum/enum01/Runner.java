package ch32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
        //Task -> enum dan alacaginiz objeden  ay
        // ismine göre kaç gün çektiğini
        // print eden code create ediniz

          Aylar ay =  Aylar.AGUSTOS;

        System.out.println("ay = " + ay);//ay = AGUSTOS
        System.out.println("ay.name() = " + ay.name()); //ay.name() = AGUSTOS

        System.out.println("ay.hashCode() = " + ay.hashCode());//ay.hashCode() = 3447021

        System.out.println("ay.ordinal() = " + ay.ordinal()); //ay.ordinal() = 7

        switch (ay){
            case OCAK:
                System.out.println("31 gun icerir");
                break;

            case SUBAT:
                System.out.println("subat 28 gundur");
                break;
            case MART:
                System.out.println("mart 31 gun olur");
                break;

            case AGUSTOS:
                System.out.println("agustos 31 gun olur");
                break;

            default:
                System.out.println("yanlis ay grdin");

        }








    }
}
