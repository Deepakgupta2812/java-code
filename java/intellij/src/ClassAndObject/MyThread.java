package ClassAndObject;

public class MyThread extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"-count"+i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("intrrupt exception");
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
       MyThread obj1=new MyThread();
        MyThread obj2=new MyThread();
        obj1.setName("Harshu body");
        obj2.setName("Altof");
        obj1.start();
        obj2.start();
    }
}