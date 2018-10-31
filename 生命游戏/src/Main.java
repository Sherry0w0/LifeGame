import javax.swing.*;

public class Main extends JFrame {
    private static final long serialVersionUID = -1660060555234651445L;

    Main(){
        this.setSize(1000,1000);
        this.setTitle("生命游戏[LifeGame]DEMO");
        this.add(new Map(new GameGraph()));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    public static void main(String[] args)
    {
        Main main=new Main();
        main.setVisible(true);
    }
}
