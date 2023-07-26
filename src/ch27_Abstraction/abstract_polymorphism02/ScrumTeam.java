package ch27_Abstraction.abstract_polymorphism02;

abstract class ScrumTeam {

    public String name, jobTitle;
    public double salary;

    public abstract void dailyStandUp();

    public abstract void demo();

    public void getEmployeeInfo() {
        System.out.println("***************");
        System.out.println("employee name : " + this.name +
                "\n Job Title : " + this.jobTitle +
                "\n Salary : " + this.salary);

        System.out.println("***************");
    }
}

class Testers extends ScrumTeam {

    public Testers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Tester " + name + " is working");
    }

    @Override
    public void demo() {
        System.out.println("Tester " + name + " is doing demo");
    }
}

class Developers extends ScrumTeam {

    public Developers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Developer  " + name + " is working");

    }

    @Override
    public void demo() {
        System.out.println("Developer " + name + " is doing demo");

    }
}

class BOA {
    public static void main(String[] args) {

        Testers tester1 = new Testers("Ahmet ", "Tester", 5000);
        Testers tester2 = new Testers("Iclal ", "Tester", 8000);
        Testers tester3 = new Testers("Sefa ", "Tester", 6000);

        ScrumTeam[] testersArr = {tester1, tester2, tester3};

        for (ScrumTeam tester : testersArr) {
            tester.getEmployeeInfo();
        }

        Developers developer1 = new Developers("taha ", "Developer", 8000);
        Developers developer2 = new Developers("zeynep ", "Developer", 9000);
        Developers developer3 = new Developers("eren ", "Developer", 10000);

        ScrumTeam[] developersArr = {developer1, developer2, developer3};

        for (ScrumTeam dev : developersArr) {
            dev.getEmployeeInfo();
        }





    }
}



