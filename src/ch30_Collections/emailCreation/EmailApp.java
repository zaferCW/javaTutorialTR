package ch30_Collections.emailCreation;

import java.util.Scanner;

public class EmailApp {
    private String name;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String emailSuffix = "clarusway.com";
    private int   passwordLength=12 ;

    public EmailApp() {
    }

    public EmailApp(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.password = setRandomPassWord(passwordLength);
        System.out.println("setRandomPassWord methodu calisti" +
                "password = " + password);
        this.department = setDepartment();
        this.email = name.toLowerCase() + lastName.toLowerCase()
        +"."+department+"@"+emailSuffix;



    }



    public String setRandomPassWord(int passwordLength) {
//buyukkucuk harf rakam olmali
        String dataSource =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                        "abcdefghijklmnopqrstuvwxyz" +
                        "0123456789" +
                        "!@#$%^&*()-_=+[]{}|;:'\",.<>?";


        char [] password = new char[ passwordLength ];

        for (int i = 0; i <passwordLength ; i++) {
            int random = (int) (Math.random() * dataSource.length());

            password[i] = dataSource.charAt(random);
        }
        return new String(password);
    }

    @Override
    public String toString() {
        return "EmailApp{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

public String setDepartment(){
    System.out.println("bu departmanlardan birini sec\n" +
            "1 Test Automation\n" +
            "2 Developer\n" +
            "3 DevOps");

    Scanner input = new Scanner(System.in);
    int secim = input.nextInt();

    if (secim == 1){
        return "Test Automation ".replaceAll(" ","");
    }else if (secim == 2){
        return "Developer";
    } else if (secim == 3) {
        return "DevOps";
    }else return "hatali girdin";

}



}
