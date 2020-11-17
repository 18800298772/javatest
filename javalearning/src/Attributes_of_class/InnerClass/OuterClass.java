package Attributes_of_class.InnerClass;

public class OuterClass {
    innerclass in=new innerclass(); //在外部类实例化内部类对象引用
    public void outf(){   //在外部类调用内部类方法
        in.inf();
    }
    class innerclass{   //内部类
        innerclass(){     //内部类构造方法
        }
        public void inf(){
            System.out.println("内部类方法");
        }
        int y=0;
    }
    public innerclass doit(int y){   //外部类方法，返回值为内部类引用
        //y=4;             //外部类方法不可直接调用内部类成员变量
        in.y=y;
        System.out.println("外部类out方法"+in.y);
        return new innerclass();  //返回内部类引用
    }

    public static void main(String[] args) {
        OuterClass out=new OuterClass();
        out.doit(3);  //输出：外部类out方法3
        //内部类的对象实例化操作必须在外部类或者外部类的费静态方法中实现
        out.outf();     //输出：内部类方法
        OuterClass.innerclass in=out.doit(6);   //内部类的对象实例化操作在外部类的费静态方法中实现
        OuterClass.innerclass in2=out.new innerclass();//内部类的对象实例化操作必须在外部类中实现
        in.inf();
        in2.inf();
    }
}
