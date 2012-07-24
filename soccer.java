import java.util.Scanner;

public class soccer {
	

}
class soccerTeam  {
					String name;
					int goalsScored ;
					int goalsReceived ;
					int pts ;
					boolean played;
					int [] goalsScoredPerGame = new int [9];
				};
class Week
			{
				String name;
				int [] host = new int [2];
				int [] guest = new int [2];
			};
public static void main(String[] args) {
				soccer season = new soccer();
				
			}

boolean InputGameResults(int week,soccerTeam *teamA,soccerTeam *teamB) {
																			Scanner scanner = new Scanner(System.in);
																			int goalA,goalB;
																			cout<<teamA->name<<"\n";
																			cin>>goalA;	

	if(!cin.good())    		
	{
		cout << "Not a numeric value.\n";
		cin.clear();
		cin.ignore(numeric_limits<int>::max(), '\n');
		return true;
	}  
	teamA->goalsScoredPerGame[week]=goalA;	
		
cout<<teamB->name<<"\n";	
cin>>goalB;

	if(!cin.good())     	
	{
		cout << "Not a numeric value.\n";
		cin.clear();
		cin.ignore(numeric_limits<int>::max(), '\n');
		return true;
	}  
	teamB->goalsScoredPerGame[week]=goalB;
if (goalA>=0 && goalA<=20 && goalB>=0 && goalB<=20)
{
	
	if (goalA>goalB) 
	{
		teamA->goalsScored=teamA->goalsScored+goalA, teamA->goalsReceived=teamA->goalsReceived+goalB, teamA->pts+=2;
		teamB->goalsScored=teamB->goalsScored+goalB, teamB->goalsReceived=teamB->goalsReceived+goalA, teamB->pts+=0;
	}
	else if(goalA==goalB) 
	{
		teamA->goalsScored=teamA->goalsScored+goalA, teamA->goalsReceived=teamA->goalsReceived+goalB, teamA->pts=teamA->pts+1;
		teamB->goalsScored=teamB->goalsScored+goalB, teamB->goalsReceived=teamB->goalsReceived+goalA, teamB->pts=teamB->pts+1;
	}
	else
	{
		teamA->goalsScored=teamA->goalsScored+goalA, teamA->goalsReceived=teamA->goalsReceived+goalB, teamA->pts+=0;
		teamB->goalsScored=teamB->goalsScored+goalB, teamB->goalsReceived=teamB->goalsReceived+goalA, teamB->pts+=2;
	}	
	return false;		
}	
else
return true;

}




int main()
{


struct soccerTeam team[4];
struct Week TournamentWeek[6];

team[0].name="Arsenal";
team[1].name="Chelsea";
team[2].name="Liverpool";
team[3].name="Manchester United";

TournamentWeek[0].name = "Week One";
TournamentWeek[1].name = "Week Two";
TournamentWeek[2].name = "Week Three";
TournamentWeek[3].name = "Week Four";
TournamentWeek[4].name = "Week Five";
TournamentWeek[5].name = "Week Six";

TournamentWeek[0].host  [0]=1;
TournamentWeek[0].guest [0]=2;
TournamentWeek[0].host  [1]=3;
TournamentWeek[0].guest [1]=4;

TournamentWeek[1].host  [0]=2;
TournamentWeek[1].guest [0]=3;
TournamentWeek[1].host  [1]=4;
TournamentWeek[1].guest [1]=1;

TournamentWeek[2].host  [0]=1;
TournamentWeek[2].guest [0]=3;
TournamentWeek[2].host  [1]=4;
TournamentWeek[2].guest [1]=2;

TournamentWeek[3].host  [0]=2;
TournamentWeek[3].guest [0]=1;
TournamentWeek[3].host  [1]=4;
TournamentWeek[3].guest [1]=3;

TournamentWeek[4].host  [0]=3;
TournamentWeek[4].guest [0]=2;
TournamentWeek[4].host  [1]=1;
TournamentWeek[4].guest [1]=4;

TournamentWeek[5].host  [0]=3;
TournamentWeek[5].guest [0]=1;
TournamentWeek[5].host  [1]=2;
TournamentWeek[5].guest [1]=4;	

for (int i = 0;i < 4;i++)
{
	team[i].goalsScored = 0;
	team[i].goalsReceived = 0;
	team[i].pts = 0;
	team[i].played = false;		
}
bool notExit = true;
int c1,c2;

for (int i = 0; i < 3; i++)
{
cout<<TournamentWeek[i].name + "\n";
for (int j=0; j<2; j++)
{
	c1=TournamentWeek[i].host[j]-1;
	c2=TournamentWeek[i].guest[j]-1;	
	notExit=true;			
	while (notExit)
		{
			notExit = InputGameResults(i,&team[c1],&team[c2]);
		}
}
}	
for (int i = 0; i < 3; i++)
{
cout<<TournamentWeek[i].name + "\n"+"Results: \n";
for (int j=0; j<2; j++)
{
	c1=TournamentWeek[i].host[j]-1;
	c2=TournamentWeek[i].guest[j]-1;	
	
	cout<<team[c1].name<<" - "<<team[c2].name<<'\n';
	cout<<team[c1].goalsScoredPerGame[i]<<" : "<<team[c2].goalsScoredPerGame[i]<<'\n';			
}

}



cout<<"Table: "<<" P "<<" GS/GA \n";
cout<<"---------"<<'\n';
for (int i = 0;i < 4;i++)
{
cout<< setw(25) << team[i].name<<" |"<<team[i].pts<<"|"<<team[i].goalsScored<<"/"<<team[i].goalsReceived<<'\n';
cout<<"---------"<<'\n';
}	

return 0;
}