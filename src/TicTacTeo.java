import java.util.Scanner;

public class TicTacTeo {
    public static void main(String[] args) {
        String [][] board = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
        System.out.println(printBoard(board));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int inputForRowNumber = scanner.nextInt();
        int inputForRowIndex = scanner.nextInt();
        System.out.println(board[inputForRowNumber][inputForRowIndex]);
    }

    public static String printBoard(String [][] board ){
        for(int i = 0;i < 3; i++){
            for(int a = 0; a < 3; a++){
                System.out.print(board[i][a]);
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("-------------");
        }
        return "";
    }
}