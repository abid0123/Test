package ReferencePrograms.lengthUnit;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

/*
 * GUI components used: JList, etc.
 */
public class GUILengthUnitConverter extends JFrame implements ListSelectionListener{
	public JList jListFrmUnit = null;
	public JList jListToUnit = null;
	String[] unitArry = {" Foot", " Meter", " Mile", " Inch", " Yard"};  
	
	JTextField jtfFrm = new JTextField(10);
	JTextField jtfTo = new JTextField(10);
	
	JLabel jlbFrm = new JLabel(" From");
	JLabel jlbTo = new JLabel(" To");
	
	JLabel jlbInstruction =new JLabel("Please choose units, and key in value of source unit");
	
	public GUILengthUnitConverter(){
		jListFrmUnit = new JList(unitArry);
		jListToUnit = new JList(unitArry);
		
		JPanel jpLTFrm = new JPanel();
		jpLTFrm.setLayout(new GridLayout(2,1, 2,2));
		jpLTFrm.add(jlbFrm);
		jpLTFrm.add(jtfFrm);
		
		JPanel jpLTTo = new JPanel();
		jpLTTo.setLayout(new GridLayout(2,1, 2,2));
		jpLTTo.add(jlbTo);
		jpLTTo.add(jtfTo);
		
		JPanel jpFrm = new JPanel();
		jpFrm.setLayout(new BorderLayout(3,3));
		jpFrm.add(jpLTFrm, BorderLayout.NORTH);
		jpFrm.add(jListFrmUnit, BorderLayout.CENTER);

		JPanel jpTo = new JPanel();
		jpTo.setLayout(new BorderLayout(3,3));
		jpTo.add(jpLTTo, BorderLayout.NORTH);
		jpTo.add(jListToUnit, BorderLayout.CENTER);
		
		JPanel jpMain = new JPanel();
		jpMain.setLayout(new GridLayout(1,2,2,2));
		jpMain.add(jpFrm);
		jpMain.add(jpTo);
		
		setLayout(new BorderLayout());
		add(jlbInstruction, BorderLayout.NORTH);
		add(jpMain, BorderLayout.CENTER);

		jListFrmUnit.setSelectionMode(0); //SINGLE_SELECTION
		  // Handle list selection
		jListFrmUnit.addListSelectionListener(this);  

		jListToUnit.setSelectionMode(0); //SINGLE_SELECTION
		  // Handle list selection
		jListToUnit.addListSelectionListener(this);  
	
	}
	
	public static void main(String[] a){
		GUILengthUnitConverter con = new GUILengthUnitConverter();
		con.setTitle("Length Unit Concerter with GUI");
		con.setVisible(true);
		con.setSize(400, 300);
	    con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void valueChanged(ListSelectionEvent arg0) {
		
		// TODO Auto-generated method stub
		
	    double dFrm = 0;
	    try{
	    	dFrm = Double.parseDouble(jtfFrm.getText().trim());
	    }catch(Exception e){
	    	//jlbInstruction.setText(jlbInstruction.getText()+ "Please enter  a double value for From Unit");
	      JOptionPane.showMessageDialog(null,"Please enter  a double value for From Unit","Invalid value for From unit", JOptionPane.ERROR_MESSAGE);
	      jtfFrm.setText("");
	    }
	    int intFrm =  jListFrmUnit.getSelectedIndex();
	    int intTo =  jListToUnit.getSelectedIndex();
	    
	    int choice  = getChoice(intFrm, intTo);
	    /*
	    if (intFrm==0 && intTo==0) choice = 100;
	    else if(intFrm==0 && intTo==1) choice = 1;
	    else if(intFrm==0 && intTo==2) choice = 2;
	    else if(intFrm==0 && intTo==3) choice = 3;
	    else if(intFrm==0 && intTo==4) choice = 4;
	  
	    else if(intFrm==1 && intTo==0) choice = 5;
	    else if(intFrm==2 && intTo==0) choice = 6;
	    else if(intFrm==3 && intTo==0) choice = 7;
	    else if(intFrm==4 && intTo==0) choice = 8;
	    
	    else if(intFrm==1 && intTo==1) choice = 100;//no need to convert
	    else if(intFrm==1 && intTo==2) choice = 9;
	    else if(intFrm==1 && intTo==3) choice = 10;
	    else if(intFrm==1 && intTo==4) choice = 11;
	    else if(intFrm==2 && intTo==1) choice = 12;
	    
	    else if(intFrm==2 && intTo==2) choice = 100;
	    else if(intFrm==3 && intTo==1) choice = 13;
	    else if(intFrm==4 && intTo==1) choice = 14;
	    else if(intFrm==4 && intTo==3) choice = 15;
	    else if(intFrm==4 && intTo==2) choice = 16;
	    
	    else if(intFrm==3 && intTo==3) choice = 100;
	    else if(intFrm==3 && intTo==4) choice = 17;
	    else if(intFrm==2 && intTo==4) choice = 18;
      	else if(intFrm==3 && intTo==2) choice = 19;
	    else if(intFrm==2 && intTo==3) choice = 20;
		   
	    else if(intFrm==4 && intTo==4) choice = 100;
	*/
	 //   System.out.println("Frm: "+intFrm + "to:"+ intTo);
	    
	    jtfTo.setText("" + LengthUnitConverter.convert(choice, dFrm));
	}
	
	/*
	 * method getChoice() is designed based on LengthUnitConverter class
	 */
	  public int getChoice(int intFrm, int intTo){
		  int choice = 0;
		  if (intFrm==0 && intTo==0) choice = 100;
		    else if(intFrm==0 && intTo==1) choice = 1;
		    else if(intFrm==0 && intTo==2) choice = 2;
		    else if(intFrm==0 && intTo==3) choice = 3;
		    else if(intFrm==0 && intTo==4) choice = 4;
		  
		    else if(intFrm==1 && intTo==0) choice = 5;
		    else if(intFrm==2 && intTo==0) choice = 6;
		    else if(intFrm==3 && intTo==0) choice = 7;
		    else if(intFrm==4 && intTo==0) choice = 8;
		    
		    else if(intFrm==1 && intTo==1) choice = 100;//no need to convert
		    else if(intFrm==1 && intTo==2) choice = 9;
		    else if(intFrm==1 && intTo==3) choice = 10;
		    else if(intFrm==1 && intTo==4) choice = 11;
		    else if(intFrm==2 && intTo==1) choice = 12;
		    
		    else if(intFrm==2 && intTo==2) choice = 100;
		    else if(intFrm==3 && intTo==1) choice = 13;
		    else if(intFrm==4 && intTo==1) choice = 14;
		    else if(intFrm==4 && intTo==3) choice = 15;
		    else if(intFrm==4 && intTo==2) choice = 16;
		    
		    else if(intFrm==3 && intTo==3) choice = 100;
		    else if(intFrm==3 && intTo==4) choice = 17;
		    else if(intFrm==2 && intTo==4) choice = 18;
	      	else if(intFrm==3 && intTo==2) choice = 19;
		    else if(intFrm==2 && intTo==3) choice = 20;
			   
		    else if(intFrm==4 && intTo==4) choice = 100;
		  return choice;
	  }
}
