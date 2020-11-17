package Attributes_of_class;
final class finalC{
    public int I=2;
    public final int J=3;
    void doit(){
        System.out.println("parentC");
    }
}
//final类不能被继承，final内的方法也不可以被负载或重写
//class subC extends finalC{ }

public class FinalClass {
    public static void main(String[] args) {
        finalC FC=new finalC();   //final 类可以被实例化
        FC.I=5;   //final类的成员变量可以被修改
        System.out.println(FC.I);
        FC.doit();  //final 类的方法可以被调用
    }
}
