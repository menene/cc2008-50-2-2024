class Reserva
{
    Cliente cliente;
    Habitacion habitacion;
    String fecha;

    public Reserva(Cliente cliente, String fecha)
    {
        this.cliente = cliente;
        this.fecha = fecha;
        this.habitacion = null;
    }

    public void asignarHabitacion(Habitacion habitacion)
    {
        this.habitacion = habitacion;
    }

    public boolean pendiente()
    {
        if (this.habitacion == null) {
            return true;
        }

        return false;
    }

    public Cliente getCliente()
    {
        return this.cliente;
    }

    public String toString()
    {
        return "El cliente " + this.cliente.getNombre() + " ha reservado para: " + this.fecha + " con habitación asignada: " + (this.habitacion != null ? this.habitacion.getNumero() : " PENDIENTE");
    }
}