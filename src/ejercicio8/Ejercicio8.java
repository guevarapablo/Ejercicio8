/*
Escribir un programa utilizando la estructura Switch, que reciba dos números de dos 
cifras, tome el primer número digitado y dependiendo del valor del último digito haga:
0: Diga cuál es mayor           5: Calcule la división
1: Diga cuál es menor           6: Diga si el primero es divisible por el segundo
2: Calcule la suma              7: Diga si el segundo es divisible por el prime
3: Calcule la resta             8: calcule la raíz cuadrada del primer número
4: Calcule la multiplicación    9: Imprima en pantalla "Que punto tan fácil parce"
Ejemplo si los dos números digitados son 46 y 54, el primer número es el 46 y 
el último digito es 6 el programa debe decir si el primero es divisible por el segundo.
                                
 */
package ejercicio8;

import java.util.Scanner;       //Teclado

public class Ejercicio8 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        int aux = num1%10;
        
        switch(aux){
            
            case 0:{
                if(num1>num2)
                    System.out.println("El mayor es el primero.");
                else
                    System.out.println("El mayor es el segundo.");
            
            break;
            }
            case 1:{
                if(num1<num2)
                    System.out.println("El menor es el primero.");
                else
                    System.out.println("El menor es el segundo.");
                
            break;
            }
            case 2:{
                
                int suma = num1+num2;     
                System.out.println("La suma es: "+suma);
            
            break;
            }
            case 3:{
                
                int resta = num1-num2;     
                System.out.println("La resta es: "+resta);
            
            break;
            }
            case 4:{
                
                int mult = num1*num2;     
                System.out.println("La multiplicación es: "+mult);
            
            break;
            }
            case 5:{
                
                double div = num1/num2;     
                System.out.println("La división es: "+div);
            
            break;
            }
            case 6:{
                
                int aux2 = num1%num2;
                if (aux2==0)
                    System.out.println("El primero es divisible por el segundo");
                else
                    System.out.println("El primero no es divisible por el segundo");
            
            break;
            }
            case 7:{
                
                int aux3 = num2%num1;
                if (aux3==0)
                    System.out.println("El segundo es divisible por el primero");
                else
                    System.out.println("El segundo no es divisible por el primero");
            
            break;
            }
            case 8:{
                
                double raiz = Math.sqrt(num1);     
                System.out.println("La raiz del primero es: "+raiz);
            
            break;
            }
            case 9:{
                
                System.out.println("Qué punto tan fácil parce");
            
            break;
            }
        }
  
    }
    
}
