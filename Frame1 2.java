import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Frame1 {

	private JFrame frame;
	private JTextField txtSimpleProgram;
	private JTextField txtThisIsA;

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
		
		txtSimpleProgram = new JTextField();
		txtSimpleProgram.setText("Basic App");
		frame.getContentPane().add(txtSimpleProgram, BorderLayout.NORTH);
		txtSimpleProgram.setColumns(10);
		
		JButton btnShowMessage = new JButton("Show message ");
		btnShowMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This is a message.");
				
				
			}
		});
		frame.getContentPane().add(btnShowMessage, BorderLayout.WEST);
		
		txtThisIsA = new JTextField();
		txtThisIsA.setText("This is a basic app that shows a message.");
		frame.getContentPane().add(txtThisIsA, BorderLayout.CENTER);
		txtThisIsA.setColumns(10);
	}

}
