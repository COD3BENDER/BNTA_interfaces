package models;

import interfaces.ICycle;

public class Cyclist implements ICycle { // to use an interface you have to do implements ...

    private String name;

    public Cyclist(String name){
        this.name = name;
    }

    public String cycle(int distance){ // this is the implementation of the method
        return  this.name + " cycled " + distance + "m";
    }


}
