import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.net.*;
import java.awt.Desktop;

public class Learn_More implements  ActionListener {
    JPanel titlePanel, buttonPanel, rulesPanel;
    JLabel rule1, rule2, rule3, rule4, redLabel;
    static JButton backButton, button3, button4, button5;


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
        rule3 = new JLabel("If you are still having trouble understanding, take this link to learn more:");
        rule3.setLocation(0,60);
        rule3.setSize(1200,30);
        rulesPanel.add(rule3);
        button3 = new JButton();
        button3.setText("<HTML><FONT color=\"#000099\"><U>link</U></FONT></HTML>");
        button3.setHorizontalAlignment(SwingConstants.LEFT);
        button3.setBorderPainted(false);
        button3.setOpaque(false);
        button3.setBackground(Color.RED);
        button3.addActionListener( new ActionListener() 
            {
                public void actionPerformed(ActionEvent e)
                {
                    openWebPage("https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html");
                }
            });
        button3.setLocation(440,60);
        button3.setSize(1200,30);
        rulesPanel.add(button3);
        rule4 = new JLabel("Or, you can look at one of these two visiualization's to better understand:");
        rule4.setLocation(0,90);
        rule4.setSize(1200,30);
        rulesPanel.add(rule4);
        button4 = new JButton();
        button4.setText("<HTML><FONT color=\"#000099\"><U>Visualization</U></FONT></HTML>");
        button4.setHorizontalAlignment(SwingConstants.LEFT);
        button4.setBorderPainted(false);
        button4.setOpaque(false);
        button4.setBackground(Color.RED);
        button4.addActionListener( new ActionListener() 
            {
                public void actionPerformed(ActionEvent e)
                {
                    openWebPage("https://visualgo.net/en/list");
                }
            });
        button4.setLocation(445,90);
        button4.setSize(105,30);
        rulesPanel.add(button4);
        button5 = new JButton();
        button5.setText("<HTML><FONT color=\"#000099\"><U>Video</U></FONT></HTML>");
        button5.setHorizontalAlignment(SwingConstants.LEFT);
        button5.setBorderPainted(false);
        button5.setOpaque(false);
        button5.setBackground(Color.RED);
        button5.addActionListener( new ActionListener() 
            {
                public void actionPerformed(ActionEvent e)
                {
                    openWebPage("https://www.youtube.com/watch?v=ZvHRYEcTxe8");
                }
            });
        button5.setLocation(535,90);
        button5.setSize(300,30);
        rulesPanel.add(button5);

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

    public void openWebPage(String url){
        try {         
          Desktop.getDesktop().browse(URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
     }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton){
            createNewGUI();
        }
        else{
            rule4.setText("yo yo yo");
        }
    }
    
    private static void createNewGUI(){
        Home_Page.main(new String[0]);
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

    public static void main(String[] args) throws URISyntaxException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}