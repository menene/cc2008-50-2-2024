class Lab
{
    private String nombre;
    private int puntos, calificacion;

    public Lab(String nombre, int puntos, int calificacion)
    {
        this.nombre = nombre;
        this.puntos = puntos;
        this.calificacion = calificacion;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getCalificacion()
    {
        return this.calificacion;
    }
}