//figura es abstract porque tiene al menos un m todo abstracto

public abstract class Figura{
    //el siguiente m etodo es abstracto porque no podemos calcular el area
   //sin saber de que figura se trata
    public abstract double calcularArea();
    public abstract int lados();

}
