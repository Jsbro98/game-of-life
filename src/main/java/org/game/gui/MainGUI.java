package org.game.gui;

import org.game.logic.GameGrid;

import javax.swing.*;
import java.awt.*;

public class MainGUI {
  private JFrame main;
  private GameGrid board;
  private final Dimension windowDim;

  public MainGUI() {
    this.windowDim = new Dimension(700, 600);
    initGameGrid();
    initWindow();
  }

  private void initWindow() {
    this.main = new JFrame("Game Of Life");
    this.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.main.setSize(this.windowDim);
    this.main.setVisible(true);
    this.main.setResizable(false);
    this.main.getContentPane().add(this.board, BorderLayout.CENTER);
  }

  public void initGameGrid() {
    this.board = new GameGrid(this.windowDim);
  }

  public GameGrid getBoard() {
    return this.board;
  }
}
