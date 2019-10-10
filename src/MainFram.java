import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFram extends JFrame {
     Point mous;
    MainFram() {
        super("Tractor");
        Auto tractor = new Auto(10, 10, Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        MouseListener mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mous = e.getPoint();
                double dx = e.getX() - tractor.getX();
                double dy = e.getY() - tractor.getY();
              tractor.moveA(dx,dy);
            }
        };
        setVisible(true);
        add(tractor);
        addMouseListener(mouseListener);
    }
}
