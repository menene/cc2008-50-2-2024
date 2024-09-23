class Main
{
    public static void main(String[] args)
    {
        // Perro fido = new Perro("Fido", "Pitbull", "Canis Familiaris");
        // String habla = fido.hablar();
        // System.out.println(habla);

        // String nc = fido.ciencia();
        // System.out.println(nc);

        PerroFaldero pf = new PerroFaldero("Clio", "Pomeranian", "Canis Familiaris", "Adrían");
        String habla = pf.hablar();
        System.out.println(habla);
    }
}