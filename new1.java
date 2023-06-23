import java.awt.*;
import javax.swing.*;
import java.awt.event.*;      
class online extends new1{  
    JLabel l,l1;  
    JFrame f;
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    public online(String s,String s1){   
        f=new JFrame(s);  
        l1=new JLabel();
        l=new JLabel(); 
        l1.setBounds(30, 10, 150, 30); 
        l1.setText(s1);
        f.add(l);f.add(l1);
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++){  
            jb[i]=new JRadioButton();     
            f.add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Mark");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.add(b1);f.add(b2); 
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setLayout(null);  
        f.setLocation(250,100);  
        f.setVisible(true);  
        f.setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b1){  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==7){  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Mark")){  
            JButton bk=new JButton("Mark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            f.add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==7)  
                b2.setText("Result");  
            f.setVisible(false);  
            f.setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++){  
            if(e.getActionCommand().equals("Mark"+y)){  
                if(check())  
                    count=count+1;  
                now=current;  
                current=m[y];  
                set();  
                ((JButton)e.getSource()).setEnabled(false);  
                current=now;  
            }  
        }  
        if(e.getActionCommand().equals("Result")){  
            if(check())  
                count=count+1;  
            current++;    
            JOptionPane.showMessageDialog(f,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set(){  
        jb[4].setSelected(true);  
        if(current==0){     
            l.setText("Q1: Which package is directly available to our class without importing it?");  
            jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");
        }  
        if(current==1){  
            l.setText("Q2: Which class is available to all the class automatically?");  
            jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");  
        }  
        if(current==2){  
            l.setText("Q3: Which one among these is not a primitive datatype?");  
            jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char"); 
        }  
        if(current==3){  
            l.setText("Q4: String class is defined in which package?");  
            jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");  
        } 
        if(current==4){  
            l.setText("Q5: Which one among these is not a keyword?");  
            jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");  
        }  
        if(current==5){  
            l.setText("Q6: Which one among these is not a class? ");  
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
            jb[3].setText("Button");  
        }  
        if(current==6){  
            l.setText("Q7: Which one among these is not a valid component?");  
            jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");  
            jb[3].setText("JTextArea");
        }  
        if(current==7){  
            l.setText("Q8: which one among these is not a function of Object class?");  
            jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");  
            jb[3].setText("getDocumentBase");  
        }  
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check(){  
        if(current==0)  
            return(jb[3].isSelected()); 
        if(current==1)  
            return(jb[2].isSelected());  
        if(current==2)  
            return(jb[1].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)                      
            return(jb[2].isSelected());  
        if(current==5)                      
            return(jb[1].isSelected());  
        if(current==6)                      
        return(jb[2].isSelected()); 
        if(current==7)                      
        return(jb[3].isSelected());
        return false;  
    } 
} 
class find extends new1{   
    JTextField tf=new JTextField();JLabel l;JButton b;JFrame f=new JFrame("Find IP");
    JLabel l1=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    find(String s,String s1){
        f1.dispose();
        l1.setBounds(280, 70, 200, 30);
        l3.setBounds(280, 100, 200, 30);
        l4.setBounds(280, 130,200, 30);
        l=new JLabel();
        l.setBounds(50,180,300,25);
        b=new JButton("Find IP");
        b.setBounds(50,100,150,30);
        tf.setBounds(50,50,150,30);
        f.setSize(500,400);
        f.setLayout(null);
		f.setVisible(true);
        f.add(tf);f.add(l);f.add(b);f.add(l1);f.add(l3);f.add(l4);
        l1.setText("LOGIN DETAILS");
        l3.setText("User Name : "+s);
        l4.setText("Password : "+s1);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ex){
        if(ex.getSource()==b){
            if(tf.getText().isEmpty()){
                JOptionPane.showMessageDialog(f, "This is Required", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    String host=tf.getText();
                    String ip=java.net.InetAddress.getByName(host).getHostAddress();
                    l.setFont(new Font("ALGERIAN",Font.BOLD,12));
                    l.setText("IP of "+host+" is: "+ip);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
class signup extends new1{
    JFrame f=new JFrame("User Signup");
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    signup(){
        /*-----------sign--up-----------------------------------------------------------*/
        JButton b2=new JButton("SIGNUP");
        b2.setBounds(180, 240, 120, 30);
        JLabel ll1=new JLabel("NAME");
        ll1.setBounds(50, 50, 120, 30);
        JTextField tf1=new JTextField();
        tf1.setBounds(180, 50, 120, 30);
        JLabel ll3=new JLabel("MOBILIE NO");
        JTextField tf2=new JTextField();
        ll3.setBounds(50, 100, 120, 30);
        tf2.setBounds(180, 100, 120, 30);
        JLabel ll4=new JLabel("USERNAME");
        ll4.setBounds(50, 150, 120, 30);
        JTextField tf3=new JTextField();
        tf3.setBounds(180, 150, 120, 30);
        JLabel l5=new JLabel("PASSWORD");
        l5.setBounds(50, 200, 120, 30);
        JPasswordField p1=new JPasswordField(20);
        p1.setBounds(180, 200, 120, 30);
        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);
        p3.setBounds(100, 50, 400, 400); 
        p3.setVisible(true);
        p3.setLayout(null);
        p3.add(ll1);p3.add(ll3);p3.add(ll4);p3.add(l5);p3.add(tf1);p3.add(tf2);p3.add(tf3);p3.add(p1);p3.add(b2);
        f.add(p3);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==b2){
                    if(tf1.getText().isEmpty()||tf2.getText().isEmpty()||tf3.getText().isEmpty()){
                        JOptionPane.showMessageDialog(f, "Please fill all the fields", "warning", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(f1, "Signup Successful");
                        new online("Online Test","Welcome , "+tf3.getText());
                        f.dispose();
                    }
                }
            }
        });
    }
}
public class new1 implements ActionListener{
    JFrame f1=new JFrame("Main Page");
    JButton b1=new JButton("OWNER");
    JButton b2=new JButton("USER");
    JFrame f =new JFrame("Owner Login");
    JPasswordField p=new JPasswordField();
    JButton b=new JButton("LOGIN");
    JLabel l1=new JLabel("USERNAME");
    JLabel l2=new JLabel("PASSWORD");
    JCheckBox cb=new JCheckBox("Show Password");
    JLabel l3=new JLabel();JLabel l4=new JLabel();
    final JTextField tf=new JTextField();
    public String s,s1;
    new1(){
        l3.setBounds(50, 150, 300, 30);
        l4.setBounds(50, 180, 300, 30);
        l3.setText(">>OWNER-->This Field is accessible only by owner");
        l4.setText(">>USER-->Enter this field to write an online test");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2.setBounds(150, 100, 80, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        f1.setSize(400, 400);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.add(b1);f1.add(b2);f1.add(l3);f1.add(l4);
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            JPanel p2=new JPanel();
            cb.setBounds(150, 130, 150, 30);
            b.setBounds(150, 160, 80, 30);
            b.setBackground(Color.BLACK);
            b.setForeground(Color.WHITE);
            l1.setBounds(50, 50, 100, 30);
            tf.setBounds(150, 50, 100, 30);
            l2.setBounds(50, 100, 100, 30);
            p.setBounds(150, 100, 100, 30);
            p2.setBounds(50, 50, 400, 400); 
            p2.setVisible(true);
            p2.setLayout(null);
            p2.add(p);p2.add(l1);p2.add(l2);p2.add(b);p2.add(tf);p2.add(cb);
            f.setSize(700, 500);
            f.setLayout(null);
            f.setVisible(true);
            f.add(p2);
            cb.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ex){
                    if(ex.getSource()==cb){
                        if(cb.isSelected()){
                            p.setEchoChar((char)0);
                        }
                        else{
                            p.setEchoChar('*');
                        }
                    }
                }
            });
            b.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(e.getSource()==b){
                        String data=tf.getText();
                        s=data;
                        String data1=new String(p.getPassword()); 
                        s1=data1;
                        if(data.equalsIgnoreCase("Harish")&& data1.equals("harish1234")){
                            new find(s,s1);
                            f.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(f, "Invalid username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                        } 
                       
                    }
                }
            });
        }
        else if(e.getSource()==b2){
            f1.dispose();
            new signup();
        }
    }
    public static void main(String[] args) {
        new new1();
    }
}