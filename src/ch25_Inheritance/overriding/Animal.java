package ch25_Inheritance.overriding;

public class Animal {//grandparent class godfather

    /*
Override edilen methodların access seviyeleri, parent class'taki
 methodun access seviyesiyle aynı veya daha geniş olabilir.
 Örneğin,
  parent class'ta protected olan bir method,
  child class'ta public olabilir

  ancak private veya default
   access seviyesiyle override edilemez.

   Örneğin, parent class'ta protected olan
   bir method, child class'ta public olarak override edilebilir, ancak
   private olarak override edilemez. Aynı şekilde, parent class'ta
   private
   olan bir method, child class'ta override edilemez
 */
    public Animal() {
        System.out.println("animal class pm siz const");
    }
    public void yeme(){
        System.out.println("hayvan yer");
    }
    protected void icme(){
        System.out.println("hayvan icer");
    }
    public void hareket(){
        System.out.println("hayvan hareket eder");
    }

    int number = 34;
    int age = 33;
    int numberOfAnimals = 500;

    @Override
    public String toString() {
        return "Animal{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfAnimals=" + numberOfAnimals +
                '}';
    }
}
