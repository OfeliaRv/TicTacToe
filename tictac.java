package kurs;
import java.util.Scanner;

public class tictac {
        private static Scanner scan;

        public static void main(String[] args) {
                scan = new Scanner(System.in);
                Game game = new Game();

            System.out.println("TICTACTOE GAME");
            System.out.println("");
                System.out.println("Player 1: ");
                String p1 = scan.nextLine();
                System.out.println("Player 2: ");
                String p2 = scan.nextLine();

                System.out.println("INSTRUCTIONS");
                System.out.println("Coordinates:");
                System.out.println("(0,0)(0,1)(0,2)");
                System.out.println("(1,0)(1,1)(1,2)");
                System.out.println("(2,0)(2,1)(2,2)");
                System.out.println("");

// for(int i=0;i<3;i++) {
// for(int j=0;j<3;j++) {
// System.out.print("*");
// }
// System.out.println("");
// }
                game.process1(p1);
                game.printBoard();
                game.process2(p2);
                game.printBoard();
                game.process1(p1);
                game.printBoard();
                game.process2(p2);
                game.printBoard();
                game.process1(p1);
                game.printBoard();
                for(int c=1;c<5;c++){
                        if(game.checkX()==true){
                                System.out.println(p1+" WINS!");
                                break;
                        }
                game.process2(p2);
                game.printBoard();
                        if(game.checkO()==true){
                                System.out.println(p2+" WINS!");
                                break;
                        }
                game.process1(p1);
                game.printBoard();
                        if(game.checkX()==true){
                                System.out.println(p1+" WINS!");
                                break;
                        }
                }
}

static class Game{
        char[][] board = new char[3][3];
        Scanner sc = new Scanner(System.in);

        public void printBoard(){
                for(int i=0;i<3;i++) {
                        for(int j=0;j<3;j++) {
                                System.out.print(board[i][j]);
                        }
                        System.out.println("");
                }
        }

        public void process1(String p1){
                System.out.println(p1 +", your move: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                        board[a][b]='x';
        }

        public void process2(String p2){
                System.out.println(p2 +", your move: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                        board[a][b]='o';
        }

        public boolean checkX(){
                if(board[0][0]=='x' && board[1][1]=='x' && board[2][2]=='x' || board[0][2]=='x' && board[1][1]=='x' && board[2][0]=='x' || board[0][1]=='x' && board[1][1]=='x' && board[2][1]=='x' || board[1][0]=='x' && board[1][1]=='x' && board[1][2]=='x') {
                return true;
                }
                else{
                        return false;
                }
        }

        public boolean checkO(){
                if(board[0][0]=='o' && board[1][1]=='o' && board[2][2]=='o' || board[0][2]=='o' && board[1][1]=='o' && board[2][0]=='o' || board[0][1]=='o' && board[1][1]=='o' && board[2][1]=='o' || board[1][0]=='o' && board[1][1]=='o' && board[1][2]=='o') {
                return true;
                }
                else{
                        return false;
                }
        }
}
}