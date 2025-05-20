public class training {

  public static void main(String[] args) {
    String str="aaaabbbccaa";
    int counta=0;
    int countb=0;
    int countc=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='a'){
        counta++;
    }
    else if(ch=='b'){
     countb++;
    }
    else if(ch=='c'){
     countc++;
    }

}
System.out.println("a is "+ counta);
System.out.println("b is "+ countb);
System.out.println("c is "+ countc);
}
}