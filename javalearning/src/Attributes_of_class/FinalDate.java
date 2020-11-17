package Attributes_of_class;
import static java.lang.System.out;
import java.util.Random;
class Test{
    int i=0;
}
public class FinalDate {
    static Random rand=new Random();
    private final int VALUE_1=9;    //声明一个final变量
    private static final int VALUE_2=9;     //声明一个final,static变量
    private final Test test=new Test();     //声明一个final引用
    private Test test2=new Test();     //声明一个不是final的引用
    private final int[] a={1,2,3,4,5,6};    //声明一个final数组
    private final int i4=rand.nextInt(20);  //产生0-10之前的随机整数
    private static final int i5=rand.nextInt(20);
    public String toString(){
        return i4+" "+i5+" ";
    }
    public static void main(String[] args){
        FinalDate data=new FinalDate();
        //date.test=new Test(); //可以对指定为final的引用中的成员变量赋值，但是不能将定义为final的引用指向其他引用
        //date.VALUE_2++;   被final声明的变量不可以再改变该变量的值
        data.test2=new Test();
        for (int i=0;i<data.a.length;i++){
            //a[i]=9;被final声明的变量不可以再改变该变量的值
        }
        out.println(data);
        out.println("data2");
        out.println(new FinalDate());
        out.println(new FinalDate());
        out.println(data);
    }
}
class FinalStaticDate{
    private static Random rand=new Random();
    private final int a1=rand.nextInt(10);
    private static final int a2=rand.nextInt(10);

    public static void main(String[] args) {
        FinalStaticDate fdata=new FinalStaticDate();//实例化对象
        out.println("重新实例化对象调用final变量a1的值:"+fdata.a1);
        out.println("重新实例化对象调用final static变量a2的值:"+fdata.a2);
        FinalStaticDate fdata2=new FinalStaticDate();
        out.println("重新实例化对象调用final变量a1的值:"+fdata2.a1);//a1可改变
        out.println("重新实例化对象调用final static变量a2的值:"+fdata2.a2);//a2不可改变
    }
}

