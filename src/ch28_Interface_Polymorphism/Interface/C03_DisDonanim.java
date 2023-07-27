package ch28_Interface_Polymorphism.Interface;

public interface C03_DisDonanim {//parent interface


    public abstract void kapi();
    //Modifier 'abstract' is redundant for interface methods

    void kaporta();

    String RENK = "siyah";

    public default String sisLamp(){
        return "sisli havada ootomatik calsiri";
    }








}
