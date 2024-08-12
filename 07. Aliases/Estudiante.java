class Estudiante
{
    private String nombre;
    private int edad;

    public Estudiante(String name, int age)
    {
        this.nombre = name;
        this.edad = age;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(int age)
    {
        this.edad = age;
    }
}