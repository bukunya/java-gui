import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class MyFrame4 extends JFrame implements ActionListener {

    JRadioButton buttonOne;
    JRadioButton buttonTwo;
    JRadioButton buttonThree;
    ImageIcon one;
    ImageIcon two;

    MyFrame4(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(MyFrame4.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        one = new ImageIcon(resizedImage);

        ImageIcon originalImage2 = new ImageIcon(Objects.requireNonNull(MyFrame4.class.getResource("/resource/circularUpsideDown.png")));
        Image resizedImage2 = originalImage2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        two = new ImageIcon(resizedImage2);

        buttonOne = new JRadioButton("One");
        buttonTwo = new JRadioButton("Two");
        buttonThree = new JRadioButton("Three");

        ButtonGroup group = new ButtonGroup();
        group.add(buttonOne);
        group.add(buttonTwo);
        group.add(buttonThree);

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);

        buttonOne.setIcon(one);
        buttonOne.setSelectedIcon(two);
        this.add(buttonOne);
        this.add(buttonTwo);
        this.add(buttonThree);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonOne){
            System.out.println("Get one");
        } else if (e.getSource() == buttonTwo) {
            System.out.println("Get two");
        } else {
            System.out.println("Get three");
        }
    }
}

public class RadioButton {
    public static void main(String[] args) {
        new MyFrame4();
    }
}
