import javax.swing.*;
import java.awt.*;
import java.util.Objects;

class MyFrame121 extends JPanel {

    Image image;

    MyFrame121(){
        this.setPreferredSize(new Dimension(500,500));
        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(MyFrame5.class.getResource("/resource/circular.png")));
        image = originalImage.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.red);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,0,500,500);

        g2D.setPaint(Color.blue);
        g2D.drawRect(0,0,100,200);
        g2D.fillRect(0,0,100,200);

        g2D.setPaint(Color.orange);
        g2D.drawOval(0,0,100,100);
        g2D.fillOval(0,0,90,90);

        g2D.setPaint(Color.green);
        g2D.drawArc(0,0,120,120,0,180);

        g2D.fillArc(100,100,100,100,0,-180);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.yellow);
        g2D.drawPolygon(xPoints,yPoints,3);

        g2D.setPaint(Color.black);
        g2D.setFont(new Font(null, Font.BOLD, 25));
        g2D.drawString("U r a weener", 300,200);
        g2D.drawImage(image,0,0,null);
    }
}

class MyFrame12 extends JFrame {

    MyFrame121 panel;

    MyFrame12(){
        panel = new MyFrame121();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }


}

public class Graphics2Dapp {
    public static void main(String[] args) {
        new MyFrame12();
    }
}
