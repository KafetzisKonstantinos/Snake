import javax.swing.*;

public class SnakeFrame extends JFrame {

    SnakeFrame(){
        this.add(new SnakePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);


        this.pack();
        this.setVisible(true);
    }



}

