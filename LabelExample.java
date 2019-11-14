import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class LabelExample extends Frame implements ActionListener{  
    JTextField tf; JLabel l; JButton b; JFrame f;JPasswordField value;
    LabelExample(){  
	f=new JFrame("Password Field Example");
      	tf=new JTextField(); 
	JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,100, 80,30); 
        tf.setBounds(50,50, 150,20);  
        l=new JLabel();  
        l.setBounds(150,150, 300,30);      
        b=new JButton("Find IP");  
        b.setBounds(50,150,95,30);  
        b.addActionListener(this); 
	value = new JPasswordField();   
     	JLabel l1=new JLabel("Password:");    
        l1.setBounds(20,100, 80,30);    
        value.setBounds(100,100,100,30);     
        f.add(value);  
	f.add(l1);
	f.add(l2);    
        f.add(b);
	f.add(tf);
	f.add(l);    
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        try{  
        String host=tf.getText();  
	String pswd=value.getText();  
	System.out.println(host);
	System.out.println(pswd);
        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
        l.setText("IP of "+host+" is: "+ip);  
        }catch(Exception ex){System.out.println(ex);}  
    }  
    public static void main(String[] args) {  
        new LabelExample();  
    } }