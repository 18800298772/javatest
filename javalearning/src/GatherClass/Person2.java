package GatherClass;

import java.util.Objects;

//和person相同，只是重写了equals() and hashCode()
public class Person2 implements Comparable {
    //对象属性
    private String name;
    private int age;
    //无参构造方法
    //Ctrl+Inster 选择Constructor，不选择参数
    public Person2() {
    }
    //有参构造方法
    //Ctrl+Inster 选择Constructor，选择参数
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get、set方法
    //Ctrl+Inster 选择Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //toString()方法
    //Ctrl+Inster 选择ToStribg
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重写equals方法
    //Ctrl+Inster 选择ToStribg，选择equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        System.out.println("调用一次equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {     //31*(31*1+name.hashCode())+age。hashCode
        return Objects.hash(name, age);
    }

    //按照姓名从小到达排序
    //如果只是按照姓名比较和排序，当姓名一样时就会认为两者相同，不会添加到treeSet中
    //
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person2){
            Person2 person2=(Person2) o;
//            return this.name.compareTo(person2.name);
            int compare=this.name.compareTo(person2.name);   //比较姓名
            if (compare!=0){
                return compare;
            }else {     //姓名相同则比较年龄
                return Integer.compare(this.age,person2.age);
            }
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
