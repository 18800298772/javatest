package Swing_Programming;

//创建窗口，添加按钮，点击按钮则弹出对话框窗体

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog {
    public MyJDialog(MyFrame frame){
        //调用父类构造方法：public JDialof(Frame f,String title,boolen model),f为父窗体，title为标题，model为true/fluse为模式
        super(frame,"第一个Dialog窗体",true);
        Container container=getContentPane();          //创建一个容器
        container.add(new JLabel("这是一个对话框"));   //在容器中添加标签
        setBounds(120,120,500,300);//设置窗口大小
    }
}
public class MyFrame extends JFrame{
    public MyFrame(){
        Container container =getContentPane();  //创建一个容器
        container.setLayout(null);
        JLabel jl=new JLabel("这是一个JFrame窗体");    //创建标签
        //jl.setHorizontalAlignment(SwingConstants.CENTER);  //使标签的文字居中
        jl.setBounds(400,300,100,21);
        container.add(jl);    //将标签添加父窗体中

        JButton jb=new JButton("弹出对话框");      //创建按钮
        jb.setBounds(100,100,100,21);
        jb.addActionListener(new ActionListener() {    //为标签添加鼠标点击事件
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);    //鼠标点击，则MyDialog可见
            }
        });
        container.add(jb);   //将按钮添加到父窗体中

        container.setBackground(Color.blue);  //设置容器的背景颜色
        setVisible(true);   //设置窗体可见
        setSize(1000,800);//设置窗体大小
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //设置窗口关闭方式
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}

