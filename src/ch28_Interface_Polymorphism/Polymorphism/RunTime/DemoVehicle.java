package ch28_Interface_Polymorphism.Polymorphism.RunTime;

public class DemoVehicle {

    public static void main(String[] args) {
        /**
         * Run Time Polymorphism (Dynamic Poly.)
         *  Method Overriding
         */

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new SportCar();
        //sportcar class inda speedUpTo60mph() methodu override edilmis ise , speedUpTo60mph() methodu sportcar class dan gelir
        Vehicle vehicle3 = new Truck();

        vehicle1.speedUpTo60mph();      //Vehicle is speeding up to 60 mph
        vehicle2.speedUpTo60mph();      //sport car is speeding up to 60 in 3.2 seconds!
        vehicle3.speedUpTo60mph();      //Truck is speeding up to 60 mph in 9 seconds


    }
}
