import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class XOwi {
	static JFrame window;
	static boolean turn = true;  //true - player1, false - player2
	static String Winner = "";
	static int j=0;
	
	final static JLabel[] cells = new JLabel[9];
	static void resetGame (){
		for (int i=0; i<9; i++){
			cells[i].setText("");
		}
		j=0;
		turn=true;
	}
	
	static String winningCondition (JLabel field[]) {
		
		if (field[0].getText()==field[1].getText() && field[0].getText()==field[2].getText() && field[0].getText()!="") //first horizontal line 0,1,2
			{			
				return field[0].getText();								
			}
		else if (field[3].getText()==field[4].getText() && field[3].getText()==field[5].getText() && field[3].getText()!="") //second horizontal line 3,4,5
					{
						return field[3].getText();
					}
		else if (field[6].getText()==field[7].getText() && field[6].getText()==field[8].getText() && field[6].getText()!="") //third horizontal line 6,7,8
					{
						return field[6].getText();
					}			
		else if (field[0].getText()==field[3].getText() && field[0].getText()==field[6].getText() && field[0].getText()!="") //first vertical line 0,3,6
					{
						return field[0].getText();
					}
		else if (field[1].getText()==field[4].getText() && field[1].getText()==field[7].getText() && field[1].getText()!="") //second  vertical line 1,4,7
					{
						return field[1].getText();
					}		
		else if (field[2].getText()==field[5].getText() && field[2].getText()==field[8].getText() && field[2].getText()!="") //third vertical line 2,5,8
					{
						return field[2].getText();
					}
		else if (field[0].getText()==field[4].getText() && field[0].getText()==field[8].getText() && field[0].getText()!="") //first diagonal line 0,4,8
					{
						return field[0].getText();
					}		
		else if (field[2].getText()==field[4].getText() && field[2].getText()==field[6].getText() && field[2].getText()!="") //second diagonal line 2,4,6
					{
						return field[2].getText();
					}	
			return "";
		}
	public static void main(String[] args) {
		window=new JFrame("XO Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 100, 600, 400);
		
		Border border = LineBorder.createBlackLineBorder();
		
		window.setLayout(new GridLayout (3,3));
		
		
		
		for (int i=0; i<9; i++) {
			cells[i] = new JLabel("",SwingConstants.CENTER);
			cells[i].setBorder(border);
			cells[i].setFont(new Font("Arial", Font.BOLD, 72));
			
			cells[i].addMouseListener(new MouseListener () {
			@Override
			public void mouseClicked(MouseEvent me)
			{	
				Object event = me.getSource();
				JLabel temp = (JLabel)event;
				if (temp.getText()=="") {
					j++;
					if (turn == true) {
						temp.setText("X");
						turn = false;
					}
					else {
						temp.setText("O");
						turn = true;
					}
					Winner = winningCondition(cells);
					if (Winner=="X"){
						JOptionPane.showMessageDialog(null, "The first player is the winner. Congratulation!");
						resetGame();
					}					
					else if (Winner=="O"){
						JOptionPane.showMessageDialog(null, "The second player is the winner. Congratulation!");
						resetGame();
					}
					else if (j==9){
						JOptionPane.showMessageDialog(null, "You both suck! Congratulation!");
						resetGame();
					}
				}
				
		
				/*
				if(panelColor == Color.WHITE)
				{
					temp.setBackground(Color.WHITE);
				}
				else
				{
					temp.setBackground(Color.BLACK);
				}*/
				//System.out.println (temp.getText());
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
			});
			window.getContentPane().add(cells[i]);	
			
			
		}
		
		
		window.setVisible(true);
		
		
		
	}

}
