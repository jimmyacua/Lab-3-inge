public class Cliente {

    public int id;
    public String nombre;
    public int numero_Ident_Pers;
    public double saldo;

    public Cliente(int id, String nombre, int pin){
        this.id = id;
        this.nombre = nombre;
        this.numero_Ident_Pers = pin;
    }

    public void retjre(int amount){
        if(amount <= saldo){
            System.out.println("Retirando " + amount + " de su cuenta.");
            saldo -= amount;
        } else {

        }
    }

    public double deSaldo(){
        return saldo;
    }

    public void deposite(int monto){
        saldo += monto;
    }
}
