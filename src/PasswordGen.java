import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class PasswordGen {
	public static Random ran=new Random();
	public static JCheckBox[] cond= { new JCheckBox("Has UpperCase Letters"), new JCheckBox("Has Numbers"),new JCheckBox("Has Symbols"),new JCheckBox("Has Other Characters")};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr=new JFrame("Password Generator");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(10,10,500,500);
		JPanel panel=new JPanel();
		for(JCheckBox chk:cond) {
		
		panel.add(chk);
		
		}
		JSpinner lc=new JSpinner(new SpinnerNumberModel(8,0,500,1));
		JLabel lcl=new JLabel("How many letters?");
		lcl.setFont(new Font("Arial",Font.PLAIN,20));
		
		panel.add(lcl);
		panel.add(lc);	
		JTextField password=new JTextField(20);
		panel.add(password);
		
		JButton gen=new JButton("Generate");
		panel.add(gen);
		gen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder generated=new StringBuilder("");
				int count= (int) lc.getValue();
				for(int i=0;i<count;i++) {
					int rand;
					if(cond[0].isSelected()) {
						if(ran.nextBoolean()) {
							rand=65+ ran.nextInt(25);
						generated.append((char)rand);
						continue;
						}
					}
					if(cond[1].isSelected()) {
						if(ran.nextBoolean()) {
							rand=48+ ran.nextInt(10);
						generated.append((char)rand);
						continue;
						}
					}
					if(cond[2].isSelected()) {
						if(ran.nextBoolean()) {
							rand=33+ ran.nextInt(14);
						generated.append((char)rand);
						continue;
						}
					}
					if(cond[3].isSelected()) {
						if(ran.nextBoolean()) {
							rand= ran.nextInt(Character.MAX_VALUE);
						generated.append((char)rand);
						continue;
						}
					}
					rand= 97+ ran.nextInt(25);	
					generated.append((char)rand);
				}
				password.setText(generated.toString());
				}
			
		});
		JButton copy=new JButton("Copy");
		panel.add(copy);
		copy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(password.getText()),null);
			}
		});
		for(Component c:panel.getComponents()) {
			c.setFont(new Font("Arial",Font.PLAIN,20));
		}
		fr.setVisible(true);;
		fr.add(panel);
		
	}
	
}
