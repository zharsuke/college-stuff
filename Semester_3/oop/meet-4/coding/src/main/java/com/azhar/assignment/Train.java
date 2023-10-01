package com.azhar.assignment;

public class Train {
    private String name;
    private String carriageClass;
    private Carriage[] arrayCarriage;

    public Train(String name, String carriageClass, int amountCarriage) {
        this.name = name;
        this.carriageClass = carriageClass;
        this.arrayCarriage = new Carriage[amountCarriage];
        this.initCarriage(amountCarriage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarriage(Carriage carriage, int number) {
        this.arrayCarriage[number-1] = carriage;
    }

    public String getCarriageClass() {
        return carriageClass;
    }

    public void setCarriageClass(String CarriageClass) {
        this.carriageClass = CarriageClass;
    }

    public Carriage[] getArrayCarriage() {
        return arrayCarriage;
    }

    private void initCarriage(int amount) {
        for (int i = 0; i < arrayCarriage.length; i++) {
            this.arrayCarriage[i] = new Carriage(String.valueOf(i + 1), amount);
        }
    }

    public void printTrain() {
        System.out.println("Name = " + name);
        for (Carriage carriage : arrayCarriage) {
            carriage.printCarriage();
        }
    }
}
