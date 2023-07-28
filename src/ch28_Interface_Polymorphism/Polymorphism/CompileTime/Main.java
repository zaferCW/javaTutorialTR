package ch28_Interface_Polymorphism.Polymorphism.CompileTime;

public class Main {
    public static void main(String[] args) {


        /**
         * Compile Time Polymorphism (Static Poly.)
         *   "Method Overloading"
         */

        Calculation.sum(5,9);
        Calculation.sum(5,9 ,55);
        Calculation.sum(5.9,5.6);
        Calculation.sum(5.9,6.5,99.36);

        //Rumeysa hanimdan
        Calculation.subtract(100,54);
        Calculation.subtract(55,23,2);
        Calculation.subtract(99.6,56.4);

        //Zeynep hanim
        Calculation.subtract(55.25,35.10,2.1);


    }
}
