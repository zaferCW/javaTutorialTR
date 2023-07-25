package ch26_Exceptions.final_finally_finalize;

public final class F02_FinalClass extends F01_Parent{
        //final class parent olamaz ama child olabilir

    /**
     * Final class cannot be inherited
     */
    public void finalClassMethod(){
        System.out.println("final class dan");
    }
}
