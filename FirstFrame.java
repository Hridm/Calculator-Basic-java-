import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstFrame extends JFrame implements ActionListener
{
	JLabel label;
	private double mem;
	public double mm;
	
	JButton offBtn,acBtn,backspaceBtn,mplusBtn,mminusBtn,mcBtn,mrBtn,oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn,zeroBtn,plusBtn,minusBtn,starBtn,slashBtn,equalBtn,dotBtn;
	JPanel panel;
	Color myColor1,myColor2,myColor3;
	int flag=0;
	public FirstFrame()
	{
		super("Calculator");
		this.setSize(350,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor1 = new Color(203,239,238);
		myColor2 = new Color(86,162,161);
		myColor3 = new Color(209,61,61);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color. LIGHT_GRAY);
		
		label = new JLabel();
		label.setBounds(5,10,325,60);
		label.setBackground(myColor1);
		label.setOpaque(true);
		panel.add(label);
		
		offBtn= new JButton("OFF");
		offBtn.setBounds(10,95,105,40);
		offBtn.setBackground(myColor3);
		offBtn.addActionListener(this);
		panel.add(offBtn);
		
		acBtn= new JButton("AC");
		acBtn.setBounds(135,95,105,40);
		acBtn.addActionListener(this);
		panel.add(acBtn);
		
		backspaceBtn=new JButton("<");
		backspaceBtn.setBounds(260,95,65,40);
		backspaceBtn.addActionListener(this);
		panel.add(backspaceBtn);
		
		
		mplusBtn=new JButton("M+");
		mplusBtn.setBounds(10,145,55,40);
		mplusBtn.addActionListener(this);
		panel.add(mplusBtn);
		
		sevenBtn=new JButton("7");
		sevenBtn.setBounds(75,145,55,40);
		sevenBtn.setBackground(myColor2);
		sevenBtn.addActionListener(this);
		panel.add(sevenBtn);
		
		
	    eightBtn=new JButton("8");
		eightBtn.setBounds(140,145,55,40);
		eightBtn.setBackground(myColor2);
		eightBtn.addActionListener(this);
		panel.add(eightBtn);
		
		nineBtn=new JButton("9");
		nineBtn.setBounds(205,145,55,40);
		nineBtn.setBackground(myColor2);
		nineBtn.addActionListener(this);
		panel.add(nineBtn);
		
		slashBtn=new JButton("/");
		slashBtn.setBounds(270,145,55,40);
		slashBtn.addActionListener(this);
		panel.add(slashBtn);
		
		mminusBtn=new JButton("M-");
		mminusBtn.setBounds(10,195,55,40);
		mminusBtn.addActionListener(this);
		panel.add(mminusBtn);
		
		fourBtn=new JButton("4");
		fourBtn.setBounds(75,195,55,40);
		fourBtn.setBackground(myColor2);
		fourBtn.addActionListener(this);
		panel.add(fourBtn);
		
		fiveBtn=new JButton("5");
		fiveBtn.setBounds(140,195,55,40);
		fiveBtn.setBackground(myColor2);
		fiveBtn.addActionListener(this);
		panel.add(fiveBtn);
		
		
		sixBtn=new JButton("6");
		sixBtn.setBounds(205,195,55,40);
		sixBtn.setBackground(myColor2);
		sixBtn.addActionListener(this);
		panel.add(sixBtn);
		
		starBtn=new JButton("*");
		starBtn.setBounds(270,195,55,40);
		starBtn.addActionListener(this);
		panel.add(starBtn);
		
		mcBtn=new JButton("MC");
		mcBtn.setBounds(10,245,55,40);
		mcBtn.addActionListener(this);
		panel.add(mcBtn);
		
		oneBtn=new JButton("1");
		oneBtn.setBounds(75,245,55,40);
		oneBtn.setBackground(myColor2);
		oneBtn.addActionListener(this);
		panel.add(oneBtn);
		
		
		twoBtn=new JButton("2");
		twoBtn.setBounds(140,245,55,40);
		twoBtn.setBackground(myColor2);
		twoBtn.addActionListener(this);
		panel.add(twoBtn);
		
		
		threeBtn=new JButton("3");
		threeBtn.setBounds(205,245,55,40);
		threeBtn.setBackground(myColor2);
		threeBtn.addActionListener(this);
		panel.add(threeBtn);
		
		minusBtn=new JButton("-");
		minusBtn.setBounds(270,245,55,40);
		minusBtn.addActionListener(this);
		panel.add(minusBtn);
		
		mrBtn=new JButton("MR");
		mrBtn.setBounds(10,295,55,40);
		mrBtn.addActionListener(this);
		panel.add(mrBtn);
		
		zeroBtn=new JButton("0");
		zeroBtn.setBounds(75,295,55,40);
		zeroBtn.setBackground(myColor2);
		zeroBtn.addActionListener(this);
		panel.add(zeroBtn);
		
		dotBtn=new JButton(".");
		dotBtn.setBounds(140,295,55,40);
		dotBtn.addActionListener(this);
		panel.add(dotBtn);
		
		equalBtn=new JButton("=");
		equalBtn.setBounds(205,295,55,40);
		equalBtn.addActionListener(this);
		panel.add(equalBtn);
		
		plusBtn=new JButton("+");
		plusBtn.setBounds(270,295,55,40);
		plusBtn.addActionListener(this);
		panel.add(plusBtn);
		
		
		
		
		
		
		
		

		

		
		
		
		this.add(panel);
		
		
	}
	public void setMemory(double x)
	{
		mem=x;

	}
	public double getMemory()
	{
		if(mem!=0)
		{
			return mem;
		}
		else return 0;
	}	
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(offBtn.getText().equals(command))
		{
			System.exit(0);
		}
		else if (oneBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+oneBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+oneBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
			
		}
		else if (twoBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+twoBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+twoBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (threeBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+threeBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+threeBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (fourBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+fourBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+fourBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (fiveBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+fiveBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+fiveBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (sixBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+sixBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+sixBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (sevenBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+sevenBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+sevenBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (eightBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+eightBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+eightBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (nineBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+nineBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+nineBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (zeroBtn.getText().equals(command))
		{
			if(flag==0){
			String text = label.getText()+zeroBtn.getText();
			label.setText(text);
			}
			else if(flag==1)
			{
				label.setText("");
				String text=label.getText()+zeroBtn.getText();
				label.setText(text);
				flag=0;
			}
			else{}
		}
		else if (plusBtn.getText().equals(command))
		{
			String text = label.getText()+plusBtn.getText();
			label.setText(text);
		}
		else if (minusBtn.getText().equals(command))
		{
			String text = label.getText()+minusBtn.getText();
			label.setText(text);
		}
		else if (starBtn.getText().equals(command))
		{
			String text = label.getText()+starBtn.getText();
			label.setText(text);
		}
		else if (slashBtn.getText().equals(command))
		{
			String text = label.getText()+slashBtn.getText();
			label.setText(text);
		}
		else if (dotBtn.getText().equals(command))
		{
			String text = label.getText()+dotBtn.getText();
			label.setText(text);
		}
		else if(acBtn.getText().equals(command))
		{
			label.setText("");
		}
		
		else if (backspaceBtn.getText().equals(command))
		{			
			String text=label.getText();
			text=text.substring(0,text.length()-1);
			label.setText(text);
		}
		else if (equalBtn.getText().equals(command))
		{
			String text = label.getText();
			int a=text.length();
			for(int i=0;i<a;i++)
			{
				if(text.charAt(i)=='+')
				{
					String num1=text.substring(0,text.indexOf('+'));
					String num2=text.substring(text.indexOf('+')+1,a);
					double x=Double.parseDouble(num1);
					double y=Double.parseDouble(num2);
					double z=x+y ;
					if(mem==0){setMemory(z);}
					mm=z;
					label.setText(text+"="+z+"  ");
					flag=1;
				}
				else if(text.charAt(i)=='-')
				{
					String num1=text.substring(0,text.indexOf('-'));
					String num2=text.substring(text.indexOf('-')+1,a);
					double x=Double.parseDouble(num1);
					double y=Double.parseDouble(num2);
					double z=x-y ;
					if(mem==0){setMemory(z);}
					mm=z;
					label.setText(text+"="+z+"  ");
					flag=1;
				}
				else if(text.charAt(i)=='*')
				{
					String num1=text.substring(0,text.indexOf('*'));
					String num2=text.substring(text.indexOf('*')+1,a);
					double x=Double.parseDouble(num1);
					double y=Double.parseDouble(num2);
					double z=x*y;
					if(mem==0){setMemory(z);}
					mm=z;
					label.setText(text+"="+z+"  ");
					flag=1;
				}
				else if(text.charAt(i)=='/')
				{
					String num1=text.substring(0,text.indexOf('/'));
					String num2=text.substring(text.indexOf('/')+1,a);
					double x=Double.parseDouble(num1);
					double y=Double.parseDouble(num2);
	
					double z=x/y;
                    if(mem==0){setMemory(z);}
					mm=z;
					label.setText(text+"="+z+"  ");
					flag=1;
				
				}
				
			}
			
		
			
		}
		else if(mplusBtn.getText().equals(command))
		{
			double m=getMemory()+mm;
			setMemory(m);
	
		}
		else if(mminusBtn.getText().equals(command))
		{
			double m=getMemory()-mm;
			setMemory(m);
					
		}
		else if (mrBtn.getText().equals(command))
		{
			
			String text =" "+getMemory();
		    label.setText(text);
		
		}
	    else if (mcBtn.getText().equals(command))
		{
			setMemory(0);
		
		}
		
	}
}