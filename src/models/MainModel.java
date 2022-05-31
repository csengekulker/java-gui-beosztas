/*
* File: MainModel.java
* Author: Balogh Csenge
* Copyright: 2021, Balogh Csenge
* Group: Szoft_I-N
* Date: 2022-05-31
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Position[] positionArray = {
        new Position(1, "Igazgató"),
        new Position(2, "Projektvezető"),
        new Position(3, "Könyvelő"),
        new Position(4, "HR Manager"),
        new Position(5, "Informatikai vezető"),
        new Position(6, "Logisztikai asszisztens"),
        new Position(7, "Irodavezető"),
        new Position(8, "Szoftvermérnök"),
        new Position(9, "Szoftverfejlesztő"),
        new Position(10, "Takarító"),
    };

    public Vector<Position> positionVector = new Vector<>(Arrays.asList(positionArray));
}
