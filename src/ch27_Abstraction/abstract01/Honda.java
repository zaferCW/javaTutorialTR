package ch27_Abstraction.abstract01;

public abstract class Honda {//parent

    abstract void motor();//abs. meth

    protected void sunroof(){
        System.out.println("panoromik cam tavan harika seyir katar");
    }

    String name = "Fatih bey";//abs class da variable tanimlanabilir

 //  abstract String name2 = "Fatih bey";//abs class da variable tanimlanabilir
   // varaible abs olamaz Modifier 'abstract' not allowed here

    abstract void koltuk();
    abstract void kapi();








}
