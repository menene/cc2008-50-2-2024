class Hotel
{
    public static void main(String[] args)
    {
        // Cliente erick = new Cliente("Erick Marroquin", 123);

        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();
        // erick.visitar();

        // System.out.println(erick.getTipo());

        // Reserva r1 = new Reserva(erick, "24/08/24");

        // System.out.println(r1.pendiente());


        // System.out.println(r1);

        // Habitacion h1 = new Habitacion("CIT-315", "VIP", 20, 299.99);

        // r1.asignarHabitacion(h1);

        // System.out.println(r1);

        Reserva[] reservaciones = new Reserva[100];
    
        Habitacion[] habitaciones = {
            new Habitacion("CIT-315", "Estandar", 5, 99.99),
            new Habitacion("CIT-415", "Deluxe", 10, 199.99),
            new Habitacion("CIT-515", "Suite", 15, 299.99),
        };



        for (Habitacion h: habitaciones) {
            System.out.println(h);
        }

        Cliente erick = new Cliente("Erick Marroquin", 123);

        int disponible = 0;
        for (int i = 0; i < reservaciones.length; i++) {
            if (reservaciones[i] == null) {
                disponible = i;
            }
        }

        reservaciones[disponible] = new Reserva(erick, "24/08/24");

        for (Reserva r: reservaciones) {
            if (r != null) {
                System.out.println(r.getCliente().getTipo());

                if (r.pendiente()) {
                    System.out.println("Puedo proceder con la asignacion de habitacion");

                    for (Habitacion h: habitaciones) {
                        System.out.println(h.getTipo());
                        if (!h.disponible()) {
                            System.out.println("Habitación " + h.getNumero() + " no disponible para asignar");
                        } else {
                            if (r.getCliente().getTipo() == "Regular") {
                                if (h.getTipo() != "Estandar") {
                                    System.out.println("Habitación " + h.getNumero() + " no disponible para el tipo de cliente");
                                } else {
                                    System.out.println("Habitación " + h.getNumero() + " disponible");
                                }
                            } else if (r.getCliente().getTipo() == "Frecuente") {
                                if (h.getTipo() != "Estandar" || h.getTipo() != "Deluxe") {
                                    System.out.println("Habitación " + h.getNumero() + " no disponible para el tipo de cliente");
                                } else {
                                    System.out.println("Habitación " + h.getNumero() + " disponible");
                                }
                            } else {
                                System.out.println("Habitación " + h.getNumero() + " disponible");
                            }   
                        }
                    }
                }
            }
        }



    }
}