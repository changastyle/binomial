package binomial;

import java.util.Scanner;

public class Binomial 
{
    public static void main(String[] args)
    {
        double p,n,x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar P:");
        p = scanner.nextDouble();
        
        System.out.print("Ingresar n:");
        n = scanner.nextDouble();
        
        System.out.print("Ingresar x:");
        x = scanner.nextDouble();
        /* p = 0.30;
         n = 10;
         x = 5;*/
        
        double resultado = calcularBinomial(p,x,n);
        System.out.println("Resultado = " + resultado);
        
        
    }

    private static double calcularBinomial(double p , double x, double n)
    {
        double resultado = 0 ;
        
        resultado = factorial(n) /( factorial(x) * (factorial((n-x)))) * Math.pow(p, x) * Math.pow((1-p),n-x) ;
        
        return resultado;
    }
    public static double factorial(double numeroRecibido)
    {
        double factorial = 0;
        if (numeroRecibido==0)
        {
             return 1;
        }
        else
        {
            return numeroRecibido * factorial(numeroRecibido-1);
        }
            
    }
}
