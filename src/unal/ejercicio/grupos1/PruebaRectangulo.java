
package unal.ejercicio.grupos1;


public class PruebaRectangulo {
    
    public static void main (String[] args)
    {
        java.util.Scanner lectura =
                new java.util.Scanner (System.in);
        System.out.println("Ingrese base");;
        double base = lectura.nextDouble();
        System.out.println("Ingrese altura");;
        double altura = lectura.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo (base, altura);
        double area = rectangulo.calcularArea();
        double perimetro = rectangulo.calcularPerimetro();
        
        System.out.println("Area " + area + " Perimetro " + perimetro);
                
        
    }
}
