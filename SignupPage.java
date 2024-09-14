package electricity.Billing.System;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class SignupPage  extends JFrame{
	SignupPage(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel=new JPanel();
		panel.setBounds(40, 30, 580, 250);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		panel.setForeground(Color.green);
		panel.setBorder(new TitledBorder(new LineBorder(Color.GREEN),"Create Account",TitledBorder.TOP, TitledBorder.TOP, null, Color.green));
		add(panel);
		
		JLabel title=new JLabel("CREATE ACCOUNT AS");
		title.setBounds(70, 30, 140, 20);
		title.setForeground(Color.red);
		panel.add(title);
		
		Choice selectAccountId=new Choice();
		selectAccountId.add("Admin");
		selectAccountId.add("Customer");
		selectAccountId.setBounds(210, 30, 140, 20);	
		panel.add(selectAccountId);
		
		JLabel mno = new JLabel("Meter Number");
		mno.setBounds(100,70,140,20);
		panel.add(mno);
		
		JTextField m_name= new JTextField();
		m_name.setBounds(210, 70, 140, 20);
		panel.add(m_name);
		
		JLabel name =new JLabel("User Name");
		name.setBounds(100, 100, 140, 20);
		panel.add(name);
		
		JTextField a_name= new JTextField();
		a_name.setBounds(210, 100, 140, 20);
		panel.add(a_name);
		
		JLabel uname = new JLabel("Name");
		uname.setBounds(100,130,140,20);
		panel.add(uname);
		
		JTextField nname= new JTextField();
		nname.setBounds(210,130,140,20);
		panel.add(nname);
		
		JLabel pass=new JLabel("Set Password");
		pass.setBounds(100,160,140,20);
		panel.add(pass);
		
		JTextField password =new JTextField();
		password.setBounds(210,160,140,20);
		panel.add(password);
		
		JButton create= new JButton("Create ID");
		create.setBackground(Color.blue);
		create.setForeground(Color.pink);
		create.setBounds(50,210,140,20);
		panel.add(create);
		
		JButton back =new JButton("Go Back");
		back.setBackground(Color.blue);
		back.setForeground(Color.pink);
		back.setBounds(210,210,140,20);
		panel.add(back);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
		Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
		ImageIcon i3 =new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(350,0,250,250);
		panel.add(image);
		
		setBounds(340,150,650,350);
		setVisible(true);
	}
	public static void main(String[]args) {
		new SignupPage();
		
		
	}

}
