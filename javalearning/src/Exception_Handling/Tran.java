package Exception_Handling;

//检查参数是否小于0或者大于100.是，则通过throw关键字抛出自定义异常对象，并在main中捕捉该异常。
public class Tran {
    //定义方法，抛出异常
    //如果在当前抛出异常的方法中处理异常，可以使用try-catch语句块捕捉并处理，否则在方法中的声明处通过throws关键字指明要抛出给方法调用者的异常（throws MyException），继续下一步操作
    static int avg(int number1,int number2) throws MyException{
        if(number1<0 || number2<0){           //判断方法中是否满足异常条件
            throw new MyException("不可以使用负数");  //抛出错误异常
        }
        if (number1>100 || number2>100){
            throw new MyException("数值太大了");
        }
        System.out.println("执行");    //如果执行throw语句，则后面的语句不会再执行
        return (number1+number2)/2;  //返回参数平均值
    }

    public static void main(String[] args) {
        try {
            int result=avg(102,105);    //try代码块中可能出现异常
            System.out.println(result);
        } catch (MyException e){
            System.out.println(e);    //输出异常信息
        } catch (ArithmeticException e){
            System.out.println("除数为0"+e);
        }catch (Exception e){
            System.out.println("其他异常");
        }
    }
}
