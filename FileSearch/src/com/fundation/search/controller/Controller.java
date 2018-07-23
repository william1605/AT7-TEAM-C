/*
 * @(#)Controller.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package com.fundation.search.controller;

import com.fundation.search.model.Model;
import com.fundation.search.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Controller class where the communication will be made with the view.
 *
 * @author William Claros Revollo - AT - [07]
 * @version 1.0.
 */
public class Controller {

    private View view;
    private Model model;

    /**
     * A constructor of the Controller class that receives 2 parameters that are a ModelSearch object and an object
     * in the SearchFrame view.
     *
     * @param search It is an object of the SearchFrame class.
     * @param model  It is an object of the ModelSearch class.
     */

    public void init() {
        this.view = new View();
        this.model = new Model();
        view.getPanelGeneral().getSearchPanel().getPanelSearchBasic().getSearchButton().addActionListener(e -> getData());
    }

    /**
     * Method that is in charge of making the data capture and the setting of the View. And also the communication
     * with the Model.
     */
    private void getData() {
        String nameFile = view.getPanelGeneral().getSearchPanel().getPanelSearchBasic().getNameFile().getText();
        String namePath = view.getPanelGeneral().getSearchPanel().getPanelSearchBasic().getPath().getText();
        long fileSize = Long.parseLong(view.getPanelGeneral().getSearchPanel().getPanelSearchAdvanced().getSizeFile().getValue().toString());
        String sizeFormat = view.getPanelGeneral().getSearchPanel().getPanelSearchAdvanced().getSizeType().getSelectedItem().toString();
        boolean fileHidden = view.getPanelGeneral().getSearchPanel().getPanelSearchAdvanced().getHiddenFile().isSelected();

    }
}
