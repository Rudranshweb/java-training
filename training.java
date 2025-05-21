// public class training {
//   class A{
// void sum(){
//   System.out.println("mai hu A");
// }
//   }

// }
// class B{
//   void sum(){
//     System.out.println("mai hu B");
//   }
// }
// class c extends training.A,trainingB{
//   public static void main(String[] args) {
//     obj c=new c();
//     obj.sum();
//   }
// }
interface training {
  void print();
  void show();
  
}
class dev implements training {
  public void print(){
    System.out.println("print the bill");
  }
  public void show(){
    System.out.println("show the menu");
  }
}
class main{
  public static void main(String[] args) {
    dev obj=new dev();
    obj.print();
    obj.show();
  }
}
  

   