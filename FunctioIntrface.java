@FunctionalInterface
public interface FunctioIntrface {
    void  sum();
     default  void minus(){
         System.out.println("Subtract");
     }
    @FunctionalInterface
     interface  Child extends FunctioIntrface{

     }
}
