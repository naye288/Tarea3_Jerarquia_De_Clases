//figura es abstract porque tiene al menos un metodo abstracto


public abstract class Figura implements Comparable<Figura>{
    //el siguiente m etodo es abstracto porque no podemos calcular el area
   //sin saber de que figura se trata
    public abstract double calcularArea();
    public abstract int lados();
    public abstract int compareTo(Figura o);

}
