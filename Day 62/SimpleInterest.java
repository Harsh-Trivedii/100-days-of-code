import javax.swing.*;  
import java.awt.event.*;  
public class SimpleInterest implements ActionListener{  
    JTextField tf1,tf2,tf3,tf4;  
    JButton b1;  
    JLabel l1, l2,l3;
    SimpleInterest(){  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        l1 = new JLabel("Principal");
        l1.setBounds(50,30,150,20);  
        tf1.setBounds(50,50,150,20); 
        l2 = new JLabel("Rate");
        l2.setBounds(50,80,150,20); 
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
        l3 = new JLabel("Time");
        l3.setBounds(50,130,150,20);
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf4=new JTextField();  
        tf4.setBounds(50,200,150,20);  
        tf4.setEditable(false);   
        b1=new JButton("Simple Interest");  
        b1.setBounds(50,250,150,50);  
        b1.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(b1);f.add(l1);f.add(l2);f.add(l3);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
	String s3=tf3.getText();
        int p=Integer.parseInt(s1);  
        int r=Integer.parseInt(s2);  
	int t=Integer.parseInt(s3);
        int si=0;  
        if(e.getSource()==b1){  
              si=(p*r*t)/100;
        }  
        String result=String.valueOf(si);  
        tf4.setText(result);  
    }  
public static void main(String[] args) {  
    SimpleInterest s=new SimpleInterest();
} }  
