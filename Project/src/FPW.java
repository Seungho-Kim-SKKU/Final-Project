import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FPW extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public FPW() {
		setVisible(true);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.showFPW();
	}
	public void showFPW() {
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 23));
		lblNewLabel.setBounds(33, 53, 105, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD559\uBC88 :");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 23));
		lblNewLabel_1.setBounds(33, 131, 105, 34);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 53, 221, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 136, 221, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("»Æ¿Œ");
		btnNewButton.setBounds(66, 200, 124, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("√Îº“");
		btnNewButton_1.setBounds(218, 200, 132, 34);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
