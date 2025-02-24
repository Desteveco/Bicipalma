package edu.estatuas.domain.estación;
import edu.estatuas.domain.bicicleta.Movil;

public class Anclaje{

    private Boolean ocupado;
    private Movil bici = null;
    
    Anclaje(){}

    boolean isOcupado(){
        return ocupado;
    }

    Movil getBici(){
        return bici;
    }

    void anclarBici(Movil bici){
        this.bici = bici;
        ocupado = true;
    }

    void liberarBici(){
        this.bici = null;
        ocupado = false;
    }

    @Override
    public String toString(){
        return "Anclaje: " + ocupado;
    }
}
