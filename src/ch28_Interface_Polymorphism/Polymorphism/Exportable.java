package ch28_Interface_Polymorphism.Polymorphism;
//51. Given the code fragments:
interface Exportable {
                void export();
}
class Tool implements Exportable {
    @Override
    public void export() {

    }
//        protected void export () {
//                System.out.println("Tool::export");
//
//        }
}
class ReportTool extends Tool implements Exportable {
        public void export() {
                System.out.println("RTool::export");
        }
//line nl
 public static void main(String[] args) {
         Tool aTool = new ReportTool();
         Tool bTool = new Tool();

         aTool.export();        //RTool::export
         callExport(aTool);    // RTool::export
        callExport(bTool);
 }
// line n2 What is the result?
// A. Compilation fails only at line n2.
// B. RTool::export Tool::export
// C. Tool::exportTool:export public static void callExport (Exportable ex) (1 ex. export():
// D. Compilation fails only at line n1.
// E. Compilation fails at both line n1 and line n2.

 private static void callExport(Exportable ex) {
                ex.export();
         }
        }