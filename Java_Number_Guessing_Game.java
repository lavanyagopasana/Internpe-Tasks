import java.util.*;
class GuessAnumber{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes")){
            int computernumber,guess=-1,tries=0;
            Random rand=new Random();
            computernumber=rand.nextInt(100);
            while(guess!=computernumber){
                System.out.println("Guess a number between 1 and 100");
                guess=sc.nextInt();
                tries++;
                if(guess==computernumber){
                System.out.println("Awesome! u guessed it right in just "+tries+" guesses.The number was "+computernumber);
                System.out.println("Would u like to play again , (yes|no):");
                play=sc.next().toLowerCase();
                }
                else if(guess>computernumber){
                System.out.println("too high,try again");
                }
                else{
                System.out.println("too low,try again");
                }
            }
        }
      sc.close();
    }
}
