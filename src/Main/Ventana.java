package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	JPanel panel;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bs, br, bd, bm, bb, bI, bP, bb1, be, brc;
	JTextArea text;
	int aux = 0;
	public Ventana() {
		this.setSize(225, 380);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(Color.blue);
		this.add(panel);
		text = new JTextArea();
		text.setBounds(5, 5, 215, 40);
		text.setFont(new Font("Aria", Font.PLAIN, 20));
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
		be = new JButton("x²");
		be.setBounds(5, 275, 50, 50);
		panel.add(be);
		brc = new JButton("√");
		brc.setBounds(60, 275, 50, 50);
		panel.add(brc);
		bb1 = new JButton("D");
		bb1.setBounds(115, 275, 50, 50);
		panel.add(bb1);
		bI = new JButton("=");
		bI.setBounds(170, 275, 50, 50);
		panel.add(bI);
		ActionListener ac1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("1");
			}
			
		};
		b1.addActionListener(ac1);
		ActionListener ac2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("2");
			}
			
		};
		b2.addActionListener(ac2);
		ActionListener ac3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("3");
			}
			
		};
		b3.addActionListener(ac3);
		ActionListener acb = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.setText("");
				bs.setEnabled(true);
				br.setEnabled(true);
				bd.setEnabled(true);
				bm.setEnabled(true);
				aux = 0;
				
			}
			
		};
		bb.addActionListener(acb);
		ActionListener ac4 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("4");
			}
			
		};
		b4.addActionListener(ac4);
		ActionListener ac5 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("5");
			}
			
		};
		b5.addActionListener(ac5);
		ActionListener ac6 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("6");
			}
			
		};
		b6.addActionListener(ac6);
		ActionListener acs = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append(" + ");
			}
			
		};
		bs.addActionListener(acs);
		ActionListener ac7 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("7");
			}
			
		};
		b7.addActionListener(ac7);
		ActionListener ac8 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("8");
			}
			
		};
		b8.addActionListener(ac8);
		ActionListener ac9 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("9");
			}
			
		};
		b9.addActionListener(ac9);
		ActionListener acr = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append(" - ");
			}
			
		};
		br.addActionListener(acr);
		ActionListener acp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append(".");
			}
			
		};
		bP.addActionListener(acp);
		ActionListener ac0 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append("0");
			}
			
		};
		b0.addActionListener(ac0);
		ActionListener acd = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
				text.append(" / ");
			}
			
		};
		bd.addActionListener(acd);
		ActionListener acm = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() < 15)
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
				double r = 0.0;
				if(arg0.getKeyChar() == '\n') {
					if(aux == 1) {
				    r = getResult(text.getText());
					}else if(aux == 2) {
						r = getResult2(text.getText());
					}else if(aux == 3) {
						r = getResult3(text.getText());
					}
					aux = 0;
					text.setText(r + "");
					bs.setEnabled(true);
					br.setEnabled(true);
					bd.setEnabled(true);
					bm.setEnabled(true);
					aux = 0;
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
		bs.addKeyListener(kl);
		br.addKeyListener(kl);
		bd.addKeyListener(kl);
		bm.addKeyListener(kl);
		MouseListener ms = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				//System.out.println(arg0.getButton());
				aux++;
				if(aux >= 4) {
					bs.setEnabled(false);
					br.setEnabled(false);
					bd.setEnabled(false);
					bm.setEnabled(false);
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		};
		bs.addMouseListener(ms);
		br.addMouseListener(ms);
		bd.addMouseListener(ms);
		bm.addMouseListener(ms);
		ActionListener aci = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				double r = 0.0;
					if(aux == 1) {
				    r = getResult(text.getText());
					}else if(aux == 2) {
						r = getResult2(text.getText());
					}else if(aux == 3) {
						r = getResult3(text.getText());
					}else if(aux == 5) {
						r = getPower(text.getText());
					}else if(aux == 6) {
						r = getSQRT(text.getText());
					}
					aux = 0;
					text.setText(r + "");
					bs.setEnabled(true);
					br.setEnabled(true);
					bd.setEnabled(true);
					bm.setEnabled(true);
					aux = 0;
				}
		};
		bI.addActionListener(aci);
		ActionListener acb1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().length() != 0) {
				int endIndex = text.getText().length() - 1;
				text.setText(text.getText().substring(0, endIndex).strip());
				aux--;
				}else {
					JOptionPane.showMessageDialog(null, "Ya fue eliminado");
				}
				
			}
			
			
		};
		bb1.addActionListener(acb1);
		ActionListener ace = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("²");
				aux = 5;
				bs.setEnabled(false);
				br.setEnabled(false);
				bd.setEnabled(false);
				bm.setEnabled(false);
			}
			
		};
		be.addActionListener(ace);
		ActionListener acsq = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.append("√");
				aux = 6;
				bs.setEnabled(false);
				br.setEnabled(false);
				bd.setEnabled(false);
				bm.setEnabled(false);
			}
			
		};
		brc.addActionListener(acsq);
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
	public double getResult2 (String op) {
		String n1S = op.split(" ")[0];
		String arS = op.split(" ")[1];
		String n2S = op.split(" ")[2];
		String ar2S = op.split(" ")[3];
		String n3S = op.split(" ")[4];
		double n1 = Double.parseDouble(n1S);
		double n2 = Double.parseDouble(n2S);
		double n3 = Double.parseDouble(n3S);
		double r = 0;
		if(arS.equals("+")) {
			r = n1 + n2;
			if(ar2S.equals("+")) {
				r += n3;
			}else if(ar2S.equals("-")) {
				r-= n3;
			}else if(ar2S.equals("*")) {
				r *= n3;
			}else if(ar2S.equals("/")) {
				r /= n3;
			}
		}else if(arS.equals("-")) {
			r = n1 - n2;
			if(ar2S.equals("+")) {
				r += n3;
			}else if(ar2S.equals("-")) {
				r-= n3;
			}else if(ar2S.equals("*")) {
				r *= n3;
			}else if(ar2S.equals("/")) {
				r /= n3;
			}
		}else if(arS.equals("*")) {
			r = n1* n2;
			if(ar2S.equals("+")) {
				r += n3;
			}else if(ar2S.equals("-")) {
				r-= n3;
			}else if(ar2S.equals("*")) {
				r *= n3;
			}else if(ar2S.equals("/")) {
				r /= n3;
			}
			
		}else if(arS.equals("/")) {
			r = n1 / n2;
			if(ar2S.equals("+")) {
				r += n3;
			}else if(ar2S.equals("-")) {
				r-= n3;
			}else if(ar2S.equals("*")) {
				r *= n3;
			}else if(ar2S.equals("/")) {
				r /= n3;
			}
		}
		return r;
	}
	public double getResult3(String op) {
		double r = 0.0;
		double n1 = Double.parseDouble(op.split(" ")[0]);
		double n2 = Double.parseDouble(op.split(" ")[2]);
		double n3 = Double.parseDouble(op.split(" ")[4]);
		double n4 = Double.parseDouble(op.split(" ")[6]);
		String arS = op.split(" ")[1];
		String ar2S = op.split(" ")[3];
		String ar3S = op.split(" ")[5];
		if(arS.equals("+")) {
			r = n1 + n2;
			if(ar2S.equals("+")) {
				r += n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("-")) {
				r-= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("*")) {
				r *= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("/")) {
				r /= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}
		}else if(arS.equals("-")) {
			r = n1 - n2;
			if(ar2S.equals("+")) {
				r += n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("-")) {
				r-= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("*")) {
				r *= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("/")) {
				r /= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}
		}else if(arS.equals("*")) {
			r = n1* n2;
			if(ar2S.equals("+")) {
				r += n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("-")) {
				r-= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("*")) {
				r *= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("/")) {
				r /= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}
			
		}else if(arS.equals("/")) {
			r = n1 / n2;
			if(ar2S.equals("+")) {
				r += n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("-")) {
				r-= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("*")) {
				r *= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}else if(ar2S.equals("/")) {
				r /= n3;
				if(ar3S.equals("+")) {
					r += n4;
				}else if(ar3S.equals("-")) {
					r-= n4;
				}else if(ar3S.equals("*")) {
					r *= n4;
				}else if(ar3S.equals("/")) {
					r /= n4;
				}
			}
		}
		return r;
	}
	public double getPower(String exp) {
		int endIndex = exp.length() - 1;
		double n = Double.parseDouble(exp.substring(0, endIndex));
		double r = Math.pow(n, 2);
		return r;
	}
	public double getSQRT(String sqrt) {
		double n = Double.parseDouble(sqrt.substring(1));
		double r = Math.sqrt(n);
		return r;
	}
	
}
