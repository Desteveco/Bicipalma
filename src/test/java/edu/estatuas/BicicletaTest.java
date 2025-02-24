package edu.estatuas;
import edu.estatuas.domain.bicicleta.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;


public class BicicletaTest {

    private Bicicleta bici = null;

    @Before 
    public void setup_bicicleta(){
        bici = new Bicicleta(101);
    }

    @Test
    public void test_constructor_bici(){
        // ARRANGE
        int idExpected = 101;

        // ACT
        int id = bici.getId();

        // ASSERT
        assertEquals(idExpected, id);
    }
    
    @Test
    public void test_toString_bicicleta() {
        // ARRANGE
        String id = "101";
        // ACT
        String representacionIdBici = bici.toString();
        // ASSERT
        assertEquals(String.format("Bicicleta: %s", id),  representacionIdBici);
    }
    
}
