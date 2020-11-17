package GatherClass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectTest {

    @Test
    public  void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(new String("LS"));
        coll.add(new Person2("DJ",22));
        coll.add(new Person("jon",24));

        // contains(Object o):判断当前集合是否包含o
        System.out.println(coll.contains(123));   //true
        //这里的new String("LS")和上面是两个对象，内容相同但是地址不同
        // contains(Object o):判断的是内容，调的是==或者equals方法
        System.out.println(coll.contains(new String("LS")));   //true
        //和上文是两个自定义对象，没有equals方法，所以是false
        System.out.println(coll.contains(new Person("LS",24))); //false
        //想要上面的方法变成true可以重写 Person 自定义类里的equals方法
        //调用三次equals,依次跟123，“LS”，Person2比较，比较到相同的则不再覅用
        System.out.println(coll.contains(new Person2("DJ",22)));//true

        //containsAll(Collection coll1):判断coll1中的所有元素是否都在当前集合中
        Collection  coll1= Arrays.asList(123,456);    //第二种创建方法
        System.out.println(coll.containsAll(coll1));  //false
    }
    @Test
    public  void test2(){
        //删除
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("LS"));
        coll.add(new Person2("DJ",22));
        coll.add(new Person("jon",24));
        System.out.println(coll);
        coll.remove(new String("LS"));
        System.out.println(coll);

        //coll中不包含new Person("jon",24))，（参考方法1）
        System.out.println(coll.remove(new Person("jon",24)));   //false

        //从第一个对象分别对比，得到相同的对象则删除并返回，调用3次equals
        coll.remove(new Person2("DJ",22));
        System.out.println(coll);

        Collection  coll1= Arrays.asList(123,456);
        coll.removeAll(coll1);

        System.out.println(coll);

    }
    @Test
    public void test3(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("LS"));
        coll.add(new Person2("DJ",22));
        coll.add(new Person("jon",24));

        Collection  coll1= Arrays.asList(123,456,789);

        //获取参数聚合与当前集合的交集，并返回给当前集合
        coll.retainAll(coll1);
        System.out.println(coll);
    }
    @Test
    public void test4(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("LS"));
        coll.add(new Person2("DJ",22));

        Collection coll2=new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new String("LS"));
        coll2.add(new Person2("DJ",22));

        //coll.equals(coll2)两个集合是否完全相同
        //是有序的，只需要比较对应位置元素，只调用一次equals
        System.out.println(coll.equals(coll2));  //true
    }
    @Test
    public void test5() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("LS"));
        coll.add(new Person2("DJ", 22));
        coll.add(new Person("jon", 24));

        //返回当前对象的哈希值
        System.out.println(coll.hashCode());
    }


    //数组和集合的转换
    @Test
    public void test6(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("LS"));
        coll.add(new Person2("DJ", 22));
        coll.add(new Person("jon", 24));
        //集合—————> 数组:toArray()
        Object[] arr = coll.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------");

        //数组—————>集合: Arrays.asList
        List<String> list = Arrays.asList(new String[]{"AA", "BB"});
        System.out.println(list);
        List<Integer> list2 = Arrays.asList(123,456);
        System.out.println(list2);

        List arr1=Arrays.asList(new int[]{123,456});  //整体是一个封装之后的元素，是一个封装对象
        System.out.println(arr1.size());     //1


        List arr2=Arrays.asList(new Integer[]{123,456}); //Integer本身就已经封装了，所以这是两个对象
        System.out.println(arr2.size());   //2
    }
}

