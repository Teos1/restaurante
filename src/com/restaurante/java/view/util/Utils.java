/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.java.view.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 *
 * @author teo
 */
public class Utils {
    public static Stage currentStage(ActionEvent event){
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }
}
