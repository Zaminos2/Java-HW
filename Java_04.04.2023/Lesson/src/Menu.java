import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Menu extends JFrame {
    public Menu(){
        super("Выберете режим");

        Container container = getContentPane();
        container.setLayout(new GridLayout(3,1));

        JButton button1 = new JButton("Игрок против Игрока");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PvP mode = new PvP();
                mode.setVisible(true);
            }
        });
        JButton button2 = new JButton("Игрок против Компьютера");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PvC mode2 = new PvC();
                mode2.setVisible(true);
            }
        });
        JButton button3 = new JButton("Компьютер против Компьютера");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            CvC mode3 = new CvC();
            mode3.setVisible(true);
            }
        });
        JButton button4 = new JButton("Игра в консоли");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Game.menu();
            }
        });

        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}