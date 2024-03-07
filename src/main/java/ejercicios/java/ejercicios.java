package ejercicios.java;
import java.util.Scanner;
public class ejercicios {
Scanner in = new Scanner(System.in);

public static void areadetriangulo(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite la altura del triángulo:");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("La Área del triángulo:" + area);
        scanner.close();
    }

    public static void sumadosnumeros(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número:");
        double numone = scanner.nextDouble();
        System.out.println("Digite otro número:");
        double numtwo = scanner.nextDouble();
        double suma = numone + numtwo;
        System.out.println("La suma de estos dos número es: " + suma);
        scanner.close();
    }

    public static void elevacionalcuadrado(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar un número:");
        double numero = scanner.nextDouble();
        double resultado = Math.pow(numero, 2);
        System.out.println("El cuadrdado de " + numero + "es de : " + resultado);
        scanner.close();
    }

    public static void covertidoreurodolar(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        double valueCambio = 1.08;
        System.out.println("Digita la cantidad en Euros:");
        double euro = scanner.nextDouble();
        double dolar = euro * valueCambio;
        System.out.println(euro + " de euros a dolar es: " + dolar + " dólares.");
        scanner.close();
    }

    public static void perimetroareacuadrado(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el lado del cuadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double perimetro = 4 * lado;
        System.out.println("El área del cuadrado es:" + area);
        System.out.println("El perimetro del cuadrado es:" + perimetro);
        scanner.close();
    }   

    public static void areavolumencilindro(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el radio del cilindro:");
        double radio = scanner.nextDouble();
        System.out.println("Digite la altura del cilindro:");
        double altura = scanner.nextDouble();
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El área de un lado: " + areaLateral);
        System.out.println("El área del cilindro: " + areaTotal);
        System.out.println("El volumen del cilindro: " + volumen);
        scanner.close();
    }

    public static void radiodecircuferencia(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el radio de la circunferencia:");
        double radio = scanner.nextDouble();
        double circufenrecialongitud = 2 * Math.PI * radio;
        double circuloarea = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es:" + circufenrecialongitud);
        System.out.println("El área de la circunferencia es:" + circuloarea);
        scanner.close();
    }

    public static void promediotresnumeros(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita tres números dejando un espacio:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de los tres números digitados es de:" + promedio);
        scanner.close();
    }
    
    



}