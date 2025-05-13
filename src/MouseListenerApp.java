import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame9 extends JFrame implements MouseListener {

    JLabel label;

    MyFrame9(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        Pressed and released on a component
        System.out.println("You clicked the mouse");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        Pressed
        System.out.println("You pressed the mouse");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        Released
        System.out.println("You released the mouse");
        label.setBackground(Color.magenta);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        Enters an area of a component
        System.out.println("You entered the component");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        Exited an area of a component
        System.out.println("You exited the component");
        label.setBackground(Color.RED);
    }
}

public class MouseListenerApp {
    public static void main(String[] args) {
        new MyFrame9();
    }
}
