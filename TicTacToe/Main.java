//package TicTacToe;

public class Main{
    public static void main(String[] args) {
        Player A = new Player();
        A.setName("Sourabh");
        A.setSymbol('0');

        Player B = new Player();
        B.setName("Monu");
        B.setSymbol('X');


        Player [] players = {A, B};

        Board board = new Board(3);
        Game game = new Game(players, board);

        game.play();
    }
}