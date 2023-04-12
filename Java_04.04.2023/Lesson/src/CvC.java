import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class CvC extends JFrame implements ActionListener {
    private JLabel computer1Label, computer2Label,computer1ChoiceLabel,computer2ChoiceLabel, resultLabel;
    private JButton comChoiceButton;
    private int computer1Score = 0, computer2Score = 0;
    private String computer1Choice = "", computer2Choice = "";
    private Random random = new Random();
    public CvC(){
        setTitle("Камень, Ножницы, Бумага");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(new GridLayout(3,1));

        computer1Label = new JLabel("Компьютер 1");
        computer1ChoiceLabel = new JLabel("");
        computer2Label = new JLabel("Компьютер 2");
        computer2ChoiceLabel = new JLabel("");
        comChoiceButton = new JButton("Выбор компьютера");
        comChoiceButton.addActionListener(this);
        resultLabel = new JLabel("");

        add(computer1Label);
        add(computer1ChoiceLabel);
        add(computer2Label);
        add(computer2ChoiceLabel);
        add(comChoiceButton);
        add(resultLabel);
    }
    private String computerChoice(){
    int choice = random.nextInt(3);
        if (choice == 0) {
            return "Камень";
        } else if (choice == 1) {
            return "Ножницы";
        } else {
            return "Бумага";
        }
    }
    public void actionPerformed(ActionEvent event) {
        computer1Choice = computerChoice();
        computer2Choice = computerChoice();

        computer1ChoiceLabel.setText("Компьютер 1 выбрал: " + computer1Choice);
        computer2ChoiceLabel.setText("Компьютер 2 выбрал: " + computer2Choice);

        if (computer1Choice.equals(computer2Choice)) {
            resultLabel.setText("Ничья");
        } else if (computer1Choice.equals("Камень") && computer2Choice.equals("Ножницы") ||
                computer1Choice.equals("Ножницы") && computer2Choice.equals("Бумага") ||
                computer1Choice.equals("Бумага") && computer2Choice.equals("Камень")) {
            computer1Score++;
            resultLabel.setText("Компьютер 1 победил");
        } else {
            computer2Score++;
            resultLabel.setText("Компьютер 2 победил");
        }

        computer1Label.setText("Компьютер 1: " + computer1Score + " побед");
        computer2Label.setText("Компьютер 2: " + computer2Score + " побед");
    }

}
