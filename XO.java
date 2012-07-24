import java.util.InputMismatchException;
import java.util.Scanner;


public class XO {
	int[] field  = new int[9];
	String player1;
	String player2;
	int Answer;
	boolean check=true;
	int i;
	int winWhatever=0;
	int Game=1;
	int counter=0;
	
	public static void main(String[] args) {
		XO game = new XO();
		game.play();
	}
	int winningCondition (int field[]) {
		
				if (field[0]==field[1] && field[0]==field[2] && field[0]!=0) //first horizontal line 0,1,2
					{			
						return field[0];								
					}
				else if (field[3]==field[4] && field[3]==field[5] && field[3]!=0) //second horizontal line 3,4,5
							{
								return field [3];
							}
				else if (field[6]==field[7] && field[6]==field[8] && field[6]!=0) //third horizontal line 6,7,8
							{
								return field [6];
							}			
				else if (field[0]==field[3] && field[0]==field[6] && field[0]!=0) //first vertical line 0,3,6
							{
								return field [0];
							}
				else if (field[1]==field[4] && field[1]==field[7] && field[1]!=0) //second  vertical line 1,4,7
							{
								return field [1];
							}		
				else if (field[2]==field[5] && field[2]==field[8] && field[2]!=0) //third vertical line 2,5,8
							{
								return field [2];
							}
				else if (field[0]==field[4] && field[0]==field[8] && field[0]!=0) //first diagonal line 0,4,8
							{
								return field [0];
							}		
				else if (field[2]==field[4] && field[2]==field[6] && field[2]!=0) //second diagonal line 2,4,6
							{
								return field [2];
							}	
					return 0;
				}
	void tablePrint (int field[])
	{
		if (field[0]==1) System.out.print("| X |");			
			else if (field[0]==2) System.out.print("| O |");
			else if (field[0]==0) System.out.print("|   |");
		
		if (field[1]==1) System.out.print("| X |");			
			else if (field[1]==2) System.out.print("| O |");
			else if (field[1]==0) System.out.print("|   |");		
			
		if (field[2]==1) System.out.print("| X |");			
			else if (field[2]==2) System.out.print("| O |");
			else if (field[2]==0) System.out.print("|   |");
			System.out.print("\n---------------\n");
		if (field[3]==1) System.out.print("| X |");			
			else if (field[3]==2) System.out.print("| O |");
			else if (field[3]==0) System.out.print("|   |");
		
		if (field[4]==1) System.out.print("| X |");			
			else if (field[4]==2) System.out.print("| O |");
			else if (field[4]==0) System.out.print("|   |");		
			
		if (field[5]==1) System.out.print("| X |");			
			else if (field[5]==2) System.out.print("| O |");
			else if (field[5]==0) System.out.print("|   |");
			System.out.print("\n---------------\n");
		if (field[6]==1) System.out.print("| X |");			
			else if (field[6]==2) System.out.print("| O |");
			else if (field[6]==0) System.out.print("|   |");
		
		if (field[7]==1) System.out.print("| X |");			
			else if (field[7]==2) System.out.print("| O |");
			else if (field[7]==0) System.out.print("|   |");		
			
		if (field[8]==1) System.out.print("| X |");			
			else if (field[8]==2) System.out.print("| O |");
			else if (field[8]==0) System.out.print("|   |");
			System.out.print("\n---------------\n");
						
	}
	void play () {
		Scanner scanner = new Scanner(System.in);
		for (int j=0; j<9; j++) 
			{
				field [j]=0;	
			}
		System.out.print("Enter the first player's name: \n");
		player1 = scanner.nextLine();
		System.out.print("Enter the second player's name: \n");
		player2 = scanner.nextLine();
		
		while (Game==1) 
			{
				System.out.print(" 1 | 2 | 3 \n");
				System.out.print("-----------\n");
				System.out.print(" 4 | 5 | 6 \n");
				System.out.print("-----------\n");
				System.out.print(" 7 | 8 | 9 \n");
		
		while  (check) {
      	System.out.println(player1 + ", please, enter the number from 1 to 9.");
		try {	
				Answer = scanner.nextInt(10);
				i=Answer-1; 
			if (field[i]!=0) 
				{
					System.out.println("This field is already taken. Choose another one, please.");
					check=true;					
				}					
			else 
				{
					check=false;
					field [i]=1;
					counter++;
					winWhatever=winningCondition (field);
					
					if (winWhatever==1 || winWhatever==2) 
						{
							System.out.print("We have a Winner!\n");
							if (winWhatever==1)
								{				
									System.out.println("Player " + player1 +" is the WINNER. Congratulations!!!");
								}
						
							else 
								{
									System.out.println("Player " + player2 + " is the WINNER. Congratulations!!!");
								}
							Game=0;
						}

				}
			}
			catch (/*InputMismatchException*/Exception e) 
					{
						System.out.print("Not a numeric value or outside of the range.\n");
						scanner.next();
					}
		
		}    		
		tablePrint (field);
		
		if (counter==9) 
		 		{
		 			Game=0;
		 			System.out.println("You both suck!");
		 			counter=10;
		 		}
		if (Game != 0)	check=true;
		 
		while  (check) {
	      	System.out.print(player2 + ", please, enter the number from 1 to 9.");
			try {	
					Answer = scanner.nextInt(9);
					i=Answer-1; 
				if (field[i]!=0) 
					{
						System.out.print("This field is already taken. Choose another one, please.\n");
						check=true;					
					}					
				else 
					{
						check=false;
						field [i]=2;
						counter++;
						winWhatever=winningCondition (field);
						
						if (winWhatever==1 || winWhatever==2) 
							{
								System.out.print("We have a Winner!\n");
								if (winWhatever==1)
									{				
										System.out.println("Player " + player1 +" is the WINNER. Congratulations!!!");
									}
							
								else 
									{
										System.out.println("Player " + player2 + " is the WINNER. Congratulations!!!");
									}
							Game=0;
							}
					}
			}
				catch (/*InputMismatchException*/Exception e) 
						{
							System.out.print("Not a numeric value or outside of the range.\n");
							scanner.next();
						}
			}    		
			tablePrint (field);
				
		if (Game != 0) 
		 	{
		 		check=true;	
		 	}
		}//while (game)
	}//play
}//class


