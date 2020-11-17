package GatherClass;


//构造一个自定义类对象

public class Person {
    //对象属性
    private String name;
    private int age;
    //无参构造方法
    //Ctrl+Inster 选择Constructor，不选择参数
    public Person() {
    }
    //有参构造方法
    //Ctrl+Inster 选择Constructor，选择参数
    public Person(String name, int age) {
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

}
