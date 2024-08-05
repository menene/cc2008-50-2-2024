class Perro
{
    private String nombre;
    private String raza;

    public Perro(String nombre, String raza)
    {
        this.nombre = nombre;
        this.raza = raza;
    }

    public void ladrar()
    {
        System.out.println("Woof woof");
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }

    public String getRaza()
    {
        return this.raza;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }
}