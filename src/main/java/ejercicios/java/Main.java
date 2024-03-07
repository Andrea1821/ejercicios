package ejercicios.java;
import java.util.Scanner;
public class Main {
  public static void main (String[]args){
   Scanner Scanner=new Scanner (System.in);
            
  System.out.println("Dijite un número según lo que quiera saber");
  int opc=0;
  do{
    System.out.println("Micelania:");
        System.out.println("1. Área de un triángulo");
        System.out.println("2. Digitar 2 números y sumarlos");
        System.out.println("3. Elevación al cuadrado de un número");
        System.out.println("4. Convertidor de Euro a Dolar");
        System.out.println("5. Perimetro y área de un cuadrado");
        System.out.println("6. Área y volumen de un cilindro");
        System.out.println("7. El radio de una circunferencia");
        System.out.println("8. Promedio de tres números");
        System.out.println("9. Salir");
  opc = Scanner.nextInt();
  switch (opc){
    case 1 :
    ejercicios.areadetriangulo(Scanner);
    break;
    case 2 :
    ejercicios.sumadosnumeros(Scanner);
    break;
    case 3 :
    ejercicios.elevacionalcuadrado(Scanner);
    break;
    case 4 :
    ejercicios.covertidoreurodolar(Scanner);
    break;
    case 5 :
    ejercicios.perimetroareacuadrado(Scanner);
    break;
    case 6 :
    ejercicios.areavolumencilindro(Scanner);
    break;
    case 7 :
    ejercicios.radiodecircuferencia(Scanner);
    break;
    case 8 :
    ejercicios.promediotresnumeros(Scanner);
    break;
    case 9 :
    System.out.println("Salir");
    break;
default:
    System.out.println("Respuesta no valida");
  }
 }while(opc!=9);
}
}
