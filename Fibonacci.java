public class Fibonacci{
    public static void main(String[] args){
        
        long a=0, b=1, c=0, n=9,contador=0, suma=0, promedio=0;
        
        do
        {
            System.out.println(a);
            c=a+b;
            a=b;p
            b=c;
            contador++;
            suma=b;
            
        }
        while(--n>0);
        
        promedio=suma/contador;
        
            System.out.println("El ciclo se repitió: "+contador+" veces");
            System.out.println("La suma de los números es: "+suma);
            System.out.println("El promedio de los numeros es: "+promedio);
            
    }
}