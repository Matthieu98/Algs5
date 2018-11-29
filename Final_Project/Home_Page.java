import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home_Page implements  ActionListener{
    JPanel titlePanel, scorePanel, buttonPanel, rulesPanel;
    JLabel redLabel, blueLabel, redScore, blueScore, rule1, rule2, rule3, rule4, rule5, rule6, rule7;
    JButton learnMore, blueButton, startButton;

    public JPanel createContentPane (){
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

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


        //setting pane for directions text 
        rulesPanel = new JPanel();
        rulesPanel.setLayout(null);
        rulesPanel.setLocation(100,235);
        rulesPanel.setSize(1200, 250);
        totalGUI.add(rulesPanel);
        

        //setting the text for the directions
        rule1 = new JLabel("Directions:");
        rule1.setLocation(10,0);
        rule1.setSize(1200,30);
        rulesPanel.add(rule1);
        
        rule2 = new JLabel("- This game will test your ability to insert a node into a Linked List structure.");
        rule2.setLocation(0,30);
        rule2.setSize(1200,30);
        rulesPanel.add(rule2);
        
        rule3 = new JLabel("- To move a pointer, click on the sequential nodes (starting with Head) until in desired position.");
        rule3.setLocation(0,60);
        rule3.setSize(1200,30);
        rulesPanel.add(rule3);
        
        rule4 = new JLabel("- Once pointers are in correct positions,  change the pointers of the currect node by clicking on the poiner bubble followed by clicking the desired next node.");
        rule4.setLocation(0,90);
        rule4.setSize(1200,30);
        rulesPanel.add(rule4);
        
        rule5 = new JLabel("- The level will complete once you have inserted all nodes or time runs out.");
        rule5.setLocation(0,120);
        rule5.setSize(1200,30);
        rulesPanel.add(rule5);
        
        rule6 = new JLabel("- You will be scored on the number of correctly inserted nodes.");
        rule6.setLocation(0,150);
        rule6.setSize(1200,30);
        rulesPanel.add(rule6);
        
        rule7 = new JLabel("- There are three levels with the amount of time decreasing with each level. HAPPY LEARNING!");
        rule7.setLocation(0,180);
        rule7.setSize(1200,30);
        rulesPanel.add(rule7);

        //setting pane for buttons 
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(50, 510);
        buttonPanel.setSize(1000, 230);
        totalGUI.add(buttonPanel);
        
        //LEARNMORE
        learnMore = new JButton("Learn More");
        learnMore.setLocation(300, 150);
        learnMore.setSize(500, 70);
        learnMore.setFont(learnMore.getFont().deriveFont(35.0f));
        learnMore.addActionListener(this);
        buttonPanel.add(learnMore);
        //START
        startButton = new JButton("Start");
        startButton.setLocation(50, 0);
        startButton.setSize(950, 125);
        startButton.setFont(startButton.getFont().deriveFont(48.0f));
        startButton.addActionListener(this);
        buttonPanel.add(startButton);

        totalGUI.setOpaque(true);
        return totalGUI;
    }

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
        Learn_More.main(new String[0]);
    }

    private static void createNewGUIStart(){
        Game.main(new String[0]);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Welcome to Our Game");
        Home_Page demo = new Home_Page();
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