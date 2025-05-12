import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class OptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ingfo","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Ingfo","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Ingfo","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Ingfo","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Ingfo","title",JOptionPane.ERROR_MESSAGE);

//        y 0, n 1, c 2, exit -1
        JOptionPane.showConfirmDialog(null,"Confirm?","title",JOptionPane.YES_NO_CANCEL_OPTION);

        JOptionPane.showInputDialog("What's your name? ");

        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(Frame.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(resizedImage);

        String[] responses = {"Hello", "I'am", "Under","The"};

        JOptionPane.showOptionDialog(null,"Hello","Hi",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,image,responses,0);
    }
}
