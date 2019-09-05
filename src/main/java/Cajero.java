import com.sun.org.apache.xerces.internal.impl.dv.xs.MonthDayDV;

public class Cajero {

    public Caja[] caja;
    public Transaccion[] transaccion;
    public Cliente[] cliente;

    public Cajero(){

    }

    public boolean retire(Cliente cliente, int monto, int tipoMondeda){

    }

    public void imprimaComprobante(){}

    public void definaEstadoInicial(int tipoMoneda, int[] bil){}

    public void cierreCaja(){}

    public int[] DesgloseBill(int tipoMon, int monto){}
}
