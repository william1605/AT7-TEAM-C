/**
 * @(#)AssetMultimedia.java Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package com.fundation.search.model;

import java.util.Date;

/**
 * Class that creates the basic search panel.
 *
 * @author William Claros Revollo - AT - [07]
 * @version 1.0.
 */
public class AssetMultimedia extends Asset {
    private double duration;
    private double frameRate;
    private int heigth;
    private int width;
    private String aspectRatio;
    private String codec;
    /**
     * Builder of the Asset Multimedia class.
     *
     * @param path              is a patch of file search.
     * @param filename          name file search.
     * @param extension         extent of file.
     * @param owner             of file.
     * @param size              size of file.
     * @param hidden            true or false is hidden.
     * @param readOnly          is only file read.
     */
    public AssetMultimedia(String path, String filename, long size, String extension, String owner, boolean hidden, boolean readOnly,
                           String dateCreate, String dateModify, String dateAccessed, double duration, double frameRate, int heigth, int width,
                           String aspectRatio, String codec){
        super(path, filename, size, extension, owner, hidden, readOnly, dateCreate, dateModify, dateAccessed);
        this.duration = duration;
        this.frameRate = frameRate;
        this.heigth = heigth;
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.codec = codec;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(double frameRate) {
        this.frameRate = frameRate;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }
}
