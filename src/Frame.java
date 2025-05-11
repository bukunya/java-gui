import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Frame.java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(Frame.class.getResource("/resource/circular.png")));
        frame.setIconImage(icon.getImage());

        frame.getContentPane().setBackground(Color.green);

//        public class MyFrame extends JFrame{
//            MyFrame(){
//                Change frame. to this.
//                then to psvm add MyFrame myFrame = new MyFrame();
//            }
//        }

    }
}
