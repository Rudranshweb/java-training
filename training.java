//Single inheritence
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
public class training{
  public static void main(String[] args) {
    dog obj= new dog();
    obj.eat();
    obj.bark();
  }
}
