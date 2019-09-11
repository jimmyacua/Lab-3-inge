import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void deSaldo() {
        Cliente c = new Cliente(01, "Name", 9897, 12000);
        assertEquals(12000, c.deSaldo(), 0.1);
    }
}