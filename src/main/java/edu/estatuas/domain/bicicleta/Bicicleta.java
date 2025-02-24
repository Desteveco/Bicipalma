package edu.estatuas.domain.bicicleta;

public class Bicicleta{

    private final int id;

    public Bicicleta(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return "Bicicleta: " + id;
    }
}