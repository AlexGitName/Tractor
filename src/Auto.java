import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Time;

public class Auto extends JPanel {

    Color color;
    private double setX;
    private double setY;
    private Timer timer;
    Point mouse;
    double anglRad = 0;


    public double getSetX() {
        return setX;
    }

    public void setSetX(double setX) {
        this.setX = setX;
    }

    public double getSetY() {
        return setY;
    }

    public void setSetY(double setY) {
        this.setY = setY;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect((int) getSetX(), (int) getSetY(), 10, 10);
        g.setColor(color);
        g.fillRect((int) getSetX(), (int) getSetY(), 10, 10);


    }


    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            mouse = e.getPoint();
            timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    anglRad++;
                    if (setX != mouse.x) {
                        setX = mouse.x > setX ? setX + (mouse.x - setX) * anglRad / 100 : setX - (mouse.x + setX) * anglRad / 100;
                    }
                    if (setY != mouse.y) {
                        setY = mouse.y > setY ? setY + (mouse.y - setY) * anglRad / 100 : setY - (mouse.y +setY) * anglRad / 100;
                    } else {
                        anglRad = 0;
                        timer.stop();

                    }


                    repaint();
                }


            });

            timer.start();

        }
    };


    Auto(double setX, double setY, Color color) {
        this.setX = setX;
        this.setY = setY;
        this.color = color;
    }


}
