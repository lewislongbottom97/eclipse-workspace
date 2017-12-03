import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.pi4j.io.gpio.GpioPinDigitalOutput;

public class FirstGUI {
	
	protected void sink() throws InterruptedException { //Sinking method
		GpioPinDigitalOutput relay1 = null;
		relay1.low();
		GpioPinDigitalOutput relay2 = null;
		relay2.high();
		System.out.println("Actuator Retracting"); //Glider taking on water
		Thread.sleep(20000);
		}
	protected void stopActuator() throws InterruptedException { //stops actuator method
		GpioPinDigitalOutput relay1 = null;
		relay1.low();
		GpioPinDigitalOutput relay2 = null;
		relay2.low();
		System.out.println("Actuator Retracting"); //Glider taking on water
		Thread.sleep(20000);
		}
	protected void rise() throws InterruptedException { //Rising method
		GpioPinDigitalOutput relay1 = null;
		relay1.high();
		GpioPinDigitalOutput relay2 = null;
		relay2.low();
		System.out.println("Actuator Retracting"); //Glider taking on water
		Thread.sleep(20000);
		}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGUI window = new FirstGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sink"); //Creates sink button
		btnNewButton.addActionListener(new ActionListener() { //Listens for click
			public void actionPerformed(ActionEvent arg0) { //Creates pop-up message
				JOptionPane.showMessageDialog(null, "Glider is sinking");
				try { //calls the sinking method
					sink();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(170, 72, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rise"); //Creates rise button
		btnNewButton_1.addActionListener(new ActionListener() { //Listens for click
			public void actionPerformed(ActionEvent e) { //Creates pop-up message
				JOptionPane.showMessageDialog(null, "Glider is rising");
				try { //calls the rising method
					rise();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(170, 161, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Stop"); //Creates Stop Button
		btnNewButton_1.addActionListener(new ActionListener() { //Listens for click
			public void actionPerformed(ActionEvent e) { //Creates pop-up message
				JOptionPane.showMessageDialog(null, "Actuator is stopped");
				try { //calls the stopActuator method
					stopActuator();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(170, 116, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}

