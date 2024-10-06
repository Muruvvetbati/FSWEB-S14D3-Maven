package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getName() + "is accelerate";
    }

    @Override
    public String startEngine() {
        return getName() + "is start engine";
    }

    @Override
    public String brake() {
        return  getName() + "is brake";
    }
}
