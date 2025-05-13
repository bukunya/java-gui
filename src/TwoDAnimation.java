import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class MyFrame131 extends JFrame {
    MyFrame13 panel;

    MyFrame131(){
        panel = new MyFrame13();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyFrame13 extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image one;
    Image backGroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 3;
    int x = 0;
    int y = 0;

    MyFrame13(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(MyFrame13.class.getResource("/resource/circular.png")));
        one = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon oriImage = new ImageIcon(Objects.requireNonNull(MyFrame13.class.getResource("/resource/circularUpsideDown.png")));
        backGroundImage = oriImage.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backGroundImage,0,0,null);
        g2D.drawImage(one,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - one.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        if (y >= PANEL_HEIGHT - one.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
}

public class TwoDAnimation {
    public static void main(String[] args) {
        new MyFrame131();
    }
}
