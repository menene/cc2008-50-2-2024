import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Persona p = new Persona("Juan Perez", "1232123210101");
        // System.out.println(p.getNombre() + " " + p.getCui());
        // System.out.println(p);

        Estudiante e = new Estudiante("Juan Alvarez", "1245323210102", "Computacion", "12321");
        // System.out.println(e.getNombre() + " " + e.getCui() + " " + e.getCarrera() + " " + e.getCarnet());
        // System.out.println(e);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p);
        personas.add(e);

        for (Persona per: personas) {
            System.out.println(per);

            // if (per instanceof Estudiante) {
            //     Estudiante estudiante = (Estudiante) per;
            //     System.out.println(estudiante.getNombre() + " " + estudiante.getCui() + " " + estudiante.getCarrera() + " " + estudiante.getCarnet());
            // } else {
            //     System.out.println(per.getNombre() + " " + per.getCui());
            // }
        }
    }
}