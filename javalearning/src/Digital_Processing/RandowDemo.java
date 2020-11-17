package Digital_Processing;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Random;

public class RandowDemo {
    public static void main(String[] args) {
        Random R=new Random(); //实例化一个randow类
        for(int i=1;i<=10;i++) {
            //随机产生一个整数
            System.out.println("随机产生一个整数:" + R.nextInt());
            //随机产生一个大于等于0小于10整数
            System.out.println("随机产生一个大于等于0小于10整数:" + R.nextInt(10));
            //随机产生一个布尔数
            System.out.println("随机产生一个布尔数:" + R.nextBoolean());
            //随机产生一个双精度数(大于等于0小于1)
            System.out.println("随机产生一个双精度数:" + R.nextDouble());
            //随机产生一个浮点数(大于等于0小于1)
            System.out.println("随机产生一个浮点数:" + R.nextFloat());
            //随机产生一个概率密度为高斯分布的双精度值
            System.out.println("随机产生一个概率密度为高斯分布的双精度值:" + R.nextGaussian());
        }
    }
}
