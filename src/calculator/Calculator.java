package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtInput;
	private double answer, number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public void addInput(String str) {
		txtInput.setText(txtInput.getText() + str ); 
	}
	
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer = number + Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(txtInput.getText());
			txtInput.setText(Double.toString(answer));
			break;
		}
	}
	

	/**
	 * Create the frame.
	 */
	
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlScreen = new JPanel();
		pnlScreen.setBounds(10, 10, 400, 60);
		contentPane.add(pnlScreen);
		pnlScreen.setLayout(null);
		
		txtInput = new JTextField();
		txtInput.setEditable(false);
		txtInput.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInput.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtInput.setBounds(0, 26, 400, 34);
		pnlScreen.add(txtInput);
		txtInput.setColumns(10);
		
		JLabel lblResult = new JLabel("");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResult.setBounds(0, 0, 400, 25);
		pnlScreen.add(lblResult);
		
		JPanel pnlButton = new JPanel();
		pnlButton.setBounds(10, 85, 402, 385);
		contentPane.add(pnlButton);
		pnlButton.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnNine);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtInput.getText());
				operation = 1;
				txtInput.setText("");
				lblResult.setText(number + e.getActionCommand());
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnPlus);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnSix);
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtInput.getText());
				operation = 2;
				txtInput.setText("");
				lblResult.setText(number + e.getActionCommand());
			}
		});
		btnSubtraction.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnSubtraction);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnThree);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtInput.getText());
				operation = 3;
				txtInput.setText("");
				lblResult.setText(number + e.getActionCommand());
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnMultiplication);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnZero);
		
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lblResult.setText("");
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnResult);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInput.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnC);
		
		JButton btnMode = new JButton("%");
		btnMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtInput.getText());
				operation = 4;
				txtInput.setText("");
				lblResult.setText(number + e.getActionCommand());
			}
		});
		btnMode.setFont(new Font("Tahoma", Font.BOLD, 23));
		pnlButton.add(btnMode);
	}
}
