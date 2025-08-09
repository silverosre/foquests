package net.silveros.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import net.silveros.gui.Button;
import net.silveros.quests.Quest;
import net.silveros.quests.XPValues;

public class Foquests extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	
	public static Random rand = new Random();
	public static Foquests instance;
	
	// window contents
	public List<Button> buttons;
	
	// window variables
	public static final String WINDOW_TITLE = "Foquests";
	public static final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 500;
	
	// whether the update loop is able to be ran
	public static boolean initialized = false;

	public static void main(String[] args) {
		Foquests foquests = new Foquests();
		
		JFrame frame = new JFrame(WINDOW_TITLE);
        frame.add(foquests);
        frame.pack();
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while (initialized) {
        	try {
        		foquests.loop();
                try {
    				Thread.sleep(10);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }
	}

	private void loop() {
		
	}
	
	public void paint(Graphics g) {
		if (initialized) {
			Graphics2D g2d = (Graphics2D)g;
	        g2d.scale(2, 2);
			
			//draw buttons
	        if (this.buttons != null) {
	        	for (Button b : this.buttons) {
		        	Graphics2D bg = (Graphics2D)g2d.create();
		        	b.render(bg);
		        	bg.dispose();
		        }
	        } else {
	        	System.err.println("Buttons are not initalized!");
	        }
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private Foquests() {
		super(new GridLayout(0, 1));
		this.setFocusable(true);
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		this.initialize();
	}
	
	private void initialize() {
		this.initializeButtons();
		
		this.thumbsUp();
	}
	
	private void initializeButtons() {
		this.buttons = new ArrayList<>();
		
		Quest default_quest = new Quest("Default quest", "the description of a default quest", XPValues._10K);
		this.buttons.add(new Button(0, default_quest));
		
		Quest priority_quest = new Quest("Priority quest", "the description of a priority quest", XPValues._30K);
		Button priority_button = new Button(30 + 2, priority_quest);
		
		this.buttons.add(priority_button);
		
	}
	
	private void thumbsUp() {
		initialized = true;
	}
}
