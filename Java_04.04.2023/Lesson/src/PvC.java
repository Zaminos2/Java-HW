
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PvC extends JFrame implements ActionListener {
    private JButton rockButton, paperButton, scissorsButton, computerButton;
    private JLabel player1Label, computerLabel, resultLabel;
    private int player1Score = 0, player2Score = 0, computerScore = 0;
    private String player1Choice = "", player2Choice = "",computerChoice = "";


    public PvC() {
        setTitle("Камень, Ножницы, Бумага");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new GridLayout(7, 2));

        player1Label = new JLabel("Игрок 1: ");
        computerLabel = new JLabel("Компьютер: ");
        resultLabel = new JLabel("");

        rockButton = new JButton("Камень");
        rockButton.addActionListener(this);
        paperButton = new JButton("Бумага");
        paperButton.addActionListener(this);
        scissorsButton = new JButton("Ножницы");
        scissorsButton.addActionListener(this);
        computerButton = new JButton("Выбор компьютера");
        computerButton.addActionListener(this);


        add(player1Label);
        add(computerLabel);
        add(rockButton);
        add(new Label());
        add(paperButton);
        add(computerButton);
        add(scissorsButton);
        add(new Label());
        add(resultLabel);

    }
    private String getComputerChoice() {
        int choice = (int) (Math.random() * 3) + 1;
        if (choice == 1) {
            return "Камень";
        } else if (choice == 2) {
            return "Бумага";
        } else {
            return "Ножницы";
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (clickedButton == rockButton || clickedButton == paperButton || clickedButton == scissorsButton) {
            player1Choice = clickedButton.getText();
            player1Label.setText("Игрок 1: " + player1Choice);
            computerChoice = getComputerChoice();
            computerLabel.setText("Компьютер: " + computerChoice);
            int result = getResult(player1Choice, computerChoice);
            if (result == 1) {
                resultLabel.setText("Игрок 1 победил!");
                player1Score++;
            } else if (result == -1) {
                resultLabel.setText("Компьютер победил!");
                computerScore++;
            } else {
                resultLabel.setText("Ничья!");
            }

            setTitle("Игрок 1: " + player1Score + " | Компьютер: " + computerScore);
        }
    }

    private int getResult(String player1Choice, String computerChoice) {
        if (player1Choice.equals("Камень")) {
            if (computerChoice.equals("Камень")) {
                return 0;
            } else if (computerChoice.equals("Бумага")) {
                return -1;
            } else {
                return 1;
            }
        } else if (player1Choice.equals("Бумага")) {
            if (computerChoice.equals("Камень")) {
                return 1;
            } else if (computerChoice.equals("Бумага")) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if (computerChoice.equals("Камень")) {
                return -1;
            } else if (computerChoice.equals("Бумага")) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    }