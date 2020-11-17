package GatherClass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * 增强for循环：foreach 遍历集合
 * Create by LiShuang on 2020/11/14 16:52
 **/

public class Foreach {
    @Test
    public void test1(){

        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(new String("LS"));
        coll.add(new Person("jon",24));

        //for(集合中元素类型 局部对象：集合对象)
        //先取集合中第一个元素赋给obj,再去第二个元素给obj
        //内部用的也是迭代器
        for(Object obj: coll){
            System.out.println(obj);
        }
        System.out.println("--------------------");
        coll.forEach(System.out::println);   //方法引用
    }
    @Test
    public void test2(){
        int[] arr=new int[]{1,2,3};
        for (int a:arr) {
            System.out.println(a);
        }
    }
    @Test
    public void test3(){
        String[] arr=new String[]{"MM","MM","MM"};


        //方式1：普通for赋值
        for (int i=0;i<arr.length;i++){
            arr[i]="AA";
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //方式1：普通foreach赋值;赋值不成功
        //foreach原理：将数组中的数取出后赋值给S，后面的操作都是对S，跟数组无关；
        // S="BB";后只是将S改变，数组并没有改变
        for (String S:arr){
            S="BB";
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
