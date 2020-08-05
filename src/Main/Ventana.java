package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	JPanel panel;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bs, br, bd, bm, bb, bI, bP;
	JTextArea text;
	public Ventana() {
		this.setSize(225, 330);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		text = new JTextArea();
		text.setBounds(5, 5, 215, 40);
		text.setFont(new Font("Aria", Font.PLAIN, 25));
		text.setEditable(false);
		text.setBorder(new LineBorder(Color.BLACK, 3, false));
		text.setVisible(true);
		panel.add(text);
		b1 = new JButton("1");
		b1.setBounds(5, 55, 50, 50);
		panel.add(b1);
		b2 = new JButton("2");
		b2.setBounds(60, 55, 50, 50);
		panel.add(b2);
		b3 = new JButton("3");
		b3.setBounds(115, 55, 50, 50);
		panel.add(b3);
		bb = new JButton("C");
		bb.setBounds(170, 55, 50, 50);
		panel.add(bb);
		b4 = new JButton("4");
		b4.setBounds(5, 110, 50, 50);
		panel.add(b4);
		b5 = new JButton("5");
		b5.setBounds(60, 110, 50, 50);
		panel.add(b5);
		b6 = new JButton("6");
		b6.setBounds(115, 110, 50, 50);
		panel.add(b6);
		bs = new JButton("+");
		bs.setBounds(170, 110, 50, 50);
		panel.add(bs);
		b7 = new JButton("7");
		b7.setBounds(5, 165, 50, 50);
		panel.add(b7);
		b8 = new JButton("8");
		b8.setBounds(60,165, 50, 50);
		panel.add(b8);
		b9 = new JButton("9");
		b9.setBounds(115, 165, 50, 50);
		panel.add(b9);
		br = new JButton("-");
		br.setBounds(170, 165, 50, 50);
		panel.add(br);
		bP = new JButton(".");
		bP.setBounds(5, 220, 50, 50);
		panel.add(bP);
		b0 = new JButton("0");
		b0.setBounds(60, 220, 50, 50);
		panel.add(b0);
		bd = new JButton("/");
		bd.setBounds(115, 220, 50, 50);
		panel.add(bd);
		bm = new JButton("*");
		bm.setBounds(170, 220, 50, 50);
		panel.add(bm);
		ActionListener ac1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("1");
			}
			
		};
		b1.addActionListener(ac1);
		ActionListener ac2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("2");
			}
			
		};
		b2.addActionListener(ac2);
		ActionListener ac3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("3");
			}
			
		};
		b3.addActionListener(ac3);
		ActionListener acb = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.setText("");
			}
			
		};
		bb.addActionListener(acb);
		ActionListener ac4 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("4");
			}
			
		};
		b4.addActionListener(ac4);
		ActionListener ac5 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("5");
			}
			
		};
		b5.addActionListener(ac5);
		ActionListener ac6 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("6");
			}
			
		};
		b6.addActionListener(ac6);
		ActionListener acs = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append(" + ");
			}
			
		};
		bs.addActionListener(acs);
		ActionListener ac7 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("7");
			}
			
		};
		b7.addActionListener(ac7);
		ActionListener ac8 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("8");
			}
			
		};
		b8.addActionListener(ac8);
		ActionListener ac9 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("9");
			}
			
		};
		b9.addActionListener(ac9);
		ActionListener acr = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append(" - ");
			}
			
		};
		br.addActionListener(acr);
		ActionListener acp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append(".");
			}
			
		};
		bP.addActionListener(acp);
		ActionListener ac0 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("0");
			}
			
		};
		b0.addActionListener(ac0);
		ActionListener acd = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append(" / ");
			}
			
		};
		bd.addActionListener(acd);
		ActionListener acm = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append(" * ");
			}
			
		};
		bm.addActionListener(acm);
		KeyListener kl = new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar() == '\n') {
					double r = getResult(text.getText());
					text.setText(r + "");
				}
				
			}
			
		};
		text.addKeyListener(kl);
		b1.addKeyListener(kl);
		b2.addKeyListener(kl);
		b3.addKeyListener(kl);
		b4.addKeyListener(kl);
		b5.addKeyListener(kl);
		b6.addKeyListener(kl);
		b7.addKeyListener(kl);
		b8.addKeyListener(kl);
		b9.addKeyListener(kl);
		b0.addKeyListener(kl);
	}
	public double getResult(String op) {
		String n1S = op.split(" ")[0];
		String n2S = op.split(" ")[2];
		String opE = op.split(" ")[1];
		double n1 = Double.parseDouble(n1S);
		double n2 = Double.parseDouble(n2S);
		String type = opE;
		double r = 0.0;
		if(type.equals("+")) {
			r = n1 + n2;
		}else if(type.equals("-")) {
			r = n1 - n2;
		}else if(type.equals("*")) {
			r = n1 * n2;
		}else if(type.equals("/")) {
			r = n1 / n2;
		}
		return r;
	}
}
