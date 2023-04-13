package Quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;

        JLabel heading=new JLabel("Here are some rules "+name+":" );
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        heading.setBounds(500,20,700,40);
        heading.setForeground(Color.red);
        add(heading);

        JLabel rules=new JLabel();
        rules.setFont(new Font("Tohoma",Font.PLAIN,12));
        rules.setBounds(20,20,700,450);
        rules.setText("<html>" + "1. Only Single participation is allowed."+"<br><br>"+
        "2. The medium of the questions will be only English."+"<br><br>"+
        "3. There will be no screening round."+"<br><br>"+
        "4. All the participants can play all the rounds."+"<br><br>"+
        "5. On the average score derives from all the rounds, winners will be declared."+"<br><br>"+
        "6. There will be certain time span for each round."+"<br><br>"+
        "7. If there is any tie up among the participants about average score, it will be solved by taking another round or set of rounds"+"<br><br>"+
        "8. All the rights related with the competition are reserved to Organizers of MAESTRO 2020-21."+"<br><br>"+
        "9. Rules and Regulations can be change on time which will depend upon circumstances and number of Entries."+"<br><br>"+
    "<html>"
    );
        add(rules);


        start=new JButton("Start");
        start.setBounds(150,400,120,25);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);

        back=new JButton("Back");
        back.setBounds(20,400,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);



        getContentPane().setBackground(Color.white );
        setLayout(null);
        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
    }
        else {
            setVisible(false);
            new Login();
        }}
    public static void main(String[] args) {
        new Rules("User");
    }
}
