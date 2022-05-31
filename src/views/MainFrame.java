/*
* File: MainFrame.java
* Author: Balogh Csenge
* Copyright: 2021, Balogh Csenge
* Group: Szoft_I-N
* Date: 2022-05-31
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
  JPanel mainPanel;

  public DefaultComboBoxModel<String> defaultComboBoxModel;
  public JComboBox<String> positionComboBox;

  public DefaultListModel<String> defaultListModel;
  public JList<String> positionList;
  JScrollPane scrollPane;

  public MainFrame() {

    setComponents();
    setMainPanel();
    setFrame();
  }

  private void setComponents() {
    this.defaultComboBoxModel = new DefaultComboBoxModel<>();
    this.positionComboBox = new JComboBox<>(defaultComboBoxModel);

    defaultComboBoxModel.addElement("Válasszon beosztást...");

    this.defaultListModel = new DefaultListModel<>();
    this.positionList = new JList<>(defaultListModel);
    this.scrollPane = new JScrollPane(positionList);
  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BorderLayout());

    this.mainPanel.add(positionComboBox, BorderLayout.NORTH);
    this.mainPanel.add(scrollPane, BorderLayout.CENTER);
    this.add(this.mainPanel);
  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setTitle("Balogh Csenge | Szoft_I_N | 2022.05.31");
    this.setVisible(true);

    this.setLayout(new FlowLayout());
  }
}
