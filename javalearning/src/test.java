import java.sql.SQLOutput;

 class test extends Thread{

    public static void main(String args[]){
        test t1=new test();
        test t2=new test();
        t1.start();
        System.out.print("one.");
        t2.start();
        System.out.print("two.");
    }
    @Override
    public void run(){
        System.out.print("Thread");
    }
}
