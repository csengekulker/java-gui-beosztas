package controllers;

import models.MainModel;
import models.Position;
import views.MainFrame;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;

  DefaultComboBoxModel<String> defaultComboBoxModel;
  JComboBox<String> positionComboBox;

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
  }
}