import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CajeroTest {

    @Test
    public void setCaja() {
    }

    @Test
    public void instancieClientes() {
    }

    @Test
    public void instancieCajas() {
        Cajero cajero = new Cajero("11 set 2019");
        cajero.instancieCajas();
        for (Caja c: cajero.caja){
            int[] v = c.getBalance();
            assertNotEquals(0, v.length); //si es distinto de cero está bien.
        }
    }

    @Test
    public void deCierreCaja() {
    }

    @Test
    public void retire(){
        //monto actual 500000
        //monto despues de la prueba 500000 -100000 = 400000
        int montoARetirar = 100000;
        Cajero cajero = new Cajero("11 set 2019");
        cajero.instancieCajas();
        cajero.instancieClientes();
        cajero.retire(montoARetirar,123, 1); //al cliente en la pos 0
        assertEquals(400000, cajero.cliente.get(0).deSaldo(), 0.1);
    }
}