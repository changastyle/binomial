package binomial;

import java.util.Scanner;

public class Binomial 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar P:");
        double p = scanner.nextDouble();
        
        System.out.print("Ingresar n:");
        double n = scanner.nextDouble();
        
        System.out.print("Ingresar x:");
        double x = scanner.nextDouble();
        
        double resultado = calcularBinomial(p,n,x);
        System.out.println("Resultado = " + resultado);
        
        
    }

    private static double calcularBinomial(double p , double x, double n)
    {
        double resultado = 0 ;
        
        resultado = (factorial(n) / factorial(x) * factorial((n-x))) * Math.pow(p, x) * Math.pow((1-p),n-x) ;
        
        return resultado;
    }
    public static double factorial(double numeroRecibido)
    {
        double resultadoFactorial = 0;
        
        double fact = 1; 
        
        for (int i = 1; i <= numeroRecibido; i++) 
        {
            fact *= i;
        }
        
        return fact;
    }
}
