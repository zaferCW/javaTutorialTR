package ch28_Interface_Polymorphism.Polymorphism;

class Animal{
    public void talk() {
        System.out.println("animal is talking");
    }
}
class Tiger extends Animal{
    public void hunt(){
        System.out.println("tiger is hunting");
    }
    public void talk() {
        System.out.println("tiger is talking  ==> roar");
    }

}
class Octopus extends Animal{
    public void swim(){
        System.out.println("octopus is swimming");
    }
    public void talk() {
        System.out.println("octopus is talking  ==> googloglo");
    }
}
public class Zoo {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger [] tigers = {  tiger1 , new Tiger()   };

        System.out.println("tigers.length = " + tigers.length);  //tigers.length = 2
        for (Tiger tiger : tigers       ) {
            System.out.println("tiger = " + tiger.toString());
        }

        Octopus octopus1 = new Octopus();
        Octopus [] octopus = {  octopus1 , new Octopus()};

          Animal                animal1        =      new Tiger();
        //reference type     reference name       obj. const
        animal1.talk();   // tiger is talking  ==> roar

       // animal1.hunt();
        //Cannot resolve method 'hunt' in 'Animal'

        //Not Iclal hanimddan
       // ilk data type bak override edilmişse git child 'a yoksa static ise gitmez child a???



        Animal                animal2        =      new Octopus();

      // animal2.swim();  //
      // Cannot resolve method 'swim' in 'Animal'
        animal2.talk();

    }

}
