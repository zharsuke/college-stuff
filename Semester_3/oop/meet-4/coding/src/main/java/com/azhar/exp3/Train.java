package com.azhar.exp3;

public class Train {
    private String name;
    private String trainClass;
    private Employee machinist;
    // private Employee asistant;

    public Train(String name, String trainClass, Employee machinist) {
        this.name = name;
        this.trainClass = trainClass;
        this.machinist = machinist;
        // this.asistant = asistant;
    }

    public String getName() {
        return name;
    }

    public String getTrainClass() {
        return trainClass;
    }

    public Employee getMachinist() {
        return machinist;
    }

    // public Employee getAsistant() {
    //     return asistant;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainClass(String trainClass) {
        this.trainClass = trainClass;
    }

    public void setMachinist(Employee machinist) {
        this.machinist = machinist;
    }

    // public void setAsistant(Employee asistant) {
    //     this.asistant = asistant;
    // }

    public String info() {
        String info = "";
        info += "Name = " + name + "\n";
        info += "Train Class = " + trainClass + "\n";
        info += "Machinist = " + machinist.info() + "\n";
        // info += "Asistant = " + asistant.info() + "\n";
        return info;
    }
}
