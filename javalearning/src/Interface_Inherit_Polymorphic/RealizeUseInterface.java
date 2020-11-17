package Interface_Inherit_Polymorphic;

interface int1{ }
interface int2 extends int1{}  //接口可以继承接口

interface drawtest{    //定义接口
    public void draw();   //定义接口方法
}
//定义平行四边形类，集成四边形类，并实现drawtest接口
class ParalleogramgleUseinterface extends QuadrangleUseInterface implements drawtest{
    public void draw(){     //实现接口，重写draw方法
        System.out.println("平行四边形.draw()");
    }
    public void doThing(){     //重写覆盖父类方法
        System.out.println("平行四边形方法");
    }
}
//定义正方形类，集成四边形类，并实现drawtest接口
class SquareUseinterface extends QuadrangleUseInterface implements drawtest{
    public void draw(){
        System.out.println("正方向.draw()");
    }
    public void doThing(){     //重写覆盖父类方法
        System.out.println("正方形方法");
    }
}
class AnyThingUseInterface extends QuadrangleUseInterface{
    public void doThing(){
        System.out.println("anything");
    }
}

abstract class QuadrangleUseInterface {  //定义抽象四边形类
    public abstract void doThing();   //定义抽象方法
}
public class RealizeUseInterface{
    public static void main(String[] args) {
        ParalleogramgleUseinterface P=new ParalleogramgleUseinterface();
        SquareUseinterface S=new SquareUseinterface();
        AnyThingUseInterface A=new AnyThingUseInterface();
        P.doThing();
        S.doThing();
        A.doThing();
        //SquareUseinterface和ParalleogramgleUseinterface向上转型为接口
        drawtest[] d={new SquareUseinterface(),new ParalleogramgleUseinterface()};
        //AnyThingUseInterface,QuadrangleUseInterface中没有实现接口
        for (int i=0;i<d.length;i++){
            d[i].draw();     //调用draw方法
        }
    }
}
