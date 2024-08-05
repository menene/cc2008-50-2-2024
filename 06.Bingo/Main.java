class Main
{
    public static void main(String[] args)
    {
        Bingo elPar = new Bingo();
        Jugador player = new Jugador("Jugador 1", 10);

        int num1 = elPar.comprarNumero(player);
        int num2 = elPar.comprarNumero(player);
        int num3 = elPar.comprarNumero(player);

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("No tienes saldo para comprar todos los números para jugar.");
        } else {
            System.out.println("Tus 3 números son:");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);

            // calcular ganancias
            elPar.calcularGanancias(player, num1, num2, num3);
        }

        System.out.println(player.getSaldo());
    }
}