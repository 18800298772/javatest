package Class_and_Object;

//一个文件中只能有一个public类
 public class Book {
    public static void main(String[] args){
        System.out.println("class.book");
    }
 }
//不同类中的main可以调用
class Any {
    public static void main(String[] args){
        Book.main(args);
    }
}

class Testmain {
    public static void main(String[] args) {
        for(int i=0;i< args.length;i++){
            System.out.println(args[i]);
        }
    }
}
//对象的创建与访问
class TransferProperty{
     static int i=47;   //定义静态成员变量
     public void call(){
         System.out.println("调用call():"+i);
     }
     public TransferProperty(){   //定义构造方法
     }
     public static void main(String[] args){
         TransferProperty t1=new TransferProperty();//创建一个对象
         TransferProperty t2=new TransferProperty();//创建一个对象
         t2.i=60;//引用对象中的成员变量
         System.out.println("t1:"+(t1.i++));//输出：t1:60
         t1.call();//输出：调用call():61
         System.out.println("t2:"+t2.i);//输出：t2:61
         t2.call();//输出：调用call():61
     }
}
//TransferProperty与TransferProperty2对比（static修饰的变量与无修饰变量的区别）
class TransferProperty2{
    int i=47;   //定义静态成员变量
    public void call(){
        System.out.println("调用call():"+i);
    }
    public TransferProperty2(){   //定义构造方法
    }
    public static void main(String[] args){
        TransferProperty2 t1=new TransferProperty2();//创建一个对象
        TransferProperty2 t2=new TransferProperty2();//创建一个对象
        t2.i=60;
        System.out.println("t1:"+(t1.i++));//输出：t1:47
        t1.call();//输出：调用call():48
        System.out.println("t2:"+t2.i);//输出：t2:60
        t2.call();//输出：调用call():60
    }
}
//对象的比较
class Compare{
     public static void main(String[] args){
        String C1=new String("abc");
        String C2=new String("abc");
        String C3=C1;
        System.out.println("C1==C3的结果为："+(C1==C3));//==比较的是两个对象引用的地址
        System.out.println("C2==C3的结果为："+(C2==C3));
        System.out.println("C2 equals C3的结果为："+(C2.equals(C3)));//equals比较的两个对象的内容
        C3="abcde";
        System.out.println("C3:"+C3);//C3:abcde
        System.out.println("C1:"+C1);//C1:abc
     }
}





