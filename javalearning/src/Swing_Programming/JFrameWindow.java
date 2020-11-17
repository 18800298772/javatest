package Swing_Programming;

import javax.swing.*;   //导入Swing包
import java.awt.*;

//创建窗口，设置窗口背景，大小，关闭方式，并添加一个标签
public class JFrameWindow extends JFrame {
    public void CreatJFrame(String title){     //定义一个CreatJFrame方法
        JFrame jf=new JFrame(title);  //实例化JFrame对象，title为窗口标题，也可以没有
        Container containter=jf.getContentPane();  //获取一个容器
        JLabel jl=new JLabel("这是一个JFrame窗体");  //创建一个JLable标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);  //使标签的文字居中
        containter.add(jl);    //将标签添加至容器
        containter.setBackground(Color.white);  //设置容器的背景颜色
        jf.setVisible(true);   //设置窗体可见
        jf.setSize(1000,800);//设置窗体大小
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //设置窗口关闭方式
    }

    public static void main(String[] args) {
        new JFrameWindow().CreatJFrame("创建一个JFrame窗体");
    }
}
