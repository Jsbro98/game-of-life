package org.game.gui;

import javax.swing.*;
import java.awt.*;

public class MainGUI {
  private JFrame main;

  public MainGUI() {
    initWindow();
    main.add(new JLabel("Testing"));
  }

  private void initWindow() {
    this.main = new JFrame("Game Of Life");
    this.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.main.setSize(700, 600);
    this.main.setLayout(new FlowLayout());
    this.main.setVisible(true);
  }
}
