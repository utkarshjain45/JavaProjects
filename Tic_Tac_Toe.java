import java.util.Scanner;

public class Tic_Tac_Toe {

    public static void main(String[] args) {
        char[][] boardgame = new char[3][3];
        for (int i = 0; i < boardgame.length; i++) {
            for (int j = 0; j < boardgame[i].length; j++) {
                boardgame[i][j] = ' ';
            }
        }
        
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        boolean gameOver = false;
        
        while(!gameOver){
            printboard(boardgame);
            System.out.println("Player " + player + " enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(boardgame[row][col] == ' '){
                boardgame[row][col] = player;
                gameOver = ifwon(boardgame, player);
                if (gameOver) {
                    System.out.println("Player " + player + " won!!");
                }
                else{
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            else{
                System.out.println("Invalid Position");
            }
        }
        printboard(boardgame);
        sc.close();
    }

    public static void printboard(char[][] boardgame){
        for (int i = 0; i < boardgame.length; i++) {
            for (int j = 0; j < boardgame[i].length; j++) {
                System.out.print(boardgame[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean ifwon(char[][] boardgame, char player){
        for (int row = 0; row < boardgame.length; row++) {
            if (boardgame[row][0] == player && boardgame[row][1] == player && boardgame[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < boardgame[0].length; col++) {
            if (boardgame[0][col] == player && boardgame[1][col] == player && boardgame[2][col] == player) {
                return true;
            }
        }
        if (boardgame[0][0] == player && boardgame[1][1] == player && boardgame[2][2] == player) {
            return true;
        }
        if (boardgame[0][2] == player && boardgame[1][1] == player && boardgame[2][0] == player) {
            return true;
        }
        return false;
    }
}
