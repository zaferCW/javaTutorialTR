package ch24_Encapsulation.encapsulation02;

public class UserRunner {
    public static void main(String[] args) {

        User user1 =
                new User("Taha","Qa","12345taha",33);

        System.out.println("user1.getAd() = " + user1.getAd());
        System.out.println("user1.getSoyad() = " + user1.getSoyad());
        System.out.println("user1.getPassword() = " + user1.getPassword());
        System.out.println("user1.getYas() = " + user1.getYas());


        System.out.println("user1 = " + user1);

        User user2 =
                new User("zeynep",
                        "hanim","12345zeynp",-33);

        System.out.println("user2 = " + user2);


    }
}
