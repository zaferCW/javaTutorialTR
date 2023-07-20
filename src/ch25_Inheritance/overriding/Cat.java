package ch25_Inheritance.overriding;

public class Cat extends Pet { // cat class i Pet class in child idir
    public Cat() {
        super();
        System.out.println("kediler psikolojiye iyi gelir");
    }
    public void mirmir(){
        System.out.println("kediler mirmir la sizin moralinizi duzeltir");
    }

    public Cat(String str) {
        this();
        System.out.println(super.number);//34
        System.out.println(this.number); //22
        System.out.println("pm li const dan" +
                "kediler psikolojiye iyi gelir");
    }

    @Override
    public void icme() {
        System.out.println("override edilmis cat e gore icme methodu");
    }

    int number = 22;
    int age = 11;
    int numberOfCats = 50;

    @Override
    public String toString() {
        return "Cat{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfCats=" + numberOfCats +" "+
                super.toString()+
                '}';
    }
}
