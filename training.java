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
                    if(elem.length()<=4){
                        it.set("byee");
                    }
                   
                 }
                 System.out.println(list);
        
                    
                }
               
                
        }
    



  

   