package domain.bicicleta;
import org.junit.Test;

import edu.estatuas.domain.bicicleta.Bicicleta;

import static org.junit.Assert.assertEquals;

public class BicicletaTest {

    private Bicicleta bici = null;

    @Before 
    public void setup_bicicleta(){
        bici = new Bicicleta(101);
    }

    @Test
    public void test_constructor_bici(){
        // ARRANGE
        int idExpected = 1;

        // ACT
        int id = bici.getId();

        // ASSERT
        assertEquals(idExpected, id);
    }
    
}
