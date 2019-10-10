import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Auto extends JPanel {

    Color color;
    private double setX;
    private double setY;
    public int x, y;
    private double INITIAL_X = setX;
    private double INITIAL_X1 = 0;
    private double INITIAL_Y = setY;
    private double INITIAL_Y1 = 0;
    private Timer timer;


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


    public void moveA(double x, double y) {
        timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int postCentrX = getX() + 5;
                int postCentrY = getY() + 5;
                if (x!= postCentrX) {
                    setX += x < postCentrX ? -1 : 1;
                    setSetX(setX);
                }
                if (y != postCentrY) {
                    setY += y < postCentrX ? -1 : 1;
                    setSetY(setY);
                }


                repaint();
            }


        });

        timer.start();
    }


    Auto(double setX, double setY, Color color) {
        this.setX = setX;
        this.setY = setY;
        this.color = color;
    }


}
