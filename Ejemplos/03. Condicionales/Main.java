import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int cuenta = 6;

        if (cuenta < 8) {
            System.out.println("La cuenta es menor a 8");
        }
        else {
            System.out.println("La cuenta es mayor a 8");
            cuenta = 0;
        }

        System.out.println("cuenta: " + cuenta);


        int numero = 900;

        String mensaje = numero > 100 ? "mayor" : "menor";

        // String mensaje = "";
        // if (numero > 100) {
        //     mensaje = "mayor";
        // } else {
        //     mensaje = "menor";
        // }

        System.out.println(mensaje);


        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();


        String msg1 = "Hola";
        String msg2 = msg1;

        System.out.println(msg1.toUpperCase());

        if (msg1 == msg2) {
            System.out.println("SON IGUALES");
        }

        if (nombre.equals("Erick")) {
            System.out.println("Hola Profe");
        }
        else {
            System.out.println("Hola, " + nombre);
        }


        sc.close();


        int numeroNuevo = 10;
        switch (numeroNuevo) {
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println("Número incorrecto");
                break;
        }

        // if (numero == 1) {
        //     System.out.println("El numero es 1");
        // } else {
        //     if (numero == 2) {
        //         System.out.println("El numero es 1");
        //     }
        // }
    }
}