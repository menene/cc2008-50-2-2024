class Animal
{
    protected String nombre_cientifico;

    public Animal(String nombre)
    {
        this.nombre_cientifico = nombre;
    }

    protected String hablar()
    {
        return "El animal está hablado";
    }
}