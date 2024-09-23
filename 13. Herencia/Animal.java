class Animal
{
    protected String nombre_cientifico;

    public Animal(String nombre)
    {
        this.nombre_cientifico = nombre;
    }

    protected void hablar()
    {
        System.out.println("El animal está hablando");
    }
}