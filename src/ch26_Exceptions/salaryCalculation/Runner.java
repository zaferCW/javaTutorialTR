package ch26_Exceptions.salaryCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

    Employee employee =
            new Employee(
                    "iclal hanim",125000,
                    60,2020);


        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("tax "+employee.tax());
        System.out.println("bonus "+employee.bonus());
        System.out.println("raisesalary "+employee.raiseSalary());

        System.out.println("employee = " + employee);

        salaryCalculate();


    }

    private static void salaryCalculate() {
        Scanner input = new Scanner(System.in);

        System.out.println("ismini gir");
        String name = input.nextLine().trim();

        System.out.println("maasini gir");
        int salary =0;
        int workHours=0;
        int year=0;
        try {
             salary = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz tekrar dene");
            salaryCalculate();
        }


        System.out.println("calisma saat gir");
        try {
             workHours = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz tekrar dene");
            salaryCalculate();
        }
        System.out.println("ise baslama yilini  gir");
        try {
             year = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz tekrar dene");
            salaryCalculate();
        }

       Employee employee = new Employee(name,salary,workHours,year);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("tax "+employee.tax());
        System.out.println("bonus "+employee.bonus());
        System.out.println("raisesalary "+employee.raiseSalary());

        System.out.println("employee = " + employee);

    }
}
