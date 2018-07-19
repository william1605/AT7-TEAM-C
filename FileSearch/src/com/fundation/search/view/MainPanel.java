/*
 * @(#)MainPanel.java
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
package com.fundation.search.view;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * Class that creates intermediate panels.
 *
 * @author William Claros Revollo - AT - [07]
 * @version 1.0
 */
public class MainPanel extends JPanel {

    /**
     * Constructor that creates the primary panels that will contain the search
     * panels.
     *
     * @param dim Parameters that we use to initialize the highs of the secondary panels.
     */
    public MainPanel(Dimension dim) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel searchPanel = new PanelSearchBar();
        JPanel contentPanel = new PanelSearchResult();
        add(searchPanel);
        add(contentPanel);
    }
}