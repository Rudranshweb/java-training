// Hierarchical inheritence
class animal{
  void eat(){
    System.out.println("eatinggggggggggggggg");
  }
}
class dog extends animal{
  void bark(){
    System.out.println("barkkkkkkkkkkkkkkkkkk");
  }
  
}
class species extends animal{
  void lazy(){
    System.out.println("the dog is lazy");
  }
}
public class training{
  public static void main(String[] args) {
    dog obj= new dog();
    obj.eat();
    obj.bark();
    species obj1= new species();
    obj1.lazy();
  }
}
