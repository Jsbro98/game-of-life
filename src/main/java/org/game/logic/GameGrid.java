package org.game.logic;

public class GameGrid {
  private final boolean[][] grid;

  public GameGrid(int width, int height) {
    this.grid = new boolean[height][width];
  }

  public Row getRow(int row) {
    return new Row(this.grid[row]);
  }

  public static class Row {
    private final boolean[] row;

    // Only GameGrid gets instance access
    private Row(boolean[] init) {
      this.row = init;
    }

    public boolean getCell(int index) {
      return row[index];
    }

    public void setCell(int index, boolean newValue) {
      this.row[index] = newValue;
    }
  }
}
