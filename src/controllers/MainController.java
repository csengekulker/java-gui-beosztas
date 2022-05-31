package controllers;

import models.MainModel;
import models.Position;
import views.MainFrame;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;

  DefaultComboBoxModel<String> defaultComboBoxModel;
  JComboBox<String> positionComboBox;

  DefaultListModel<String> defaultListModel;

  Vector<Position> positionVector;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();

    positionComboBox = this.mainFrame.positionComboBox;
    defaultComboBoxModel = this.mainFrame.defaultComboBoxModel;

    positionVector = this.mainModel.positionVector;

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