class Cliente
{
    private String nombre;
    private int identificacion, visitas;

    public Cliente(String nombre, int identificacion)
    {
       this.nombre = nombre;
       this.identificacion = identificacion;
       this.visitas = 0;
    }

    public String getTipo()
    {
        if (this.visitas < 5) {
            return "Regular";
        } else {
            if (this.visitas < 10) {
                return "Frecuente";
            }

            return "VIP";
        }
    }

    public void visitar()
    {
        this.visitas += 1;
    }

    public String getNombre()
    {
        return this.nombre;
    }
}