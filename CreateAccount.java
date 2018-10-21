package myp;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class CreateAccount extends Frame implements ActionListener
{

Connection con;
PreparedStatement pst;
Statement st;
ResultSet rec;

ImageIcon i2,i3,ib,ih;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,lb,lp1,lp2,lp,lh;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35;
JButton b1,b2,b3;
Frame frm;
Thread th;
Font f,f1; 
FileDialog dialog;
Choice c1,c2,c3,c4,c5,c6;

String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="";

public CreateAccount()
{
ib=new ImageIcon("tp2.jpg");
ih= new ImageIcon("cr.png");
lb=new JLabel(ib);
lh= new JLabel(ih);
l1= new JLabel("Scientist Id");
l2 = new JLabel("Scientist Name");
l3 = new JLabel("Department");
l4 = new JLabel("Password");
l5 = new JLabel("Confirm Password");
l6 = new JLabel("Contact");
l7 = new JLabel("Email");
l8 = new JLabel("Gender");
t1 = new JTextField();
t2 = new JTextField();
t3 = new JTextField();
t4 = new JTextField();
t5 = new JTextField();
t6 = new JTextField();
t7 = new JTextField();
t8 = new JTextField();
b1= new JButton("Submit");
b2= new JButton("Cancel");

frm=new Frame("Create Account");

}
public void conn()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:LMS");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void getData()
{
a1=t1.getText();
a2=t2.getText();
a3=t3.getText();
a4=t4.getText();
a5=t5.getText();
a6=t6.getText();
a7=t7.getText();
a8=t8.getText();
}
public void enterData()
{
try{

a1=t1.getText();
a2=t2.getText();
a3=t3.getText();
a4=t4.getText();
a5=t5.getText();
a6=t6.getText();
a7=t7.getText();
a8=t8.getText();

st=con.createStatement();
rec=st.executeQuery("select * from createaccount where scientistid="+a1+"");
if(rec.next())
{
String dialogtittle="Fail";
String dialogmessage="this id is already exists";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else
{

pst=con.prepareStatement("insert into issuebook values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"') ");
pst.executeUpdate();

String dialogtittle="Success";
String dialogmessage="Account Created Successfully!!";
int dialogtype = JOptionPane.PLAIN_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
}
catch(Exception e)
{
System.out.println(e);
}


}
public void setUpCreateAccount()
{
frm.setLayout(null);
frm.setSize(1366,768);

lh.setBounds(0,0,1366,118);
l1.setBounds(350,130,200,25);
l2.setBounds(350,170,200,25);
l3.setBounds(350,210,200,25);
l4.setBounds(350,250,200,25);
l5.setBounds(350,290,200,25);
l6.setBounds(350,330,200,25);
l7.setBounds(350,370,200,25);
l8.setBounds(350,410,200,25);
t1.setBounds(520,130,200,25);
t2.setBounds(520,170,200,25);
t3.setBounds(520,210,200,25);
t4.setBounds(520,250,200,25);
t5.setBounds(520,290,200,25);
t6.setBounds(520,330,200,25);
t7.setBounds(520,370,200,25);
t8.setBounds(520,410,200,25);

b1.setBounds(400,440,150,40);
b2.setBounds(570,440,150,40);
lb.setBounds(0,120,1366,688);

b1.addActionListener(this);
b2.addActionListener(this);

frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(t6);
frm.add(t7);
frm.add(t8);
frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(l8);
frm.add(b1);
frm.add(b2);
frm.add(lb);
frm.add(lh);
frm.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
enterData();
}
if(ae.getSource()==b2)
{
System.exit(0);
}
}

}