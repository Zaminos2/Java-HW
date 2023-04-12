
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class PvP extends JFrame implements ActionListener {
        private JButton rockButton, paperButton, scissorsButton;
        private JButton player2RockButton, player2PaperButton, player2ScissorsButton;
        private JLabel player1Label, player2Label, resultLabel;
        private int player1Score = 0, player2Score = 0;
        private String player1Choice = "", player2Choice = "";

        /**
         * создание оконного интерфейса
         */
        public PvP() {
            setTitle("Камень, Ножницы, Бумага");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600, 400);
            setLayout(new GridLayout(7, 2));

            player1Label = new JLabel("Игрок 1: ");
            player2Label = new JLabel("Игрок 2: ");
            resultLabel = new JLabel("");

            rockButton = new JButton("Камень");
            rockButton.addActionListener(this);
            paperButton = new JButton("Бумага");
            paperButton.addActionListener(this);
            scissorsButton = new JButton("Ножницы");
            scissorsButton.addActionListener(this);
            player2RockButton = new JButton("Камень");
            player2RockButton.addActionListener(this);
            player2PaperButton = new JButton("Бумага");
            player2PaperButton.addActionListener(this);
            player2ScissorsButton = new JButton("Ножницы");
            player2ScissorsButton.addActionListener(this);

            add(player1Label);
            add(player2Label);
            add(rockButton);
            add(player2RockButton);
            add(paperButton);
            add(player2PaperButton);
            add(scissorsButton);
            add(player2ScissorsButton);
            add(resultLabel);

        }

        /**
         * метод обработки события(нажатие на кнопку)
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            if (clickedButton == rockButton || clickedButton == paperButton || clickedButton == scissorsButton) {
                player1Choice = clickedButton.getText();
                player1Label.setText("Игрок 1: " + player1Choice);
            } else {
                player2Choice = clickedButton.getText();
                player2Label.setText("Игрок 2: " + player2Choice);
            }

            if (!player1Choice.isEmpty() && !player2Choice.isEmpty()) {
                int result = getResult(player1Choice, player2Choice);
                if (result == 1) {
                    resultLabel.setText("Игрок 1 победил!");
                    player1Score++;
                } else if (result == -1) {
                    resultLabel.setText("Игрок 2 победил!");
                    player2Score++;
                } else {
                    resultLabel.setText("Ничья!");
                }

                setTitle("Игрок 1: " + player1Score + " | Игрок 2: " + player2Score);


                player1Choice = "";
                player2Choice = "";
                player1Label.setText("Игрок 1: ");
                player2Label.setText("Игрок 2: ");
            }
        }

        /**
         * метод определения результата
         * @param player1Choice
         * @param player2Choice
         * @return
         */
        private int getResult(String player1Choice, String player2Choice) {
            if (player1Choice.equals("Камень")) {
                if (player2Choice.equals("Камень")) {
                    return 0;
                } else if (player2Choice.equals("Бумага")) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (player1Choice.equals("Бумага")) {
                if (player2Choice.equals("Камень")) {
                    return 1;
                } else if (player2Choice.equals("Бумага")) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                if (player2Choice.equals("Камень")) {
                    return -1;
                } else if (player2Choice.equals("Бумага")) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
}
