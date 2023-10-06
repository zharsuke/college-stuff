package com.azhar.object;

public class Keyboard extends Item {
    private int layout;

    public Keyboard() {
        
    }

    public Keyboard(int layout) {
        this.layout = layout;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public void printKeyboard() {
        print();
        System.out.println("Layout: " + layout + "%");
    }
}
