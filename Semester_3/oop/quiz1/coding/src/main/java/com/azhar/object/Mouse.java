package com.azhar.object;

public class Mouse extends Item {
    private String type;

    public Mouse() {
        
    }

    public Mouse(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printMouse() {
        print();
        System.out.println("Type: " + type);
    }
}
