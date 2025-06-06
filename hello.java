import java.util.ArrayList;
import java.util.Collections;

class hello{
    public static void main(String[] args) {
       ArrayList<String> list =new ArrayList<>();
       list.add("rupa");
       list.add("rajesh");
       list.add("simba");
       Collections.sort(list,(a,b)->a.compareTo(b));
       System.out.println(list);
    }
}