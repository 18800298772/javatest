package GatherClass;

import org.junit.Test;

import java.text.CompactNumberFormat;
import java.util.*;

/**
 * Create by LiShuang on 2020/11/15 8:28
 **/

public class SetTest {

    
    @Test
    public void test1(){
        HashSet hashSet = new LinkedHashSet();
        hashSet.add(123);
        hashSet.add(4);
        hashSet.add("A");
        hashSet.add(new Person2("LS",24));   //Person2重写了equals和HashCode方法
        hashSet.add(new Person("Jon",24));   //Person2未重写equals和HashCode方法
        hashSet.add(23);
        hashSet.add(123);   //和上面的123一样
        hashSet.add(new Person2("LS",24));    //使用了一次equals
        hashSet.add(new Person("Jon",24));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){

        //自然排序
        TreeSet treeSet = new TreeSet();
        treeSet.add(123);
        treeSet.add(4);
        treeSet.add(23);
        treeSet.add(123);   //和上面的123一样

        //需要重写Person2的比较器，指定排序方法
        TreeSet treeSet2= new TreeSet();
        treeSet2.add(new Person2("LS",24));
        treeSet2.add(new Person2("Jon",24));
        treeSet2.add(new Person2("Dj",22));
        treeSet2.add(new Person2("Wng",26));
        treeSet2.add(new Person2("Wng",23));
        Iterator iterator = treeSet2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //TreeSet定制排序
    @Test
    public void test3(){
        Comparator com =new Comparator() {
            //按照年龄从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person2 && o2 instanceof Person2){
                    Person2 p1=(Person2)o1;
                    Person2 p2=(Person2)o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };

        //如果不加参数com则按照定制排序进行排序，如果没有参数com则使用Person2里的compareTo方法自然排序
        TreeSet treeSet2= new TreeSet(com);
        treeSet2.add(new Person2("LS",24));
        treeSet2.add(new Person2("Jon",24));
        treeSet2.add(new Person2("Dj",22));
        treeSet2.add(new Person2("Wng",26));
        treeSet2.add(new Person2("Wng",23));
        Iterator iterator = treeSet2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
