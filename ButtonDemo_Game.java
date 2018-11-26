import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonDemo_Game implements  ActionListener{
    JPanel titlePanel, bubblePanel, LLPanel, buttonPanel;
    JLabel bubble1, bubble2, bubble3, bubble4, redLabel, ll1, ll2, ar1;
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

        bubblePanel = new JPanel();
        bubblePanel.setLayout(null);
        bubblePanel.setLocation(100,235);
        bubblePanel.setSize(1200, 250);
        totalGUI.add(bubblePanel);

        bubble1 = new JLabel("1");
        bubble1.setLocation(0,0);
        bubble1.setSize(30,30);
        bubblePanel.add(bubble1);
        bubble2 = new JLabel("2");
        bubble2.setLocation(30,0);
        bubble2.setSize(30,30);
        bubblePanel.add(bubble2);
        bubble3 = new JLabel("3");
        bubble3.setLocation(60,0);
        bubble3.setSize(30,30);
        bubblePanel.add(bubble3);
        bubble4 = new JLabel("4");
        bubble4.setLocation(90,0);
        bubble4.setSize(30,30);
        bubblePanel.add(bubble4);

        LLPanel = new JPanel();
        LLPanel.setLayout(null);
        LLPanel.setLocation(100, 200);
        LLPanel.setSize(1000, 230);
        totalGUI.add(LLPanel);

        ll1 = new JLabel("Head");
        ll1.setLocation(0,0);
        ll1.setSize(50,30);
        LLPanel.add(ll1);
        ar1 = new JLabel(" ->");
        ar1.setLocation(30,0);
        ar1.setSize(30,30);
        LLPanel.add(ar1);
        ll2 = new JLabel("Null");
        ll2.setLocation(120,0);
        ll2.setSize(50,30);
        LLPanel.add(ll2);

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
            createNewGUI();
        }
        else
        {
            bubble4.setText("yo yo yo");
        }
    }

    private static void createNewGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame2 = new JFrame("Welcome to Our Game");
        ButtonDemo_Extended demo2 = new ButtonDemo_Extended();
        frame2.setContentPane(demo2.createContentPane());

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1200, 750);
        frame2.setVisible(true);
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Lets Play!!");

        //Create and set up the content pane.
        ButtonDemo_Game demo = new ButtonDemo_Game();
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