package main.java.logic;

public class Board {
    String[][] board;

    public Board() {
        this.board = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print(board[i][a]);
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }

    public void update(int row, int column, String symbol) {
        board[row][column] = symbol;
    }
}
