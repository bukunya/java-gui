import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Objects;

class MenBr extends JFrame implements ActionListener {

        JMenuBar menuBar;
        JMenu fileMenu;
        JMenu editMenu;
        JMenu helpMenu;

        JMenuItem loadItem;
        JMenuItem saveItem;
        JMenuItem exitItem;
        ImageIcon one;
        ImageIcon two;

    MenBr(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        ImageIcon originalImage = new ImageIcon(Objects.requireNonNull(MyFrame4.class.getResource("/resource/circular.png")));
        Image resizedImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        one = new ImageIcon(resizedImage);

        ImageIcon originalImage2 = new ImageIcon(Objects.requireNonNull(MyFrame4.class.getResource("/resource/circularUpsideDown.png")));
        Image resizedImage2 = originalImage2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        two = new ImageIcon(resizedImage2);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(one);
        saveItem.setIcon(two);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for load
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for save
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for quit
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for quit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("Loading item");
        } else if (e.getSource() == saveItem) {
            System.out.println("Saving");
        } else {
            System.exit(0);
        }
    }
}

public class MenuBarsApp {
    public static void main(String[] args) {
        new MenBr();
    }
}
