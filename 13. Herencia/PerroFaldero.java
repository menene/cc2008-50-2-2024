class PerroFaldero extends Perro
{
    protected String owner;

    public PerroFaldero(String nombre, String raza, String nombre_cientifico,String owner)
    {
        super(nombre, raza, nombre_cientifico);
        this.owner = owner;
    }

    @Override
    public String hablar()
    {
        return "Woof Woof";
    }
}