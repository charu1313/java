 import java.util.Scanner;
 
 class tiktaktoe { 
    public static void main(String[] args){
        char[][] board = new char[3][3];
        for(int row = 0; row < board.length; row++){
            for(int column = 0;column < board[row].length; column++ ){
                board[row][column] = ' ';
            }
        }
        char player = 'X';
        boolean gameover = false;
        Scanner scan = new Scanner(System.in); 
        while(!gameover){
            printboard(board);
            System.out.print( "player"+ player + "enter :");
            int row = scan.nextInt();
            int column = scan.nextInt();
            System.out.println();

            if(board[row][column] == ' '){
                board[row][column] = player;
                gameover = havewon( board ,  player);
                if(gameover){
                    System.out.println("player"+ player + "haswon");
                }else{
                    player =(player =='X')? 'O':'X';
                }

            }else{
                System.out.println("invalid move, Try again!");
            }
        }
        printboard(board); 

         }
         public static boolean havewon(char[][]board,char player){
            //row
             for(int row =0; row < board.length;row++){
                if(board[row][0] == player && board[row][1] == player && board[row][2] == player ){
                    return true;
                }
             }
                //column
            for(int column=0; column < board[0].length;column++){
                if(board[0][column] == player && board[1][column] == player && board[2][column] == player ){
                    return true;
                }

         }
         //diagonal
         if(board[0][0] == player && board[1][1] == player &&board[2][2] == player ){
            return true;
         }
         if(board[0][2] == player && board[1][1] == player &&board[2][0] == player ){
            return true;
         }
         return false;

         }
            
         public static  void printboard(char[][]board){
             for(int row =  0; row < board.length;row++){
               for(int column =0;column < board[row].length; column++){
               System.out.print( board[row][column] + "  |  ");
            }
             System.out.println();
             }
         }
}
         