package leesangho;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class FID extends readtheprofile{	
	ImageIcon imgFID = new ImageIcon("./ID.png");
	
	private JPanel contentPane;
	private JTextField SID;
	private JTextField Name;
	
	public FID() {
		setVisible(true);
		
		System.out.println("dd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 316);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SID = new JTextField();
		SID.setBounds(139, 120, 258, 33);
		contentPane.add(SID);
		SID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("�й� :");
		lblNewLabel.setBounds(42, 120, 85, 33);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 23));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("�̸� :");
		lblNewLabel_1.setBounds(42, 163, 85, 33);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 23));
		contentPane.add(lblNewLabel_1);
		
		Name = new JTextField();
		Name.setBounds(139, 167, 258, 33);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JButton finding = new JButton("ID Ȯ��");
		finding.setBounds(99, 225, 110, 33);
		finding.setBackground(Color.WHITE);
		contentPane.add(finding);
		finding.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Idf();
			}
		});
		
		JButton cancel = new JButton("���");
		cancel.setBounds(240, 225, 110, 33);
		cancel.setBackground(Color.WHITE);
		contentPane.add(cancel);
		
		JLabel label = new JLabel("");
		label.setIcon(imgFID);
		label.setBounds(0, 0, 449, 200);
		contentPane.add(label);
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	public void Idf() { //���̵��� ������ �´��� Ȯ��
		
		String a,b;
		for(int i =0;i<21;i++) {
			try {
				a=read_Student_ID(i);
				b=read_Name(i);
				if(SID.getText().equals("")||Name.getText().equals("")) {
					 JOptionPane.showMessageDialog(null, "�Է¾ȵ� �κ��� �ֽ��ϴ�.");
					 break;
				 }
				if(new String(SID.getText()).equals(a) && Name.getText().equals(b)) {
					String c = read_ID(i);
					setVisible(true);
					
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(100, 100, 259, 212);
					contentPane = new JPanel();
					contentPane.setBackground(Color.WHITE);
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					setContentPane(contentPane);
					contentPane.setLayout(null);
					
					JLabel outputID = new JLabel("����� ���̵�� " + c + " �Դϴ�.");
					outputID.setBounds(12, 55, 219, 44);
					contentPane.add(outputID);		
					
					JButton button = new JButton("Ȯ��");
					button.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							dispose();
						}
					});
					button.setBackground(Color.WHITE);
					button.setBounds(66, 126, 105, 27);
					contentPane.add(button);
					break;
				}
				else {
					if(i==20)
		              JOptionPane.showMessageDialog(null, "Faild");
		
					else
						continue;
		        }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
