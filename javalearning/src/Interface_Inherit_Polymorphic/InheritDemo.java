package Interface_Inherit_Polymorphic;

public class InheritDemo {
    public InheritDemo(){ //无参构造方法
        System.out.println("调用父类的InheritDemo()构造方法");
    }
    public void dosomething(){
        //成员方法
    }
    protected InheritDemo doit(){
      //方法返回值类型为  InheritDemo 类型
        return new InheritDemo();
    }
}
class Sub_InheritDemo extends InheritDemo{ //继承父类
    public Sub_InheritDemo() {
        //构造方法
        super();//调用父类构造方法
        super.dosomething();//调用父类成员变量
    }
    public void dosothingnew(){
        //新增方法
    }
    public void dosomething(){
        //重写父类方法
    }
    public Sub_InheritDemo doit(){
        //重写父类方法,方法返回值类型为  Sub_InheritDemo 类型
        return new Sub_InheritDemo();
    }
}
class Sub_parent extends InheritDemo{
    Sub_parent(int r){          //有参构造方法
        System.out.println("调用子类的Sub_parent()构造方法");
        System.out.println(r);
    }

    public static void main(String[] args) {
        System.out.println("Sub_parent()主函数");
    }
}
class Sub_routine extends Sub_parent{
    Sub_routine(){
        super(5);             //使用super()调用父类构造方法
        System.out.println("调用子类的Sub_routine()构造方法");
    }

    public static void main(String[] args) {
        Sub_parent.main(args);         //调用Sub_parent()的主函数
        Sub_routine s=new Sub_routine();   //实例化子类对象
    }
}

