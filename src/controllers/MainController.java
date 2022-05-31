/*
* File: MainController.java
* Author: Balogh Csenge
* Copyright: 2021, Balogh Csenge
* Group: Szoft_I-N
* Date: 2022-05-31
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

package controllers;

import views.MainFrame;
import models.MainModel;

import java.util.Vector;
import models.Position;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;

  Vector<Position> positionVector;

  DefaultComboBoxModel<String> defaultComboBoxModel;
  JComboBox<String> positionComboBox;
  DefaultListModel<String> defaultListModel;

  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();

    positionVector = this.mainModel.positionVector;

    positionComboBox = this.mainFrame.positionComboBox;
    defaultComboBoxModel = this.mainFrame.defaultComboBoxModel;

    positionVector.forEach(position -> {
      defaultComboBoxModel.addElement(position.name);
    });

    this.setEvents();
  }

  private void handleComboBoxAction() {
    defaultListModel = this.mainFrame.defaultListModel;
    int index = positionComboBox.getSelectedIndex();
    int positionId = index;

    defaultListModel.clear();

    positionVector.forEach(position -> {
      if (positionId == position.id) {
        defaultListModel.addElement(position.name);
      }
    });
  }

  private void setEvents() {
    positionComboBox.addActionListener(action -> handleComboBoxAction());
  }
}
