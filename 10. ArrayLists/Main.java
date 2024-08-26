import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<String>();

        System.out.println(fruits);
        System.out.println(fruits.size());

        // agregar elementos
        fruits.add("Watermelon");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits.size());

        // esto no se puede hacer
        // fruits[1] = null;

        System.out.println(fruits);

        // obtener elementos

        String fruit = fruits.get(1);

        System.out.println(fruit);
        System.out.println(fruits.size());

        // borrar un elemento

        // fruits.remove(1);

        System.out.println(fruits);

        // boolean done = fruits.remove("Orange");
        System.out.println(fruits.size());

        // System.out.println(done);
        System.out.println(fruits);

        // limpiar una lista por completo
        // fruits.clear();

        System.out.println(fruits.size());
        System.out.println(fruits);

        // recorrer un arrayList con ciclo for
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // recorrer un arrayList con iterador
        String trash = null;
        for (String i: fruits) {
            System.out.println(i);

            // esto no se puede...
            // if (i.equals("Orange")) {
            //     fruits.remove(i);
            // }

            if (i.equals("Orange")) {
                trash = i;
            }
        }

        if (trash != null) {
            fruits.remove(trash);
        }

        System.out.println(fruits);
    }
}