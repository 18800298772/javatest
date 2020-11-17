package Attributes_of_class;
class parent{
    public parent(){
        System.out.println("fulei构造");
    }
    private final void doit()
    {
        System.out.println("fulei1");
    }
    final void doit2(){
        System.out.println("fulei2");
    }
    public void doit3(){
        System.out.println("fulei3");
    }
}
class sub extends parent{
    public sub(){
        System.out.println("子类构造");
    }
    public final void doit(){
        System.out.println("zilei1");
    }
  /*  final void doit2(){     //final方法不能被覆盖
        System.out.println("zilei2");
    }*/
    public void doit3(){
        System.out.println("zilei3");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        parent p=new parent();
        //p.doit();  //不能调用private方法
        p.doit2();
        p.doit3();    //子类未被实例化，方法未重载
        sub s=new sub();
        s.doit();      //没有对父类的private final方法重载，而是重新生成了一个方法
        s.doit2();     //没有被重载
        s.doit3();     //重载
        parent p1=s;   //执行向上转型操作
        p1.doit2();
        p1.doit3();     //已被重载
        parent p2=new parent();
        p2.doit3();     //依旧是父类方法
    }
}
