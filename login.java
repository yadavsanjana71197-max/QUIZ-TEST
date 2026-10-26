package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, Back;
    login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450,0,550,500);
        add(image);

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD , 40));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
        name.setForeground(new Color(22,99,54));
        add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman",Font.BOLD, 18));
        add(text);

        Next = new JButton("Next");
        Next.setBounds(100,270,120,25);
        Next.setBackground(new Color(22, 99,54));
        Next.setForeground(Color.white);
        Next.addActionListener(this);
        add(Next);

        Back= new JButton("Back");
        Back.setBounds(250,270,120,25);
        Back.setBackground(new Color(22, 99,54));
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);






        setSize(1000,500);
        setLocation(200,150);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== Next){
            String name = text.getText();
            setVisible(false);
            new Rules(name);

        } else if (e.getSource()== Back) {
            System.exit(50);

        }
    }

    public static void main(String[] args){
        new login();

    }
}
