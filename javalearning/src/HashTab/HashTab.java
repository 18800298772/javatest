package HashTab;

//题目：
//有一个公司，当有新员工到来时，要求将该员工的信息加入（id,性别，年龄，名字...），当输入该员工的id时，要求查询该员工的所有信息。
//要求：不使用数据库，尽量节省内存，速度越快越好，
//代码实现[增、删、改、查、显示]
//使用链表实现哈希表，该链表不加表头

public class HashTab{
    public static void main(String[] args) {
        HashTab2 hashTab2=new HashTab2(5);
        Emp emp1=new Emp(1,"Wang","男");
        Emp emp2=new Emp(2,"DJ","女");
        Emp emp3=new Emp(6,"George","男");
        Emp emp4=new Emp(4,"LS","女");
        Emp emp5=new Emp(5,"fly","男");
        //添加
        hashTab2.add(emp1);
        hashTab2.add(emp2);
        hashTab2.add(emp3);
        //显示
        hashTab2.list();
        //修改
        hashTab2.update(6,"乔治","男");
        System.out.println("-------------------------------");
        hashTab2.list();
        //查找
        hashTab2.findEmpByID(6);
        //删除
        hashTab2.remove(1);
        System.out.println("-------------------------------");
        hashTab2.list();

        hashTab2.add(emp4);
        hashTab2.add(emp5);

        System.out.println("-------------------------------");
        hashTab2.list();

        hashTab2.remove(4);
        System.out.println("-------------------------------");
        hashTab2.list();
    }
}
class HashTab2{
    private EmpLinkedList[] emplist;
    private int size;
    public HashTab2(int size){   //构造函数
        this.size=size;
        //初始化emplist
        emplist=new EmpLinkedList[size];
        //注意：初始化emplist里面存在的Size个链表此时全部无指向，就是什么都没有
        //如果要添加时，或者操作任意步骤时，都会报空指针错误
        //所以先给size个emplist初始化分配内存
        for (int i=0;i<size;i++){
            emplist[i]=new EmpLinkedList();
        }
    }
    //散列函数，哈希表的关键只在，通过某种特定的位置来寻找key进而存储value,方法很多，这里使用取模法
    public int hashFun(int id){
        return id%size;
    }
    //增加
    public void add(Emp emp){
        int empNo=hashFun(emp.id);
        emplist[empNo].add(emp);
    }
    //删除
    public void remove(int id){
        int empNo=hashFun(id);
        emplist[empNo].removeByID(id);
    }
    //修改
    public void update(int id,String name,String gender){
        int empNo=hashFun(id);
        emplist[empNo].updateByID(id,name,gender);
    }
    //查看
    public void findEmpByID(int id){
        int empNo=hashFun(id);
        Emp emp=emplist[empNo].findEmpByID(id);
        //找到
        if(emp!=null){
            System.out.printf("在第%d条链表里找到id = %d\n",empNo+1,id);
        }else {
            System.out.println("在哈希表中未找到该员工");
        }

    }
    //现实全部
    public void list(){
        for (int i=0;i<size;i++){
            emplist[i].list(i);
        }
    }
}

//创建Emp的链表
class EmpLinkedList{
    //头指针，包括数据
    private Emp head;
    //添加
    public void add(Emp emp){
        //因为头结点包含数据，所以添加第一个节点的时候要把head=emp
        if(head==null){
            head=emp;
            return;
        }
        //如果第一个节点已经有数据，那我们需要借助辅助指针，遍历找到链表最后的位置，然后插入数据
        Emp temp=head;
        while (true){
            //如果链表到了最后，就退出循环不再后移
            if (temp.next==null){
                break;
            }
            //链表没有到最后，就后移
            temp=temp.next;
        }
        //找到最后的位置添加数据
        temp.next=emp;
    }
    //删除
    //带头结点的链表，使用temp.next=temp.next.next;
    //但现在不能这么写，如果该链表里值存在一个数据，则执行上述代码会出现空指针异常
    //因为头结点就是第一个数据本身，只有head=head.next;（head=null）才能删除只有一个节点的链表
    //如果该链表数据不止一个，则用temp.next=temp.next.next;就可以删除。
    public void removeByID(int id){
        //链表为空，无删除操作
        if (head==null){
            System.out.println("该链表为空");
            return;
        }
        //定义辅助指针找到对应位置坐删除操作
        Emp temp=head;
        while (true){
            //存在链表中只有一个节点的情况（该节点就是要删除的）
            //或者要删除的节点时第一个节点
            if(temp.id==id){
                head=head.next;
                return;
            }
            //链表有多个节点，要删除的节点不是第一个节点
            if(temp.next.id==id){
                temp.next=temp.next.next;
                break;
            }
            //如果没有找到要删除的节点，直接return
            if (temp.next==null){
                return;
            }
            //节点后移
            temp=temp.next;
        }
    }
    //修改
    public void updateByID(int id,String name,String gender){
        if(head==null){
            System.out.println("链表为空");
            return;
        }
        //辅助指针
        Emp temp=head;
        while (true){
            if (temp.id==id){
                temp.name=name;
                temp.gender=gender;
                return;
            }
            //如果没有找到要修改的节点,直接return
            if (temp.next==null){
                return;
            }
            //节点后移
            temp=temp.next;
        }
    }
    //查看
    //根据id查找
    public Emp findEmpByID(int id){
        if(head==null){
            System.out.println("链表为空");
        }
        Emp temp=head;
        while (true){
            if(temp.id==id){
                break;
            }
            //如果没有找到要的节点,直接break
            if (temp.next==null){
                temp=null;
                break;
            }
            //节点后移
            temp=temp.next;
        }
        return temp;
    }
    //显示全部
    public void list(int no){
        if(head==null){
            System.out.println("第"+(no+1)+"链表的信息为空");
            return;
        }
        System.out.println("第"+(no+1)+"链表的信息为：");
        Emp temp=head;
        while (true){
            System.out.printf("--> id = %d, name = %s, gender = %s\t",temp.id,temp.name,temp.gender);
            //如果遍历到了最后
            if (temp.next==null){
                break;
            }
            //节点后移
            temp=temp.next;
        }
        System.out.println();
    }

}
//新建一个员工，相当于一个节点
class Emp{
    public int id;
    public String name;
    public String gender;

    public Emp next;  //next指针

    public Emp(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
}
