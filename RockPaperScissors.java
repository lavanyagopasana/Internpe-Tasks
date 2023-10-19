import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
		System.out.println("Lets play RockPaper&Scissors -> ");
		while(true){
			Scanner sc = new Scanner(System.in);
            String[] availablemoves={"Rock","Scissors","Paper"};
            String computermove = availablemoves[new Random().nextInt(availablemoves.length)];
            System.out.print("Computer has chosen its Move.");
            System.out.println("Now its ur turn, GoodLuck! ");
            String usermove;
            while(true){
                usermove=sc.nextLine();
				if(usermove.equals("Rock")|| usermove.equals("Paper")|| usermove.equals("Scissors")){
					break;
				}
            System.out.println("Invalid move ");
            System.out.println("please chose from the available moves 'Rock','Paper','Scissors' only.");
		    }
			if(usermove.equals(computermove)){
				System.out.println("Its a tie! Computer has chosen the same");
			}
			else if(usermove.equals("Rock")){
				if(computermove.equals("Paper")){
					System.out.println("Computer Won, Computer move was Paper.try again ");
                }
                else if(computermove.equals("Scissors")){
				    System.out.println("You won!.Computer move was Scissors. ");
				}
		    }
		    else if(usermove.equals("Paper")){
			    if(computermove.equals("Rock")){
				    System.out.println("You won!.Computer move was Rock ");
			    }
			    else if(computermove.equals("Scissors")){
				    System.out.println("Computer won! ");
				    System.out.println("Computer move was Scissors,try again");
				}
			}
            else if(usermove.equals("Scissors")){
			   if(computermove.equals("Rock")){
				    System.out.println("You won!, Computer move was Rock ");
				}
				else if(computermove.equals("Paper")){
					System.out.println("Computer won! Computer move was Paper,try again.");
                 }
            }
		    System.out.println("Do you wanna play again");
            System.out.println("(yes|no) : ");
            String playagain;
		    while(true){
                playagain=sc.nextLine();
                if(playagain.equals("yes")||playagain.equals("Yes")||playagain.equals("No")||playagain.equals("no")){
					System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
                    System.out.println();
                    break;
				}
			    System.out.println("Invalid input");
                sc.close();
			}
		    if(playagain.equals("no") || playagain.equals("No")){
                sc.close();
				break;
			}
        }
    }
}
