import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonDemo_Extended implements  ActionListener{

    // Definition of global values and items that are part of the GUI.
    int redScoreAmount = 0;
    int blueScoreAmount = 0;

    JPanel titlePanel, scorePanel, buttonPanel, rulesPanel;
    JLabel redLabel, blueLabel, redScore, blueScore, rule1, rule2, rule3, rule4;
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

        rulesPanel = new JPanel();
        rulesPanel.setLayout(null);
        rulesPanel.setLocation(100,235);
        rulesPanel.setSize(1200, 250);
        totalGUI.add(rulesPanel);

        rule1 = new JLabel("Read the following rules to know how to play!");
        rule1.setLocation(0,0);
        rule1.setSize(1200,30);
        rulesPanel.add(rule1);
        rule2 = new JLabel("- There will be an empty linked list to start off the game. When you enter, a random number will light up, this is the number you are going to insert in the list.");
        rule2.setLocation(0,30);
        rule2.setSize(1200,30);
        rulesPanel.add(rule2);
        rule3 = new JLabel("- You will then move the cursor underneath the linked list to where you think this element will be inserted, thereby showing that you understand how the pointers work.");
        rule3.setLocation(0,60);
        rule3.setSize(1200,30);
        rulesPanel.add(rule3);
        rule4 = new JLabel("- Finally we will check to make sure you put the cursor in the right place and if youa are right you will keep going and if you are wrong you will lose time!");
        rule4.setLocation(0,90);
        rule4.setSize(1200,30);
        rulesPanel.add(rule4);

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
            createNewGUILearn();
        }
        else if(e.getSource() == startButton)
        {
            createNewGUIStart();
        }
    }
    
    private static void createNewGUILearn(){
        ButtonDemo_LearnMore.main(new String[0]);
    }

    private static void createNewGUIStart(){
        ButtonDemo_Game.main(new String[0]);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Welcome to Our Game");
        ButtonDemo_Extended demo = new ButtonDemo_Extended();
        frame.setContentPane(demo.createContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
