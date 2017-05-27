import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JOptionPane;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("ParkReminder");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnWhereDidI = new JButton("Park Location");
		btnWhereDidI.setEnabled(false);
		btnWhereDidI.setBackground(SystemColor.window);
		btnWhereDidI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnWhereDidI, BorderLayout.CENTER);
		
		JButton btnRecordLocation = new JButton("Record Location");
		btnRecordLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Please type in the address at which you are parked.");
			}
		});
		btnRecordLocation.setEnabled(false);
		btnRecordLocation.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnRecordLocation, BorderLayout.WEST);
		
		JButton btnParkLocationHistory = new JButton("Location History");
		btnParkLocationHistory.setEnabled(false);
		btnParkLocationHistory.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnParkLocationHistory, BorderLayout.EAST);
	}

}
