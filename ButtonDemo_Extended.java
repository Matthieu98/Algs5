import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonDemo_Extended implements  ActionListener{

    // Definition of global values and items that are part of the GUI.
    int redScoreAmount = 0;
    int blueScoreAmount = 0;

    JPanel titlePanel, scorePanel, buttonPanel;
    JLabel redLabel, blueLabel, redScore, blueScore;
    JButton learnMore, blueButton, startButton;

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        // Creation of a Panel to contain the title labels
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(50, 10);
        titlePanel.setSize(1000, 200);
        totalGUI.add(titlePanel);

        redLabel = new JLabel("Linked Lists Learning Game!");
        redLabel.setLocation(0, 0);
        redLabel.setSize(1000, 200);
        redLabel.setHorizontalAlignment(0);
        redLabel.setFont(redLabel.getFont().deriveFont(72.0f));
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);

        // Creation of a Panel to contain the score labels.
        scorePanel = new JPanel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(100, 235);
        scorePanel.setSize(900, 250);
        totalGUI.add(scorePanel);

        redScore = new JLabel(""+redScoreAmount);
        redScore.setLocation(0, 0);
        redScore.setSize(120, 30);
        redScore.setHorizontalAlignment(0);
        scorePanel.add(redScore);

        blueScore = new JLabel(""+blueScoreAmount);
        blueScore.setLocation(130, 0);
        blueScore.setSize(120, 30);
        blueScore.setHorizontalAlignment(0);
        scorePanel.add(blueScore);

        // Creation of a Panel to contain all the JButtons.
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(50, 510);
        buttonPanel.setSize(1000, 230);
        totalGUI.add(buttonPanel);

        // We create a button and manipulate it using the syntax we have
        // used before. Now each button has an ActionListener which posts
        // its action out when the button is pressed.
        learnMore = new JButton("Learn More");
        learnMore.setLocation(300, 150);
        learnMore.setSize(500, 70);
        learnMore.setFont(learnMore.getFont().deriveFont(35.0f));
        learnMore.addActionListener(this);
        buttonPanel.add(learnMore);
        // set size makes it 150 long by 30 up/down

        startButton = new JButton("Start");
        startButton.setLocation(50, 0);
        startButton.setSize(950, 125);
        startButton.setFont(startButton.getFont().deriveFont(48.0f));
        startButton.addActionListener(this);
        buttonPanel.add(startButton);

        totalGUI.setOpaque(true);
        return totalGUI;
    }

    // This is the new ActionPerformed Method.
    // It catches any events with an ActionListener attached.
    // Using an if statement, we can determine which button was pressed
    // and change the appropriate values in our GUI.
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == learnMore)
        {
            redScoreAmount = redScoreAmount + 1;
            redScore.setText(""+redScoreAmount);
        }
        else if(e.getSource() == blueButton)
        {
            blueScoreAmount = blueScoreAmount + 1;
            blueScore.setText(""+blueScoreAmount);
        }
        else if(e.getSource() == startButton)
        {
            redScoreAmount = 0;
            blueScoreAmount = 0;
            redScore.setText(""+redScoreAmount);
            blueScore.setText(""+blueScoreAmount);
        }
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Welcome to Our Game");

        //Create and set up the content pane.
        ButtonDemo_Extended demo = new ButtonDemo_Extended();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
