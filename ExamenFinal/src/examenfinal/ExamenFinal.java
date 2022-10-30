/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;
import java.util.Scanner;

public class ExamenFinal {

    
    public static void main(String[] args) {
      
        boolean llave= true;
        int opcion;
        while(llave){
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Selelccione la opción deseada");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("\n");
            Scanner ob1=new Scanner(System.in);
            opcion=ob1.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("\n");
                    System.out.println("Ingresar dos números");
                    System.out.println("\n");
                    double numero1=ob1.nextDouble();
                    double numero2=ob1.nextDouble();
                    if(numero1>numero2){
                        System.out.println("El número mayor es: "+numero1);
                    }
                    else{
                        System.out.println("El número mayor es: "+numero2);
                    }
                    break;
                    
                case 2:
                    boolean bandera1=true;
                    while(bandera1){
                    System.out.println("Ingrese el número impar para la piramide");
                    int base=ob1.nextInt();
                    
                    if(base%2==0){
                        System.out.println("Debe ingresar un número impar");
                    }
                    
                    else 
                    
                    
                    for(int i=1; i<=(base/2)+1;i++){
                        for(int j=1;j<=base-i;j++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=(i*2)-1;k++){
                             System.out.print("*");      
                        }
                        System.out.println();
                        bandera1=false;
                    }
                    System.out.println(" ");}
                break;
                
                case 3:
                    
                    String cadena1=ob1.nextLine();
                    String DatosLetras []= cadena1.split(",");
                    double DatosNumeros1 []= new double[8];
                    for(int i=0; i<8;i++){
                       DatosNumeros1[i] = Double.valueOf(DatosLetras[i]);
                                }
                    
                    String cadena2=ob1.nextLine();
                    String DatosLetras2 []= cadena1.split(",");
                    double DatosNumeros2 []= new double[8];
                    for(int i=0; i<8;i++){
                       DatosNumeros2[i] = Double.valueOf(DatosLetras2[i]);
                                }
                    
                    double suma=0;
                    for(int i=0; i<5;i++){
                       
                        suma=suma+DatosNumeros2[i];
                                }
                    
                    System.out.println(suma);
                    
                    
                break;
                case 4:
                   System.out.println("Adiós papu");    
                   System.exit(0);
                   
                break;
                default:
                    System.out.println("Opción Invalida, ingrese otra opción");
                    
            }
        
        
        }
    }
    
    }

