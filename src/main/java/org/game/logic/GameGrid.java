package org.game.logic;

import javax.swing.*;
import java.awt.*;

public class GameGrid extends JPanel {
  private final boolean[][] grid;

  public GameGrid(Dimension dim) {
    this.grid = new boolean[dim.width][dim.height];
    this.setPreferredSize(dim);
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
