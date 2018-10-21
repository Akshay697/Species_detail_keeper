package myp;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class LogIn extends Frame implements ActionListener, ItemListener
{
ImageIcon i2,i3,ib,ip,ih;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,lb,lp1,lp2,lp,lh;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35;
JButton b1,b2,b3;
Frame frm;
Thread th;
Font f,f1; 
FileDialog dialog;
Choice c1,c2,c3,c4,c5,c6,ca1,ca2;

String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="",a11="",a12="",a13="",a14="",a15="",a16="",a17="",a18="",a19="",a20="",a21="",a22="",a23="",a24="",a25="",a26="",a27="",a28="",a29="",a30="",a31="",a32="",a33="",a34="",a35="",a36="",ac1="",ac5="",ac6="";

public LogIn()
{

ib=new ImageIcon("2.png");
ip= new ImageIcon("pro.png");
ih=new ImageIcon("Lo.png");
l1=new JLabel("Enter User Id");
l2=new JLabel("Enter password");
l3=new JLabel("*Trouble LogIn");

lh=new JLabel(ih);
lb=new JLabel(ib);
lp=new JLabel(ip);


t1=new JTextField();
t2=new JTextField();

f= new Font("TimesNewRoman",Font.BOLD,20);

b1=new JButton("LogIn");
b2=new JButton("Close");
b3=new JButton("Forgot Password"); 

frm= new Frame("LogIn");
}
public void setUpLogIn()
{
frm.setSize(1366,768);
frm.setLayout(null);
l1.setBounds(370,300,200,30);
l2.setBounds(370,350,200,30);
l3.setBounds(600,480,100,25);
lh.setBounds(0,10,1366,110);
lb.setBounds(0,115,1366,768);
lp.setBounds(150,250,200,200);
t1.setBounds(600,300,220,30);
t2.setBounds(600,350,220,30);
b1.setBounds(600,440,100,25);
b2.setBounds(720,440,100,25);
b3.setBounds(720,480,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

l1.setFont(f);
l2.setFont(f);

frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(lp);
frm.add(lh);
frm.add(t1);
frm.add(t2);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(lb);
frm.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{

}
public void itemStateChanged(ItemEvent ie)
{

}
}