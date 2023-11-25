package at.ac.fhcampuswien.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    char[][] gameBoard;
    Player p1;
    Player p2;
    private static final int ROWS = 3;
    private static final int COLS = 3;

    public TicTacToe(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
        this.gameBoard = new char[][]{{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    }

    public boolean placeTic(Player p, int row, int col){
        if(this.gameBoard[row][col] != this.p1.getSymbol() && this.gameBoard[row][col] != this.p2.getSymbol()){
            this.gameBoard[row][col] = p.getSymbol();
            return true;
        }
        return false;
    }
    private void prettyPrintGameBoard(){
        char[][] g = this.gameBoard;
        System.out.println(g[0][0]+" | "+g[0][1]+" | "+g[0][2] + " ");
        System.out.println("--+---+--");
        System.out.println(g[1][0]+" | "+g[1][1]+" | "+g[1][2] + " ");
        System.out.println("--+---+--");
        System.out.println(g[2][0]+" | "+g[2][1]+" | "+g[2][2] + " ");
    }
    public boolean checkIfWon(Player p){
        char[][] g = this.gameBoard;
        char s = p.getSymbol();
        for(int row=0;row<ROWS; row++){
            if(g[row][0]==s && g[row][0]==g[row][1] && g[row][1]==g[row][2]){ return true; }
        }
        return g[1][1] == s && ((g[1][1] == g[0][0] && g[2][2] == g[0][0]) || (g[2][0] == g[1][1] && g[1][1] == g[0][2]));
    }

    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<9; i+=2){
            this.prettyPrintGameBoard();
            System.out.println();
            this.p1.makeMove(this, scanner);
            if(checkIfWon(p1)){
                System.out.println(p1.getName() + " has won the game!");
                break;
            }
            if(i==8) {
                System.out.println("Nobody wins!");
                this.prettyPrintGameBoard();
                break;
            }
            this.prettyPrintGameBoard();
            System.out.println();
            this.p2.makeMove(this, scanner);
            if(checkIfWon(p2)){
                System.out.println(p2.getName() + " has won the game!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Player p1 = new Player('X', "1");
        Player p2 = new Player('O', "2");
        TicTacToe ttt = new TicTacToe(p1, p2);
        ttt.playGame();
        /*
        * Create Instances of Class Player like:
        * Player p1 = new Player(....);
        * Player p2 = new Player(....);
        * Create an Instance of TicTacToe itself:
        * TicTacToe ttt = new TicTacToe(....);
        * Start the game via the reference (ttt)
        * */

    }
}
