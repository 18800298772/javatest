package Digital_Processing;

import java.text.DecimalFormat;

//两种方法实现格式化数字
public class DecimalFormatSimpleDemo {
    //使用实例化对象时设置格式化模式
    static public void SimpleFormat(String pattern,double value){
        //实例化DecimalFormat对象
        DecimalFormat myFormat=new DecimalFormat(pattern);
        String output=myFormat.format(value);//将数字进行格式化
        System.out.println(value+" "+pattern+" "+output);
    }
    //使用applyPartten()方法对数字进行格式化
    static public void UseApplyPatternMethodFormat(String pattern,double value){
        //实例化DecimalFormat对象
        DecimalFormat myFormat=new DecimalFormat();
        //调用applyPartten()方法设置格式化模板
        myFormat.applyPattern(pattern);
        System.out.println(value+" "+pattern+" "+myFormat.format(value));
    }

    public static void main(String[] args){
        SimpleFormat("###,###.#########",123456.7894578787);
        //在数字后加上单位
        SimpleFormat("00000000.##kg",123456.789);
        //按照格式模板格式化数字，不存在的位以0显示
        SimpleFormat("000000.000",123.78);
        //将数字转化为百分数形式
        UseApplyPatternMethodFormat("#.###%",0.789);
        //将小数点后格式化为两位(四舍五入)
        UseApplyPatternMethodFormat("###.##\u00A4",123456.782);
        //将数字转化为千分数形式
        UseApplyPatternMethodFormat("0.00\u2030",0.789);
    }
}


//数组分组
class DecimalMethod{
    public static void main(String[] args){
        DecimalFormat myFormat=new DecimalFormat();
        myFormat.setGroupingSize(2);//设置将数字分组为2；,数字整数部分将以2个数字为一组输出
        String output=myFormat.format(123456.7417825);
        System.out.println("将数组以两个数字分组："+output);
        myFormat.setGroupingUsed(false);//设置不允许数字进行分组，后面的设置数字分组的操作无效
        String output2=myFormat.format(123456.789);
        System.out.println("不允许数字分组："+output2);
        myFormat.setGroupingSize(2);
        String output3=myFormat.format(123456.789);
        System.out.println("禁止数组分组后："+output3);
        myFormat.setGroupingUsed(true);//重新允许设置数字分组
        myFormat.setGroupingSize(1);
        String output4=myFormat.format(123456.789);
        System.out.println("允许数组分组："+output4);
    }
}







