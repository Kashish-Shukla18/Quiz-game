package Quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("\\Quiz\\login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);


        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,38));
        heading.setForeground(Color.red);
        add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(750,115,300,45);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.black);
        add(name);

        tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Mongolian Baiti",Font.BOLD,14));
        add(tfname);

        rules=new JButton("Rules");
        rules.setBounds(735,250,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915,250,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==rules){
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);

        }
        else if (ae.getSource()==back) {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
