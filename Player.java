package at.ac.fhcampuswien.tictactoe;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;

    public Player(char s, String n){
        this.symbol = s;
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public char getSymbol() {
        return this.symbol;
    }
    public void makeMove(TicTacToe ttt, Scanner scanner){
        boolean loop = true;
        while(loop){
            System.out.print(this.getName() + " make your move (choose a number): ");
            int play = scanner.nextInt() - 1;
            if(0<=play && play<10){
                loop = !ttt.placeTic(this, play/3, play%3);
            }
        }
    }

}
