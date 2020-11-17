package GatherClass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * 集合元素的遍历，使用迭代器Iterator接口:hasNext()和next()
 * 内部定义了一个remove方法，在遍历的时候删除集合元素
 * Create by LiShuang on 2020/11/14 16:10
 **/

public class Iteratortest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("LS"));
        coll.add(new Person2("DJ", 22));
        coll.add(new Person("jon", 24));

        //一个next之后再一个remove,如果没有next直接remove会报错，如果一次next两次remove也会报错
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj.equals("LS"))
                iterator.remove();
        }

        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());
    }
}
