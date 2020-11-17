package GatherClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();  //创建ArrayList对象
        List<String> list2=new LinkedList<>();//创建LinkedList对象
        list.add("a");   //向listz中添加元素
        list.add("b");
        list.add("c");
        list.remove(2);//删除指定索引元素
        //两种遍历索引的方法
        //1. 循环遍历
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));//获取指定索引元素
        }
        //2.使用迭代器
        Iterator<String> it=list.listIterator();   //创建迭代器
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
