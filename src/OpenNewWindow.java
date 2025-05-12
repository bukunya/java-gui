import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class One implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    One(){

        myButton.setBounds(100,100,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(myButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == myButton){
            frame.dispose();
            Two two = new Two();
        }
    }
}
class Two{

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");
    Two(){
        label.setBounds(0,0,100,40);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
}

public class OpenNewWindow {
    public static void main(String[] args) {
        One one = new One();
    }
}