package myp;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class UpdateAni extends Frame implements ActionListener
{
ImageIcon i2,i3,ib,i;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,lb,lp1,lp2,lp,lh;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35;
JButton b1,b2,b3;
Frame frm;
Thread th;
Font f,f1; 
FileDialog dialog;
Choice c1,c2,c3,c4,c5,c6;

public UpdateAni()
{
ib=new ImageIcon("tp2.jpg");
i= new ImageIcon("upd.png");
lh=new JLabel(i);
l1 = new JLabel("Tag No.");
l2 = new JLabel("Name");
l3 = new JLabel("Kingdom");
l4 = new JLabel("Class");
l5 = new JLabel("Region of existence");
l6 = new JLabel("Population");
l7 = new JLabel("No. of adult Male");
l8 = new JLabel("No. of adult Female");
l9 = new JLabel("No. of immature");
l10 = new JLabel("Reproductive Condition");
l11 = new JLabel("Survival Difficulty");
l12 = new JLabel("Color");
l13 = new JLabel("Diet");
l14=new JLabel("Incubation Period");
l15 = new JLabel("Movement");
lb=new JLabel(ib);
c1= new Choice();
t1= new JTextField();
t2= new JTextField();
t3= new JTextField();
t4= new JTextField();
t5= new JTextField();
t6= new JTextField();
t7= new JTextField();
t8= new JTextField();
t9= new JTextField();
t10= new JTextField();
t11= new JTextField();
t12= new JTextField();
t13= new JTextField();
t14= new JTextField();



frm= new Frame("Update Existing Animals");
}

public void setUpUpdateAni()
{
frm.setLayout(null);
frm.setSize(1366,768);

l1.setBounds(50,130,150,25);
l2.setBounds(50,170,150,25);
l3.setBounds(50,210,150,25);
l4.setBounds(50,250,150,25);
l5.setBounds(50,290,150,25);
l6.setBounds(50,330,150,25);
l7.setBounds(50,370,150,25);
l8.setBounds(50,410,150,25);
l9.setBounds(50,450,150,25);
l10.setBounds(50,490,150,25);
l11.setBounds(50,530,150,25);
l12.setBounds(50,570,150,25);
l13.setBounds(50,610,150,25);
l14.setBounds(390,130,150,25);
l15.setBounds(390,170,150,25);
lh.setBounds(0,15,1366,110);
lb.setBounds(0,120,1366,688);
c1.setBounds(220,130,150,25);
t1.setBounds(220,170,150,25);
t2.setBounds(220,210,150,25);
t3.setBounds(220,250,150,25);
t4.setBounds(220,290,150,25);
t5.setBounds(220,330,150,25);
t6.setBounds(220,370,150,25);
t7.setBounds(220,410,150,25);
t8.setBounds(220,450,150,25);
t9.setBounds(220,490,150,25);
t10.setBounds(220,530,150,25);
t11.setBounds(220,570,150,25);
t12.setBounds(220,610,150,25);
t13.setBounds(560,130,150,25);
t14.setBounds(560,170,150,25);

frm.add(c1);
frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(t6);
frm.add(t7);
frm.add(t8);
frm.add(t9);
frm.add(t10);
frm.add(t11);
frm.add(t12);
frm.add(t13);
frm.add(t14);
frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(l8);
frm.add(l9);
frm.add(l10);
frm.add(l11);
frm.add(l12);
frm.add(l13);
frm.add(l14);
frm.add(l15);
frm.add(lh);
frm.add(lb);
frm.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{

}
}