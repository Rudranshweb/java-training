import java.util.ArrayList;
import java.util.Iterator;
       public class training{
        public static void main(String[] args) {
            ArrayList<String> list= new ArrayList<>();
                list.add("ravi");
                list.add("vijay");
                list.add("Ajay");
                list.add("Anil");
                list.add("Gaurav");
                list.add("Amit");
                list.add("Rahul");
                list.add("Adarsh");
                Iterator<String> it =list.iterator();
                while(it.hasNext()){
                    String elem =it.next();
                    System.out.println(elem);
                    if(elem.startsWith("A")){
                        it.remove();
                        
                    }
                }
                System.out.println(list);
                
        }
    }



  

   