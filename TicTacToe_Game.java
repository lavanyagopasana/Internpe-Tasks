import java.util.*;
public class TicTacToe_Game {
    static String[] board;
    static String turn;
    static String checkwinner(){
        for(int i=0;i<8;i++){
            String line = null;
            switch(i){
                case 0:line = board[0] + board[1] + board[2];
                       break;
                case 1:line = board[3] + board[4] + board[5];
                       break;
                case 2:line = board[6] + board[7] + board[8];
                       break;
                case 3:line = board[0] + board[3] + board[6];
                       break;
                case 4:line = board[1] + board[4] + board[7];
                       break;
                case 5:line = board[2] + board[5] + board[8];
                       break;
                case 6:line = board[0] + board[4] + board[8];
                       break;
                case 7:line = board[2] + board[4] + board[6];
                       break;
            }
            if(line.equals("xxx")){
                return "x";
            }
            else if(line.equals("ooo")){
                return "o";
            }
        }
        for(int i=0;i<9;i++){
            if(Arrays.asList(board).contains(String.valueOf(i+1))){
                break;
            }
            else if(i==8){
                return "draw";
            }
        }
        System.out.println(turn+"'s turn. Enter a slot number - ");
        return null;
    }
    static void printboard(){
        System.out.println(".............");
        System.out.println("| "+board[0]+" | "+board[1]+ " | "+board[2]+" |");
        System.out.println(".............");
        System.out.println("| "+board[3]+" | "+board[4]+ " | "+board[5]+" |");
        System.out.println(".............");
        System.out.println("| "+board[6]+" | "+board[7]+ " | "+board[8]+" |");
        System.out.println(".............");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        board = new String[9];
        turn = "x";
        String winner=null;
        for(int i=0;i<9;i++){
            board[i]=String.valueOf(i+1);
        }
        System.out.println("Welcome to 3x3 TicTacToe Game---->");
        printboard();
        System.out.println("x will play first.Enter a slot number to place x - ");
        while(winner==null){
            int numinput;
            try{
                numinput=sc.nextInt();
                if(numinput<0 && numinput>9){
                    System.out.println("Invalid Input, please enter slot number again");
                    continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid Input, please enter slot number again");
                continue;
            }
            if(board[numinput - 1].equals(String.valueOf( numinput))){
                board[numinput - 1] = turn;
                if(turn.equals("x")){
                    turn="o";
                }
                else{
                    turn="x";
                }
                printboard();
                winner = checkwinner();
            } else {
                System.out.println("Slot already taken, enter another slot - ");
            }
        }
        if(winner.equalsIgnoreCase("draw")){
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! "+winner+"'s won thanks for playing.");
        }
        sc.close();
    }
}