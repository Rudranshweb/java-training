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
//multiple inheritence using interface
interface client {
  void show();
  
}
interface client2{
void show();
  
}
class dev implements client,client2 {
  public void show(){
    System.out.println("show the common feature for client ,client2");
  }
  public static void main(String[] args) {
    dev obj=new dev();
    obj.show();
  }
}
  

  

   