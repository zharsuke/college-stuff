package com.azhar.object;

public class Monitor extends Item {
    private String resolution;
    private int screenSize;

    public Monitor() {
        
    }

    public Monitor(String resolution, int screenSize) {
        this.resolution = resolution;
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void printMonitor() {
        print();
        System.out.println("Resolution: " + resolution);
        System.out.println("Screen Size: " + screenSize);
    }
}
