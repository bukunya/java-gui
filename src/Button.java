import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){
        button = new JButton();
        button.setBounds(200,100,150,50);
        button.addActionListener(this);
        button.setText("Prints hello world");
        button.setFocusable(false);
        button.setBorder(BorderFactory.createLineBorder(Color.red));

        label = new JLabel("Disabled");
        label.setBounds(0,0,100,50);
        label.setVisible(false);

//        Using lambda expression, no need implements ActionListener and @Override
        JButton button2 = new JButton();
        button2.setBounds(200,200,150,50);
        button2.addActionListener(e -> System.out.println("Hello Galaxy!"));
        button2.setText("Prints hello galaxy");
        button2.setFocusable(false);
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setBackground(Color.green);

        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Hello World!");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}

public class Button {
    public static void main(String[] args) {
        new MyFrame();
//        new MyFrame2();
    }
}
