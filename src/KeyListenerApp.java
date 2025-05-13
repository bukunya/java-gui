import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

class MyFrame8 extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon one;

    MyFrame8(){
        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(MyFrame4.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        one = new ImageIcon(resizedImage);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,50);
        label.setIcon(one);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        When key is typed, Uses KeyChar outputs Char
        switch (e.getKeyChar()) {
            case 'a' : label.setLocation(label.getX()-1, label.getY()); // 37
            break;
            case 'w' : label.setLocation(label.getX(),label.getY()-1); // 38
            break;
            case 's' : label.setLocation(label.getX(),label.getY()+1); // 39
            break;
            case 'd' : label.setLocation(label.getX()+1, label.getY()); // 40
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        When key is pressed, Uses KeyCode outputs int

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        Called when key is released
        System.out.println("Stopped " + e.getKeyChar());
        System.out.println("Stopped " + e.getKeyCode());
    }
}

public class KeyListenerApp {
    public static void main(String[] args) {
        new MyFrame8();
    }
}
