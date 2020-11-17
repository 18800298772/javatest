package Exception_Handling;

public class Shoot {
    static void pop() throws NegativeArraySizeException{
        //定义方法并抛出NegativeArraySizeException异常（数组元素个数为负数）
        int[] arr=new int[-3];//创建数组
    }
    public static void main(String[] args){
        try {
            pop();
        }catch (NegativeArraySizeException e){
            System.out.println("pop()方法抛出的异常");    //输出异常信息
        }
    }
}
