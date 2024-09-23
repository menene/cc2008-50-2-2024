class Perro extends Animal
{
    private String nombre, raza;

    public Perro(String nombre, String raza, String nombre_cientifico)
    {
        super(nombre_cientifico);

        this.nombre = nombre;
        this.raza = raza;
    }

    public String hablar()
    {
        return "Guau Guau";
    }

    public String ciencia()
    {
        return this.nombre_cientifico;
    }
}