import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
       public class training{
        public static void main(String[] args) {
            ArrayList<String> list= new ArrayList<>();
                list.add("ravi");
                list.add("vijay");
                list.add("Ajay");
                list.add("Anil");
                list.add("Gaurav");
                list.add("Amit");
                list.add("ahul");
                list.add("Adarsh");
                ListIterator<String> it =list.listIterator();
                while(it.hasNext()){
                    String elem =it.next();
                    System.out.println(elem);}
                    System.out.println("pree");
                    while(it.hasPrevious()){
                        String last=it.previous();
                        System.out.println(last);
                    }
                    // if(elem.startsWith("A")|| elem.startsWith("a")){
                    //     it.remove();
                        
                    
                }
                // System.out.println(list);
                
        }
    



  

   