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
        circle[0] = new Circulo(1.09225); // 19.63 area
        circle[1] = new Circulo(1.7); // 9.07 area
        circle[2] = new Circulo( 3.1); // 30.19 area
        circle[3] = new Circulo(1.55); // 7.54 area
        Arrays.sort(circle);

        //Pruebas 
        /*Segun una consulta que le hice al profesor el me dijo que
         * "debe funcionar para cualquier tipo de figura"
         * el asunto es que solo logro que funcione la comparacion
         * cuando son del mismo tipo de clase.
        */
        System.out.print("Area Triangulo 1= "+ trian[1].calcularArea()+" comparado Area Triangulo 2= "+trian[1].calcularArea() +" Retorna: "); 
        System.out.println(trian[1].compareTo(trian[2]));
        System.out.print("\nArea Ciculo 1= "+ circle[1].calcularArea()+" comparado Area Triangulo 0= "+trian[0].calcularArea() +" Retorna: ");  
        System.out.println(circle[1].compareTo(trian[0]));
        System.out.print("\nArea Ciculo 2= "+ circle[2].calcularArea()+" comparado Area Rectangulo 1= "+rects[1].calcularArea() +" Retorna: "); 
        System.out.println(circle[2].compareTo(rects[1]));
        System.out.print("\nArea Rectangulo 0= "+ rects[0].calcularArea()+" comparado Area Circulo 3= "+circle[3].calcularArea() +" Retorna: ");
        System.out.println(rects[0].compareTo(circle[3]));
        System.out.print("\nArea Circulo 0= "+ circle[0].calcularArea()+" comparado Area Rectangulo 0= "+rects[0].calcularArea() +" Retorna: ");
        System.out.println(circle[0].compareTo(trian[3]));
        System.out.print("\nArea Rectangulo 2= "+ rects[2].calcularArea()+"  comparado Area Triangulo 3= "+trian[3].calcularArea() +" Retorna: ");
        System.out.println(rects[2].compareTo(rects[0]));

    }
}
