package ch26_Exceptions.final_finally_finalize;

public class F01_Parent {
    public void testMethod(){
        System.out.println("guven kontrole mani degildir");

    }
    /**
     * Final method cannot be overridden
     */
    public final void finalMethod(){
        System.out.println("final methoddan gelirlerse");

    }

}
