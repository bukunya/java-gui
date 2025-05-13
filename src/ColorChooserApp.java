import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame7 extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame7(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a Color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("Textttt");
        label.setFont(new Font(null, Font.PLAIN,50));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);

            label.setForeground(color);
        }
    }
}

public class ColorChooserApp {
    public static void main(String[] args) {
        new MyFrame7();
    }
}
