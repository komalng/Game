import java.util.Scanner;

public class TicTacTeo {
    public static void main(String[] args) {
        String[][] board = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        printBoard(board);
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < board[0].length * board[0].length) {
            System.out.println(getTurn(i));
            System.out.println("Enter Numbers");
            int inputForRowNumber = scanner.nextInt();
            int inputForRowIndex = scanner.nextInt();
            getXOrO(i, board, inputForRowNumber, inputForRowIndex);
            printBoard(board);
            checkWinner(getXOrO(i, board, inputForRowNumber, inputForRowIndex),board,i);
            i = i + 1;
        }
    }

    public static String getTurn(int a) {
        if (a % 2 == 0) {
            return "x Turn";
        }
        return "o Turn";
    }

    public static String getXOrO(int j, String[][] board, int inputForRowNumber, int inputForRowIndex) {
        if (j % 2 == 0) {
            return board[inputForRowNumber - 1][inputForRowIndex - 1] = " x";
        }
        return board[inputForRowNumber - 1][inputForRowIndex - 1] = " o";


    }

    public static void checkWinner(String winner, String [][] board,int count){
        if(board[0][0].equals(winner) && board[0][1].equals(winner) && board[0][2].equals(winner)){
            System.out.println("winner"+winner);
        }
        else if(board[1][0].equals(winner) && board[1][1].equals(winner) && board[1][2].equals(winner)) {
            System.out.println("winner"+winner);
        }
        else if(board[2][0].equals(winner) && board[2][1].equals(winner) && board[2][2].equals(winner)) {
            System.out.println("winner"+winner);
        }
        else if(board[0][0].equals(winner) && board[1][1].equals(winner) && board[2][2].equals(winner)) {
            System.out.println("winner"+winner);
        }

        else if(board[0][2].equals(winner) && board[1][1].equals(winner) && board[2][0].equals(winner)) {
            System.out.println("winner"+winner);
        }
        else if(board[0][0].equals(winner) && board[1][0].equals(winner) && board[2][0].equals(winner)) {
            System.out.println("winner"+winner);
        }
        else if(board[0][1].equals(winner) && board[1][1].equals(winner) && board[2][1].equals(winner)) {
            System.out.println("winner"+winner);
        }
        else if(board[0][2].equals(winner) && board[1][2].equals(winner) && board[2][2].equals(winner)) {
            System.out.println("winner"+winner);
        }
        else if(count == board[0].length*board[0].length-1){
            System.out.println("Draw");
        }

        }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print(board[i][a]);
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }
}