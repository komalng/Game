import java.util.Scanner;

public class TicTacTeo {
    public static void main(String[] args) {
        String [][] board = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
       printBoard(board);
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while(i < board[0].length*board[0].length){
            if(i%2==0) {
                System.out.println("X Turn");
                System.out.println("Enter Numbers");
                int inputForRowNumber = scanner.nextInt();
                int inputForRowIndex = scanner.nextInt();
                board[inputForRowNumber - 1][inputForRowIndex - 1] = "0";
                printBoard(board);
            }
            else{
                System.out.println("Y Turn");
                System.out.println("Enter Numbers");
                int inputForRowNumber = scanner.nextInt();
                int inputForRowIndex = scanner.nextInt();
                board[inputForRowNumber - 1][inputForRowIndex - 1] = "0";
                printBoard(board);

            }
            i = i + 1;
        }
    }

    public static void printBoard(String [][] board ){
        for(int i = 0;i < 3; i++){
            for(int a = 0; a < 3; a++){
                System.out.print(board[i][a]);
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }
}