import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonDemo_LearnMore implements  ActionListener{
    JPanel titlePanel, buttonPanel, rulesPanel;
    JLabel rule1, rule2, rule3, rule4, redLabel;
    JButton backButton;

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

        rule1 = new JLabel("ZHere is some stuff about stuff");
        rule1.setLocation(0,0);
        rule1.setSize(1200,30);
        rulesPanel.add(rule1);
        rule2 = new JLabel("And here is some more stuff about things");
        rule2.setLocation(0,30);
        rule2.setSize(1200,30);
        rulesPanel.add(rule2);
        rule3 = new JLabel("LINK");
        rule3.setLocation(0,60);
        rule3.setSize(1200,30);
        rulesPanel.add(rule3);
        rule4 = new JLabel("VIDEO");
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
        backButton = new JButton("Back");
        backButton.setLocation(300, 150);
        backButton.setSize(500, 70);
        backButton.setFont(backButton.getFont().deriveFont(35.0f));
        backButton.addActionListener(this);
        buttonPanel.add(backButton);
        // set size makes it 150 long by 30 up/down

        totalGUI.setOpaque(true);
        return totalGUI;
    }

    // This is the new ActionPerformed Method.
    // It catches any events with an ActionListener attached.
    // Using an if statement, we can determine which button was pressed
    // and change the appropriate values in our GUI.
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            rule3.setText("whats happening");
            createNewGUI();
        }
        else
        {
            rule4.setText("yo yo yo");
        }
    }
    
    private static void createNewGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame2 = new JFrame("Welcome to Sparta");
        ButtonDemo_Extended demo2 = new ButtonDemo_Extended();
        frame2.setContentPane(demo2.createContentPane());

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1200, 750);
        frame2.setVisible(true);
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Welcome to Our Game");

        //Create and set up the content pane.
        ButtonDemo_Extended demo = new ButtonDemo_LearnMore();
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