// Q8 
class manager{
  void list(){
    System.out.println("the data of the employyy");
  }
}
class employee extends manager{
  void data(){
    System.out.println("here the employyysss working");
   // System.out.println("here the employ 2");
  }
  
}
// class species extends animal{
//   void lazy(){
//     System.out.println("the dog is lazy");
//   }
// }
public class training{
  public static void main(String[] args) {
    employee obj= new employee();
    obj.list();
    obj.data();
    // species obj1= new species();
    // obj1.lazy();
  }
}
