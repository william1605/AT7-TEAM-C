/*
 * @(#)PanelSearchAdvanced.java
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

import com.toedter.calendar.JDateChooser;

import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;


/**
 * Class that creates the advanced search panel.
 *
 * @author William Claros Revollo - AT - [07]
 * @version 1.0.
 */
public class PanelSearchAdvanced extends JPanel {

    private JLabel labelTypeFormat;
    private Vector<String> typeFormat;
    private JComboBox<String> type;
    private Vector<String> typeFile;
    private JComboBox<String> file;

    private JLabel labelFileSize;
    private Vector<String> typeCount;
    private JComboBox<String> count;
    private JSpinner sizeFile;
    private Vector<String> typeSize;
    private JComboBox<String> size;

    private JLabel labelHiddenFile;
    private JCheckBox hiddenFile;

    private JLabel labelOwner;
    private JTextField owner;

    private JLabel labelDateCreated;
    private JTextField dateCreated;

    private JLabel labelDateModificated;
    private JTextField dateModificated;

    private JLabel labelIntervalDate;
    private JTextField intervalDateInicio;
    private JTextField intervalDateEnd;

    private JLabel labelIntervalSymbol;
    private JLabel labelPanelAdvanced;

    private JDateChooser dateChoserCreateIni;
    private JDateChooser dateChooserCreateEnd;
    private JDateChooser dateChooserModifyIni;
    private JDateChooser dateChooserModifyEnd;
    private JDateChooser dateChooserAccessedIni;
    private JDateChooser dateChooserAccessedEnd;

    /**
     * Method that creates the advanced search panel.
     */
    public PanelSearchAdvanced() {

        settingPanelAdvanced();
        initComponent();
    }

    /**
     * Method that contains the Advanced Panel settings.
     */
    public void settingPanelAdvanced() {
        setLayout(null);
        setBorder(BorderFactory.createRaisedBevelBorder());
    }

    /**
     * Method that contains the components of the Advanced Panel.
     */
    public void initComponent() {
        labelPanelAdvanced = new JLabel();
        labelPanelAdvanced.setText("SEARCH ADVANCED");
        labelPanelAdvanced.setBounds(30, 10, 130, 30);
        add(labelPanelAdvanced);
        labelTypeFormat = new JLabel();
        labelTypeFormat.setText("File Format");
        labelTypeFormat.setBounds(110, 50, 80, 30);
        add(labelTypeFormat);
        typeFormat = new Vector<String>();
        typeFormat.add("Multimedia");
        typeFormat.add("Images");
        typeFormat.add("Documents");
        typeFormat.add("Executable");
        type = new JComboBox<String>(typeFormat);
        type.setBounds(50, 80, 90, 30);
        add(type);
        labelFileSize = new JLabel();
        labelFileSize.setText("File Size");
        labelFileSize.setBounds(355, 50, 80, 30);
        add(labelFileSize);
        typeFile = new Vector<String>();
        typeFile.add("All");
        typeFile.add(".mp3");
        typeFile.add(".m4a");
        typeFile.add(".wma");
        typeFile.add("acc");
        file = new JComboBox<String>(typeFile);
        file.setBounds(150, 80, 90, 30);
        add(file);
        typeCount = new Vector<String>();
        typeCount.add(" < ");
        typeCount.add(" > ");
        typeCount.add(" = ");
        count = new JComboBox<String>(typeCount);
        count.setBounds(280, 80, 50, 30);
        add(count);
        sizeFile = new JSpinner();
        sizeFile.setBounds(340, 80, 70, 30);
        add(sizeFile);
        typeSize = new Vector<String>();
        typeSize.add("Byte");
        typeSize.add("KByte");
        typeSize.add("MByte");
        typeSize.add("GByte");
        size = new JComboBox<String>(typeSize);
        size.setBounds(420, 80, 70, 30);
        add(size);
        labelHiddenFile = new JLabel();
        labelHiddenFile.setText("Hidden");
        labelHiddenFile.setBounds(520, 50, 50, 30);
        add(labelHiddenFile);
        hiddenFile = new JCheckBox();
        hiddenFile.setBounds(530, 80, 30, 30);
        add(hiddenFile);
        labelOwner = new JLabel();
        labelOwner.setText("Owner");
        labelOwner.setBounds(608, 50, 80, 30);
        add(labelOwner);
        owner = new JTextField();
        owner.setBounds(580, 80, 100, 30);
        add(owner);
        labelDateCreated = new JLabel();
        labelDateCreated.setText("Date Created");
        labelDateCreated.setBounds(120, 150, 110, 30);
        add(labelDateCreated);
        dateChoserCreateIni = new JDateChooser("MM/dd/yyyy","##/##/####",'_');
        dateChoserCreateIni.setBounds(60,190,90,30);
        add(dateChoserCreateIni);
        dateChooserCreateEnd = new JDateChooser("MM/dd/yyyy","##/##/####",'_');
        dateChooserCreateEnd.setBounds(160,190,90,30);
        add(dateChooserCreateEnd);
        labelDateModificated = new JLabel();
        labelDateModificated.setText("Date Modificated");
        labelDateModificated.setBounds(300, 150, 100, 30);
        add(labelDateModificated);
        dateChooserModifyIni = new JDateChooser("MM/dd/yyyy","##/##/####",'_');
        dateChooserModifyIni.setBounds(270,190,90,30);
        add(dateChooserModifyIni);
        dateChooserModifyEnd = new JDateChooser("MM/dd/yyyy","##/##/####",'_');
        dateChooserModifyEnd.setBounds(370,190,90,30);
        add(dateChooserModifyEnd);
        labelIntervalDate = new JLabel();
        labelIntervalDate.setText("Accessed Date");
        labelIntervalDate.setBounds(540, 150, 100, 30);
        add(labelIntervalDate);
        dateChooserAccessedIni = new JDateChooser("MM/dd/yyyy","##/##/####",'_');
        dateChooserAccessedIni.setBounds(480,190,90,30);
        add(dateChooserAccessedIni);
        labelIntervalSymbol = new JLabel();
        labelIntervalSymbol.setText(" - ");
        labelIntervalSymbol.setBounds(514, 196, 10, 10);
        add(labelIntervalSymbol);
        dateChooserAccessedEnd = new JDateChooser("MM/dd/yyyy","##/##/####",'_');
        dateChooserAccessedEnd.setBounds(580,190,90,30);
        add(dateChooserAccessedEnd);
    }

    /**
     * @return Size file of file will search.
     */
    public JSpinner getSizeFile() {
        return sizeFile;
    }

    /**
     * @return a hidden file if true of file will search.
     */
    public JCheckBox getHiddenFile() {
        return hiddenFile;
    }

    /**
     * @return a owner file will search.
     */
    public JTextField getOwner() {
        return owner;
    }
}
