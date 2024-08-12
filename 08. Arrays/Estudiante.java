class Estudiante
{
    private String nombre;
    private int carnet;
    private Lab[] labs;

    public Estudiante(String nombre, int carnet)
    {
        this.nombre = nombre;
        this.carnet = carnet;
        this.labs = new Lab[5];
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void addLab(int indice, Lab lab)
    {
        this.labs[indice] = lab;
    }

    private double promedio()
    {
        int suma = 0;
        int n = 0;
        for (Lab l: this.labs) {
            if (l != null) {
                suma += l.getCalificacion();
                n++;
            }
        }

        if (n == 0) {
            return 0.0;
        }

        return suma / n;
    }

    public String toString()
    {
        String results = "";
        for (Lab l: this.labs) {
            if (l != null) {
                results = results + "\n" + l.getNombre() + " - " + l.getCalificacion();
            }
        }

        results += "\nPromedio: " + this.promedio();

        return this.nombre + " (" + this.carnet + "):" + results + "\n";
    }
}