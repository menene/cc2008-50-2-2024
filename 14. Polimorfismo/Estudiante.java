class Estudiante extends Persona
{
    private String carrera, carnet;

    public Estudiante(String nombre, String cui, String carrera, String carnet)
    {
        super(nombre, cui);

        this.carrera = carrera;
        this.carnet = carnet;
    }

    public String getCarrera()
    {
        return this.carrera;
    }

    public String getCarnet()
    {
        return this.carnet;
    }

    @Override
    public String toString()
    {
        return "ESTUDIANTE: " + this.nombre + " " + this.cui + " " + this.carrera + " " + this.carnet;
    }
}