import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    private JFrame SF,RF ,fq1, fq2, fq3, fq4, fq5, WF;
    private JPanel SP, RP, pq1, pq2, pq3, pq4, pq5, WP;
    private JLabel SL, RL, lq1, l2q1, lq2, l2q2, lq3, l2q3, lq4, l2q4, lq5, l2q5, WL;
    private JButton SB, RB, q1a1, q1a2, q1a3, q1a4, q2a1, q2a2, q2a3, q2a4, q3a1, q3a2, q3a3, q3a4, q4a1, q4a2, q4a3, q4a4, q5a1, q5a2, q5a3, q5a4, WB;

    // This Method is for the start menu
    public void start() {
        SF = new JFrame("Quiz Game");
        SP = new JPanel();
        SL = new JLabel("WELCOME TO QUIZ GAME!");
        SB = new JButton("Start");
        SB.addActionListener(this);

        SP.setLayout(new GridLayout(2, 1));
        SP.add(SL);
        SP.add(SB);
        SF.getContentPane().add(SP);
        SF.setVisible(true);
        SF.setSize(500, 500);
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SB) {
            SF.setVisible(false);

            // Advance to the first question
            fq1 = new JFrame("Question 1");
            fq1.setSize(500, 500);
            l2q1 = new JLabel("Question 1:");
            lq1 = new JLabel("You're 4th place right now in a race. What place will you be in when you pass the person in 3rd place?");
            q1a1 = new JButton("1st");
            q1a1.addActionListener(this);
            q1a2 = new JButton("2nd");
            q1a2.addActionListener(this);
            q1a3 = new JButton("3rd");
            q1a3.addActionListener(this);
            q1a4 = new JButton("None of the above");
            q1a4.addActionListener(this);
            pq1 = new JPanel();
            pq1.setSize(500, 500);
            pq1.setLayout(new GridLayout(3, 2));
            pq1.add(l2q1);
            pq1.add(lq1);
            pq1.add(q1a1);
            pq1.add(q1a2);
            pq1.add(q1a3);
            pq1.add(q1a4);
            pq1.setSize(500, 500);
            fq1.add(pq1);
            fq1.setVisible(true);
        }

        if (e.getSource() == q1a1 || e.getSource() == q1a2 || e.getSource() == q1a4) {
            //Wrong answer code q1
            fq1.setVisible(false);
            RF = new JFrame("Game over");
            RF.setSize(500, 500);
            RP = new JPanel();
            RP.setLayout(new GridLayout(2, 1));
            RB = new JButton("Restart");
            RB.addActionListener(this);
            RL = new JLabel("WRONG! Go again?");
            RP.add(RL);
            RP.setBackground(Color.RED);
            RP.add(RB);
            RF.getContentPane().add(RP);
            RF.setVisible(true);
        }
        if (e.getSource() == q2a2 || e.getSource() == q2a3 || e.getSource() == q2a4) {
            //Wrong answer code q2
            fq2.setVisible(false);
            RF = new JFrame("Game over");
            RF.setSize(500, 500);
            RP = new JPanel();
            RP.setLayout(new GridLayout(2, 1));
            RB = new JButton("Restart");
            RB.addActionListener(this);
            RL = new JLabel("WRONG! Go again?");
            RP.add(RL);
            RP.add(RB);
            RP.setBackground(Color.RED);
            RF.getContentPane().add(RP);
            RF.setVisible(true);
        }

        if (e.getSource() == q3a1 || e.getSource() == q3a3 || e.getSource() == q3a4) {
            //Wrong answer code q3
            fq3.setVisible(false);
            RF = new JFrame("Game over");
            RF.setSize(500, 500);
            RP = new JPanel();
            RP.setLayout(new GridLayout(2, 1));
            RB = new JButton("Restart");
            RB.addActionListener(this);
            RL = new JLabel("WRONG! Go again?");
            RP.add(RL);
            RP.add(RB);
            RP.setBackground(Color.RED);
            RF.getContentPane().add(RP);
            RF.setVisible(true);
        }

        if (e.getSource() == q1a3) {
            //2nd question
            fq1.setVisible(false);
            fq2 = new JFrame("Question 2");
            fq2.setSize(500, 500);
            pq2 = new JPanel();
            pq2.setLayout(new GridLayout(3, 2));
            lq2 = new JLabel("Question 2:");
            l2q2 = new JLabel("What is the capital od Brasil?");
            q2a1 = new JButton("Brasilia");
            q2a1.addActionListener(this);
            q2a2 = new JButton("Rio de Janeiro");
            q2a2.addActionListener(this);
            q2a3 = new JButton("Amman");
            q2a3.addActionListener(this);
            q2a4 = new JButton("Salvador");
            q2a4.addActionListener(this);
            pq2.add(lq2);
            pq2.add(l2q2);
            pq2.add(q2a1);
            pq2.add(q2a2);
            pq2.add(q2a3);
            pq2.add(q2a4);
            fq2.getContentPane().add(pq2);
            fq2.setVisible(true);
        }

        if (e.getSource() == RB) {
            //Restart button
            RF.setVisible(false);
            fq1.setVisible(true);
        }

        if (e.getSource() == q2a1) {
            //3rd question
            fq2.setVisible(false);
            fq3 = new JFrame("Question 3");
            fq3.setSize(500, 500);
            pq3 = new JPanel();
            pq3.setLayout(new GridLayout(3, 2));
            lq3 = new JLabel("Question 3:");
            l2q3 = new JLabel("What is the largest mammal");
            q3a1 = new JButton("Your mom");
            q3a1.addActionListener(this);
            q3a2 = new JButton("Blue Whale");
            q3a2.addActionListener(this);
            q3a3 = new JButton("Elephant");
            q3a3.addActionListener(this);
            q3a4 = new JButton("Hippo");
            q3a4.addActionListener(this);
            pq3.add(lq3);
            pq3.add(l2q3);
            pq3.add(q3a1);
            pq3.add(q3a2);
            pq3.add(q3a3);
            pq3.add(q3a4);
            fq3.getContentPane().add(pq3);
            fq3.setVisible(true);
        }

        if(e.getSource() == q3a2)
        {
            //4th question
            fq3.setVisible(false);
            fq4 = new JFrame("Question 4");
            fq4.setSize(500,500);
            pq4 = new JPanel();
            pq4.setLayout(new GridLayout(3,2));
            lq4 = new JLabel("Question 4:");
            l2q4 = new JLabel("Wer ist dein Onkel?");
            q4a1 = new JButton("Dr. Mansour");
            q4a1.addActionListener(this);
            q4a2 = new JButton("Andrew Tate");
            q4a2.addActionListener(this);
            q4a3 = new JButton("Yazan");
            q4a3.addActionListener(this);
            q4a4 = new JButton("Deine Mutter");
            q4a4.addActionListener(this);
            pq4.add(lq4);
            pq4.add(l2q4);
            pq4.add(q4a1);
            pq4.add(q4a2);
            pq4.add(q4a3);
            pq4.add(q4a4);
            fq4.getContentPane().add(pq4);
            fq4.setVisible(true);
        }

        if (e.getSource() == q4a1 || e.getSource() == q4a2 || e.getSource() == q4a4) {
            //Wrong answer code q4
            fq4.setVisible(false);
            RF = new JFrame("Game over");
            RF.setSize(500, 500);
            RP = new JPanel();
            RP.setLayout(new GridLayout(2, 1));
            RB = new JButton("Restart");
            RB.addActionListener(this);
            RL = new JLabel("WRONG! Go again?");
            RP.add(RL);
            RP.add(RB);
            RF.getContentPane().add(RP);
            RP.setBackground(Color.RED);
            RF.setVisible(true);
        }

        if(e.getSource() == q4a3)
        {
            //5th question
            fq4.setVisible(false);
            fq5 = new JFrame("Question 5");
            fq5.setSize(500,500);
            pq5 = new JPanel();
            pq5.setLayout(new GridLayout(3,2));
            lq5 = new JLabel("Question 5:");
            l2q5 = new JLabel("How tall is Yazan?");
            q5a1 = new JButton("190 cm");
            q5a1.addActionListener(this);
            q5a2 = new JButton("188 cm");
            q5a2.addActionListener(this);
            q5a3 = new JButton("186 cm");
            q5a3.addActionListener(this);
            q5a4 = new JButton("191 cm");
            q5a4.addActionListener(this);
            pq5.add(lq5);
            pq5.add(l2q5);
            pq5.add(q5a1);
            pq5.add(q5a2);
            pq5.add(q5a3);
            pq5.add(q5a4);
            fq5.getContentPane().add(pq5);
            fq5.setVisible(true);
        }

        if (e.getSource() == q5a1 || e.getSource() == q5a2 || e.getSource() == q5a4) {
            //Wrong answer code q5
            fq5.setVisible(false);
            RF = new JFrame("Game over");
            RF.setSize(500, 500);
            RP = new JPanel();
            RP.setLayout(new GridLayout(2, 1));
            RB = new JButton("Restart");
            RB.addActionListener(this);
            RL = new JLabel("WRONG! Go again?");
            RP.add(RL);
            RP.add(RB);
            RP.setBackground(Color.RED);
            RF.getContentPane().add(RP);
            RF.setVisible(true);
        }

        if(e.getSource() == q5a3)
        {
            //win screen
            fq5.setVisible(false);
            WF = new JFrame("Win screen");
            WF.setSize(500,500);
            WP = new JPanel();
            WP.setLayout(new GridLayout(2,1));
            WB = new JButton("Play again.");
            WB.addActionListener(this);
            WL = new JLabel("Congrats, you win!!!");
            WP.add(WL);
            WP.add(WB);
            WF.getContentPane().add(WP);
            WP.setBackground(Color.GREEN);
            WF.setVisible(true);
        }

        if(e.getSource() == WB)
        {
            WF.setVisible(false);
            fq1.setVisible(true);
        }
    }
}
