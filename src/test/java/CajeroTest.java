import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CajeroTest {

    @Test
    public void instancieCajas() {
        Cajero cajero = new Cajero("11 set 2019");
        cajero.instancieCajas();
        for (Caja c : cajero.caja) {
            int[] v = c.getBalance();
            assertNotEquals(0, v.length); //si es distinto de cero está bien.
        }
    }

    @Test
    public void deCierreCaja() {
        Cajero cajero = new Cajero("11 set 2019");
        cajero.instancieCajas();
        cajero.instancieClientes();
        cajero.retire(20000, 123, 1, 1);
        cajero.retire(100, 123, 1, 2);
        cajero.retire(500, 123, 1, 3);

        //int[] cc = cajero.deCierreCaja(1);

        for (int i = 1; i < 4; i++) { //3 # de cajas
            int[] cc = cajero.deCierreCaja(i);
            boolean res = false;
            for (int value : cc) {
                if(value != 200){
                    res = true;
                }
            }
            //se revisa si se redujo la cantidad de billetes en cada caja.
            assertEquals(true, res);
        }


    }

    @Test
    public void retire() {
        //monto actual 500000
        //monto despues de la prueba 500000 -20000 = 480000
        int montoARetirar = 20000;
        Cajero cajero = new Cajero("11 set 2019");
        cajero.instancieCajas();
        cajero.instancieClientes();
        cajero.retire(montoARetirar, 123, 1, 1); //al cliente en la pos 0
        assertEquals(480000, cajero.cliente.get(0).deSaldo(), 0);
    }
}