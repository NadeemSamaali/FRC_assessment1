package app;

public class App
{
    public static void main(String[] args)
    {
        int sum = 0;

        for(int i =0; i < 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("La somme des nombres multiple de 5 ou 3 plus petits que 1000 est: " + sum);
    }
}
