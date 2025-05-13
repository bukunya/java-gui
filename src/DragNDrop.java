import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Objects;

class MyFrame101 extends JFrame {

    MyFrame10 dragPanel;

    MyFrame101() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dragPanel = new MyFrame10();
        this.add(dragPanel);

        this.setVisible(true);
    }
}

class MyFrame10 extends JPanel {

    ImageIcon one;
    final int WIDTH, HEIGHT;
    Point imageCorner;
    Point prevPt;

    MyFrame10() {
        one = new ImageIcon(Objects.requireNonNull(MyFrame10.class.getResource("/resource/circular.png")));
        WIDTH = one.getIconWidth();
        HEIGHT = one.getIconHeight();
        imageCorner = new Point(0, 0);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        one.paintIcon(this, g, imageCorner.x, imageCorner.y);
    }

    private class ClickListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate(currentPt.x - prevPt.x, currentPt.y - prevPt.y);
            prevPt = currentPt;
            repaint();
        }
    }
}

public class DragNDrop {
    public static void main(String[] args) {
        new MyFrame101();
    }
}