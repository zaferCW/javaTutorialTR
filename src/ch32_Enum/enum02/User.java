package ch32_Enum.enum02;

import java.util.Set;

public class User {//POJO class


    String name;

    Role role;

    Status statu;

//iki tane role olursa user in nasil bir logic yaparsiniz

    Set<Role > roles;//eger bir user in birden fazla rolu olursa

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
