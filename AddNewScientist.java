package myp;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class AddNewScientist extends Frame implements ActionListener, ItemListener
{

Validation ov = new Validation();

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,lb,lp1,lp2,lp,lh;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,tc1,tc2,tc3;
JButton b1,b2,b3;
Frame frm;
Thread th;
Font f; 
FileDialog dialog;
ImageIcon ih,ib;

Choice c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

int f4;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="",a11="",a12="",a13="",a14="",a15="",a16="",a17="",a18="",a19="",a20="",a21="",a22="",a23="";
public AddNewScientist()
{
ib= new ImageIcon("tp2.png");

ih=new ImageIcon("scie.png");

l1=new JLabel("Scientist's ID");
l2=new JLabel("Scientist's Category");
l3=new JLabel("Surname");
l4=new JLabel("Name");
l5=new JLabel("Gender");
l6=new JLabel("Father/Husband name");
l7=new JLabel("Date of Birth");
l8=new JLabel("Marital Status");
l9=new JLabel("Place of Birth");
l10=new JLabel("Highest Degree");
l11=new JLabel("Date of Appointment");
l12=new JLabel("Place of Appointment");
l13=new JLabel("Department");
l14=new JLabel("Current Designation");
l15=new JLabel("Mobile No.");
l16=new JLabel("Personal E-mail");
l17=new JLabel("Community");
l18=new JLabel("Pay Scale");
l19=new JLabel("Category");
l20=new JLabel("Bank Details of the Individual",JLabel.CENTER);
l21=new JLabel("GPF Number");
l22=new JLabel("CPS No.");
l23=new JLabel("Aadhaar No.");
l24=new JLabel("IFSC code");
l25=new JLabel("Bank Name");
l26=new JLabel("Bank Branch");
l26=new JLabel("Account No.");
l27=new JLabel("PAN No.");
l28=new JLabel("Address of the Individual",JLabel.CENTER);
l29=new JLabel("Street/Road/Lane");
l30=new JLabel("Landmark");
l31=new JLabel("Area/Locality/Sector");
l32=new JLabel("District");
l33=new JLabel("Village");
l34=new JLabel("PIN Code");
lh=new JLabel(ih);
lb=new JLabel(ib);

t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
t5=new JTextField();
t6=new JTextField();
t7=new JTextField();
t8=new JTextField();
t9=new JTextField();
t10=new JTextField();
t11=new JTextField();
t12=new JTextField();
t13=new JTextField();
t14=new JTextField();
t15=new JTextField();
t16=new JTextField();
t17=new JTextField();
t18=new JTextField();
t19=new JTextField();
t20=new JTextField();
t21=new JTextField();
t22=new JTextField();
t23=new JTextField();
t24=new JTextField();
t25=new JTextField();
tc1=new JTextField();
tc2=new JTextField();
tc3=new JTextField();

c1=new Choice();
c2=new Choice();
c3=new Choice();
c4=new Choice();
c5=new Choice();
c6=new Choice();
c7=new Choice();
c8=new Choice();
c9 =new Choice();

c4.addItem("State");
c4.addItem("Andhra Pradesh");
c4.addItem("Arunachal Pradesh");
c4.addItem("Assam");
c4.addItem("Bihar");
c4.addItem("Chhattisgarh");
c4.addItem("Goa");
c4.addItem("Gujarat");
c4.addItem("Haryana");
c4.addItem("Himachal Pradesh");
c4.addItem("Jammu & Kashmir");
c4.addItem("Karnataka");
c4.addItem("Kerala");
c4.addItem("Madhya Pradesh");
c4.addItem("Maharashtra");
c4.addItem("Manipur");
c4.addItem("Meghalaya");
c4.addItem("Mizoram");
c4.addItem("Nagaland");
c4.addItem("Orissa");
c4.addItem("Punjab");
c4.addItem("Rajasthan");
c4.addItem("Sikkim");
c4.addItem("Tamil Nadu");
c4.addItem("Tripura");
c4.addItem("Uttar Pradesh");
c4.addItem("Uttarakhand");
c4.addItem("West Bengal ");
c4.addItem("Jharkhand");
c4.addItem("Telangana");

c5.add("City");
b1=new JButton("Save");
b2 =new JButton("Close");

dialog=new FileDialog(this,"FileDialog");
f=new Font("TimesNewRoman",Font.BOLD,12);

frm =new Frame("AddNewScientist");

}

public void setUpAddNewScientist()
{
frm.setLayout(null);
frm.setSize(1366,768);

l1.setBounds(50,130,150,25);
l2.setBounds(390,130,150,25);
l3.setBounds(50,170,150,25);
l4.setBounds(390,170,150,25);
l5.setBounds(50,210,150,25);
l6.setBounds(390,210,150,25);
l7.setBounds(50,250,150,25);
l8.setBounds(390,250,150,25);
l9.setBounds(50,290,150,25);
l10.setBounds(390,330,150,25);
l11.setBounds(50,330,150,25);
l12.setBounds(50,370,150,25);
l13.setBounds(390,370,150,25);
l14.setBounds(50,410,150,25);
l15.setBounds(390,410,150,25);
l16.setBounds(50,450,150,25);
l17.setBounds(390,450,150,25);
l18.setBounds(50,490,150,25);
l19.setBounds(390,490,150,25);
l20.setBounds(50,530,600,25);
l21.setBounds(50,570,150,25);
l22.setBounds(390,570,150,25);
l23.setBounds(50,610,150,25);
l24.setBounds(390,610,150,25);
l25.setBounds(50,650,150,25);
l26.setBounds(390,650,150,25);
l27.setBounds(50,690,150,25);
l28.setBounds(730,130,450,25);
l29.setBounds(730,170,150,25);
l30.setBounds(730,210,150,25);
l31.setBounds(730,250,150,25);
l32.setBounds(730,290,150,25);
l33.setBounds(730,330,150,25);
l34.setBounds(730,370,150,25);
lh.setBounds(0,15,1366,110);
lb.setBounds(0,120,1366,768);


t1.setBounds(220,130,150,25);
c1.setBounds(560,130,150,25);
t2.setBounds(220,170,150,25);
t3.setBounds(560,170,150,25);
 c2.setBounds(220,210,150,25);
t4.setBounds(560,210,150,25);
c3.setBounds(220,250,150,25);
t5.setBounds(560,250,150,25);
c4.setBounds(220,290,150,25);
c5.setBounds(390,290,150,25);
c6.setBounds(560,290,150,25);
t6.setBounds(220,330,150,25);
c7.setBounds(560,330,150,25);
t7.setBounds(220,370,150,25);
t8.setBounds(560,370,150,25);
t9.setBounds(220,410,150,25);
t10.setBounds(560,410,150,25);
t11.setBounds(220,450,150,25);
c8.setBounds(560,450,150,25);
t12.setBounds(220,490,150,25);
c9.setBounds(560,490,150,25);
t13.setBounds(220,570,150,25);
t14.setBounds(560,570,150,25);
t15.setBounds(220,610,150,25);
t16.setBounds(560,610,150,25);
t17.setBounds(220,650,150,25);
t18.setBounds(560,650,150,25);
t19.setBounds(220,690,150,25);
t20.setBounds(900,170,150,25);
t21.setBounds(900,210,150,25);
t22.setBounds(900,250,150,25);
t23.setBounds(900,290,150,25);
t24.setBounds(900,330,150,25);
t25.setBounds(900,370,150,25);

b1.setBounds(900,410,65,25);
b2.setBounds(975,410,75,25);

b1.addActionListener(this);
b2.addActionListener(this);

c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);

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
frm.add(l16);
frm.add(l17);
frm.add(l18);
frm.add(l19);
frm.add(l20);
frm.add(l21);
frm.add(l22);
frm.add(l23);
frm.add(l24);
frm.add(l25);
frm.add(l26);
frm.add(l27);
frm.add(l28);
frm.add(l29);
frm.add(l30);
frm.add(l31);
frm.add(l32);
frm.add(l33);
frm.add(l34);
frm.add(lh);
frm.add(t1);
frm.add(c1);
frm.add(t2);
frm.add(t3);
frm.add(c2);
frm.add(t4);
frm.add(c3);
frm.add(c4);
frm.add(c5);
frm.add(c6);
frm.add(t5);
frm.add(c7);
frm.add(t6);
frm.add(t7);
frm.add(t8);
frm.add(t9);
frm.add(t10);
frm.add(t11);
frm.add(c8);
frm.add(t12);
frm.add(c9);
frm.add(t13);
frm.add(t14);
frm.add(t15);
frm.add(t16);
frm.add(t17);
frm.add(t18);
frm.add(t19);
frm.add(t20);
frm.add(t21);
frm.add(t22);
frm.add(t23);
frm.add(t24);
frm.add(t25);
frm.add(b1);
frm.add(b2);

frm.add(lb);

frm.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{ 
if(ae.getSource()==b1)
{
f4=ov.email(t11.getText());
t13.setText(""+f4);
}
}
public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==c4)
{
if(c4.getSelectedItem().equals("Andhra Pradesh"))
{
c5.removeAll();
c5.addItem("City");
c5.addItem("Visakhapatnam");
c5.addItem("Vijayawada");
c5.addItem("Guntur");
c5.addItem("Nellore");
c5.addItem("Anantapur");
c5.addItem("Vizianagaram");
c5.addItem("Eluru");
c5.addItem("Machilipatnam");
c5.addItem("Chittoor");
c5.addItem("Ongole");
c5.addItem("Proddatur");
}
else if(c4.getSelectedItem().equals("Arunachal Pradesh"))
{
c5.removeAll();
c5.addItem("City");
c5.addItem("Itanagar");
c5.addItem("Tawang");
c5.addItem("Bhismaknagar");
c5.addItem("Malinithan");
}
}
}
}

