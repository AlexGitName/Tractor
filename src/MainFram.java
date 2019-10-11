import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFram extends JFrame {

    MainFram() {
        super("Tractor");
        Auto tractor = new Auto(10, 10, Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
        add(tractor);
        addMouseListener(tractor.mouseListener);
    }
}
