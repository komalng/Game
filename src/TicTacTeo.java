public class TicTacTeo {
    public static void main(String[] args) {
        System.out.println(board());
    }

    public static String board(){
        for(int i = 0;i < 3; i++){
            for(int a = 0; a < 3; a++){
                System.out.print(" -"+" |");
            }
            System.out.println();
            System.out.println("-------------");
        }
        return "";
    }

}
