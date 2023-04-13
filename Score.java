package Quiz;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String name, int Score) {
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("\\Quiz\\score.png"));
        Image i2=i1.getImage().getScaledInstance(300,550,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i1);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading=new JLabel("Thank You "+ name +" for playing");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);

        JLabel score=new JLabel("Your Score is"+ " "+Score );
        score.setBounds(350,200,300,30);
        score.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(score);

        JButton submit=new JButton("Play Again");
        submit.setBounds(400,270,120,30);
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
