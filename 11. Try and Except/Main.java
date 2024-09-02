import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Watermelon");
        fruits.add("Apple");
        fruits.add("Orange");

        try {
            fruits.remove(10);
        } catch(Exception e) {
            System.out.println("Se ha producido el siguiente error: " + e);
        } finally {
            System.out.println("Esto va siempre...");
        }

        // String trash;
        // for (String i: fruits) {
        //     if (i.equals("Orange")) {
        //         trash = i;
        //     }
        // }

        // if (trash != null) {
        //     fruits.remove(trash);
        // }

        System.out.println(fruits);
    }
}