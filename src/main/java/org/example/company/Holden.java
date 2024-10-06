package org.example.company;

public class Holden  extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getName() + "is accelerate!";
    }

    @Override
    public String startEngine() {
        return getName() + "engine is start!";
    }

    @Override
    public String brake() {
        return  getName() + "is brake!";
    }
}
