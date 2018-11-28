import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Learn_More implements  ActionListener{
    JPanel titlePanel, buttonPanel, rulesPanel;
    JLabel rule1, rule2, rule3, rule4, redLabel;
    JButton backButton;

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
        rule3 = new JLabel("If you are still having trouble understanding, take this link to learn more: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html");
        rule3.setLocation(0,60);
        rule3.setSize(1200,30);
        rulesPanel.add(rule3);
        rule4 = new JLabel("Or, you can look at this visiualization to better understand: https://visualgo.net/en/list or https://www.youtube.com/watch?v=ZvHRYEcTxe8");
        rule4.setLocation(0,90);
        rule4.setSize(1200,30);
        rulesPanel.add(rule4);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(50, 510);
        buttonPanel.setSize(1000, 230);
        totalGUI.add(buttonPanel);

        backButton = new JButton("Back");
        backButton.setLocation(300, 150);
        backButton.setSize(500, 70);
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
        else
        {
            rule4.setText("yo yo yo");
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
        JFrame frame = new JFrame("Information For You");
        Learn_More demo = new Learn_More();
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