class Main
{
    public static void main(String[] args)
    {
        Estudiante e1 = new Estudiante("Pedro", 20);
        Estudiante e2 = new Estudiante("Maria", 19);

        System.out.println("ORIGINAL");
        System.out.println(e1.getNombre() + " - " + e1.getEdad());
        System.out.println(e2.getNombre() + " - " + e2.getEdad());
        System.out.println();

        e1 = e2;

        System.out.println("IGUALADOS");
        System.out.println(e1.getNombre() + " - " + e1.getEdad());
        System.out.println(e2.getNombre() + " - " + e2.getEdad());
        System.out.println();

        e2.setEdad(40);

        System.out.println("CAMBIO DE VALOR");
        System.out.println(e1.getNombre() + " - " + e1.getEdad());
        System.out.println(e2.getNombre() + " - " + e2.getEdad());
        System.out.println();
    }
}