class mythread extends Thread {
    public void run() {
        System.out.println("helllooooooooo");
}
}
class hello{
    public static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();
        System.out.println("hhhiiii");
    }
}