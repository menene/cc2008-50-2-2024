public class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        int result = calc.sum(10, 28);
        System.out.println(result);

        int result2 = calc.sum(10, 28, 90);
        System.out.println(result2);

        double result3 = calc.sum(10.875, 223.323);
        System.out.println(result3);
    }
}