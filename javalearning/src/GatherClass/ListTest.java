package GatherClass;

import org.junit.Test;

import java.util.*;

/**
 *ArrayList常用方法：
 * 增(add)、
 * 删(remove（int index）/remove(Object obj))、
 * 改 set
 * 查 get
 * 长度 size
 * 遍历 1.Interator迭代器 2.foreach  3. for
 *
 * Create by LiShuang on 2020/11/14 20:45
 **/

public class ListTest {
    @Test
    public void test(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add("AA");
        list.add(new Person2("LS",24));
        list.add(123);
        System.out.println(list);
        //add
        list.add(1,"BB");
        System.out.println(list);
        //Addall
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);   //将list1里的元素添加到list里
        System.out.println(list.size());
        //get：获取指定位置元素
        System.out.println(list.get(3));
    }
    @Test
    public void test2(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add("AA");
        list.add(new Person2("LS",24));
        list.add(123);
        System.out.println(list);

        //返回元素首次出现的位置，没找到则返回-1（和数组一样）
        System.out.println(list.indexOf(123));
        System.out.println(list.indexOf(456));
        //返回元素最后出现的位置，没找到则返回-1（和数组一样）
        System.out.println(list.lastIndexOf("AA"));
        //按索引删除，返回删除的位置的元素
        System.out.println(list.remove(1));
        System.out.println(list);
        //set设置
        list.set(0,"MM");
        System.out.println(list);
        //sublist返回子集（左闭右开）,list本事无变化
        List sublist = list.subList(1, 3);
        System.out.println(sublist);
        System.out.println(list);
    }

    //遍历
    @Test
    public void test3(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add("AA");
        list.add(new Person2("LS",24));
        list.add(123);
        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------");
        //foreach
        for(Object obj:list){
            System.out.println(obj);
        }
        System.out.println("--------------------------");
        //for
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------");
    }
}
