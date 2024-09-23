class Main
{
    public static void main(String[] args)
    {
        Perro fido = new Perro("Fido", "Pitbull", "Canis Familiaris");
        fido.hablar();

        String nc = fido.ciencia();

        System.out.println(nc);
    }
}