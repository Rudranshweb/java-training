
class hello{
    public static void main(String[] args) {
        System.out.println("hey");
        // myrunable obj=new myrunable();
        Thread t1= new Thread(()->{
            System.out.println("hellllllllo");
        });
        Thread t2=new Thread(()->{
            System.out.println("hhiiiiiii");
        });
        t1.start();
        t2.start();
    }
}

        