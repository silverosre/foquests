package net.silveros.main;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	
	public static Random rand = new Random();
	public static Main instance;
	
	// window variables
	public static final String WINDOW_TITLE = "Quest Checker";
	public static final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 500;
	
	// whether the update loop is able to be ran
	public static boolean initialized = false;

	public static void main(String[] args) {
		Main app = new Main();
		
		JFrame frame = new JFrame(WINDOW_TITLE);
        frame.add(app);
        frame.pack();
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while (initialized) {
        	try {
        		app.loop();
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
	
	private Main() {
		super(new GridLayout(0, 1));
		this.setFocusable(true);
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		this.initialize();
	}
	
	private void initialize() {
		
		
		
		this.thumbsUp();
	}
	
	private void thumbsUp() {
		initialized = true;
	}
}
