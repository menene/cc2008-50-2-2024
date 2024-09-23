class PerroFaldero extends Perro
{
    private String owner;

    public PerroFaldero(String nombre, String raza, String nombre_cientifico,String owner)
    {
        super(nombre, raza, nombre_cientifico);
        this.owner = owner;
    }

    public String hablar()
    {
        return "Woof Woof";
    }
}