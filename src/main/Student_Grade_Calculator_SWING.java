package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_Grade_Calculator_SWING implements ActionListener {

	private JFrame frame;
	private  JTextField textField_Name;
	private JTextField textField_Mid1;
	private JTextField textField_Mid2;
	private JTextField textField_Final;
	private JTextField textField__Name_Grade;
	private JLabel lblNewLabel_Your_Grade;
	private JLabel lblNewLabel_Your_Grade_2;
	static ArrayList<Student> list = new ArrayList<Student>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Grade_Calculator_SWING window = new Student_Grade_Calculator_SWING();
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
	public Student_Grade_Calculator_SWING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(5, 0, 10, 10));
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		panel.add(horizontalBox_1_1);
		
		JLabel lblNewLabel_Name = new JLabel("Name         ");
		horizontalBox_1_1.add(lblNewLabel_Name);
		
		textField_Name = new JTextField();
		horizontalBox_1_1.add(textField_Name);
		textField_Name.setColumns(10);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		panel.add(horizontalBox_2);
		
		JLabel lblNewLabel_Mid1 = new JLabel("Mid 1          ");
		horizontalBox_2.add(lblNewLabel_Mid1);
		
		textField_Mid1 = new JTextField();
		horizontalBox_2.add(textField_Mid1);
		textField_Mid1.setColumns(10);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		panel.add(horizontalBox_3);
		
		JLabel lblNewLabel_Mid2 = new JLabel("Mid 2          ");
		horizontalBox_3.add(lblNewLabel_Mid2);
		
		textField_Mid2 = new JTextField();
		horizontalBox_3.add(textField_Mid2);
		textField_Mid2.setColumns(10);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		panel.add(horizontalBox_4);
		
		JLabel lblNewLabel_Final = new JLabel("Final           ");
		horizontalBox_4.add(lblNewLabel_Final);  
		
		textField_Final = new JTextField();
		horizontalBox_4.add(textField_Final);
		textField_Final.setColumns(10);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		panel.add(horizontalBox_5);
		
		JButton Add_ArrayList = new JButton("Add to Array List");
		Add_ArrayList.addActionListener(this) ;
				
				
				
			
		horizontalBox_5.add(Add_ArrayList);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(5, 1, 10, 10));
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		panel_1.add(horizontalBox_6);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		panel_1.add(horizontalBox_7);
		
		JLabel lblNewLabel_Name_Grade = new JLabel(" Enter Name For Grade  ");
		horizontalBox_7.add(lblNewLabel_Name_Grade);
		
		textField__Name_Grade = new JTextField();
		horizontalBox_7.add(textField__Name_Grade);
		textField__Name_Grade.setColumns(10);
		
		Box horizontalBox_8 = Box.createHorizontalBox();
		panel_1.add(horizontalBox_8);
		
		 lblNewLabel_Your_Grade = new JLabel("Your Grade is: ");
		horizontalBox_8.add(lblNewLabel_Your_Grade);
		
		 lblNewLabel_Your_Grade_2 = new JLabel("");
		horizontalBox_8.add(lblNewLabel_Your_Grade_2);
		
		Box horizontalBox_9 = Box.createHorizontalBox();
		panel_1.add(horizontalBox_9);
		
		JButton Display_Grade_Name = new JButton("Display Grade and Name");
		Display_Grade_Name.addActionListener(this);
		horizontalBox_9.add(Display_Grade_Name);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Add to Array List")) {
			
			try {
				String name = textField_Name.getText();
				if(name.length() != 0) {
			
				double mid1 = Double.parseDouble(textField_Mid1.getText());
				double mid2 = Double.parseDouble(textField_Mid2.getText());
				double final1 = Double.parseDouble(textField_Final.getText());
				double result = mid1 *0.2 + mid2 * 0.3 + final1 *0.5;
				
				Student std = new Student(name,mid1,mid2,final1,result);
				
				list.add(std);
				
				textField_Name.setText("");
				textField_Mid1.setText("");
				textField_Mid2.setText("");
				textField_Final.setText("");
				
				System.out.println(list.get(0).getName());
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
		if(e.getActionCommand().equals("Display Grade and Name")) {

			String std_name = textField__Name_Grade.getText();
						
			for (Student student : list) {
				
				if(student.getName().equals(std_name)){
					lblNewLabel_Your_Grade_2.setText(Double.toString(student.getResult()));
					
				}
				else{
					lblNewLabel_Your_Grade_2.setText("NO RESULT");
				}
				
			}
		}
		
		
		
	}

}
