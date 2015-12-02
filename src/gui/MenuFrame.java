package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Menu Frame.
 * @author Emrullah Celik
 * @version 11/27/15
 *
 */
@SuppressWarnings("serial")
public class MenuFrame extends JFrame {
    /**
     * My Panel List. 
     */
    private List<JPanel> myPanelList = new ArrayList<JPanel>();
    /**
     * Create Panel. 
     */
    private final CreatePanel myCreatePanel = new CreatePanel();
    /**
     * Search Panel. 
     */
    private final SearchPanel mySearchPanel = new SearchPanel();
    /**
     * Home Panel. 
     */
    private final HomePanel myHomePanel = new HomePanel();
    /**
     * Help Panel.
     */
    private final HelpPanel myHelpPanel = new HelpPanel();
    
    /**
     * Main panel.
     */
    private final JPanel myMainPanel = new JPanel();
    /**
     * index. 
     */
    private int myIndex;
    /**
     * Create the frame.
     */
    public MenuFrame() {
        setBackground(new Color(204, 204, 255));
        getContentPane().setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        getContentPane().setBackground(new Color(51, 102, 204));
        setTitle("Business Logistics Solutions");
        getContentPane().setLayout(null);
        final int k = 100;
        setBounds(k, k, 936, 640);
        myPanelList.add(myHomePanel);
        myPanelList.add(mySearchPanel);
        myPanelList.add(myCreatePanel);
        myPanelList.add(myHelpPanel);
      
        myIndex = 0;
        buildMenu();
        buildComponents();
        myMainPanel.setBackground(new Color(204, 204, 255));
        myMainPanel.setLayout(new BorderLayout(0, 0));
        myMainPanel.add((JPanel) myPanelList.get(myIndex), BorderLayout.CENTER);
        
        JLabel label = new JLabel("Version 1.0  \u00A9 2015");
        label.setForeground(new Color(0, 204, 0));
        label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));
        label.setBackground(new Color(204, 204, 204));
        label.setBounds(535, 503, 363, 54);
        getContentPane().add(label);
    }
    
    /**
     *menu bar. 
     */
    private void buildMenu() {
    }
    /**
     * show panels.
     */
    private void buildComponents() {
        myMainPanel.setBounds(140, 11, 749, 486);
        getContentPane().add(myMainPanel);
        final JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(new Color(102, 153, 204));
        buttonsPanel.setLayout(null);
        buttonsPanel.setBounds(10, 11, 120, 559);
        getContentPane().add(buttonsPanel);
        
        JButton helpButton = new JButton("");
        helpButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        helpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myMainPanel.removeAll();               
                myMainPanel.add((JPanel) myPanelList.get(3), BorderLayout.CENTER);
                myMainPanel.repaint();
                myMainPanel.validate();
            }
        });
        helpButton.setBounds(22, 339, 72, 66);
        final java.awt.Image img5 = new ImageIcon(this.getClass().getResource ("/help.png")).getImage();
        helpButton.setIcon(new ImageIcon(img5));
        buttonsPanel.add(helpButton);
        
        JButton createButton = new JButton("");
        createButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myMainPanel.removeAll();               
                myMainPanel.add((JPanel) myPanelList.get(2), BorderLayout.CENTER);
                myMainPanel.repaint();
                myMainPanel.validate();    
            }
        });
        createButton.setBounds(22, 21, 72, 66);
        final java.awt.Image img3 = new ImageIcon(this.getClass().getResource ("/create.png")).getImage();
        createButton.setIcon(new ImageIcon(img3));
        buttonsPanel.add(createButton);
        
        JButton searchButton = new JButton("");
        searchButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                myMainPanel.removeAll();               
                myMainPanel.add((JPanel) myPanelList.get(1), BorderLayout.CENTER);
                myMainPanel.repaint();
                myMainPanel.validate();
            }
        });
        searchButton.setBounds(22, 98, 72, 70);
        final java.awt.Image img4 = new ImageIcon(this.getClass().getResource ("/search.png")).getImage();
        searchButton.setIcon(new ImageIcon(img4));
        buttonsPanel.add(searchButton);
        
        JButton homeButton = new JButton("");
        homeButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                myMainPanel.removeAll();               
                myMainPanel.add((JPanel) myPanelList.get(0), BorderLayout.CENTER);
                myMainPanel.repaint();
                myMainPanel.validate();
            }
        });
        homeButton.setBounds(22, 258, 72, 70);
        final java.awt.Image img6 = new ImageIcon(this.getClass().getResource ("/home.png")).getImage();
        homeButton.setIcon(new ImageIcon(img6));
        buttonsPanel.add(homeButton);
        
        JButton exitButton = new JButton("");
        exitButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitButton.setBounds(22, 416, 72, 66);
        final java.awt.Image img7 = new ImageIcon(this.getClass().getResource ("/exit.png")).getImage();
        exitButton.setIcon(new ImageIcon(img7));
        buttonsPanel.add(exitButton);
        
        JLabel ccsLabel = new JLabel("CCS \u00A9");
        ccsLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));
        ccsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ccsLabel.setBounds(10, 493, 103, 44);
        buttonsPanel.add(ccsLabel);
        
        JButton libraryButton = new JButton("");
        libraryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ViewLibrary.main(null);
            }
        });
        libraryButton.setBounds(22, 179, 72, 66);
        final java.awt.Image img8 = new ImageIcon(this.getClass().getResource ("/library.png")).getImage();
        libraryButton.setIcon(new ImageIcon(img8));
        buttonsPanel.add(libraryButton);
    }
    /**
     * change apps. 
     */
    public void next() {
        ((Component) myPanelList.get(myIndex)).setVisible(false);
        myIndex++;
        ((Component) myPanelList.get(myIndex)).setVisible(true);      
    }
    /**
     * Close frame.
     */
    public void start() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
