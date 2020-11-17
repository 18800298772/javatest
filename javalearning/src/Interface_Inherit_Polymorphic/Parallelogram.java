package Interface_Inherit_Polymorphic;

class Quadrangle { //四边形类
    public static void draw(Quadrangle q){
        //四边形类的方法
    }
}
class Squara extends Quadrangle{
    //正方形类
}
class Anything{
    //
}
public class Parallelogram extends Quadrangle{
    public static void main(String[] args) {
        Quadrangle q=new Quadrangle(); //实例化子类对象、
        //判断对象是非为Quadrangle对象的一个实例
        if (q instanceof Quadrangle){    //Yes
            System.out.println("q instanceof Quadrangle");
        }
        //判断父类对象是非为Parallelogram子类对象的一个实例
        if (q instanceof Parallelogram){    //NO
            Parallelogram p=(Parallelogram) q;
            System.out.println("q instanceof Parallelogram");
        }
        //判断父类对象是非为子类对象的一个实例
        if (q instanceof Squara){    //NO
            Squara s=(Squara) q;
            System.out.println("q instanceof Squara");
        }
        //q对象不为Anything类的对象，这句语句是错的
        //System.out.println(q instanceof Anything);
    }
}
