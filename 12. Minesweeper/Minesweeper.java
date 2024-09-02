import java.util.Scanner;

class Minesweeper
{
    private Board board;
    private int mines;

    public Minesweeper(int rows, int columns, int mines)
    {
        this.board = new Board(rows, columns, mines);
        this.mines = mines;
    }

    public void play()
    {
        Scanner sc = new Scanner(System.in);
        boolean go = true;

        while (go) {
            this.board.printBoard();

            System.out.println("Ingrese la fila");
            int row = sc.nextInt();

            System.out.println("Ingrese la columna");
            int col = sc.nextInt();

            if (this.board.isMine(row, col)) {
                System.out.println("PERDISTE!!!");
                go = false;
            } else {
                this.board.reveal(row, col);
            }

            if (this.board.pendingCells() == this.mines) {
                System.out.println("GANASTE!!!");
                go = false;
            }

            System.out.println();
        }

        this.board.showBoard();
    }

    public static void main(String[] args)
    {
        Minesweeper game = new Minesweeper(2, 2, 1);
        game.play();
    }
}