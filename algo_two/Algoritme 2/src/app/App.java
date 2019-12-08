package app;

public class App
{
    public static void main(String[] args)
    {
        int sum = 0;
        int value1 = 1;
        int value2 = 1;
        int valueAUX;

        valueAUX = 0;
        
        while(valueAUX < 4000000)
        {
            valueAUX = value1 + value2;

            if(valueAUX % 2 == 0) 
            {
                sum = sum + valueAUX;
            }

            value1 = value2;
            value2 = valueAUX;
        }
        System.out.println("La somme des nombres Fibonacci pairs en dessous de 4 millions est: " + sum);
    }
}
    
    
