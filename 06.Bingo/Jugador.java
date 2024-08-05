public class Jugador
{
    String nombre;
    double saldo;

    public Jugador(String nombre, double saldo)
    {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public double getSaldo() 
    {
        return this.saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void sumSaldo(double saldo)
    {
        this.saldo += saldo;
    }
}