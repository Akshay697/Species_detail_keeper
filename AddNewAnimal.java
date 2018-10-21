package myp;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public  class AddNewAnimal extends Frame implements ActionListener, ItemListener
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

int r=1;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="",a11="",a12="",a13="",a14="",a15="",a16="",a17="",a18="",a19="",a20="",a21="",a22="",a23="",a24="",a25="",a26="",a27="",a28="",a29="",a30="",a31="",a32="",a33="",a34="",a35="",a36="",ac1="",ac5="",ac6="";

public AddNewAnimal()
{
i=new ImageIcon("pro.png");
ib=new ImageIcon("tp2.jpg");
i3=new ImageIcon("ad.png");
i2=new ImageIcon("p10.png");
l1=new JLabel("Tag No.");
l2=new JLabel("Genetic Code");
l3=new JLabel("Common");
l4 = new JLabel("Scientific Name");
l5 = new JLabel("Kingdom");
l6 = new JLabel("Sub Kingdom");
l7 = new JLabel("Phylum");
l8= new JLabel("Class");
l9=new JLabel("Sub Class");
l10 = new JLabel("Order");
l11 = new JLabel("Family");
l12 = new JLabel("Sub Family");
l13 = new JLabel("Tribe");
l14=new JLabel("Sub Tribe");
l15 = new JLabel("Genus");
l16 = new JLabel("Species");
l17 = new JLabel("Type");
l18 = new JLabel("Region of existence");
l19=new JLabel("Type of Birth");
l20=new JLabel("Mode of Reproduction");
l21=new JLabel("Population");
l22= new JLabel("Habitat");
l23= new JLabel("Height (*meters)");
l24= new JLabel("Average weight (*kilos)");
l25 = new JLabel("Color");
l26=new JLabel("Skin Type");
l27=new JLabel("Behaviour");
l28=new JLabel("Food");
l29=new JLabel("Morphology");
l30=new JLabel("Movement");
l31=new JLabel("About More");
l32=new JLabel("Scientist's Id");
l33=new JLabel("Scientist's Name");
l34=new JLabel("Group Name");
l35 = new JLabel("Date"); 
l36=new JLabel("Upload Photo");
l37=new JLabel(i);
lb=new JLabel(ib);
lh=new JLabel(i3);

c1=new Choice();
c1.addItem("Select");
c1.addItem("Vertebrates");
c1.addItem("Invertebrates");

c2=new Choice();
c2.addItem("dd");
for(int i=1;i<=31;i++)
{
dc2.addItem(""+i);
}
c3=new Choice();
c3.add("mm");
for(int i=1;i<=12;i++)
{
c3.addItem(""+i);
}
c4= new Choice();
c4.addItem("yyyy");
for(int i=2015;i<=2020;i++)
{
c4.addItem(""+i);
}
c5=new Choice();
c5.addItem("Select");
c5.addItem("Viviparous");
c5.addItem("Oviparous");
c6=new Choice();
c6.addItem("Select");
c6.addItem("Asexual");
c6.addItem("Sexual");
t1 = new JTextField();
t2 = new JTextField();
t3 = new JTextField();
t4 = new JTextField();
t5 = new JTextField("Animalia");
t6 = new JTextField();
t7 = new JTextField();
t8 = new JTextField();
t9 = new JTextField();
t10 = new JTextField();
t11 = new JTextField();
t12 = new JTextField();
t13 = new JTextField();
t14 = new JTextField();
t15 = new JTextField();
t16 = new JTextField();
t17 = new JTextField();
t18 = new JTextField();
t19 = new JTextField();
t20 = new JTextField();
t21 = new JTextField();
t22=new JTextField();
t23=new JTextField();
t24=new JTextField();
t25=new JTextField();
t26=new JTextField(); 
t27=new JTextField();
t28=new JTextField();
t29=new JTextField();
t30 = new JTextField();
t31=new JTextField();
t32=new JTextField();
t33=new JTextField();
t34=new JTextField();
t35 =new JTextField();

t32.setEditable(false);
f= new Font("TimesNewRoman",Font.BOLD,12);

c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);



b1= new JButton("Save");
b2=new JButton("Exit");
b3=new JButton("choose");
dialog = new FileDialog(this,"FileDialog");
t5.setEditable(false);
frm = new Frame("AddNewAnimal");

}

public void setUpAddNewAnimal()
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
l14.setBounds(50,650,150,25);
l15.setBounds(50,690,150,25);
l16.setBounds(390,130,150,25);
l17.setBounds(390,170,150,25);
l18.setBounds(390,210,150,25);
l19.setBounds(390,250,150,25);
l20.setBounds(390,290,150,25);
l21.setBounds(390,330,150,25);
l22.setBounds(390,370,150,25);
l23.setBounds(390,410,150,25);
l24.setBounds(390,450,150,25);
l25.setBounds(390,490,150,25);
l26.setBounds(390,530,150,25);
l27.setBounds(390,570,150,25);
l28.setBounds(390,610,150,25); 
l29.setBounds(390,650,100,25);
l30.setBounds(390,690,150,25);
l31.setBounds(730,130,150,25);
l32.setBounds(730,170,150,25);
l33.setBounds(730,210,150,25);
l34.setBounds(730,250,150,25);
l35.setBounds(730,290,150,25);
l36.setBounds(730,330,150,25);
l37.setBounds(900,370,150,135);
lh.setBounds(0,15,1366,110);
lb.setBounds(0,120,1366,688);

t1.setBounds(220,130,150,25);
t2.setBounds(220,170,150,25);
t3.setBounds(220,210,150,25);
t4.setBounds(220,250,150,25);
t5.setBounds(220,290,150,25);
t6.setBounds(220,330,150,25);
t7.setBounds(220,370,150,25);
t8.setBounds(220,410,150,25);
t9.setBounds(220,450,150,25);
t10.setBounds(220,490,150,25);
t11.setBounds(220,530,150,25);
t12.setBounds(220,570,150,25);
t13.setBounds(220,610,150,25);
t14.setBounds(220,650,150,25);
t15.setBounds(220,690,150,25);
t16.setBounds(560,130,150,25);
c1.setBounds(560,170,150,25);
t17.setBounds(560,210,150,25);
c5.setBounds(560,250,150,25);
c6.setBounds(560,290,150,25);
t18.setBounds(560,330,150,25);
t19.setBounds(560,370,150,25);
t20.setBounds(560,410,150,25);
t21.setBounds(560,450,150,25);
t22.setBounds(560,490,150,25);
t23.setBounds(560,530,150,25);
t24.setBounds(560,570,150,25);
t25.setBounds(560,610,150,25);
t26.setBounds(560,650,150,25);
t27.setBounds(560,690,150,25);
t28.setBounds(900,130,150,25);
t29.setBounds(900,170,150,25);
t30.setBounds(900,210,150,25);
t31.setBounds(900,250,150,25);
t32.setBounds(900,330,55,25);
b3.setBounds(965,330,85,25);
c2.setBounds(900,290,40,25);
c3.setBounds(943,290,50,25);
c4.setBounds(997,290,53,25);

b1.setBounds(900,530,65,25);
b2.setBounds(985,530,65,25);

b1.setBounds(900,500,65,25);
b2.setBounds(985,500,65,25);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);

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
frm.add(c1);
frm.add(t12);
frm.add(t13);
frm.add(t14);
frm.add(t15);
frm.add(t16);
frm.add(c5);
frm.add(c6);
frm.add(t17);
frm.add(t18);
frm.add(t19);
frm.add(t20);
frm.add(t21);
frm.add(t22);
frm.add(t23);
frm.add(t24);
frm.add(t25);
frm.add(t26);
frm.add(t27);
frm.add(t28);
frm.add(t29);
frm.add(t30);
frm.add(t31);
frm.add(t32);
frm.add(t33);
frm.add(t34);
frm.add(b3);
frm.add(t35);
frm.add(b1);
frm.add(b2);

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
frm.add(l35);
frm.add(l36);
frm.add(l37);
frm.add(lh);
frm.add(c2);
frm.add(c3);
frm.add(c4);

l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f);
l5.setFont(f);
l6.setFont(f);
l7.setFont(f);
l8.setFont(f);
l9.setFont(f);
l10.setFont(f);
l11.setFont(f);
l12.setFont(f);
l13.setFont(f);
l14.setFont(f);
l15.setFont(f);
l16.setFont(f);
l17.setFont(f);
l18.setFont(f);
l19.setFont(f);
l20.setFont(f);
l21.setFont(f);
l22.setFont(f);
l23.setFont(f);
l24.setFont(f);
l25.setFont(f);
l26.setFont(f);
l27.setFont(f);
l28.setFont(f);

frm.add(lb);

frm.setVisible(true);

}

public void actionPerformed(ActionEvent ae)
{

a1=t1.getText();
a2=t2.getText();
a3=t3.getText();
a4=t4.getText();
a5=t5.getText();
a6=t6.getText();
a7=t7.getText();
a8=t8.getText();
a9=t9.getText();
a10=t10.getText();
a11=t11.getText();
a12=t12.getText();
a13=t13.getText();
a14=t14.getText();
a15=t15.getText();
a16=t16.getText();
a17=t17.getText();
a18=t18.getText();
a19=t19.getText();
a20=t20.getText();
a21=t21.getText();
a22=t22.getText();
a23=t23.getText();
a24=t24.getText();
a25=t25.getText();
a26=t26.getText();
a27=t27.getText();
a28=t28.getText();
a29=t29.getText();
a30=t30.getText();
a31=t31.getText();
a32=t32.getText();
a33=c2.getSelectedItem();
a34=c3.getSelectedItem();
a35=c4.getSelectedItem();
ac1=c1.getSelectedItem();
ac5=c5.getSelectedItem();
ac6=c6.getSelectedItem();
a36=t33.getText();

Validation ob= new Validation();
String dialogtittle = "Message";
int t=ob.tagn(a29);
int p=ob.tagn(a18);
boolean h=ob.heigth(a20);
boolean w=ob.heigth(a21);
if(ae.getSource()==b1)
{
int r=ob.tagn(a1);

if(r==0)
{
String dialogmessage="Please enter  a valid Tag No.";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a2)==false)
{
String dialogmessage="Please enter valid Genetic code";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a3)==false)
{
String dialogmessage="Please enter valid Common Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a4)==false)
{
String dialogmessage="Please enter valid Scientific name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a6)==false)
{
String dialogmessage="Please enter valid SubKingdom name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a7)==false)
{
String dialogmessage="Please enter valid Phylum";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a8)==false)
{
String dialogmessage="Please enter valid Class Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a9)==false)
{
String dialogmessage="Please enter valid Sub-Class Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a10)==false)
{
String dialogmessage="Please enter valid Order";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a11)==false)
{
String dialogmessage="Please enter valid Family Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a12)==false)
{
String dialogmessage="Please enter valid Sub-Family Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a13)==false)
{
String dialogmessage="Please enter valid Tribe Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a14)==false)
{
String dialogmessage="Please enter valid Sub-Tribe Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a15)==false)
{
String dialogmessage="Please enter valid Genus Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a16)==false)
{
String dialogmessage="Please enter valid Species Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ac1.equals("Select"))
{
String dialogmessage="Please Select a valid Type";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a17)==false)
{
String dialogmessage="Please enter valid Region Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ac5.equals("Select"))
{
String dialogmessage="Please Select a valid Type of Birth";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ac6.equals("Select"))
{
String dialogmessage="Please Select a valid Reprodution Type";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(p==0)
{
String dialogmessage="Please fill a valid Amount";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a19)==false)
{
String dialogmessage="Please enter valid Habitat";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(h==false)
{
String dialogmessage="Fill a valid heigth ";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}

else if(w==false)
{
String dialogmessage="Fill a valid weigth";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a22)==false)
{
String dialogmessage="Please enter valid Color Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a23)==false)
{
String dialogmessage="Please enter valid Skin-Type";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a24)==false)
{
String dialogmessage="Please enter Behaviour in words";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a25)==false)
{
String dialogmessage="Please enter Food in Words";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a26)==false)
{
String dialogmessage="Please enter Morphology in Words";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a27)==false)
{
String dialogmessage="Please enter Movement in Words";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a28)==false)
{
String dialogmessage="Please Write in About more in Words";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(t==0)
{
String dialogmessage="Please enter  a valid Scientist-Id.";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a30)==false)
{
String dialogmessage="Please enter a valid Scientist Name";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(ob.string(a31)==false)
{
String dialogmessage="Please enter Group Name in Words";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}



else if(a33.equals("dd"))
{
String dialogmessage="Please Choose a Valid Date";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(a34.equals("mm"))
{
String dialogmessage="Please Choose a Valid Month";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(a35.equals("yyyy"))
{
String dialogmessage="Please Choose a Valid Year";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}
else if(a36.equals(""))
{
String dialogmessage="Please Choose a Photo";
int dialogtype = JOptionPane.ERROR_MESSAGE;
JOptionPane.showMessageDialog((Component) null, dialogmessage, dialogtittle, dialogtype);
}

}
else if(ae.getSource()==b2)
{
frm.setVisible(false);
}
else if(ae.getSource()==b3)
{
dialog.setVisible(true);
t32.setText(dialog.getFile());
}
}
public void itemStateChanged(ItemEvent ie)
{

if(ie.getSource()==c3)
{

if(c3.getSelectedItem().equals("2"))
{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=28;i++)
{
c2.addItem(""+i);
}
if(!(c4.getSelectedItem().equals("yyyy")))
{
r = Integer.parseInt(c4.getSelectedItem());
}
if(r%4==0&&!(r%100==0))
{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=29;i++)
{
c2.addItem(""+i);

}
}
else if(r%400==0&&r%100==0)
{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=29;i++)
{
c2.addItem(""+i);
}
}
else{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=28;i++)
{
c2.addItem(""+i);
}
}
}
else if(c3.getSelectedItem().equals("1")||c3.getSelectedItem().equals("3")||c3.getSelectedItem().equals("5")||c3.getSelectedItem().equals("7")||c3.getSelectedItem().equals("8")||c3.getSelectedItem().equals("10")||c3.getSelectedItem().equals("12"))
{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=31;i++)
{
c2.addItem(""+i);
}
}
else{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=30;i++)
{
c2.addItem(""+i);
}
}
}
if(ie.getSource()==c4)
{
if(c3.getSelectedItem().equals("2"))
{
if(!(c4.getSelectedItem().equals("yyyy")))
{
 r = Integer.parseInt(c4.getSelectedItem());
}
if(r%4==0&&!(r%100==0))
{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=29;i++)
{
c2.addItem(""+i);
}
}
else if(r%400==0&&r%100==0)
{
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<=29;i++)
{
c2.addItem(""+i);
}
}
else {
c2.removeAll();
c2.addItem("dd");
for(int i=1;i<29;i++)
{
c2.addItem(""+i);
}
}
}
}
}
}