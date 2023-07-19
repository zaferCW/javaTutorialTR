package ch24_Encapsulation.encapsulation06;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/* TODO 1
    Burada iki adet class vardır. Biri Main diğeri ise Employees,
    Employees(Çalışanlar) class'ında;
    Bu variable'ları oluşturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doğum tarihi)
    getter ve setter oluşturunuz.

todo  2 ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age

todo 3 Employes class'ın içinde;
    Örnek: toString i duzenleyin
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000 print edin

todo 4 main method'un içinde,
    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.

*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your name");
        String name = input.nextLine();
        System.out.println("enter your salary");
        int salary = input.nextInt();
        System.out.println("enter your dob. format must be 25/03/2000");
        String dob = input.next();

        Employees employee1 = new Employees(name, salary ,dob);

        System.out.println(employee1);

        int age= employee1.ageCalculator(dob);
        System.out.println(age);
        if (age >18){
            System.out.println("Welcome to our company "+  employee1.getName() +" your salary is "+employee1.getSalary());
        }
        if (age < 18){
            System.out.println("come back when you are 18 years old");
        }
        if (age == 18 ){
            System.out.println("we can have inter with you after that you can have a 80000 salary");
        }

    }
}

class Employees{
    private String name;
    private int salary;
    private String dob;

    public int ageCalculator(String dob){  //  08/23/1990
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate now= LocalDate.now();

        LocalDate dateOfBirth = LocalDate.parse(dob ,format ) ; //kullanicin girdigi String dogum tarihini LocalDate e cevirdi

        return  now.getYear() -  dateOfBirth.getYear() ;
    }

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public Employees() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "name is "+ name + "\n"+
                "dob is "+dob+ "\n"+
                "Salary is "+salary;

                /*
                 Name is Fernando
    dob is 11/23/2000
    Salary is 80000 print edin
                 */
    }
}