import java.util.Random;

class Board
{
    private int rows, columns, mines;
    private Cell[][] grid;

    public Board(int rows, int columns, int mines)
    {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
        this.grid = new Cell[rows][columns];

        this.initializeBoard();
        this.placeMines();
        this.defineAdjacentMines();
    }

    private void initializeBoard()
    {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.grid[i][j] = new Cell();
            }
        }
    }

    private void placeMines()
    {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < this.mines) {
            int i = rand.nextInt(this.rows);
            int j = rand.nextInt(this.columns);

            if (!this.grid[i][j].isMine()) {
                this.grid[i][j].placeMine();
                placedMines++;
            }
        }
    }

    private void defineAdjacentMines()
    {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (!this.grid[i][j].isMine()) {
                    int mineCount = this.countAdjacentMines(i, j);
                    this.grid[i][j].setAdjacentMines(mineCount);
                }
            }
        }
    }

    private int countAdjacentMines(int row, int column)
    {
        int mineCount = 0;
        for (int k = -1; k <= 1; k++) {
            for (int n = -1; n <= 1; n++) {
                int r = row + k;
                int c = column + n;

                if (r >= 0 && r < this.rows && c >= 0 && c < this.columns && this.grid[r][c].isMine()) {
                    mineCount++;
                }
            }
        }

        return mineCount;
    }

    public boolean isMine(int row, int column)
    {
        return this.grid[row][column].isMine();
    }

    public void reveal(int row, int column)
    {
        this.grid[row][column].reveal();
    }

    public int pendingCells()
    {
        int pending = 0;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (!this.grid[i][j].isRevealed()) {
                    pending++;
                }
            }
        }

        return pending;
    }

    public void printBoard()
    {
        System.out.println();
        System.out.println("=== CURRENT BOARD ===");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.grid[i][j].isRevealed()) {
                    if (this.grid[i][j].isMine()) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" " + this.grid[i][j].getAdjacentMines() + " ");
                    }
                } else {
                    System.out.print(" ? ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    public void showBoard()
    {
        System.out.println();
        System.out.println("=== CURRENT BOARD ===");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.grid[i][j].isMine()) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" " + this.grid[i][j].getAdjacentMines() + " ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }
}