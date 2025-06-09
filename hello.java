// import java.util.ArrayList;
// import java.util.stream.Collectors;
// import java.util.List;
// class training{
//     public static void main(String[] args) {
//        ArrayList<Integer> list =new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(2);
//        list.add(8);
//      ArrayList<Integer> data=(ArrayList<Integer>) list.stream().filter(a->a>2).collect(Collections.tolist());
//      System.out.println(data);
//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

class hello
{
  public static void main(String[] args) {
    ArrayList<Integer>list =new ArrayList<>();
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
   int result=list.stream()
   .filter(n->n%2!=0)
   .reduce(0,Integer::sum);
  //  .collect(Collectors.toList());
  //  Collections.sort(result);
   
   System.out.println(result);
  }
}