package models;


import interfaces.ICycle; // need to import package, it usually auto on intellij
import interfaces.IRun;
import interfaces.ISwim;

public class Triathlete implements ICycle, IRun, ISwim { // to use interface you need to add implements ...

    private String name;

    public Triathlete(String name){
        this.name = name;
    }

    public String cycle(int distance){ // implementation of interface and has to have the same
        // signature as the interface to be able to implement it - uses abstraction.
        return this.name + " cycled " + distance + "m after swimming";
    }

    public String run(int distance){
        return this.name + " ran " + distance + "m after cycling";
    }

    public String swim(int distance){
        return this.name + " swam " + distance + "m from the start";
    }

}
