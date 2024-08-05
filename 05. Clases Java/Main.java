import java.util.Random;

class Main
{
    public static void main(String[] args)
    {
        // definicion de variable
        // Estudiante est;

        // est = new Estudiante("Estudiante 1", "Mamemáticas", 123);
        // System.out.println(est);

        // est = new Estudiante("Estudiante 2", "Computación", 456);
        // System.out.println(est);
    
        // --------------------------------------------

        // Estudiante est;
        // System.out.println(est);

        // for (int i = 0; i < 5; i++) {
        //     est = new Estudiante("Estudiante " + i, "Computación", i);
        //     System.out.println(est);
        // }

        // --------------------------------------------

        // int num1 = 5;
        // int num2 = 12;

        // System.out.println(num1);
        // System.out.println(num2);

        // num2 = num1;

        // System.out.println(num1);
        // System.out.println(num2);

        // num1 = 8;
        // System.out.println(num1);
        // System.out.println(num2);

        // --------------------------------------------

        String msg1 = "Hello";
        String msg2 = "World";

        System.out.println(msg1);
        System.out.println(msg2);

        msg2 = msg1;

        // validar aliases
        System.out.println("VALIDAR ALIASES");
        if (msg1 == msg2) {
            System.out.println("IGUALES");
        } else {
            System.out.println("DIFERENTES");
        }
        System.out.println();

        System.out.println(msg1);
        System.out.println(msg2);

        msg2 = "OTRO VALOR";

        System.out.println("CAMBIO DE VALOR");
        System.out.println(msg1);
        System.out.println(msg2);

        if (msg1 == msg2) {
            System.out.println("IGUALES");
        } else {
            System.out.println("DIFERENTES");
        }
        System.out.println();

        // --------------------------------------------

        // String cadena1 = "Hola";
        // String cadena2 = "Mundo";

        // char caracter = cadena1.charAt(2);
        // System.out.println(caracter);

        // String substring = cadena1.substring(1, 3);
        // System.out.println(substring);

        // int result = cadena1.compareTo(cadena2);
        // int result2 = cadena1.compareTo(cadena1);
        // System.out.println(result);
        // System.out.println(result2);

        // int largo = cadena1.length();
        // System.out.println(largo);

        // --------------------------------------------

        // Random rd = new Random();

        // int randomNumber = rd.nextInt();
        // int randomNumber2 = rd.nextInt(10);

        // System.out.println(randomNumber);
        // System.out.println(randomNumber2);
    }
}