class Main
{
    public static void main (String[] args)
    {
        // int[] notas = new int[10];

        // notas[0] = 100;
        // notas[1] = 90;

        // System.out.println(notas);
        // System.out.println(notas[0]);
        // System.out.println(notas[1]);
        // System.out.println(notas[2]);
        // System.out.println(notas[3]);

        // char[] codes = new char[10];

        // codes[0] = 'A';
        // codes[1] = 'B';
        // System.out.println(codes[0]);
        // System.out.println(codes[1]);
        // System.out.println(codes[2]);

        // primera forma de recorrer un arreglo
        // ciclo for
        // i++ => i = i + 1
        // for (int i = 0; i < notas.length; i++) {
        //     System.out.println(notas[i]);
        // }

        // System.out.println("---");

        // segunda forma de recorrer un arreglo
        // foreach
        // for (int nota: notas) {
        //     System.out.println(nota);
        // }

        // for (char code: codes) {
        //     System.out.println(code);
        // }

        // System.out.println(notas[100]);

        // String[] arr = new String[3];
        // arr[0] = "Hello";
        // arr[1] = "World";
        // arr[2] = "!";

        // for (String str: arr) {
        //     System.out.println(str);
        // }

        // char caracter = arr[0].charAt(0);

        // System.out.println(caracter);

        // for (String str: arr) {
        //     for (int j = 0; j < str.length(); j++) {
        //         System.out.println(str.charAt(j));
        //     }
        // }

        // int[] labs = {-1, -1, -1, -1, -1};
        // for (int lab: labs) {
        //     System.out.println(lab);
        // }

        // int[] labs = new int[5];
        // for (int k = 0; k < labs.length; k++) {
        //     labs[k] = -1;
        // }

        // Estudiante e1 = 
        Estudiante e3 = new Estudiante("Jp", 789);

        Estudiante[] estudiantes = new Estudiante[3];
        
        estudiantes[0] = new Estudiante("Pedro", 123);
        estudiantes[1] = new Estudiante("Maria", 456);
        estudiantes[2] = e3;

        // System.out.println(estudiantes);
        for (Estudiante e: estudiantes) {
            if (e.getNombre() == "Pedro") {
                Lab l1 = new Lab("Laboratorio 1", 7, 100);
                Lab l2 = new Lab("Laboratorio 2", 7, 95);
                Lab l3 = new Lab("Laboratorio 3", 7, 90);

                e.addLab(0, l1);
                e.addLab(1, l2);
                e.addLab(2, l3);
            }

            System.out.println(e);
        }
    }
}