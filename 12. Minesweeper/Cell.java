class Cell
{
    private boolean isMine, isRevealed;
    private int adjacentMines;

    public Cell()
    {
        this.isMine = false;
        this.isRevealed = false;
        this.adjacentMines = 0;
    }

    public boolean isMine()
    {
        return this.isMine;
    }

    public void placeMine()
    {
        this.isMine = true;
    }

    public int getAdjacentMines()
    {
        return this.adjacentMines;
    }

    public void setAdjacentMines(int mines)
    {
        this.adjacentMines = mines;
    }

    public boolean isRevealed() {
        return this.isRevealed;
    }

    public void reveal() {
        this.isRevealed = true;
    }
}