class Perro extends Animal
{
    protected String nombre, raza;

    public Perro(String nombre, String raza, String nombre_cientifico)
    {
        super(nombre_cientifico);

        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public String hablar()
    {
        return super.hablar() + " y dice Guau Guau";
    }

    // protected String ciencia()
    // {
    //     return this.nombre_cientifico;
    // }
}