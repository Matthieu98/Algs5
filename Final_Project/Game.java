import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Game implements  ActionListener{
    static JPanel titlePanel, bubblePanel, LLPanel, buttonPanel;
    static JLabel redLabel, ll1, ll2, ar1, ar2;
    static JButton backButton, bubble1, bubble2, bubble3, bubble4;

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

        bubblePanel = new JPanel();
        bubblePanel.setLayout(null);
        bubblePanel.setLocation(100,235);
        bubblePanel.setSize(1200, 250);
        totalGUI.add(bubblePanel);

        //setting bubble buttons
        bubble1 = new JButton("[1]");
        bubble1.addActionListener(this);
        bubble1.setLocation(0,0);
        bubble1.setSize(30,30);
        bubblePanel.add(bubble1);
        
        bubble2 = new JButton("[2]");
        bubble2.addActionListener(this);
        bubble2.setLocation(30,0);
        bubble2.setSize(30,30);
        bubblePanel.add(bubble2);
        

        bubble3 = new JButton("[3]");
        bubble3.addActionListener(this);
        bubble3.setLocation(60,0);
        bubble3.setSize(30,30);
        bubblePanel.add(bubble3);
        
        bubble4 = new JButton("[4]");
        bubble4.addActionListener(this);
        bubble4.setLocation(90,0);
        bubble4.setSize(30,30);
        bubblePanel.add(bubble4);
//setting the LL pane
        LLPanel = new JPanel();
        LLPanel.setLayout(null);
        LLPanel.setLocation(275, 200);
        LLPanel.setSize(1000, 230);
        totalGUI.add(LLPanel);
        
        //setting the HEAD label
        ll1 = new JLabel("Head");
        ll1.setLocation(0,0);
        ll1.setSize(50,30);
        LLPanel.add(ll1);
        ar1 = new JLabel(" ->");
        ar1.setLocation(30,0);
        ar1.setSize(30,30);
        LLPanel.add(ar1);
        ar2 = new JLabel(" ->");
        ar2.setLocation(330,0);
        ar2.setSize(30,30);
        LLPanel.add(ar2);
        ll2 = new JLabel("Null");
        ll2.setLocation(360,0);
        ll2.setSize(50,30);
        LLPanel.add(ll2);

        // setting Back button Pane and setting button
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(50, 510);
        buttonPanel.setSize(1000, 230);
        totalGUI.add(buttonPanel);
        backButton = new JButton("Back");
        backButton.setLocation(425, 150);
        backButton.setSize(200, 70);
        backButton.setFont(backButton.getFont().deriveFont(35.0f));
        backButton.addActionListener(this);
        buttonPanel.add(backButton);

        totalGUI.setOpaque(true);
        return totalGUI;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            createNewGUI();
        }
        else if (e.getSource()== bubble1)
        {
            bubble1.setText("clicked");
        }
        else if (e.getSource()== bubble2)
        {
            bubble2.setText("clicked");
        }
        else if (e.getSource()== bubble3)
        {
            bubble3.setText("clicked");
        }
        else if (e.getSource()== bubble4)
        {
            bubble4.setText("clicked");
        }
    }

    private static void createNewGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame2 = new JFrame("Welcome to Our Game");
        Home_Page demo2 = new Home_Page();
        frame2.setContentPane(demo2.createContentPane());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1200, 750);
        frame2.setVisible(true);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Lets Play!!");
        Game demo = new Game();
        frame.setContentPane(demo.createContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        frame.setVisible(true);
    }

    private static void runStuff() {
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        if(n == 1){
            bubble1.setForeground(Color.RED);
        } else if(n ==2){
            bubble2.setForeground(Color.RED);
        } else if (n==2){
            bubble3.setForeground(Color.RED);
        } else {
            bubble4.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                runStuff();
            }
        });
    }
}