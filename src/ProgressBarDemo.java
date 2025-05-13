import javax.swing.*;
import java.awt.*;

class Progg {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,5000);

    Progg(){

        bar.setValue(0);
        bar.setBounds(0,0,500,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.BLACK);
        bar.setBackground(Color.WHITE);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        int counter = 5000;
        while (counter > 0) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            counter -= 10;
        }
        bar.setString("Done!");
    }
}

public class ProgressBarDemo {
    public static void main(String[] args) {
        new Progg();
    }
}
