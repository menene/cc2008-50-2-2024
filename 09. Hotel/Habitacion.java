class Habitacion
{
    String numero, tipo;
    int ocupacion_maxima;
    double precio;
    boolean disponible;

    public Habitacion(String numero, String tipo, int ocupacion_maxima, double precio)
    {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupacion_maxima = ocupacion_maxima;
        this.disponible = true;
    }

    public String getNumero()
    {
        return this.numero;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public boolean disponible()
    {
        return this.disponible;
    }

    public String toString()
    {
        return this.numero;
    }
}