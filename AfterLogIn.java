package myp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AfterLogIn extends Frame implements ActionListener
{
JLabel lb;
ImageIcon ib;
MenuBar mb;
Menu mnuAdd,mnuOpr,mnuUp,mnuSrc;
MenuItem miAddAni,miAddSci,miAcc,miExit;
MenuItem miAboutAni,miAboutSci;
MenuItem miUpdateAni,miUpdateSci;
MenuItem miSearchAni,miSearchSci;
Frame frm;
public AfterLogIn() 
{
ib= new ImageIcon("tp2.png");
lb= new JLabel(ib);
mb= new MenuBar();
mnuAdd=new Menu("Add");
miAddAni = new MenuItem("AddNewAnimal");
miAddSci = new MenuItem("AddNewScientist");
miAcc= new MenuItem("AddNewAccount");
miExit = new MenuItem("Exit");

mnuOpr = new Menu("Operation");
miAboutAni  = new MenuItem("AboutAnimal");
miAboutSci = new MenuItem("AboutSci");

mnuUp = new Menu("Update");
miUpdateAni = new MenuItem("UpdateAnimal");
miUpdateSci = new MenuItem("UpdateScientist");

mnuSrc = new Menu("Search");
miSearchAni = new MenuItem("SearchAnimal");
miSearchSci = new MenuItem("SearchSci");

frm = new Frame("Menu");

}
public void setUpAfterLogIn()
{
frm.setSize(500,500);
lb.setBounds(0,0,500,500);

mnuAdd.add(miAddAni);
mnuAdd.add(miAddSci);
mnuAdd.add(miAcc);
mnuAdd.add(miExit);

mnuOpr.add(miAboutAni);
mnuOpr.add(miAboutSci);

mnuUp.add(miUpdateAni);
mnuUp.add(miUpdateSci);

mnuSrc.add(miSearchAni);
mnuSrc.add(miSearchSci);

mb.add(mnuAdd);
mb.add(mnuOpr);
mb.add(mnuUp);
mb.add(mnuSrc);

frm.setMenuBar(mb);
frm.setVisible(true);

miAddAni.addActionListener(this);
miAddSci.addActionListener(this);
miAcc.addActionListener(this);
miExit.addActionListener(this);

miAboutAni.addActionListener(this);
miAboutSci.addActionListener(this);

miUpdateAni.addActionListener(this);
miUpdateSci.addActionListener(this);

miSearchAni.addActionListener(this);
miSearchAni.addActionListener(this);
 frm.add(lb);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==miAddAni)
{
AddNewAnimal on= new AddNewAnimal();
on.setUpAddNewAnimal();
}
if(ae.getSource()==miAddSci)
{
AddNewScientist os= new AddNewScientist();
os.setUpAddNewScientist();
}
if(ae.getSource()==miExit)
{

}
if(ae.getSource()==miUpdateAni)
{
UpdateAnimal ua= new UpdateAnimal();
ua.setUpUpdateAnimal();
}
if(ae.getSource()==miUpdateSci)
{

}

}

} 