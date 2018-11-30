import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Game implements  ActionListener{
    static JPanel titlePanel, bubblePanel, LLPanel, buttonPanel;
    static JLabel redLabel, ll1, ll2, ar1, ar2;
    static JButton backButton, bubble1, bubble2, bubble3, bubble4, bubble5, p1, p2, p3, p4, p5;

    public JPanel createContentPane (){
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        //Creating title panel and title
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

        //Creating bubbles for the different numbers
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

        bubble5 = new JButton("[5]");
        bubble5.addActionListener(this);
        bubble5.setLocation(120,0);
        bubble5.setSize(30,30);
        bubblePanel.add(bubble5);

        //setting the LL pane
        LLPanel = new JPanel();
        LLPanel.setLayout(null);
        LLPanel.setLocation(275, 200);
        LLPanel.setSize(1000, 230);
        totalGUI.add(LLPanel);
        
        //setting the HEAD/Null Labels
        ll1 = new JLabel("Head");
        ll1.setLocation(0,0);
        ll1.setFont(ll1.getFont().deriveFont(16.0f));
        ll1.setSize(50,30);
        LLPanel.add(ll1);
        ar1 = new JLabel(" ->");
        ar1.setLocation(40,0);
        ar1.setSize(30,30);
        LLPanel.add(ar1);
        ar2 = new JLabel(" ->");
        ar2.setLocation(330,0);
        ar2.setSize(30,30);
        LLPanel.add(ar2);
        ll2 = new JLabel("Null");
        ll2.setLocation(360,0);
        ll2.setFont(ll2.getFont().deriveFont(16.0f));
        ll2.setSize(50,30);
        LLPanel.add(ll2);

        //Adding in the containers
        p1 = new JButton("___");
        p1.addActionListener(this);
        p1.setLocation(70,0);
        p1.setSize(30,30);
        LLPanel.add(p1);
        p2 = new JButton("___");
        p2.addActionListener(this);
        p2.setLocation(120,0);
        p2.setSize(30,30);
        LLPanel.add(p2);
        p3 = new JButton("___");
        p3.addActionListener(this);
        p3.setLocation(170,0);
        p3.setSize(30,30);
        LLPanel.add(p3);
        p4 = new JButton("___");
        p4.addActionListener(this);
        p4.setLocation(220,0);
        p4.setSize(30,30);
        LLPanel.add(p4);
        p5 = new JButton("___");
        p5.addActionListener(this);
        p5.setLocation(270,0);
        p5.setSize(30,30);
        LLPanel.add(p5);

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
        if(e.getSource() == backButton){
            createNewGUI();
        } else if (e.getSource()== bubble1){
            bubble1.setText("clicked");
        } else if (e.getSource()== bubble2){
            bubble2.setText("clicked");
        } else if (e.getSource()== bubble3){
            bubble3.setText("clicked");
        } else if (e.getSource()== bubble4){
            bubble4.setText("clicked");
        } else if (e.getSource()== bubble5){
            bubble5.setText("clicked");
        } else if (e.getSource()== p1){
            p1.setText("_|_");
        } else if (e.getSource()== p2){
            p2.setText("_|_");
        } else if (e.getSource()== p3){
            p3.setText("_|_");
        } else if (e.getSource()== p4){
            p4.setText("_|_");
        } else if (e.getSource()== p5){
            p5.setText("_|_");
        }
    }

    private static void createNewGUI(){
        Home_Page.main(new String[0]);
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
        int n = rand.nextInt(5) + 1;
        if(n == 1){
            bubble1.setForeground(Color.RED);
        } else if(n ==2){
            bubble2.setForeground(Color.RED);
        } else if (n==3){
            bubble3.setForeground(Color.RED);
        } else if (n==4){
            bubble4.setForeground(Color.RED);
        } else {
            bubble5.setForeground(Color.RED);
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