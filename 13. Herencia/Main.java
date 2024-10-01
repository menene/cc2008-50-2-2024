import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Animal a = new Animal("Canis Familiaris");
        String habla = a.hablar();
        System.out.println(habla);
        
        Perro p = new Perro("Fido", "Pitbull", "Canis Familiaris");
        String habla2 = p.hablar();
        System.out.println(habla2);

        PerroFaldero pf = new PerroFaldero("Clio", "Pomeranian", "Canis Familiaris", "Adrían");
        String habla3 = pf.hablar();
        System.out.println(habla3);

        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(p);
        animales.add(pf);
        System.out.println(animales);

        ArrayList<Perro> perros = new ArrayList<Perro>();
        // perros.add(a); // esto no se puede hacer
        perros.add(p);
        perros.add(pf);
    }
}