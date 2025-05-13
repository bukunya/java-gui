import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class MyFrame3 extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JButton button;
    ImageIcon one;
    ImageIcon two;

    MyFrame3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(MyFrame3.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        one = new ImageIcon(resizedImage);

        ImageIcon originalImage2 = new ImageIcon(Objects.requireNonNull(MyFrame3.class.getResource("/resource/circularUpsideDown.png")));
        Image resizedImage2 = originalImage2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        two = new ImageIcon(resizedImage2);

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox();
        checkBox.setText("Hello world!");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font(null, Font.PLAIN, 50));
        checkBox.setIcon(one);
        checkBox.setSelectedIcon(two);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){

            System.out.println(checkBox.isSelected());
        }
    }
}

public class CheckBox {
    public static void main(String[] args) {
        new MyFrame3();
    }
}
