
import java.util.Scanner;

public class tarea4 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Escribe el alto del rectangulo
        System.out.println("Proprciona el alto del rectangulo:");
        int alto = Integer.parseInt(scanner.nextLine());
        //Escribe el ancho del rectangulo
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(scanner.nextLine());
        //Establecemos variable del perimetro
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }

}
