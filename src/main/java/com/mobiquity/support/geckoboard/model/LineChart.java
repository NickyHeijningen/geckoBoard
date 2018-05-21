package com.mobiquity.support.geckoboard.model;

import java.util.ArrayList;

public class LineChart {
    
    private X_Axis x_axis;
    private ArrayList<Series> series;

    public LineChart(){}


    public LineChart(X_Axis x_axis, ArrayList<Series> series){
        
        this.x_axis = x_axis;
        this.series = series;
    }

    public X_Axis getX_axis() {
        return x_axis;
    }

    public void setX_axis(X_Axis x_axis) {
        this.x_axis = x_axis;
    }

    public ArrayList<Series> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Series> series) {
        this.series = series;
    }
}

