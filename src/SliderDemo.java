import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class SliderSlider implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderSlider(){
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,25);

        slider.setPreferredSize(new Dimension(450,250));
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(1); // SwingConstants.VERTICAL
        slider.addChangeListener(this);

        label.setText("Temperature: " + slider.getValue());

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Temperature: " + slider.getValue());
    }
}

public class SliderDemo {
    public static void main(String[] args) {
        new SliderSlider();
    }
}
