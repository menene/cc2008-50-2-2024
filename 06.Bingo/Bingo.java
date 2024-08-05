import java.util.Random;

class Bingo
{
    Random rand;

    public Bingo()
    {
        this.rand = new Random();
    }

    // private boolean canPlay(Jugador jugador)
    // {
    //     return jugador.getSaldo() >= 12;
    // }

    public int comprarNumero(Jugador jugador)
    {
        if (jugador.getSaldo() >= 4) {
            jugador.sumSaldo(-4);
            return this.rand.nextInt(100, 1001);
        } else {
            return 0;
        }
    }

    public void calcularGanancias(Jugador jugador, int num1, int num2, int num3)
    {
        System.out.println("CALCULANDO...");
    }
}