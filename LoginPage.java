package electricity.Billing.System;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame{
	LoginPage(){
		super("Login Page");
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel username=new JLabel("User Name");
		username.setBounds(50, 20, 100, 20);
		add(username);
		
		JTextField enter_name=new JTextField();
		enter_name.setBounds(150, 20, 100, 20);	
		add(enter_name);
		
		JLabel password=new JLabel("Password");
		password.setBounds(50, 60, 100, 20);
		add(password);
		
		JTextField enter_password=new JTextField();
		enter_password.setBounds(150, 60, 100, 20);	
		add(enter_password);

		JLabel id=new JLabel("Loggin As");
		id.setBounds(50, 100, 100, 20);
		add(id);
		
		Choice select_loggin_id=new Choice();
		select_loggin_id.add("Admin");
		select_loggin_id.add("Customer");
		select_loggin_id.setBounds(150, 100, 100, 20);	
		add(select_loggin_id);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
		Image i2 = i1.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT);
		ImageIcon i3 =new ImageIcon(i2);
		JLabel image1=new JLabel(i3);
		JButton login=new JButton("Login",i3);
		login.setBounds(50, 150, 100, 20);
		add(login);
 
		ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
		Image i5 = i4.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT);
		ImageIcon i6 =new ImageIcon(i5);
		JLabel image2=new JLabel(i6);
		JButton cancel=new JButton("Cancel",i6);
		cancel.setBounds(170, 150, 100, 20);
		add(cancel);
		
		ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
		Image i8 = i7.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT);
		ImageIcon i9 =new ImageIcon(i8);
		JLabel image3=new JLabel(i9);
		JButton signup=new JButton("Signup",i9);
		signup.setBounds(110, 190, 100, 20);
		add(signup);
		
		ImageIcon i10= new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
		Image i11 = i10.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
		ImageIcon i12 =new ImageIcon(i11);
		JLabel image4=new JLabel(i12);
		image4.setBounds(310,0,250,250);
		add(image4);
		
		
		setSize(640,300);
		setLocation(400,200);
		setVisible(true);
	}
	
	
	public static void main(String[]args) {
		new LoginPage();
	}

}
