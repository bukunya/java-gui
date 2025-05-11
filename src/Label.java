import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Objects;

public class Label {
    public static void main(String[] args) {

//      Resize original image to 100x100
        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(Frame.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(resizedImage);

        Border border = BorderFactory.createLineBorder(Color.red, 3);

        JLabel label = new JLabel();
        label.setText("Hello World!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        label.setIconTextGap(30);

//        These two should always together
        label.setBackground(Color.black);
        label.setOpaque(true);

        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

//        Add when needed
//        frame.setSize(500,500);
//        frame.setLayout(null);
//        label.setBounds(0,0, 250,250);

        frame.add(label);

//        Set width and height auto based on content
        frame.pack();

    }
}
