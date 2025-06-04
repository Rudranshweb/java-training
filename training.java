class myrunable implements Runnable {
public void run() {
    System.out.println(Thread.currentThread().getName() + "Hello");
}
}
class hello{
    public static void main(String[] args) {
        myrunable obj=new myrunable();
        Thread t1= new Thread(obj);
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println("error");
        }
        System.out.println("hhhiiii");
    }
    }
        
