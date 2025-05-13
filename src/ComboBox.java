import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class MyFrame5 extends JFrame implements ActionListener {

    JComboBox comboBox;
    ImageIcon one;
    ImageIcon two;

    MyFrame5(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(MyFrame5.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        one = new ImageIcon(resizedImage);

        ImageIcon originalImage2 = new ImageIcon(Objects.requireNonNull(MyFrame5.class.getResource("/resource/circularUpsideDown.png")));
        Image resizedImage2 = originalImage2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        two = new ImageIcon(resizedImage2);

        String[] animals = {"dog","cat","bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        comboBox.setEditable(true);
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig",0);
        comboBox.setSelectedIndex(0);
        System.out.println(comboBox.getItemCount());
        comboBox.removeItem("cat");
        comboBox.removeItemAt(1);
        comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}

public class ComboBox {
    public static void main(String[] args) {
        new MyFrame5();
    }
}
