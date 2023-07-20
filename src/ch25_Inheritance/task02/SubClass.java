package ch25_Inheritance.task02;

public class SubClass extends SuperClass{

    int num= 10;

   public void goster(){
            System.out.println("Bu method Sub classsın görüntülenme" +
                    " methodudur. ");
       super.goster();
       System.out.println("Sub classtaki eleman "+this.num);
       System.out.println("Super classtaki eleman "+super.num);
   }

}
