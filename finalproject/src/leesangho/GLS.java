package leesangho;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToolBar;
import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GLS extends writetheprofile {
 String year;
 int sem;
 
 ImageIcon imgup = new ImageIcon("./상단.png");
 ImageIcon img_wall = new ImageIcon("./gls배경.png");
 ImageIcon log_out = new ImageIcon("./로그아웃.png");
 ImageIcon img_0 = new ImageIcon("./일반휴학신청.png"); 
 ImageIcon img_1 = new ImageIcon("./학기별성적.png");
 ImageIcon img_2 = new ImageIcon("./저장.png");
 ImageIcon img_3 = new ImageIcon("./추가.png");
 ImageIcon img_4 = new ImageIcon("./연락처조회및수정.png");
 ImageIcon img_5 = new ImageIcon("./신청.png");
 ImageIcon img_6 = new ImageIcon("./학적정보조회_1.png");
 ImageIcon img_7 = new ImageIcon("./학적정보조회_2.png");
 
 private JPanel contentPane;
 private JInternalFrame internalFrame_0;
 private JInternalFrame internalFrame_3;
 private JInternalFrame internalFrame_4;
 private JLabel lblNewLabel;
 private JPanel panel;
 private JLabel label;
 private JTextField textField_1;
 private JTextField textField;
 private final ButtonGroup ButtonGroup_1 = new ButtonGroup();
 private JTextField textField_2;
 private JTextField textField_3;
 private JTextField textField_4;
 private JTextField textField_5;
 private final ButtonGroup buttonGroup = new ButtonGroup();
 private JTable table;
 String number1=null;
 String number2=null;
 String address=null;
 String address_n=null;
 String fo=null;

 public GLS(int i)throws IOException {  
       String name;
       String major;
       int grade;
       String sn;
       int season;
       int semester;
       
       
       name=read_Name(i);
       major=read_Major(i);
       grade=read_Semester(i)/2;
       sn=read_Student_ID(i);
       season=grade+2017;
       semester=read_Semester(i);
       
       
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100, 100, 1209, 979);
       contentPane = new JPanel();
       contentPane.setBackground(Color.WHITE);
       contentPane.setForeground(Color.WHITE);
       contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
       setContentPane(contentPane);
       contentPane.setLayout(null);
       //////////////////////////////////////////
       internalFrame_4 = new JInternalFrame("연락처조회및수정 ");
       internalFrame_4.getContentPane().setBackground(Color.WHITE);
       internalFrame_4.setBounds(168, 67, 1023, 865);
       contentPane.add(internalFrame_4);
       internalFrame_4.setClosable(true);
       internalFrame_4.setResizable(false);
       internalFrame_4.getContentPane().setLayout(null);
       
       JPanel panel_1 = new JPanel();
       panel_1.setBackground(Color.WHITE);
       panel_1.setBounds(0, 0, 1007, 829);
       internalFrame_4.getContentPane().add(panel_1);
       panel_1.setLayout(null);
       
       JPanel panel_5 = new JPanel();
       panel_5.setBackground(SystemColor.activeCaption);
       panel_5.setBounds(210, 126, 322, 26);
       panel_1.add(panel_5);
       panel_5.setLayout(null);
       
       JLabel lblA = new JLabel(name);  ///이름
       lblA.setBounds(4, 0, 322, 26);
       panel_5.add(lblA);
       
       JPanel panel_6 = new JPanel();
       panel_6.setBackground(SystemColor.activeCaption);
       panel_6.setBounds(210, 158, 322, 26);
       panel_1.add(panel_6);
       panel_6.setLayout(null);
       
       JLabel lblB = new JLabel(major);  ///전공
       lblB.setBounds(4, 0, 322, 26);
       panel_6.add(lblB);
       
       JPanel panel_7 = new JPanel();
       panel_7.setBackground(SystemColor.activeCaption);
       panel_7.setBounds(210, 189, 322, 26);
       panel_1.add(panel_7);
       panel_7.setLayout(null);
       
       JLabel lblDddd = new JLabel(Integer.toString(grade));   ///학년
       lblDddd.setBounds(4, 0, 322, 26);
       panel_7.add(lblDddd);
       
       JPanel panel_8 = new JPanel();
       panel_8.setBackground(SystemColor.activeCaption);
       panel_8.setBounds(697, 126, 249, 26);
       panel_1.add(panel_8);
       panel_8.setLayout(null);
       
       JLabel lblD = new JLabel(sn);   //학번
       lblD.setBounds(4, 0, 249, 26);
       panel_8.add(lblD);
       
       JPanel panel_10 = new JPanel();
       panel_10.setBackground(SystemColor.activeCaption);
       panel_10.setBounds(697, 158, 249, 26);
       panel_1.add(panel_10);
       panel_10.setLayout(null);
       
       JLabel lblE = new JLabel(Integer.toString(season)+"년도");  //수업학년도
       lblE.setBounds(4, 0, 249, 26);
       panel_10.add(lblE);
       
       JPanel panel_9 = new JPanel();
       panel_9.setBackground(SystemColor.activeCaption);
       panel_9.setBounds(697, 189, 249, 26);
       panel_1.add(panel_9);
       panel_9.setLayout(null);
       
       JLabel lblF = new JLabel(Integer.toString(semester));   //학기
       lblF.setBounds(4, 0, 249, 26);
       panel_9.add(lblF);
       
       JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("국내주소");   //국내
       rdbtnNewRadioButton_4.setBackground(SystemColor.text);
       rdbtnNewRadioButton_4.setBounds(634, 711, 101, 26);
       panel_1.add(rdbtnNewRadioButton_4);
       ButtonGroup_1.add(rdbtnNewRadioButton_4);
       
       JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("국외주소");  //국외
       rdbtnNewRadioButton_5.setBackground(SystemColor.text);
       rdbtnNewRadioButton_5.setBounds(735, 711, 120, 27);
       panel_1.add(rdbtnNewRadioButton_5);
       ButtonGroup_1.add(rdbtnNewRadioButton_5);
       
       JButton btnNewButton = new JButton("");
       btnNewButton.setIcon(img_3);  //추가 버튼
       btnNewButton.setBounds(804, 65, 99, 30);
       panel_1.add(btnNewButton);
       btnNewButton.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                
             
            
            try {
            	
            	if(textField_2.getText().equals("")||textField_3.getText().equals("")||textField_4.getText().equals("")||textField_5.getText().equals("")||!rdbtnNewRadioButton_4.isSelected()||!rdbtnNewRadioButton_5.isSelected()) {
            		JOptionPane.showMessageDialog(null, "입력되지 않은 부분이 있습니다.");
            	}else {
            	
                write_House_number(textField_2.getText(),i);
                changecsvfile();
                
                write_Post_number(textField_3.getText(),i);
                changecsvfile();
                
                write_Address(textField_4.getText(),i);
                changecsvfile();
                
                write_Address_details(textField_5.getText(),i);
                changecsvfile();
                
                if(rdbtnNewRadioButton_4.isSelected()) {
                 write_Fore("국내",i);
                    changecsvfile();
                }
                else {
                 write_Fore("국외",i);
                    changecsvfile();
               }
                
                JOptionPane.showMessageDialog(null, "추가 되었습니다.");
            	}
    } catch (FileNotFoundException e1) {
     // TODO Auto-generated catch block
     e1.printStackTrace();
    } catch (IOException e1) {
     // TODO Auto-generated catch block
     e1.printStackTrace();
    }
                 
                
            }
        });
       
       
       JButton button_1 = new JButton("");
       button_1.setIcon(img_2);  //저장 버튼
       button_1.setBounds(903, 65, 101, 31);
       panel_1.add(button_1);
       button_1.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                	
                	/*{"1", "현거주지",null , fo , address_n , address},
                    {"2", "연락처1",number1 , fo , address_n , address},
                    {"3", "연락처2",number2 , fo , address_n  , address}*/
					number1=read_Phone_number1(i);
					number2=read_Phone_number2(i);
	                address=read_Address(i)+" "+read_Address_details(i);
	                address_n=read_Post_number(i);
	                fo=read_For(i);
	                Object[]aa=new Object[1];
	                aa[2]=number1;
	                Object[]bb=new Object[2];
	                aa[2]=number2;
	                for(int j=0;j<3;j++) {
	                 Object[] cc = new Object[j];
	                 aa[3] = fo;
	                 aa[4]=address_n;
	                 aa[5]=address;
	                }
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
            }
        });
       
       JPanel panel_11 = new JPanel();
       panel_11.setBackground(SystemColor.text);
       panel_11.setBounds(326, 711, 169, 26);
       panel_1.add(panel_11);
       panel_11.setLayout(null);
       
       textField_2 = new JTextField();   //전화번호
       textField_2.setBounds(0, 0, 169, 24);
       panel_11.add(textField_2);
       textField_2.setColumns(10);
       
       JPanel panel_12 = new JPanel();
       panel_12.setBackground(SystemColor.text);
       panel_12.setBounds(326, 740, 79, 26);
       panel_1.add(panel_12);
       panel_12.setLayout(null);
       
       textField_3 = new JTextField();  //우편번호
       textField_3.setBounds(0, 0, 79, 24);
       panel_12.add(textField_3);
       textField_3.setColumns(10);
       
       JPanel panel_13 = new JPanel();
       panel_13.setBackground(SystemColor.text);
       panel_13.setBounds(403, 740, 452, 26);
       panel_1.add(panel_13);
       panel_13.setLayout(null);
       
       textField_4 = new JTextField();  //주소
       textField_4.setBounds(0, 0, 452, 24);
       panel_13.add(textField_4);
       textField_4.setColumns(10);
       
       JPanel panel_14 = new JPanel();
       panel_14.setBackground(SystemColor.text);
       panel_14.setBounds(326, 771, 529, 26);
       panel_1.add(panel_14);
       panel_14.setLayout(null);
       
       textField_5 = new JTextField();  //상세주소
       textField_5.setBounds(0, 0, 529, 24);
       panel_14.add(textField_5);
       textField_5.setColumns(10);
       
       JPanel panel_70 = new JPanel();
       panel_70.setBackground(UIManager.getColor("Button.disabledShadow"));
       panel_70.setBounds(173, 264, 831, 388);
       panel_1.add(panel_70);
       panel_70.setLayout(null);
       
       JScrollPane scrollPane = new JScrollPane();
       scrollPane.setBounds(0, 0, 828, 345);
       panel_70.add(scrollPane);
       
       table = new JTable();
       table.setBackground(UIManager.getColor("Button.disabledShadow"));
       scrollPane.setViewportView(table);
       table.setModel(new DefaultTableModel(
    		   
        new Object[][] {
         {"1", "현거주지",null , fo , address_n , address},
         {"2", "연락처1",number1 , fo , address_n , address},
         {"3", "연락처2",number2 , fo , address_n  , address},
        },
        new String[] {
         "\uBC88\uD638", "\uC5F0\uB77D\uCC98\uAD6C\uBD84", "\uC804\uD654\uBC88\uD638", "\uAD6D\uB0B4\uC678\uC8FC\uC18C\uAD6C\uBD84", "\uC6B0\uD3B8\uBC88\uD638", "\uC8FC\uC18C"
        }
       ) {
        boolean[] columnEditables = new boolean[] {
         true, true, true, true, false, true
        };
        public boolean isCellEditable(int row, int column) {
         return columnEditables[column];
        }
       });
       table.getColumnModel().getColumn(0).setPreferredWidth(15);
       table.getColumnModel().getColumn(0).setMinWidth(5);
       table.getColumnModel().getColumn(1).setPreferredWidth(31);
       table.getColumnModel().getColumn(2).setMinWidth(40);
       table.getColumnModel().getColumn(3).setPreferredWidth(21);
       table.getColumnModel().getColumn(4).setResizable(false);
       table.getColumnModel().getColumn(4).setMinWidth(40);
       table.getColumnModel().getColumn(5).setMinWidth(40);
       
       JLabel lblNewLabel_3 = new JLabel("");
       lblNewLabel_3.setBounds(0, 0, 1011, 825);
       panel_1.add(lblNewLabel_3);
       lblNewLabel_3.setBackground(UIManager.getColor("Button.disabledShadow"));
       lblNewLabel_3.setIcon(img_4);
       internalFrame_4.setVisible(false); 
       
  internalFrame_0 = new JInternalFrame("일반휴학신청");
  internalFrame_0.setBackground(new Color(255, 255, 255));
  internalFrame_0.getContentPane().setBackground(UIManager.getColor("Button.disabledShadow"));
  internalFrame_0.setBounds(168, 67, 1023, 865);
  contentPane.add(internalFrame_0);
  internalFrame_0.setClosable(true);
  internalFrame_0.setResizable(false);
  internalFrame_0.getContentPane().setLayout(null);  
  
  panel = new JPanel();
  panel.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel.setBounds(0, 0, 1007, 829);
  internalFrame_0.getContentPane().add(panel);
  panel.setLayout(null);
  //////////////////////////////////////////////////////////////////////////////////////
  JLabel lblNewLabel_1 = new JLabel(name); //성명
  lblNewLabel_1.setBackground(new Color(173, 216, 230));
  lblNewLabel_1.setFont(new Font("돋움", Font.PLAIN, 14));
  lblNewLabel_1.setBounds(247, 74, 195, 26);
  panel.add(lblNewLabel_1);
  
  textField_1 = new JTextField();  ///비상연락처1
  textField_1.setBounds(218, 446, 232, 30);
  panel.add(textField_1);
  textField_1.setColumns(10);
  
  JRadioButton rdbtnNewRadioButton = new JRadioButton("경제사정");
  buttonGroup.add(rdbtnNewRadioButton);
  rdbtnNewRadioButton.setFont(new Font("돋움", Font.PLAIN, 14));
  rdbtnNewRadioButton.setBounds(302, 514, 85, 28);
  panel.add(rdbtnNewRadioButton);
  
  JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("군입대예정(금학기 입대자만 해당)");
  buttonGroup.add(rdbtnNewRadioButton_1);
  rdbtnNewRadioButton_1.setFont(new Font("돋움", Font.PLAIN, 14));
  rdbtnNewRadioButton_1.setBounds(483, 514, 247, 28);
  panel.add(rdbtnNewRadioButton_1);
  
  JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("질병");
  buttonGroup.add(rdbtnNewRadioButton_3);
  rdbtnNewRadioButton_3.setFont(new Font("돋움", Font.PLAIN, 14));
  rdbtnNewRadioButton_3.setBounds(813, 514, 96, 28);
  panel.add(rdbtnNewRadioButton_3);
  
  JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("어학연수");
  buttonGroup.add(rdbtnNewRadioButton_2);
  rdbtnNewRadioButton_2.setFont(new Font("돋움", Font.PLAIN, 14));
  rdbtnNewRadioButton_2.setBounds(730, 514, 85, 28);
  panel.add(rdbtnNewRadioButton_2);
  
  JRadioButton radioButton_1 = new JRadioButton("개인사정");
  buttonGroup.add(radioButton_1);
  radioButton_1.setFont(new Font("돋움", Font.PLAIN, 14));
  radioButton_1.setBounds(393, 514, 85, 28);
  panel.add(radioButton_1);
  
  JRadioButton radioButton = new JRadioButton("취업준비");
  buttonGroup.add(radioButton);
  radioButton.setFont(new Font("돋움", Font.PLAIN, 14));
  radioButton.setBounds(218, 514, 85, 28);
  panel.add(radioButton);
  
  JLabel lblNewLabel_2 = new JLabel("");
  lblNewLabel_2.setBounds(220, 412, 83, 30);
  panel.add(lblNewLabel_2);
  
  JLabel label_6 = new JLabel("");
  label_6.setBounds(395, 412, 83, 30);
  panel.add(label_6); 
  
  JComboBox comboBox = new JComboBox();
  comboBox.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    int year = 0;
    int sem = 0;
    int count = comboBox.getSelectedIndex();
	if(count==0) {
		year=grade;
		sem=semester%2;
		if(sem==0)
			sem=2;
	}
	if(count==1) {
		if(semester%2==0) {
			sem=1;
			year=grade;
			year++;
		}
		if(semester%2==1) {
			sem=2;
		    year=grade;
		}
	}
	if(count==2){
		year=grade;
		year++;
		sem=semester%2;
		if(sem==0)
			sem=2;
	}
	
	
    lblNewLabel_2.setText(Integer.toString(2017+year));
    label_6.setText(Integer.toString(sem));
   }
  });
  comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC120\uD0DD", "1", "2"}));
  comboBox.setBounds(214, 378, 142, 33);
  panel.add(comboBox);
  
  JLabel lblBb = new JLabel(major);   //전공
  lblBb.setFont(new Font("돋움", Font.PLAIN, 14));
  lblBb.setBackground(new Color(173, 216, 230));
  lblBb.setBounds(247, 106, 195, 26);
  panel.add(lblBb);
  
  JLabel lblCc = new JLabel(Integer.toString(grade)+"학년");  //학년
  lblCc.setFont(new Font("돋움", Font.PLAIN, 14));
  lblCc.setBackground(new Color(173, 216, 230));
  lblCc.setBounds(247, 140, 195, 24);
  panel.add(lblCc);
  
  JLabel lblDd = new JLabel(sn); //학번
  lblDd.setFont(new Font("돋움", Font.PLAIN, 14));
  lblDd.setBackground(new Color(173, 216, 230));
  lblDd.setBounds(714, 76, 195, 23);
  panel.add(lblDd);
  
  JLabel lblEe = new JLabel(Integer.toString(grade+2017)+"년도"); //수업학년도
  lblEe.setFont(new Font("돋움", Font.PLAIN, 14));
  lblEe.setBackground(new Color(173, 216, 230));
  lblEe.setBounds(714, 108, 195, 23);
  panel.add(lblEe);
  
  JLabel lblFf = new JLabel(Integer.toString(semester));  //수업학기
  lblFf.setFont(new Font("돋움", Font.PLAIN, 14));
  lblFf.setBackground(new Color(173, 216, 230));
  lblFf.setBounds(714, 139, 195, 26);
  panel.add(lblFf);  
  
  textField = new JTextField();
  textField.setColumns(10);
  textField.setBounds(218, 479, 232, 30);
  panel.add(textField);
  
  JButton button = new JButton(img_5);
  button.setBackground(Color.WHITE);
  button.setIcon(img_5);
  button.setBounds(445, 620, 134, 29);
  panel.add(button);
  button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
         
    	  try {
    		  
    		if(textField_1.getText().equals("")||textField.getText().equals("")||comboBox.getSelectedIndex()==0||!rdbtnNewRadioButton.isSelected()||!rdbtnNewRadioButton_1.isSelected()||!rdbtnNewRadioButton_2.isSelected()||!rdbtnNewRadioButton_3.isSelected()||!radioButton.isSelected()||!radioButton_1.isSelected()) {
    			JOptionPane.showMessageDialog(null, "입력안된 부분이 있습니다."); 			
    		}else {
    		write_Phone_number1(textField_1.getText(),i);
    		changecsvfile();
    			
    		write_Phone_number2(textField_2.getText(),i);
    		changecsvfile();
			
			
			if(comboBox.getSelectedIndex()==1) {
				write_Rest_count("1학기",i);
				changecsvfile();
			}
			else {
				write_Rest_count("2학기",i);
				changecsvfile();
			}
			/////////////////////////////////////////
			if(rdbtnNewRadioButton.isSelected()) {
				write_Rest_reason("경제사정",i);
				changecsvfile();
			}
			else if(rdbtnNewRadioButton_1.isSelected()) {
				write_Rest_reason("군입대예정",i);
				changecsvfile();				
			}
            else if(rdbtnNewRadioButton_2.isSelected()) {
            	write_Rest_reason("질병",i);
				changecsvfile();
			}
            else if(rdbtnNewRadioButton_3.isSelected()) {
            	write_Rest_reason("어학연수",i);
				changecsvfile();
			}
            else if(radioButton.isSelected()) {
            	write_Rest_reason("개인사정",i);
				changecsvfile();
			}
            else {
            	write_Rest_reason("취업준비",i);
				changecsvfile();
            }
			
			

				
																																																																																																																																																																																																																																																																																										
    		}	
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	  
    	  
      }
   });
  //////////////////////////////////////////////////////////////////////////////////////////
   
  
  label = new JLabel(img_0);
  label.setFont(new Font("굴림", Font.PLAIN, 17));
  label.setBounds(0, 12, 1004, 540);
  panel.add(label);
  label.setBackground(UIManager.getColor("Button.disabledShadow"));
  internalFrame_0.setVisible(false);  
  
  internalFrame_3 = new JInternalFrame("학적정보조회");
  internalFrame_3.getContentPane().setBackground(UIManager.getColor("controlLtHighlight"));
  internalFrame_3.getContentPane().setLayout(null);
  
  JPanel panel_3 = new JPanel();
  panel_3.setBackground(UIManager.getColor("controlLtHighlight"));
  panel_3.setBounds(0, 47, 1007, 734);
  internalFrame_3.getContentPane().add(panel_3);
  panel_3.setLayout(null);
  
  JPanel panel_4 = new JPanel();
  panel_4.setBounds(234, 49, 111, 26);
  panel_4.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_4);
  panel_4.setLayout(null);
  
  JLabel label_3 = new JLabel("학번");
  label_3.setFont(new Font("돋움", Font.BOLD, 17));
  label_3.setBackground(UIManager.getColor("Button.highlight"));
  label_3.setBounds(4, 0, 111, 26);
  panel_4.add(label_3);
  
  JPanel panel_15 = new JPanel();
  panel_15.setBounds(234, 86, 111, 26);
  panel_15.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_15);
  panel_15.setLayout(null);
  
  JLabel label_4 = new JLabel("성명");
  label_4.setFont(new Font("돋움", Font.BOLD, 17));
  label_4.setBackground(UIManager.getColor("Button.highlight"));
  label_4.setBounds(4, 0, 111, 26);
  panel_15.add(label_4);
  
  JPanel panel_16 = new JPanel();
  panel_16.setBounds(234, 122, 111, 26);
  panel_16.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_16);
  panel_16.setLayout(null);
  
  JLabel label_5 = new JLabel("주민등록번호");
  label_5.setFont(new Font("돋움", Font.BOLD, 17));
  label_5.setBackground(UIManager.getColor("Button.highlight"));
  label_5.setBounds(4, 0, 111, 26);
  panel_16.add(label_5);
  
  JPanel panel_17 = new JPanel();
  panel_17.setBounds(234, 158, 111, 26);
  panel_17.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_17);
  panel_17.setLayout(null);
  
  JLabel label_7 = new JLabel("학기");
  label_7.setFont(new Font("돋움", Font.BOLD, 17));
  label_7.setBackground(UIManager.getColor("Button.highlight"));
  label_7.setBounds(4, 0, 111, 26);
  panel_17.add(label_7);
  
  JPanel panel_18 = new JPanel();
  panel_18.setBounds(234, 195, 111, 26);
  panel_18.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_18);
  panel_18.setLayout(null);
  
  JLabel label_8 = new JLabel("휴학사유");
  label_8.setFont(new Font("돋움", Font.BOLD, 17));
  label_8.setBackground(UIManager.getColor("Button.highlight"));
  label_8.setBounds(4, 0, 111, 26);
  panel_18.add(label_8);
  
  JPanel panel_19 = new JPanel();
  panel_19.setBounds(610, 49, 97, 26);
  panel_19.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_19);
  panel_19.setLayout(null);
  
  JLabel label_9 = new JLabel("아이디");
  label_9.setFont(new Font("돋움", Font.BOLD, 17));
  label_9.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_9.setBounds(4, 0, 97, 26);
  panel_19.add(label_9);
  
  JPanel panel_20 = new JPanel();
  panel_20.setBounds(610, 86, 97, 26);
  panel_20.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_20);
  panel_20.setLayout(null);
  
  JLabel label_10 = new JLabel("비밀번호");
  label_10.setFont(new Font("돋움", Font.BOLD, 17));
  label_10.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_10.setBounds(4, 0, 97, 26);
  panel_20.add(label_10);
  
  JPanel panel_21 = new JPanel();
  panel_21.setBounds(610, 122, 97, 26);
  panel_21.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_21);
  panel_21.setLayout(null);
  
  JLabel label_11 = new JLabel("성별");
  label_11.setFont(new Font("돋움", Font.BOLD, 17));
  label_11.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_11.setBounds(4, 0, 97, 26);
  panel_21.add(label_11);
  
  JPanel panel_22 = new JPanel();
  panel_22.setBounds(610, 158, 97, 26);
  panel_22.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_22);
  panel_22.setLayout(null);
  
  JLabel label_12 = new JLabel("재학/휴학");
  label_12.setFont(new Font("돋움", Font.BOLD, 17));
  label_12.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_12.setBounds(4, 0, 97, 26);
  panel_22.add(label_12);
  
  JPanel panel_23 = new JPanel();
  panel_23.setBounds(610, 195, 97, 26);
  panel_23.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_23);
  panel_23.setLayout(null);
  
  JLabel label_13 = new JLabel("휴학기수");
  label_13.setFont(new Font("돋움", Font.BOLD, 17));
  label_13.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_13.setBounds(4, 0, 97, 26);
  panel_23.add(label_13);
  
  JPanel panel_24 = new JPanel();
  panel_24.setBounds(63, 231, 144, 26);
  panel_24.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_24);
  panel_24.setLayout(null);
  
  JLabel label_14 = new JLabel("전공");
  label_14.setFont(new Font("돋움", Font.BOLD, 17));
  label_14.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_14.setBounds(4, 0, 144, 26);
  panel_24.add(label_14);
  
  JPanel panel_25 = new JPanel();
  panel_25.setBounds(63, 267, 144, 26);
  panel_25.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_25);
  panel_25.setLayout(null);
  
  JLabel label_15 = new JLabel("주소");
  label_15.setFont(new Font("돋움", Font.BOLD, 17));
  label_15.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_15.setBounds(4, 0, 144, 26);
  panel_25.add(label_15);
  
  JPanel panel_26 = new JPanel();
  panel_26.setBounds(63, 303, 144, 26);
  panel_26.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_26);
  panel_26.setLayout(null);
  
  JLabel label_16 = new JLabel("비밀번호찾기질문");
  label_16.setFont(new Font("돋움", Font.BOLD, 17));
  label_16.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_16.setBounds(4, 0, 144, 26);
  panel_26.add(label_16);
  
  JPanel panel_27 = new JPanel();
  panel_27.setBounds(63, 339, 144, 26);
  panel_27.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_27);
  panel_27.setLayout(null);
  
  JLabel label_17 = new JLabel("답변");
  label_17.setFont(new Font("돋움", Font.BOLD, 17));
  label_17.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_17.setBounds(4, 0, 144, 26);
  panel_27.add(label_17);
  
  JPanel panel_28 = new JPanel();
  panel_28.setBounds(63, 376, 144, 26);
  panel_28.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_28);
  panel_28.setLayout(null);
  
  JLabel label_18 = new JLabel("비상연락처1");
  label_18.setFont(new Font("돋움", Font.BOLD, 17));
  label_18.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_18.setBounds(4, 0, 144, 26);
  panel_28.add(label_18);
  
  JPanel panel_29 = new JPanel();
  panel_29.setBounds(63, 411, 144, 26);
  panel_29.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_29);
  panel_29.setLayout(null);
  
  JLabel label_19 = new JLabel("비상연락처2");
  label_19.setFont(new Font("돋움", Font.BOLD, 17));
  label_19.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_19.setBounds(4, 0, 144, 26);
  panel_29.add(label_19);
  
  JPanel panel_30 = new JPanel();
  panel_30.setBounds(63, 448, 144, 26);
  panel_30.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_30);
  panel_30.setLayout(null);
  
  JLabel label_20 = new JLabel("");
  label_20.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_20.setBounds(4, 0, 144, 26);
  panel_30.add(label_20);
  
  JPanel panel_31 = new JPanel();
  panel_31.setBounds(63, 484, 144, 26);
  panel_31.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_31);
  panel_31.setLayout(null);
  
  JLabel label_32 = new JLabel("");
  label_32.setBounds(4, 0, 144, 26);
  panel_31.add(label_32);
  
  JPanel panel_32 = new JPanel();
  panel_32.setBounds(599, 340, 135, 26);
  panel_32.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_32);
  panel_32.setLayout(null);
  
  JLabel label_25 = new JLabel("미적분학");
  label_25.setFont(new Font("돋움", Font.BOLD, 15));
  label_25.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_25.setBounds(4, 0, 135, 26);
  panel_32.add(label_25);
  
  JPanel panel_33 = new JPanel();
  panel_33.setBounds(599, 376, 135, 26);
  panel_33.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_33);
  panel_33.setLayout(null);
  
  JLabel label_26 = new JLabel("일반물리학");
  label_26.setFont(new Font("돋움", Font.BOLD, 15));
  label_26.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_26.setBounds(4, 0, 135, 26);
  panel_33.add(label_26);
  
  JPanel panel_34 = new JPanel();
  panel_34.setBounds(599, 411, 135, 26);
  panel_34.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_34);
  panel_34.setLayout(null);
  
  JLabel label_27 = new JLabel("일반화학");
  label_27.setFont(new Font("돋움", Font.BOLD, 15));
  label_27.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_27.setBounds(4, 0, 135, 26);
  panel_34.add(label_27);
  
  JPanel panel_35 = new JPanel();
  panel_35.setBounds(599, 448, 135, 26);
  panel_35.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_35);
  panel_35.setLayout(null);
  
  JLabel label_28 = new JLabel("소프트웨어실습");
  label_28.setFont(new Font("돋움", Font.BOLD, 15));
  label_28.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_28.setBounds(4, 0, 135, 26);
  panel_35.add(label_28);
  
  JPanel panel_36 = new JPanel();
  panel_36.setBounds(599, 484, 135, 26);
  panel_36.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_36);
  panel_36.setLayout(null);
  
  JLabel label_29 = new JLabel("성균논어");
  label_29.setFont(new Font("돋움", Font.BOLD, 15));
  label_29.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_29.setBounds(4, 0, 135, 26);
  panel_36.add(label_29);
  
  JPanel panel_37 = new JPanel();
  panel_37.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_37.setBounds(63, 540, 144, 26);
  panel_3.add(panel_37);
  panel_37.setLayout(null);
  
  JLabel label_22 = new JLabel("");
  label_22.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_22.setBounds(4, 0, 144, 26);
  panel_37.add(label_22);
  
  JPanel panel_38 = new JPanel();
  panel_38.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_38.setBounds(63, 587, 144, 26);
  panel_3.add(panel_38);
  panel_38.setLayout(null);
  
  JLabel label_23 = new JLabel("");
  label_23.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_23.setBounds(4, 0, 144, 26);
  panel_38.add(label_23);
  
  JPanel panel_39 = new JPanel();
  panel_39.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_39.setBounds(63, 623, 144, 26);
  panel_3.add(panel_39);
  panel_39.setLayout(null);
  
  JLabel label_24 = new JLabel("");
  label_24.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_24.setBounds(4, 0, 144, 26);
  panel_39.add(label_24);
  
  JPanel panel_40 = new JPanel();
  panel_40.setBounds(599, 540, 135, 26);
  panel_40.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_40);
  panel_40.setLayout(null);
  
  JLabel label_30 = new JLabel("");
  label_30.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_30.setBounds(4, 0, 135, 26);
  panel_40.add(label_30);
  
  JPanel panel_41 = new JPanel();
  panel_41.setBounds(599, 587, 135, 26);
  panel_41.setBackground(UIManager.getColor("Button.disabledShadow"));
  panel_3.add(panel_41);
  panel_41.setLayout(null);
  
  JLabel label_31 = new JLabel("");
  label_31.setBackground(UIManager.getColor("CheckBox.highlight"));
  label_31.setBounds(4, 0, 135, 26);
  panel_41.add(label_31);
  
  JPanel panel_42 = new JPanel();
  panel_42.setBounds(348, 48, 213, 28);
  panel_3.add(panel_42);
  panel_42.setLayout(null);
  
  JLabel lblA_1 = new JLabel(read_Student_ID(i));
  lblA_1.setFont(new Font("돋움", Font.BOLD, 17));
  lblA_1.setBounds(4, 0, 213, 28);
  panel_42.add(lblA_1);
  
  JPanel panel_43 = new JPanel();
  panel_43.setBounds(348, 85, 213, 28);
  panel_3.add(panel_43);
  panel_43.setLayout(null);
  
  JLabel lblB_1 = new JLabel(read_Name(i));
  lblB_1.setFont(new Font("돋움", Font.BOLD, 17));
  lblB_1.setBounds(4, 0, 213, 28);
  panel_43.add(lblB_1);
  
  JPanel panel_44 = new JPanel();
  panel_44.setBounds(348, 121, 213, 28);
  panel_3.add(panel_44);
  panel_44.setLayout(null);
  
  JLabel lblC = new JLabel(read_Resident_Registration_Number(i));
  lblC.setFont(new Font("돋움", Font.BOLD, 17));
  lblC.setBounds(4, 0, 213, 28);
  panel_44.add(lblC);
  
  JPanel panel_45 = new JPanel();
  panel_45.setBounds(348, 157, 213, 28);
  panel_3.add(panel_45);
  panel_45.setLayout(null);
  
  JLabel lblD_1 = new JLabel(Integer.toString(read_Semester(i)));
  lblD_1.setFont(new Font("돋움", Font.BOLD, 17));
  lblD_1.setBounds(4, 0, 213, 28);
  panel_45.add(lblD_1);
  
  JPanel panel_46 = new JPanel();
  panel_46.setBounds(348, 194, 213, 28);
  panel_3.add(panel_46);
  panel_46.setLayout(null);
  
  JLabel lblE_1 = new JLabel(read_Rest_reason(i));
  lblE_1.setFont(new Font("돋움", Font.BOLD, 17));
  lblE_1.setBounds(4, 0, 213, 28);
  panel_46.add(lblE_1);
  
  JPanel panel_47 = new JPanel();
  panel_47.setBounds(710, 48, 252, 28);
  panel_3.add(panel_47);
  panel_47.setLayout(null);
  
  JLabel lblF_1 = new JLabel(read_ID(i));
  lblF_1.setFont(new Font("돋움", Font.BOLD, 17));
  lblF_1.setBounds(4, 0, 252, 28);
  panel_47.add(lblF_1);
  
  JPanel panel_48 = new JPanel();
  panel_48.setBounds(710, 85, 252, 28);
  panel_3.add(panel_48);
  panel_48.setLayout(null);
  
  JLabel lblG = new JLabel(read_Password(i));
  lblG.setFont(new Font("돋움", Font.BOLD, 17));
  lblG.setBounds(4, 0, 252, 28);
  panel_48.add(lblG);
  
  JPanel panel_49 = new JPanel();
  panel_49.setBounds(710, 121, 252, 28);
  panel_3.add(panel_49);
  panel_49.setLayout(null);
  
  JLabel lblH = new JLabel(read_Position(i));
  lblH.setFont(new Font("돋움", Font.BOLD, 17));
  lblH.setBounds(4, 0, 252, 28);
  panel_49.add(lblH);
  
  JPanel panel_50 = new JPanel();
  panel_50.setBounds(710, 157, 252, 28);
  panel_3.add(panel_50);
  panel_50.setLayout(null);
  
  JLabel lblI = new JLabel(read_Condition(i));
  lblI.setFont(new Font("돋움", Font.BOLD, 17));
  lblI.setBounds(4, 0, 252, 28);
  panel_50.add(lblI);
  
  JPanel panel_51 = new JPanel();
  panel_51.setBounds(710, 194, 252, 28);
  panel_3.add(panel_51);
  panel_51.setLayout(null);
  
  JLabel lblJ = new JLabel(read_Rest_count(i));
  lblJ.setFont(new Font("돋움", Font.BOLD, 17));
  lblJ.setBounds(4, 0, 252, 28);
  panel_51.add(lblJ);
  
  JPanel panel_52 = new JPanel();
  panel_52.setBounds(212, 231, 748, 28);
  panel_3.add(panel_52);
  panel_52.setLayout(null);
  
  JLabel lblK = new JLabel(read_Major(i));
  lblK.setFont(new Font("돋움", Font.BOLD, 17));
  lblK.setBounds(4, 0, 748, 28);
  panel_52.add(lblK);
  
  JPanel panel_53 = new JPanel();
  panel_53.setBounds(212, 267, 748, 28);
  panel_3.add(panel_53);
  panel_53.setLayout(null);
  
  JLabel lblL = new JLabel(read_Address(i)+" "+read_Address_details(i));
  lblL.setFont(new Font("돋움", Font.BOLD, 17));
  lblL.setBounds(4, 0, 748, 28);
  panel_53.add(lblL);
  
  JPanel panel_54 = new JPanel();
  panel_54.setBounds(212, 303, 748, 28);
  panel_3.add(panel_54);
  panel_54.setLayout(null);
  
  int qn=read_Question_number(i);
  String q = null;
  if(qn==1)
	  q="당신의 고향은?  ";
  if(qn==2)
	  q="당신의 출신 고등학교는?";
  if(qn==3)
	  q="당신의 최애 연예인은?";
  if(qn==4)
	  q="당신이 가장 좋아하는 음식은?";
  JLabel lblM = new JLabel(q);
  lblM.setFont(new Font("돋움", Font.BOLD, 17));
  lblM.setBounds(4, 0, 748, 28);
  panel_54.add(lblM);
  
  JPanel panel_55 = new JPanel();
  panel_55.setBounds(212, 341, 228, 26);
  panel_3.add(panel_55);
  panel_55.setLayout(null);
  
  JLabel lblN = new JLabel(read_Answer(i));
  lblN.setFont(new Font("돋움", Font.BOLD, 17));
  lblN.setBounds(4, 0, 228, 28);
  panel_55.add(lblN);
  
  JPanel panel_56 = new JPanel();
  panel_56.setBounds(212, 376, 228, 26);
  panel_3.add(panel_56);
  panel_56.setLayout(null);
  
  JLabel lblO = new JLabel(read_Phone_number1(i));
  lblO.setFont(new Font("돋움", Font.BOLD, 17));
  lblO.setBounds(4, 0, 228, 28);
  panel_56.add(lblO);
  
  JPanel panel_57 = new JPanel();
  panel_57.setBounds(212, 411, 228, 28);
  panel_3.add(panel_57);
  panel_57.setLayout(null);
  
  JLabel lblP = new JLabel(read_Phone_number2(i));
  lblP.setFont(new Font("돋움", Font.BOLD, 17));
  lblP.setBounds(4, 0, 228, 28);
  panel_57.add(lblP);
  
  JPanel panel_58 = new JPanel();
  panel_58.setBounds(212, 448, 228, 28);
  panel_3.add(panel_58);
  panel_58.setLayout(null);
  
  JPanel panel_59 = new JPanel();
  panel_59.setBounds(212, 484, 228, 28);
  panel_3.add(panel_59);
  panel_59.setLayout(null);
  
  JLabel label_49 = new JLabel("");
  label_49.setBounds(0, 0, 228, 28);
  panel_59.add(label_49);
  
  JPanel panel_60 = new JPanel();
  panel_60.setBounds(212, 540, 228, 28);
  panel_3.add(panel_60);
  panel_60.setLayout(null);
  
  JPanel panel_61 = new JPanel();
  panel_61.setBounds(212, 586, 228, 28);
  panel_3.add(panel_61);
  panel_61.setLayout(null);
  
  JPanel panel_62 = new JPanel();
  panel_62.setBounds(740, 339, 221, 28);
  panel_3.add(panel_62);
  panel_62.setLayout(null);
  
  JLabel lblQ = new JLabel(read_Math(i));
  lblQ.setFont(new Font("돋움", Font.BOLD, 17));
  lblQ.setBounds(4, 0, 221, 28);
  panel_62.add(lblQ);
  
  JPanel panel_63 = new JPanel();
  panel_63.setBounds(740, 376, 220, 28);
  panel_3.add(panel_63);
  panel_63.setLayout(null);
  
  JLabel lblR = new JLabel(read_Physics(i));
  lblR.setFont(new Font("돋움", Font.BOLD, 17));
  lblR.setBounds(4, 0, 221, 28);
  panel_63.add(lblR);
  
  JPanel panel_64 = new JPanel();
  panel_64.setBounds(740, 411, 220, 28);
  panel_3.add(panel_64);
  panel_64.setLayout(null);
  
  JLabel lblS = new JLabel(read_Chemistry(i));
  lblS.setFont(new Font("돋움", Font.BOLD, 17));
  lblS.setBounds(4, 0, 221, 28);
  panel_64.add(lblS);
  
  JPanel panel_65 = new JPanel();
  panel_65.setBounds(740, 448, 221, 28);
  panel_3.add(panel_65);
  panel_65.setLayout(null);
  
  JLabel lblT = new JLabel(read_Software(i));
  lblT.setFont(new Font("돋움", Font.BOLD, 17));
  lblT.setBounds(4, 0, 221, 28);
  panel_65.add(lblT);
  
  JPanel panel_66 = new JPanel();
  panel_66.setBounds(740, 484, 220, 28);
  panel_3.add(panel_66);
  panel_66.setLayout(null);
  
  JLabel lblU = new JLabel(read_Gongza(i));
  lblU.setFont(new Font("돋움", Font.BOLD, 17));
  lblU.setBounds(4, 0, 221, 28);
  panel_66.add(lblU);
  
  JPanel panel_67 = new JPanel();
  panel_67.setBounds(740, 540, 220, 28);
  panel_3.add(panel_67);
  panel_67.setLayout(null);
  
  JPanel panel_68 = new JPanel();
  panel_68.setBounds(740, 586, 220, 28);
  panel_3.add(panel_68);
  panel_68.setLayout(null);
  
  JPanel panel_69 = new JPanel();
  panel_69.setBounds(211, 622, 749, 28);
  panel_3.add(panel_69);
  
  JLabel label_2 = new JLabel("");
  label_2.setBounds(0, 0, 993, 734);
  panel_3.add(label_2);
  label_2.setIcon(img_6);
  label_2.setBackground(UIManager.getColor("controlLtHighlight"));
  
  JLabel label_21 = new JLabel("");
  label_21.setBounds(63, 486, 144, 26);
  panel_3.add(label_21);
  
  JPanel panel_2 = new JPanel();
  panel_2.setBackground(UIManager.getColor("controlLtHighlight"));
  panel_2.setBounds(0, -125, 1007, 219);
  internalFrame_3.getContentPane().add(panel_2);
  panel_2.setLayout(null);
  
  JLabel label_1 = new JLabel("");
  label_1.setBounds(0, 0, 1007, 195);
  panel_2.add(label_1);
  label_1.setIcon(img_7);
  label_1.setBackground(UIManager.getColor("controlLtHighlight"));
  internalFrame_3.setBounds(168, 67, 1023, 865);
  contentPane.add(internalFrame_3);
  internalFrame_3.setClosable(true);
  internalFrame_3.setResizable(false);
  internalFrame_3.setVisible(false);
  
  
  JLabel wall = new JLabel(img_wall);
  wall.setBounds(142, 23, 1035, 909);
  contentPane.add(wall);
  
  JTree tree = new JTree();
  tree.setBounds(0, 142, 166, 584);
  contentPane.add(tree);
  
  tree.setRootVisible(false);
  tree.setModel(new DefaultTreeModel(
   new DefaultMutableTreeNode("GLS") {
    {
     DefaultMutableTreeNode node_1;
     DefaultMutableTreeNode node_2;
     node_1 = new DefaultMutableTreeNode("신청/자격관리");
      node_2 = new DefaultMutableTreeNode("휴복학신청");
       node_2.add(new DefaultMutableTreeNode("일반휴학신청")); 
      node_1.add(node_2);
     add(node_1);
     node_1 = new DefaultMutableTreeNode("학적/개인영역");
      node_2 = new DefaultMutableTreeNode("학적신상정보");
       node_2.add(new DefaultMutableTreeNode("학적정보조회"));
       node_2.add(new DefaultMutableTreeNode("연락처조회및수정"));
      node_1.add(node_2);
     add(node_1);      
    }
   }
  )); 
  
  JButton logoutButton = new JButton(log_out);
  logoutButton.setBounds(1076, 3, 85, 20);
  contentPane.add(logoutButton);
  
  lblNewLabel = new JLabel(imgup);
  lblNewLabel.setBounds(0, -104, 1229, 183);
  contentPane.add(lblNewLabel);
  logoutButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
    dispose();
   }
  });  
  
  tree.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent arg0) {
    DefaultMutableTreeNode node;
    node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
    
    if(node == null) return;
    
    String nodeName = (String)node.getUserObject();
    System.out.println(nodeName);
    
    if(nodeName == "일반휴학신청" ) {
     frame_0();
    }
    if(nodeName == "학적정보조회" ) {
     frame_3();
    }
    if(nodeName == "연락처조회및수정" ) {
     frame_4();
    }
   }
  });
  
  
 }
 public void frame_0() {
  internalFrame_0.setVisible(true);
  internalFrame_3.setVisible(false);
  internalFrame_4.setVisible(false);
 }
 public void frame_3() {
  internalFrame_0.setVisible(false);
  internalFrame_3.setVisible(true);
  internalFrame_4.setVisible(false);
 }
 public void frame_4() {
  internalFrame_0.setVisible(false);
  internalFrame_3.setVisible(false);
  internalFrame_4.setVisible(true);
 }
}

