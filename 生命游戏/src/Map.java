import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Map extends JPanel
{

    private static final long serialVersionUID = -336975817478756636L;
    GameGraph game;
    public static final int size = 20;

    public Map(GameGraph g)
    {
        this.game = g;
        Timer timer;
        timer = new Timer(2000, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                repaint();
                game.nextStatus();
            }
        });
        timer.start();
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int length = game.length;
        for (int i = 0; i < length ; i++)
        {
            for (int j = 0; j < length ; j++)
            {
                if (game.map[i ][j ] == 1)
                {
                    g.fillRect(j * size, i * size, size, size);
                } else
                {
                    g.drawRect(j * size, i * size, size, size);
                }
            }
        }
    }

}
