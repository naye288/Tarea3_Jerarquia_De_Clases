import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangulo[] rects = new Rectangulo[4];
        rects[0] = new Rectangulo(2.5, 3.0); // 7,5 area
        rects[1] = new Rectangulo(1.7, 2.2); // 3.74 area
        rects[2] = new Rectangulo(3.5, 1.2); // 8,68 area
        rects[3] = new Rectangulo(2.5, 3.0); //7.5 area
        Arrays.sort(rects);
        
        Triangulo[] trian= new Triangulo[4];
        trian[0] = new Triangulo(2.5, 3.0); // 3.75 area
        trian[1] = new Triangulo(1.7, 1.2); // 1.02 area
        trian[2] = new Triangulo(2.0, 3.1); // 3.1 area
        trian[3] = new Triangulo(3.5, 1.2); // 2.8 area
        Arrays.sort(trian);

        Circulo[] circle= new Circulo[4];
        circle[0] = new Circulo(2.5); // 19.63 area
        circle[1] = new Circulo(1.7); // 9.07 area
        circle[2] = new Circulo( 3.1); // 30.19 area
        circle[3] = new Circulo(1.55); // 7.54 area
        Arrays.sort(circle);

        //Pruebas 
        System.out.println("Triangulo 1 comparado Triangulo 2: "); // retorna 1
        System.out.print(trian[1].CompareTo(trian[2]));
        System.out.println("\nTriangulo 3 comparado Rectangulo 2: "); // retorna 0
        System.out.print(trian[3].CompareTo(rects[2]));
        System.out.println("\nCiculo 1 comparado Triangulo 0: "); // retorna -1
        System.out.print(circle[1].CompareTo(trian[0]));
        System.out.println("\nRectangulo 1 comparado Circulo 2: ");// retorna 1
        System.out.print(rects[1].CompareTo(circle[2]));
        System.out.println("\nCirculo 0 comparado Circulo 3: ");// retorna -1
        System.out.print(circle[0].CompareTo(circle[3]));
        System.out.println("\nRectangulo 3 comparado Rectangulo 0: ");// retorna 2
        System.out.print(rects[3].CompareTo(rects[0]));

    }
}
