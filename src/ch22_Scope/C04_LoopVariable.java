package ch22_Scope;

public class C04_LoopVariable {
    public static void main(String[] args) {

        int yas =  33;

        System.out.println("yas = " + yas);

        for (int i = 0; i < yas; i++) {
            System.out.println(yas);
            int maas =30000;


        }//loop sonu

     //CTE   System.out.println(maas);

        C01_InstanceVariable obj = new C01_InstanceVariable();
        System.out.println("obj.name = " + obj.name);
        System.out.println("obj.tecrube = " + obj.tecrube);

        C01_InstanceVariable.staticMethod();
        obj.nonStaticMethod();

    }
}
