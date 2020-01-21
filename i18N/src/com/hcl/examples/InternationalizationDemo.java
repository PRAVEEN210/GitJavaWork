package com.hcl.examples;
import java.awt.FlowLayout;
import java.util.Locale;  
import java.util.ResourceBundle;
import javax.swing.JFrame;

class Myframe extends JFrame
{
	Myframe()
	{
		setBounds(10,10,250,300);
		setLayout(new FlowLayout());
	}
	Myframe(String greet){
		JLabel
	}
}
public class InternationalizationDemo {  
 public static void main(String[] args) {  
  
  ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);  
  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  
  
  //changing the default locale to indonasian   
  Locale.setDefault(new Locale("in", "ID"));  
  bundle = ResourceBundle.getBundle("MessageBundle");  
  System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("greeting"));  
  
 }  
}  