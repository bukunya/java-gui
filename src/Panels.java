import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Panels {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel redLabel = new JLabel();
        redLabel.setText("I'm on the red side");
        redLabel.setHorizontalAlignment(JLabel.CENTER);
        redLabel.setVerticalAlignment(JLabel.CENTER);
        redLabel.setForeground(Color.white);

        JLabel blueLabel = new JLabel();
        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(Frame.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(resizedImage);
        blueLabel.setIcon(image);
        blueLabel.setText("I'm below that");
        blueLabel.setVerticalTextPosition(JLabel.BOTTOM);
        blueLabel.setHorizontalTextPosition(JLabel.CENTER);
        blueLabel.setForeground(Color.white);
        blueLabel.setHorizontalAlignment(JLabel.CENTER);
        blueLabel.setVerticalAlignment(JLabel.CENTER);

        JLabel greenLabel = new JLabel();
        greenLabel.setBounds(20,50,200,100);
        greenLabel.setText("hello howayu ayem under de wader plis help mi");

        JPanel redPanel = new JPanel();
        redPanel.setBounds(0,0,250,250);
        redPanel.setBackground(Color.red);
        redPanel.setLayout(new BorderLayout());
        redPanel.add(redLabel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setBackground(Color.blue);
        bluePanel.setLayout(new BorderLayout());
        bluePanel.add(blueLabel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setBackground(Color.green);
        greenPanel.setLayout(null);
        greenPanel.add(greenLabel);

        frame.setVisible(true);
        frame.setTitle("RGB");
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
    }
}
