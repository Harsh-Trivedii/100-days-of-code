import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;   
class CreateLoginForm extends JFrame implements ActionListener  
{  
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
      
    CreateLoginForm()  
    {     
          
  
        userLabel = new JLabel();  
        userLabel.setText("Username");      
          
        textField1 = new JTextField(15);   
        passLabel = new JLabel();  
        passLabel.setText("Password");

        textField2 = new JPasswordField(15);
          
        b1 = new JButton("SUBMIT");
          
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);    
        newPanel.add(textField1);   
        newPanel.add(passLabel);    
        newPanel.add(textField2);   
        newPanel.add(b1);           
          

        add(newPanel, BorderLayout.CENTER);  
          

        b1.addActionListener(this);
        setTitle("LOGIN FORM");   
    }  
      
    
    public void actionPerformed(ActionEvent ae)     
    {  
        String userValue = textField1.getText();      
        String passValue = textField2.getText();            
    
        if (userValue.equals("harsh@gmail.com") && passValue.equals("harsh")) {
              
            JOptionPane.showMessageDialog(null,"Welcome! Correct credentials.");
        }  
        else{  
            System.out.println("Please enter valid username and password");  
        }  
    }  
}  
class LoginFormDemo  
{  
    public static void main(String arg[])  
    {  
        try  
        {  
            CreateLoginForm form = new CreateLoginForm();  
            form.setSize(500,500);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}
