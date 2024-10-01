class Persona
{
    protected String nombre, cui;

    public Persona(String nombre, String cui)
    {
        this.nombre = nombre;
        this.cui = cui;
    }

    // public String getNombre()
    // {
    //     return this.nombre;
    // }

    // public String getCui()
    // {
    //     return this.cui;
    // }

    @Override
    public String toString()
    {
        return "PERSONA: " + this.nombre + " " + this.cui;
    }
}