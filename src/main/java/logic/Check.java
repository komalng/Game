package main.java.logic;

public class Check {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
        board.printBoard();
        board.update(1,2,"x");
        System.out.println();
        board.printBoard();


    }
}
