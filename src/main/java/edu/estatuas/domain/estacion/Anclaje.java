package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

public class Anclaje {

    private Boolean ocupado = false;
    private Movil bici = null;

    public Anclaje(){

    }

    public Boolean isOcupado(){
        return this.ocupado;
    }

    public void anclarBici(Movil bici){
        this.bici = bici;
        this.ocupado = true;
    }

    public Movil liberarBici(){
        Movil bici = this.bici;
        this.bici = null;
        this.ocupado = false;
        return bici;
    }
}
