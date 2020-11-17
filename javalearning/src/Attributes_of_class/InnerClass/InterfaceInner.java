package Attributes_of_class.InnerClass;

interface OutInterface{   //定义一个接口
    public void f();
}

public class InterfaceInner {
    public static void main(String[] args) {
        OuterClass2 out =new OuterClass2();   //实例化一个外部类对象
        OutInterface outinter = out.doit();   //调用doit方法，返回一个OutInterface接口
        outinter.f();   //调用f()方法
    }
}
class OuterClass2{
    private class InnerClass implements OutInterface{
        InnerClass(String S){    //内部类构造方法
            System.out.println(S);
        }
        public void f(){    //实现接口中的f()方法
            System.out.println("访问内部类的f()方法");
        }
    }
    public OutInterface doit(){   //定义一个方法，返回值为OutInterface接口
        return new InnerClass("访问内部类构造方法");
    }
}


